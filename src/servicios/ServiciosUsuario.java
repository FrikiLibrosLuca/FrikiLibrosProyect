package servicios;

import java.sql.ResultSet;
import java.sql.SQLException;

import datos.ConectorUsuarios;
import model.Usuario;




public class ServiciosUsuario {
	
	ConectorUsuarios bbdd= new ConectorUsuarios();

	/**
	 * método que recupera un Usuario dela bbdd y crea un objeto usario
	 * @param String correo
	 * @return Objeto tipo Usuario
	 * 
	 */
	public Usuario obtenerUsuario(ResultSet rs){
		
		Usuario usu = new Usuario();
		
	
		try {
			
				usu.setUsuario(rs.getString("usuario"));
				usu.setCorreo(rs.getString("correo"));
				usu.setContrasena(rs.getString("contrasena"));
				usu.setPrivilegios(rs.getBoolean("privilegios"));
				
				
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return usu;
	}
	/**
	 * método que busca un usuario dado un correo, manda la peticion a la capa datos
	 * @param String correo
	 * @return Objeto tipo Usuario
	 * 
	 */
	public Usuario buscarUsuario(String correo){
		
		ResultSet rs = bbdd.leerElemento("usuario","correo",correo);
		
		Usuario usu = obtenerUsuario(rs);
		
		return usu;
	}
}
