package servicios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import datos.ConectorLibros;
import model.Autor;
import model.Libro;

public class ServiciosLibro {
	
	ConectorLibros bbdd= new ConectorLibros();
	
	/**
	 * método que recupera un libro dela bbdd y crea un objeto Libro
	 * @param String isbn
	 * @return Objeto tipo Libro
	 * 
	 */
	public Libro obtenerLibro(ResultSet rs){
		
		Libro lib = new Libro();
		Autor au= new Autor();
	
		try {
			
				lib.setISBN(rs.getString("isbn"));
				lib.setTitulo(rs.getString("titulo"));
				lib.setSaga(rs.getString("saga"));
				lib.setFechaEdicion(rs.getString("fecha_edicion"));
				lib.setIdioma(rs.getString("idioma"));
				lib.setCategoria(rs.getString("categoria"));
				au.setNombreAutor(rs.getString("nombre"));
				au.setApellidoAutor(rs.getString("apellido"));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		lib.setAutor(au);
		
		
		return lib;
	}
	
	/**
	 * método que busca un libro dado un ISBN, manda la peticion a la capa datos
	 * @param String isbn
	 * @return Objeto tipo Libro
	 * 
	 */
	public Libro buscarLibro(String isbn){
		
		ResultSet rs = bbdd.leerElemento("libros","isbn",isbn);
		
		Libro lib = obtenerLibro(rs);
		
		return lib;
	}
	
	/**
	 * Metodo que devuelve la lista de todos los libros
	 * @return List Libro
	 */
	public List<Libro> leerListaLibro(){
		
		List<Libro> listadoLibros= new ArrayList<>();
		ResultSet rs = bbdd.leerListaLibro();
				
		try {
			while(rs.next()){
				listadoLibros.add(obtenerLibro(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listadoLibros;
	}
	
	/**
	 * Metodo que devuelve la lista de todos los libros de una categoria en concreto
	 * @param String , int
	 * @return List Libro
	 */
	public List<Libro> leerListaLibro(String columna, int valor){
		
		List<Libro> listadoLibros= new ArrayList<>();
		ResultSet rs = bbdd.leerListaLibro(columna, valor);
				
		try {
			while(rs.next()){
				listadoLibros.add(obtenerLibro(rs));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listadoLibros;
		
	}
	
	/**
	 * Metodo que devuelve la lista de todos los libros de una categoria en concreto
	 * @param String, String
	 * @return List Libro
	 */
	
	public List<Libro> leerListaLibro(String columna, String valor){
		
		List<Libro> listadoLibros= new ArrayList<>();
		ResultSet rs = bbdd.leerListaLibro(columna, valor);
				
		try {
			while(rs.next()){
				listadoLibros.add(obtenerLibro(rs));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listadoLibros;
		
	}
	
	
	/**
	 * Metodo que inserta o actualiza un libro de la bbdd, dependiendo de la entrada
	 * @param request
	 * @return int, resultado de la operación 0>=ok | -1=error
	 */
	public int insertarModificar(HttpServletRequest request){
	
		Libro lib = new Libro();
		int resultado=0;
		int id_autor;
		
		//llenado del libro
		lib.setTitulo(request.getParameter("titulo"));
		lib.setIdioma(request.getParameter("idioma"));
		lib.setSaga(request.getParameter("saga"));
		lib.setFoto(request.getParameter("foto"));
		lib.setISBN(request.getParameter("ISBN"));
		lib.setFechaEdicion(request.getParameter("fecha"));
		id_autor=Integer.parseInt(request.getParameter("idAutor"));
		
		if(request.getParameter("accion").equals("insert")){
			resultado=bbdd.insertLibro(lib, id_autor);
		}
		else if (request.getParameter("accion").equals("update")){
			resultado=bbdd.modificarLibro(lib, id_autor);
		}
	
		return resultado;
	}
	
	
	/**
	 * metodo que recibe un isbn y borra el registro correspondiente de la tabla libro
	 * @param isbn
	 * @return int, resultado de la operación 0>=ok | -1=error
	 */
	public int borrarLibro(String isbn){
		int resultado;
		
		resultado=bbdd.borrarLibro(isbn);
		
		return resultado;
	}

	
}
