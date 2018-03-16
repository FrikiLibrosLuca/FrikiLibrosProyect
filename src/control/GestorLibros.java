package control;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import datos.ConecJDBC;
import model.Autor;
import model.Libro;

public class GestorLibros {

	static ConecJDBC bbdd= new ConecJDBC();
	
	
	public static void buscarLibro(HttpServletRequest request){
		//modificar para poder ejecutar la select cuando Vicky la termine
		String info;
		
		info=request.getParameter("isbn");
		
		pintarLibro(bbdd.leerElemento("libros","isbn",info), request);
		
	
		
	}
	
	
	public static HttpServletRequest pintarLibro(ResultSet rs, HttpServletRequest request){
		Libro lib = new Libro();
		Autor au= new Autor();
		
		//aun falta codificar el autor para poder crear el libro
		try {
			while(rs.next()){
				lib.setISBN(rs.getString("isbn"));
				lib.setTitulo("titulo");
				lib.setSaga("saga");
				lib.setFechaEdicion("fecha_edicion");
				lib.setIdioma("idioma");
				lib.setCategoria("categoria");
				au.setNombreAutor("nombreAutor");
				au.setApellidoAutor("apellidoAutor");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//se añade libro a request
		
		request.setAttribute("libro", lib);
		
		return request;
		
	}
	
}
