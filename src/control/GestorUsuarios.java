package control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuario;
import servicios.ServiciosUsuario;

public class GestorUsuarios {
	
	static ServiciosUsuario serv=new ServiciosUsuario();
	
	public HttpServletRequest gestion(HttpServletRequest request, HttpServletResponse response){
	 
		
		String opcion=request.getParameter("opcion");
		
		switch(opcion){
			case "leerUsuario":
			
			case "modificarUsuario":
			
			case "insertarUsuario":
			
			case "borrarUsuario":
			
		
		}
		
		return request;
		
		
	}
	
	
	
}
