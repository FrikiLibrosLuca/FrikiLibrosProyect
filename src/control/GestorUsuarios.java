package control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuario;
import servicios.ServiciosUsuario;

public class GestorUsuarios {
	
	static ServiciosUsuario serv = new ServiciosUsuario();
	
	public HttpServletRequest gestion(HttpServletRequest request, HttpServletResponse response){
	 
		int codError=0;
		String opcion=request.getParameter("opcion");
		String nombre;
		Usuario usu;
		
		switch(opcion){
			case "leerUsuario":
				
				
				nombre = request.getParameter("nombre");
				usu = serv.leerUsuario(nombre);
				
				//request.setAttribute("plantilla", "perfil.jsp");
				
				break;
				
			
			case "modificarUsuario":
				codError = serv.insertarModificarUsuario(request);
				break;
				
				
				
			
			case "insertarUsuario":
				
				codError = serv.insertarModificarUsuario(request);
				break;
			
			case "borrarUsuario":
			
				nombre = request.getParameter("nombre");
				codError = serv.borrarUsuario(nombre);
				break;
		
		}
		
		return request;
		
		
	}
	
	
	
}
