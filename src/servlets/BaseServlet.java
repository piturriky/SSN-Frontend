package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ssn.ws.SSNWS;
import ssn.ws.SSNWSService;

/**
 * Servlet implementation class BaseServlet
 */
public abstract class BaseServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	protected SSNWSService service1;
    protected SSNWS port1;
    
    protected boolean isEditMode;
    protected int entityId;
	
    public BaseServlet() {
        super();
        
        service1 = new SSNWSService();
        port1 = service1.getSSNWSPort();
    }
    
    @Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
    	checkMode(arg0);
    	checkError(arg0,arg1);
		super.service(arg0, arg1);
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	protected void loguinErrorRedirect(HttpServletResponse response){
		try {
			response.sendRedirect("http://localhost:8080/SSN_Frontend?error=1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void checkMode(HttpServletRequest request){
		if(request.getParameter("mode") != null && request.getParameterValues("mode")[0].equals("edit")
				&& request.getParameter("Id") != null && Integer.parseInt(request.getParameterValues("Id")[0])>0){
			isEditMode = true;
			entityId = Integer.parseInt(request.getParameterValues("Id")[0]);
			request.setAttribute("mode", "edit");
		}else{
			isEditMode = false;
		}
		
	}
	
	private void checkError(HttpServletRequest request,HttpServletResponse response){
		if(request.getParameter("error") != null){
			switch (request.getParameterValues("error")[0]) {
			case "0":
				
				break;

			default:
				request.setAttribute("messageTitle", "Error");
				request.setAttribute("messageText", "Application error");
				request.setAttribute("messageType", "alert-danger");
				break;
			}
		}
	}

}
