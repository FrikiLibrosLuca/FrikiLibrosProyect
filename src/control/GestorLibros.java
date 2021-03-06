package control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import model.Autor;
import model.Libro;
import servicios.ServiciosLibro;

public class GestorLibros {

	static ServiciosLibro serv = new ServiciosLibro();
	
	private static Logger logger;

    static {
        try {
            logger = LogManager.getLogger(GestorLibros.class);
        } catch (Throwable e) {
            System.out.println("Don't work");
        }
    }

	public HttpServletRequest gestion(HttpServletRequest rq, HttpServletResponse rp) {

		String opcion = rq.getParameter("opcion");
		
		Libro lib;
		List<Libro> listadoLibros;
		List<Autor> listadoAutor;

		int codError;
		String valor;

		switch (opcion) {
		case "buscarLibro":
			String isbn = rq.getParameter("isbn");
			listadoLibros = serv.buscarLibro(isbn);
			rq.setAttribute("libro", listadoLibros.get(0));
			rq.setAttribute("plantilla", "plantillaLibro.jsp");
			
			break;
		case "insertarLibro":
			codError = serv.insertarModificar(rq);
			rq.setAttribute("resultado", false);
			rq.setAttribute("mensaje","Insertado correctamente");
			rq.setAttribute("plantilla", "popUp.jsp");
			//rq=popUp(codError,rq);
			break;
		case "eliminarLibro":
			String isbn1 = rq.getParameter("isbn");
			codError = serv.borrarLibro(isbn1);
			rq.setAttribute("resultado", false);
			rq.setAttribute("mensaje","Eliminado correctamente");
			rq.setAttribute("plantilla", "popUp.jsp");
			//rq=popUp(codError,rq);
			break;
		
		case "listadoGeneral":
			listadoLibros = serv.leerListaLibro();
			rq.setAttribute("listadoLibros", listadoLibros);
			rq.setAttribute("plantilla", "listaLibros.jsp");
			
			break;
		
		case "listadoCategoria":
			valor = rq.getParameter("columna");
			logger.trace("-- trace gestor--> "+valor);
			listadoLibros = serv.leerListaLibro("categoria", valor);
			rq.setAttribute("listadoLibros", listadoLibros);
			rq.setAttribute("plantilla", "listaLibros.jsp");
			
			break;
			
		case "Enviar":
			valor = rq.getParameter("valor");
			if(rq.getParameter("campo").equals("autor")){
				listadoLibros = serv.buscarPorAutor(valor);
			} else {
				listadoLibros = serv.buscarPorTitulo(valor);
			}
			
			rq.setAttribute("listadoLibros", listadoLibros);
			rq.setAttribute("plantilla", "listaLibros.jsp");
			
			break;
		case "buscarAutor":
			listadoAutor = serv.leerListaAutor();
			rq.setAttribute("listadoAutor", listadoAutor);
			rq.setAttribute("plantilla", "insertarLibro.jsp");
		break;
		
		case "stock":
			listadoLibros = serv.leerListaLibro();
			rq.setAttribute("listadoLibros", listadoLibros);
			rq.setAttribute("plantilla", "librosStock.jsp");
			break;
		}

		return rq;

	}

	private boolean isNumeric(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
	
	private HttpServletRequest popUp(int codError, HttpServletRequest rq){
		if (codError == -1) {
			rq.setAttribute("mensaje", "Ha habido un error a la hora de modificar o insertar o eliminar");
			rq.setAttribute("plantilla", "popUp.jsp");
			rq.setAttribute("resultado", true);
			
		} else if (codError >= 0) {
			rq.setAttribute("mensaje", "Insertado o modificado o eliminar correctamente");
			rq.setAttribute("plantilla", "popUp.jsp");
			rq.setAttribute("resultado", false);
		} else {
			rq.setAttribute("mensaje", "No petes");
		}
		return rq;
	}

}
