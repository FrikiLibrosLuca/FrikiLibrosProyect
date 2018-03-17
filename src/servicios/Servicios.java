package servicios;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import datos.ConecJDBC;
import model.Autor;
import model.Libro;

public class Servicios {
	
	ConecJDBC bbdd= new ConecJDBC();
	
	/*
	 * METODOS PARA MOSTRAR LOS DETALLES DE UN LIBRO
	 */
	public Libro buscarLibro(String isbn){
		
		return mostrarLibro(bbdd.leerElemento("libros","isbn",isbn));
	}
	
	
	public Libro mostrarLibro(ResultSet rs){
		Libro lib = new Libro();
		Autor au= new Autor();
		
	
		try {
			while(rs.next()){
				lib.setISBN(rs.getString("isbn"));
				lib.setTitulo(rs.getString("titulo"));
				lib.setSaga(rs.getString("saga"));
				lib.setFechaEdicion(rs.getString("fecha_edicion"));
				lib.setIdioma(rs.getString("idioma"));
				lib.setCategoria(rs.getString("categoria"));
				au.setNombreAutor(rs.getString("nombre"));
				au.setApellidoAutor(rs.getString("apellido"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		lib.setAutor(au);
		
		
		return lib;
		
	}
}
