package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



import model.Libro;
import servicios.ServiciosLibro;

public class ConectorLibros {

	static Connection con = null;
	private Statement st = null;
	private ResultSet rs = null;
	
	private static Logger logger;

    static {
        try {
            logger = LogManager.getLogger(ConectorLibros.class);
        } catch (Throwable e) {
            System.out.println("Don't work");
        }
    }

	public ConectorLibros() {
		abrirConnect();
	}

	public void abrirConnect() {
		try {
			String driverClassName = "com.mysql.jdbc.Driver";
			// String driverUrl = "jdbc:mysql://192.168.200.9:8080/frikilibros";
			String driverUrl = "jdbc:mysql://192.168.200.9/frikilibros";
			String user = "proyecto";
			String password = "1234";
			Class.forName(driverClassName);
			con = DriverManager.getConnection(driverUrl, user, password);

		} catch (ClassNotFoundException e) {
			System.out.println("No se encuentra el driver");
		} catch (SQLException e) {
			System.out.println("Exception SQL: " + e.getMessage());
			System.out.println("Estado SQL: " + e.getSQLState());
			System.out.println("Codigo del Error: " + e.getErrorCode());
		} 
	}

	public void cerrarConnect() {

		try {
			if (rs != null) {
				rs.close();
			}
			if (st != null) {
				st.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ResultSet leerElemento(String nameTable) {
		String query = "SELECT * FROM " + nameTable;
		try {
			this.st = con.createStatement();
			this.rs = st.executeQuery(query);

		} catch (SQLException e) {
			System.out.println("Exception SQL: " + e.getMessage());
			System.out.println("Estado SQL: " + e.getSQLState());
			System.out.println("Codigo del Error: " + e.getErrorCode());
		} 
		return rs;
	}

	
	
	
	
	public int insertLibro(Libro lib, int idAutor) {
		String query = "INSERT INTO libro VALUES ('" + lib.getIsbn() + "', '" + lib.getTitulo() + "', '" + lib.getSaga()
				+ "', STR_TO_DATE('" + lib.getFechaEdicion() + "', '%Y-%m-%d'), '" + lib.getIdioma() + "', '"
				+ lib.getCategoria() + "', '" + idAutor + "';";

		int registrosAfectados = -1;
		try {
			this.st = con.createStatement();
			registrosAfectados = st.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("Exception SQL: " + e.getMessage());
			System.out.println("Estado SQL: " + e.getSQLState());
			System.out.println("Codigo del Error: " + e.getErrorCode());
		} 
		return registrosAfectados;
	}

	public int modificarLibro(Libro lib, int idAutor) {
		String query = "UPDATE libros SET titulo='" + lib.getTitulo() + "', saga='" + lib.getSaga()
				+ "', fecha_edicion= STR_TO_DATE('" + lib.getFechaEdicion() + "', '%Y-%m-%d), idioma='"
				+ lib.getIdioma() + "', categoria='" + lib.getCategoria() + "', id_autor='" + idAutor + "' WHERE isbn='"
				+ lib.getIsbn() + "';";
		int registrosAfectados = -1;
		try {
			this.st = con.createStatement();
			registrosAfectados = st.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("Exception SQL: " + e.getMessage());
			System.out.println("Estado SQL: " + e.getSQLState());
			System.out.println("Codigo del Error: " + e.getErrorCode());
		} 
		return registrosAfectados;
	}

	public int borrarLibro(String isbn) {
		String query = "DELETE FROM libros WHERE isbn='" + isbn + "'";
		int registrosAfectados = -1;
		try {
			this.st = con.createStatement();
			registrosAfectados = st.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("Exception SQL: " + e.getMessage());
			System.out.println("Estado SQL: " + e.getSQLState());
			System.out.println("Codigo del Error: " + e.getErrorCode());
		} 
		return registrosAfectados;
	}

	public ResultSet leerLibro(String isbn) {
		
		
		String query = "SELECT * FROM libros WHERE isbn='" + isbn + "';";
		try {
			this.st = con.createStatement();
			this.rs = st.executeQuery(query);

		} catch (SQLException e) {
			System.out.println("Exception SQL: " + e.getMessage());
			System.out.println("Estado SQL: " + e.getSQLState());
			System.out.println("Codigo del Error: " + e.getErrorCode());
		} 
		return rs;
	}

	public ResultSet leerListaLibro(String columna, String valor) {
		logger.trace("-- trace conector --> "+valor);
		String query ="SELECT l.isbn, titulo, saga, fecha_edicion, idioma, categoria, a.nombre, a.apellido, "
				+ "i.ruta FROM libros as l, autor as a, imagenes as i WHERE l." + columna + "='" + valor + "' and a.id=l.id_autor and l.isbn=i.isbn;"; 

		try {
			this.st = con.createStatement();
			this.rs = st.executeQuery(query);

		} catch (SQLException e) {
			System.out.println("Exception SQL: " + e.getMessage());
			System.out.println("Estado SQL: " + e.getSQLState());
			System.out.println("Codigo del Error: " + e.getErrorCode());
		}
		return rs;
	}

	public ResultSet leerListaLibro(String columna, int valor) {
		String query ="SELECT l.isbn, titulo, saga, fecha_edicion, idioma, categoria, a.nombre, a.apellido, "
				+ "i.ruta FROM libros as l, autor as a, imagenes as i WHERE l." + columna + "=" + valor + " and a.id=l.id_autor and l.isbn=i.isbn;"; 
				
		try {
			this.st = con.createStatement();
			this.rs = st.executeQuery(query);

		} catch (SQLException e) {
			System.out.println("Exception SQL: " + e.getMessage());
			System.out.println("Estado SQL: " + e.getSQLState());
			System.out.println("Codigo del Error: " + e.getErrorCode());
		} 
		return rs;
	}

	public ResultSet leerListaLibro() {
		String query = "SELECT l.isbn, titulo, saga, fecha_edicion, idioma, categoria, a.nombre, a.apellido, "
				+ "i.ruta FROM libros as l, autor as a, imagenes as i WHERE a.id=l.id_autor and l.isbn=i.isbn;";

		try {
			this.st = con.createStatement();
			this.rs = st.executeQuery(query);

		} catch (SQLException e) {
			System.out.println("Exception SQL: " + e.getMessage());
			System.out.println("Estado SQL: " + e.getSQLState());
			System.out.println("Codigo del Error: " + e.getErrorCode());
		}
		return rs;
	}
	
	
	public ResultSet buscarLibro(String isbn){
		
		
		String query="SELECT l.isbn, titulo, saga, fecha_edicion, idioma, categoria, a.nombre, a.apellido, i.ruta FROM libros as l, autor as a, imagenes as i where a.id=l.id_autor and "
				+ "l.isbn=i.isbn and l.isbn='"+isbn+"';";
		logger.debug("-------dentro de leerelemento "+query);
		try {
			this.st=con.createStatement();
			this.rs=st.executeQuery(query);
		} catch (SQLException e) {
			System.out.println("Exception SQL: " + e.getMessage());
			System.out.println("Estado SQL: " + e.getSQLState());
			System.out.println("Codigo del Error: " + e.getErrorCode());
		}
		
		
		return rs;
	}
	
	
}




































