package servicios;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import datos.ConectorUsuarios;
import model.Usuario;




public class ServiciosUsuario {
	
	ConectorUsuarios bbdd= new ConectorUsuarios();

	/**
	 * método que recupera un Usuario de la bbdd y crea un objeto usario
	 * @param String correo
	 * @return Objeto tipo Usuario
	 * 
	 */
	public Usuario obtenerUsuario(ResultSet rs){
		
		Usuario usu = new Usuario();

		try {
				usu.setUsuario(rs.getString("usuario"));
				usu.setCorreo(rs.getString("correo"));
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
	public Usuario leerUsuario(String usuario){
		
		ResultSet rs = bbdd.leerUsuario(usuario);
		
		Usuario usu = obtenerUsuario(rs);
		
		return usu;
	}
	
	
	
	public int borrarUsuario(String usuario){
		int resultado;
		
		resultado=bbdd.borrarUsuario(usuario);
		
		return resultado;
	} 
	
	
	public int insertarModificarUsuario(HttpServletRequest request){
		int resultado=-1;
		Usuario user = new Usuario();
		
		user.setUsuario(request.getParameter("usuario"));
		user.setCorreo(request.getParameter("correo"));
		user.setPrivilegios(false);
		user.setContrasena(request.getParameter("contrasena"));
		
		if(request.getParameter("accion").equals("insert")){
			resultado=bbdd.insertarUsuario(user);
		}
		else if (request.getParameter("accion").equals("update")){
			resultado=bbdd.modificarUsuario(user);
		}
		
		return resultado;
	}

	
}
