package control;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import datos.ConecJDBC;
import model.Autor;
import model.Libro;

public class GestorLibros {

	static ConecJDBC bbdd= new ConecJDBC();
	
	
	public static HttpServletRequest buscarLibro(HttpServletRequest request){
		//modificar para poder ejecutar la select cuando Vicky la termine
		String info;
		
		info=request.getParameter("isbn");
		
		
		return pintarLibro(bbdd.leerElemento("libros","isbn",info), request);
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
				au.setNombreAutor("nombre");
				au.setApellidoAutor("apellido");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		lib.setAutor(au);
		
		request.setAttribute("Libro", lib);
		
		return request;
		
	}
	
}
