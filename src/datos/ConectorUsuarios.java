package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Usuario;

public class ConectorUsuarios {

	static Connection con = null;
	private Statement st = null;
	private ResultSet rs = null;
	
	public ConectorUsuarios(){
		abrirConnect();
	}

	
	public static void abrirConnect() {
		try {
			String driverClassName = "com.mysql.jdbc.Driver";
			//String driverUrl = "jdbc:mysql://192.168.200.9:8080/frikilibros";
			String driverUrl = "jdbc:mysql://192.168.200.9/frikilibros";
			String user = "proyecto";
			String password = "1234";
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
	
	public ResultSet leerUsuario(String correo){
		String query = "SELECT * FROM usuarios WHERE correo='" + correo + "'";
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
	
	public int insertarUsuario(Usuario user, boolean admin){
		int privilegios = 0;
		if (admin)
			privilegios = 1;
			
		String query = "INSERT INTO usuarios VALUES ('" + user.getUsuario() + "', '" + user.getCorreo() + "', '" + user.getContrasena() +","+privilegios+ ";";
		
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

	public int borrarUsuario(String correo){
		String query = "DELETE FROM usuarios WHERE correo='" + correo + "'";
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
	
	public int modificarUsuario(Usuario user){
			
		String query = "UPDATE usuarios SET correo='" + user.getCorreo() + "', contrasena='" + user.getContrasena() + ";";
		
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
	
}
