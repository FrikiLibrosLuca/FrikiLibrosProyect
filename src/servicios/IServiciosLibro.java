package servicios;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import model.Libro;

public interface IServiciosLibro {

	Libro buscarLibro(String isbn);
	
	List<Libro> leerListaLibro();
	
	int insertarModificar(HttpServletRequest request);
	
	int borrarLibro(String isbn);
	
	Libro buscarPorTitulo(String titulo);
	
	List<Libro> buscaPorAutor(String autor);
	
}
