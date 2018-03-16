package servicios;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class InputServlet
 */
@WebServlet(urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
	protected void processRequestHandler(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher view;
        String origen = request.getParameter("opcion");
        //Esto  es la opcion de la pagina de "pruebaboton" , 
        /*entre los if orige.contentEquals("ValordelaOpcionHiddendlhtml"){metodoProcess}*/
        if (origen.contentEquals("p1")) {
        	processBoton(request,response);
        } else if (origen.contentEquals("p2")) {
            //Vienes de la pagina 2 y vas a la 3
        	processLibro(request,response);
        }
    }
            
    
	 protected void processBoton (HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	    	//PASO 3
	    	//Vas a PruebaBoton
	    	RequestDispatcher view;
	    	view = request.getRequestDispatcher("puebaBoton.jsp");
	    	view.forward(request, response);
	    }
	 
	 protected void processLibro(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        RequestDispatcher view;
	        //Vas a plantillaLibro
	       view = request.getRequestDispatcher("plantillaLibro.jsp");
	       
	        view.forward(request, response);
	    }
	
	 /*Plantilla para crear un metodo
      * 
      * protected void processNombreDelProcesador(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher view;
        
        view= request.getRequestDispatcher("nombreDelaPagina");
        
        view.forward(reques,response);
        
        }
    }*/
	
	//metodos doGet y doPost
         
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		processRequestHandler(request,response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequestHandler(request, response);
	}
	
	
	    
	

}
