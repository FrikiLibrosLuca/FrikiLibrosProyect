package servicios;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import model.Libro;

public interface IServiciosLibro {

	List<Libro> buscarLibro(String isbn);
	
	List<Libro> leerListaLibro();
	
	int insertarModificar(HttpServletRequest request);
	
	int borrarLibro(String isbn);
	
	List<Libro> buscarPorTitulo(String titulo);
	
	List<Libro> buscarPorAutor(String autor);
	
}
