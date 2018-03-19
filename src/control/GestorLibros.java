package control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Libro;
import servicios.Servicios;

public class GestorLibros {
	
	static Servicios serv=new Servicios();
	
	public HttpServletRequest gestion(HttpServletRequest request, HttpServletResponse response){
		
		String opcion=request.getParameter("opcion");
		
		switch(opcion){
			case "readLibro":
			
			case "updateLibro":
			
			case "insertLibro":
			
			case "deleteLibro":
			
			case "readListaLibro":
			
		
		
		}
		
		return request;
		
		
	}
	
	
	
	
	public HttpServletRequest mostrarDetallesLibro(HttpServletRequest request){
		
		String info;
		
		info=request.getParameter("isbn");
		
		Libro libro = serv.buscarLibro(info);
		
		request.setAttribute("Libro", libro);
		
		return request;
	}
	
	
	
	
}
