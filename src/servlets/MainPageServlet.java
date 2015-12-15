package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ssn.ws.ManagerEntity;
import ssn.ws.Result;
import ssn.ws.Sport;

/**
 * Servlet implementation class MainPag
 */
@WebServlet("/MainPage")
public class MainPageServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	private List<ManagerEntity> managerEntityList;
	
    public MainPageServlet() {
        super();
        managerEntityList = new ArrayList<ManagerEntity>();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	getManagerEntities(request);
		request.getRequestDispatcher("/WEB-INF/pages/MainPage.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("selectedId") != null && Integer.parseInt(request.getParameter("selectedId")) > 0){
			Result res = port1.deleteManagerEntity(Integer.parseInt(request.getParameter("selectedId")));
			
			if(res.isValid()){
				request.setAttribute("messageTitle", "Success");
				request.setAttribute("messageText", "The manage entity has been deleted successfuly");
				request.setAttribute("messageType", "alert-success");
			}else{
				request.setAttribute("messageTitle", "Error");
				request.setAttribute("messageText", "Error in delet, this entity may have associated fields or events");
				request.setAttribute("messageType", "alert-danger");
			}
			
			getManagerEntities(request);
			request.getRequestDispatcher("/WEB-INF/pages/MainPage.jsp").forward(request, response);
		}
	}
    
    private void getManagerEntities(HttpServletRequest request){
    	managerEntityList.clear();
    	Result result = port1.getManagerEntities();
    	if(result.isValid()){
    		for (Iterator iterator = result.getData().iterator(); iterator.hasNext();) {
				ManagerEntity me = (ManagerEntity) iterator.next();
				
				managerEntityList.add(me);	
			}
    	}else{
    		// TODO enviar error
    	}
    		
    	request.setAttribute("managerEntities", managerEntityList);
    }
}
