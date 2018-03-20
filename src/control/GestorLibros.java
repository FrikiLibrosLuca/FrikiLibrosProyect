package control;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Libro;
import servicios.ServiciosLibro;

public class GestorLibros {
	
	static ServiciosLibro serv=new ServiciosLibro();
	
	public HttpServletRequest gestion(HttpServletRequest request, HttpServletResponse response){
		
		String opcion=request.getParameter("opcion");
		Libro lib;
		List<Libro> listadoLibros;
		
		int codError=0;
		
		switch(opcion){
			case "buscarLibro":
				String isbn = request.getParameter("isbn");
				lib= serv.buscarLibro(isbn);
				request.setAttribute("libro", lib);
				break;
			case "insertarLibro":
				codError = serv.insertarModificar(request);
				break;
			case "eliminarLibro":
				String isbn1 = request.getParameter("isbn");
				codError = serv.borrarLibro(isbn1);
				break;
			case "leerListaLibro":
				String columna = request.getParameter("columna");
				int valorInt;
				String valorString;
				
				if(request.getParameter("columna").isEmpty()){
					listadoLibros = serv.leerListaLibro();
					request.setAttribute("libro", listadoLibros);
				}
				else{
					if(this.isNumeric(request.getParameter("valor"))){
						valorInt =Integer.parseInt(request.getParameter("valor")); 
						listadoLibros= serv.leerListaLibro(columna, valorInt);
						request.setAttribute("libro", listadoLibros);
					}
					else{
						valorString = request.getParameter("valor");
						listadoLibros= serv.leerListaLibro(columna, valorString);
						request.setAttribute("libro", listadoLibros);
					}					
				}
				break;		
		}
		
		if(codError==-1){
			request.setAttribute("resultado", "Ha habido un error a la hora de modificar o insertar o eliminar");
		}
		else if(codError>=0){
			request.setAttribute("resultado", "Insertado o modificado o eliminar correctamente");
		}	
		
		
		
		return request;		
	}
	
	
	private static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
	
	public HttpServletRequest mostrarDetallesLibro(HttpServletRequest request){
		
		String info;
		
		info=request.getParameter("isbn");
		
		Libro libro = serv.buscarLibro(info);
		
		request.setAttribute("Libro", libro);
		
		return request;
	}
	
	
	
	
}
