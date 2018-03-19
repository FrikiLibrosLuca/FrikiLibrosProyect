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
       
		HttpSession session = request.getSession(); 
		
		gestor.gestion(request,response);
       
    }
            
	 
	protected void processLibro(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        RequestDispatcher view;
	        //Vas a plantillaLibro
	        
	        view = GestorLibros.mostrarDetallesLibro(request).getRequestDispatcher("plantillaLibro.jsp");
	       
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
