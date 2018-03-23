package servicios;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import model.Libro;
import model.Usuario;

public interface IServiciosUsuario {

	Usuario leerUsuario(String nombre);
	
	int insertarModificarUsuario(HttpServletRequest request);
	
	int borrarUsuario(String nombre);
	
}
