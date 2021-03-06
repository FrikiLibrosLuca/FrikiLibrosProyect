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

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServiciosLibro implements IServiciosLibro {

	private static Logger logger;

	static {
		try {
			logger = LogManager.getLogger(ServiciosLibro.class);
		} catch (Throwable e) {
			System.out.println("Don't work");
		}
	}

	private static char[] tildes = { 225, 233, 237, 243, 250, 193, 201, 205, 211, 218, 241, 209 };

	ConectorLibros bbdd = new ConectorLibros();

	/**
	 * método que recupera un libro dela bbdd y crea un objeto Libro
	 * 
	 * @param String
	 *            isbn
	 * @return Objeto tipo Libro
	 * 
	 */
	public Libro obtenerLibro(ResultSet rs) {

		Libro lib = new Libro();
		Autor au = new Autor();
		
			try {
				
				lib.setIsbn(rs.getString("isbn"));
				lib.setTitulo(rs.getString("titulo"));
				lib.setSaga(rs.getString("saga"));
				lib.setFechaEdicion(rs.getString("fecha_edicion"));
				lib.setIdioma(rs.getString("idioma"));
				lib.setCategoria(rs.getString("categoria"));
				lib.setFoto(rs.getString("ruta"));
				au.setNombreAutor(rs.getString("nombre"));
				au.setApellidoAutor(rs.getString("apellido"));
				
			} catch (SQLException sql) {
				sql.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			lib.setAutor(au);
			logger.debug("------- empaquetando libro del resultset " + lib.toString());
		

		return lib;
	}

	/**
	 * método que busca un libro dado un ISBN, manda la peticion a la capa datos
	 * 
	 * @param String
	 *            isbn
	 * @return Objeto tipo Libro
	 * 
	 */
	public List<Libro> buscarLibro(String isbn) {
		/*logger.debug("---------isbn de entrada a buscar libro " + isbn);
		ResultSet rs = bbdd.buscarLibro(isbn);

		Libro lib = obtenerLibro(rs);
		logger.debug("----servicio buscar libro " + lib.toString());
		return lib;*/
		
		List<Libro> listadoLibros = new ArrayList<>();
		ResultSet rs = bbdd.leerListaLibro("isbn", isbn);

		try {
			while (rs.next()) {
				listadoLibros.add(obtenerLibro(rs));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listadoLibros;
	}

	/**
	 * Metodo que devuelve la lista de todos los libros
	 * 
	 * @return List Libro
	 */
	public List<Libro> leerListaLibro() {

		List<Libro> listadoLibros = new ArrayList<>();
		ResultSet rs = bbdd.leerListaLibro();

		try {
			while (rs.next()) {
				listadoLibros.add(obtenerLibro(rs));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listadoLibros;
	}

	/**
	 * Metodo que devuelve la lista de todos los libros de una categoria en
	 * concreto
	 * 
	 * @param String
	 *            , int
	 * @return List Libro
	 */
	public List<Libro> leerListaLibro(String columna, int valor) {

		List<Libro> listadoLibros = new ArrayList<>();
		ResultSet rs = bbdd.leerListaLibro(columna, valor);

		try {
			while (rs.next()) {
				listadoLibros.add(obtenerLibro(rs));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listadoLibros;

	}

	/**
	 * Metodo que devuelve la lista de todos los libros de una categoria en
	 * concreto
	 * 
	 * @param String,
	 *            String
	 * @return List Libro
	 */

	public List<Libro> leerListaLibro(String columna, String valor) {
		logger.trace("-- trace servicio --> " + valor);
		List<Libro> listadoLibros = new ArrayList<>();
		ResultSet rs = bbdd.leerListaLibro(columna, valor);

		try {
			while (rs.next()) {
				listadoLibros.add(obtenerLibro(rs));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listadoLibros;

	}

	/**
	 * Metodo que inserta o actualiza un libro de la bbdd, dependiendo de la
	 * entrada
	 * 
	 * @param request
	 * @return int, resultado de la operación 0>=ok | -1=error
	 */
	public int insertarModificar(HttpServletRequest request) {

		Libro lib = new Libro();
		int resultado = 0;
		Autor au = new Autor();
		int id_autor;

		// llenado del libro
		lib.setTitulo(request.getParameter("titulo"));
		lib.setIdioma(request.getParameter("idioma"));
		lib.setSaga(request.getParameter("saga"));
		lib.setFoto(request.getParameter("foto"));
		lib.setIsbn(request.getParameter("isbn"));
		lib.setFechaEdicion(request.getParameter("fecha"));
		au.setIdAutor(Integer.parseInt(request.getParameter("idAutor")));
		id_autor = au.getIdAutor();

		if (request.getParameter("accion").equals("insert")) {
			resultado = bbdd.insertLibro(lib, id_autor);
		} else if (request.getParameter("accion").equals("update")) {
			resultado = bbdd.modificarLibro(lib, id_autor);
		}

		return resultado;
	}

	/**
	 * metodo que recibe un isbn y borra el registro correspondiente de la tabla
	 * libro
	 * 
	 * @param isbn
	 * @return int, resultado de la operación 0>=ok | -1=error
	 */
	public int borrarLibro(String isbn) {
		int resultado;

		resultado = bbdd.borrarLibro(isbn);

		return resultado;
	}

	/*
	 * metodo que recibe un titulo, lo gestiona y llama al conector para saber
	 * si existe en la bbdd
	 * 
	 * @param String titulo
	 * 
	 * @return Libro
	 */
	public List<Libro> buscarPorTitulo(String titulo) {
		List<Libro> listadoLibros = new ArrayList<>();
		ResultSet rs = bbdd.leerListaLibro("titulo", titulo);

		try {
			while (rs.next()) {
				listadoLibros.add(obtenerLibro(rs));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listadoLibros;

	}

	/*
	 * metodo que recibe un autor, lo gestiona y llama al conector para saber
	 * si existe en la bbdd
	 * 
	 * @param String autor
	 * 
	 * @return Autor
	 */
	public List<Libro> buscarPorAutor(String autor) {

		List<Libro> listadoLibros = new ArrayList<>();
		ResultSet rs = bbdd.leerListaLibro("autor", autor);

		try {
			while (rs.next()) {
				listadoLibros.add(obtenerLibro(rs));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listadoLibros;
	}

	/*
	 * sustituye letas con tilde por ? public static void replaceAll(String
	 * dato){ StringBuilder builder = new StringBuilder(dato);
	 * 
	 * for(int i=0;i<tildes.length;i++){ for (int j =0 ;j<builder.length();j++){
	 * if(builder.charAt(j)==tildes[i]) builder.replace(j, j, "?"); } }
	 * 
	 * }
	 */
	
	/**
	 * Metodo que devuelve la lista de todos los autor
	 * 
	 * @return List autor
	 */
	public List<Autor> leerListaAutor() {

		List<Autor> listadoAutor = new ArrayList<>();
		ResultSet rs = bbdd.leerListaAutor();

		try {
			while (rs.next()) {
				listadoAutor.add(obtenerAutor(rs));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listadoAutor;
	}
	
	/**
	 * método que recupera un autor dela bbdd y crea un objeto Autor
	 * 
	 * @param Resulset
	 *            
	 * @return Objeto tipo Autor
	 * 
	 */
	public Autor obtenerAutor(ResultSet rs) {

		Autor au = new Autor();
		
			try {
				
				au.setNombreAutor(rs.getString("nombre"));
				au.setApellidoAutor(rs.getString("apellido"));
				
			} catch (SQLException sql) {
				sql.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			logger.debug("------- empaquetando autor del resultset " + au.toString());
		

		return au;
	}

}
