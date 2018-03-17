package control;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import datos.ConecJDBC;
import model.Autor;
import model.Libro;
import servicios.Servicios;

public class GestorLibros {
	
	static Servicios serv=new Servicios();
	
	public static HttpServletRequest mostrarDetallesLibro(HttpServletRequest request){
		
		String info;
		
		info=request.getParameter("isbn");
		
		Libro libro = serv.buscarLibro(info);
		
		request.setAttribute("Libro", libro);
		
		return request;
	}
	
	
	
	
}
