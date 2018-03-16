package control;

import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;

import datos.ConecJDBC;
import model.Autor;
import model.Libro;

public class GestorLibros {

	static ConecJDBC bbdd= new ConecJDBC();
	
	
	public static void buscarLibro(HttpServletRequest request){
		
		//modificar para poder ejecutar la select cuando Vicky la termine
		
		pintarLibro(bbdd.select(), request);
		
	
		
	}
	
	
	public static HttpServletRequest pintarLibro(ResultSet rs, HttpServletRequest request){
		Libro lib = new Libro();
		Autor au= new Autor();
		
		//aun falta codificar el autor para poder crear el libro
		while(rs.next()){
			lib.setISBN(rs.getString("isbn"));
			lib.setTitulo("titulo");
			lib.setSaga("saga");
			lib.setFechaEdicion("fecha_edicion");
			lib.setIdioma("idioma");
			lib.setCategoria("categoria");
			lib.setAutor(autor);
		}
		//se añade libro a request
		
		request.setAttribute("libro", lib);
		
		return request;
		
	}
	
}
