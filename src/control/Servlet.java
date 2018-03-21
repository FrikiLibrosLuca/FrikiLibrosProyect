package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class InputServlet
 */
@WebServlet(urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GestorLibros gestor = new GestorLibros();

	
	protected void processRequestHandler(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		RequestDispatcher view;
		 
		System.out.println("--- "+request.getParameter("opcion"));
		
		
		//HttpSession session = request.getSession(); 
		
		request=gestor.gestion(request,response);
		
		String plantilla = (String) request.getAttribute("plantilla");
		System.out.println("---------------- "+plantilla);
		view =request.getRequestDispatcher(plantilla);
		
        view.forward(request, response);
		
		
		
				
    }
            
	 

	
	//metodos doGet y doPost
         
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		processRequestHandler(request,response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequestHandler(request, response);
	}
	
	
	    
	

}
