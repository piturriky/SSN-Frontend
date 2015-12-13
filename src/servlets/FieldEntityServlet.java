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
import ssn.ws.FieldSports;
import ssn.ws.ManagerEntity;
import ssn.ws.Result;
import ssn.ws.Sport;
import ssn.ws.User;

/**
 * Servlet implementation class ManagerEntity
 */
@WebServlet("/ManagerEntity/Field")
public class FieldEntityServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
	private int managerEntityId;
	private Field entity;
	private List<Sport> sports;
		
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FieldEntityServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try{
			managerEntityId = request.getParameter("IdManagerEntity") != null ? Integer.parseInt(request.getParameterValues("IdManagerEntity")[0]) : Integer.MIN_VALUE;
		}catch(Exception e){
			loguinErrorRedirect(response);
			return;
		}
		
		
		if(managerEntityId == Integer.MIN_VALUE){
			loguinErrorRedirect(response);
			return;
		}
		
		if(isEditMode){
			getField(entityId);
		}else{
			entity = new Field();
			entity.setIdField(Integer.MIN_VALUE);
		}
		
		entity.setIdManagerEntity(managerEntityId);
		
		getAvailableSports();
		
		request.setAttribute("sports", sports);
		request.setAttribute("entity", entity);
		request.getRequestDispatcher("/WEB-INF/pages/Field.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		Result res;
		int sportId;
		double priceHour;

		if(request.getParameter("entityName") != null){
			entity.setName(request.getParameter("entityName"));
		}
		if(request.getParameter("sportId")!= null && request.getParameter("priceHour")!= null){
			try{
				sportId = Integer.parseInt(request.getParameterValues("sportId")[0]);
				priceHour = Double.parseDouble(request.getParameterValues("priceHour")[0]);
			}catch(Exception e){
				loguinErrorRedirect(response);
				return;
			}
			FieldSports f = new FieldSports();
			f.setIdSport(sportId);
			f.setHourPrice(priceHour);
			for(Sport s : sports){
				if(s.getIdSport() == sportId)
					f.setSportName(s.getName());
			}
			entity.getSports().add(f);
		}else if (request.getParameter("selectedId")!= null){
			try{
				sportId = Integer.parseInt(request.getParameter("selectedId"));
			}catch(Exception e){
				loguinErrorRedirect(response);
				return;
			}
			for(int i = 0; i< entity.getSports().size(); i++){
				if(sportId == entity.getSports().get(i).getIdSport()){
					entity.getSports().remove(i);
					break;
				}
					
				
			}
		}else if(request.getParameter("entityId")!= null && Integer.parseInt(request.getParameterValues("entityId")[0])>0){
			// Update
			
			res = port1.updateField(entity);
			
			if(res.isValid()){
				request.setAttribute("messageTitle", "Success");
				request.setAttribute("messageText", "The field has been updated successfuly");
				request.setAttribute("messageType", "alert-success");
			}else{
				request.setAttribute("messageTitle", "Error");
				request.setAttribute("messageText", res.getError());
				request.setAttribute("messageType", "alert-danger");
			}
			
		}else{
			// Create
			res = port1.addField(entity);
			
			if(res.isValid()){
				entity = new Field();
				entity.setIdManagerEntity(managerEntityId);
				
				request.setAttribute("messageTitle", "Success");
				request.setAttribute("messageText", "The field has been created successfuly");
				request.setAttribute("messageType", "alert-success");
			}else{
				
				request.setAttribute("messageTitle", "Error");
				request.setAttribute("messageText", res.getError());
				request.setAttribute("messageType", "alert-danger");
			}		
			
		}
		getAvailableSports();
		
		request.setAttribute("sports", sports);
		
		request.setAttribute("entity", entity);
		request.getRequestDispatcher("/WEB-INF/pages/Field.jsp").forward(request, response);
	}

	private void getField(int id){
		
		Result res = port1.getFieldById(id);
		
    	if(!res.isValid()){
    		entity = null;
    	}
    	
    	entity = (Field)res.getData().get(0);
    }

	private void getAvailableSports(){
		List<Sport> sportsList = new ArrayList<Sport>();
		boolean noAdd;
		
		Result res = port1.getSports();
		if(res.isValid()){
			for (Iterator iterator = res.getData().iterator(); iterator.hasNext();) {
				noAdd = false;
				Sport s = (Sport) iterator.next();
				for(FieldSports f : entity.getSports()){
					if(s.getIdSport() == f.getIdSport()){
						noAdd = true;
						break;
					}
				}
				if(!noAdd){
					sportsList.add(s);	
				}
			}
		}
		sports =  sportsList;
	}
}
