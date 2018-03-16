package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConecJDBC {

	static Connection con = null;
	private Statement st = null;
	private ResultSet rs = null;
	
	public ConecJDBC(){
		abrirConnect();
	}
	
	public static void abrirConnect() {
		try {
			String driverClassName = "com.mysql.jdbc.Driver";
			String driverUrl = "jdbc:mysql://192.168.200.9:8080/frikilibros";
			String user = "root";
			String password = "1111";
			Class.forName(driverClassName);
			con = DriverManager.getConnection(driverUrl, user, password);
			
		} catch (ClassNotFoundException e){
			System.out.println("No se encuentra el driver");
		} catch (SQLException e) {
			System.out.println("Exception SQL: " + e.getMessage());
			System.out.println("Estado SQL: " + e.getSQLState());
			System.out.println("Codigo del Error: " + e.getErrorCode());
		}
	}
	
	public void cerrarConnect() {
		
		try {
			if(rs != null){
			rs.close();
			}
			if(st != null){
				st.close();
			}
			if (con != null){
				con.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public ResultSet leerElemento(String nameTable){
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
	
	public ResultSet leerElemento(String nameTable, String columna, String filtro){
		//String query = "SELECT * FROM " + nameTable + " WHERE " + columna + "=" + "filtro";
		
		String query = "SELECT isbn, titulo, saga, fecha_edicion, idioma, categoria, a.nombre nombreAutor, a.apellido apellidoAutor FROM libros as l, autor as a WHERE l." + columna + "=" + filtro + "and a.id=l.id_autor;";
		
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
	
	/*Estos métodos se realizarán en un futuro*/
	public void addElemento(){}
	
	public void deleteElemento(){}
	
	public void modifyElemento(){}
	
	
	
}
