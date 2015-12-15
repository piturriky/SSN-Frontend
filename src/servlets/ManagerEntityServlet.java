package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ssn.ws.Field;
import ssn.ws.ManagerEntity;
import ssn.ws.Result;
import ssn.ws.User;

/**
 * Servlet implementation class ManagerEntity
 */
@WebServlet("/ManagerEntity")
public class ManagerEntityServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
	private ManagerEntity entity;
	private List<Field> fields;
	
	private String hrefAddField_ = "/SSN_Frontend/ManagerEntity/Field?IdManagerEntity=";
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManagerEntityServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		if(isEditMode){
			getManagerEntity(entityId);
			getFields(entity.getIdManagerEntity());
			request.setAttribute("fields",fields);
			String hrefAddField = hrefAddField_.concat(Integer.toString(entityId));
			request.setAttribute("hrefAddField", hrefAddField);
		}else{
			entity = new ManagerEntity();
			entity.setIdManagerEntity(Integer.MIN_VALUE);
		}
		request.setAttribute("entity", entity);
		request.getRequestDispatcher("/WEB-INF/pages/ManagerEntity.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		Result res;
		
		if(request.getParameter("selectedId")!= null && Integer.parseInt(request.getParameterValues("selectedId")[0])>0){
			res = port1.deleteField(Integer.parseInt(request.getParameter("selectedId")));
			
			getFields(entity.getIdManagerEntity());
			request.setAttribute("fields",fields);
			
			if(res.isValid()){
				request.setAttribute("messageTitle", "Success");
				request.setAttribute("messageText", "The field has been deleted successfuly");
				request.setAttribute("messageType", "alert-success");
			}else{
				request.setAttribute("messageTitle", "Error");
				request.setAttribute("messageText", "This field may have associated reservations or sports");
				request.setAttribute("messageType", "alert-danger");
			}
			String hrefAddField = hrefAddField_.concat(Integer.toString(entityId));
			request.setAttribute("hrefAddField", hrefAddField);
		}else if(request.getParameter("entityId")!= null && Integer.parseInt(request.getParameterValues("entityId")[0])>0){
			entity.setIdManagerEntity(Integer.parseInt(request.getParameterValues("entityId")[0]));
			entity.setName(request.getParameter("entityName"));
			entity.setCity(request.getParameter("entityCity"));
			entity.setAddress(request.getParameter("entityAddress"));
			// Update
			
			res = port1.updateManagerEntity(entity);
			
			getFields(entity.getIdManagerEntity());
			request.setAttribute("fields",fields);
			
			if(res.isValid()){
				request.setAttribute("messageTitle", "Success");
				request.setAttribute("messageText", "The manage entity has been updated successfuly");
				request.setAttribute("messageType", "alert-success");
			}else{
				request.setAttribute("messageTitle", "Error");
				request.setAttribute("messageText", res.getError());
				request.setAttribute("messageType", "alert-danger");
			}
			
			String hrefAddField = hrefAddField_.concat(Integer.toString(entityId));
			request.setAttribute("hrefAddField", hrefAddField);
			
		}else{
			// Create
			entity.setIdUser(9);
			entity.setName(request.getParameter("entityName"));
			entity.setCity(request.getParameter("entityCity"));
			entity.setAddress(request.getParameter("entityAddress"));
			res = port1.createManagerEntity(entity);
			
			if(res.isValid()){
				entity = new ManagerEntity();
				entity.setIdManagerEntity(Integer.MIN_VALUE);
				
				request.setAttribute("messageTitle", "Success");
				request.setAttribute("messageText", "The manage entity has been created successfuly");
				request.setAttribute("messageType", "alert-success");
			}else{
				
				request.setAttribute("messageTitle", "Error");
				//request.setAttribute("messageText", res.getError());
				request.setAttribute("messageType", "alert-danger");
			}		
			
		}
		request.setAttribute("entity", entity);
		request.getRequestDispatcher("/WEB-INF/pages/ManagerEntity.jsp").forward(request, response);
	}

	private void getManagerEntity(int id){
		
		Result res = port1.getManagerEntitiesById(id);
		
    	if(!res.isValid()){
    		entity = null;
    	}
    	
    	entity = (ManagerEntity)res.getData().get(0);
    }
	
	private void getFields(int entityId){
		List<Field> list = new ArrayList<Field>();
		
		Result res = port1.getFieldsByManagerEntity(entityId);
		if(res.isValid()){
			for (Iterator iterator = res.getData().iterator(); iterator.hasNext();) {
				Field f = (Field) iterator.next();
				
				list.add(f);	
			}
		}
		fields =  list;
	}
}
