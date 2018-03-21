package control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Libro;
import servicios.ServiciosLibro;

public class GestorLibros {

	static ServiciosLibro serv = new ServiciosLibro();

	public HttpServletRequest gestion(HttpServletRequest rq, HttpServletResponse rp) {

		String opcion = rq.getParameter("opcion");

		Libro lib;
		List<Libro> listadoLibros;
		String plantilla;

		int codError = 0;

		switch (opcion) {
		case "buscarLibro":
			String isbn = rq.getParameter("isbn");
			lib = serv.buscarLibro(isbn);
			rq.setAttribute("libro", lib);

			break;
		case "insertarLibro":
			codError = serv.insertarModificar(rq);
			break;
		case "eliminarLibro":
			String isbn1 = rq.getParameter("isbn");
			codError = serv.borrarLibro(isbn1);
			break;
		case "leerListaLibro":
			String columna = rq.getParameter("columna");
			int valorI;
			String valorS;

			if (columna.equals("sinCategoria")) {
				listadoLibros = serv.leerListaLibro();
				rq.setAttribute("listadoLibros", listadoLibros);
				rq.setAttribute("plantilla", "listaLibros.jsp");
			}

			else {
				if (this.isNumeric(rq.getParameter("valor"))) {
					valorI = Integer.parseInt(rq.getParameter("valor"));
					listadoLibros = serv.leerListaLibro(columna, valorI);
					rq.setAttribute("listadoLibros", listadoLibros);
					rq.setAttribute("plantilla", "listaLibros.jsp");
				} else {
					valorS = rq.getParameter("valor");
					listadoLibros = serv.leerListaLibro(columna, valorS);
					rq.setAttribute("listadoLibros", listadoLibros);
					rq.setAttribute("plantilla", "listaLibros.jsp");
				}
			}
			break;
		}

		if (codError == -1) {
			rq.setAttribute("resultado", "Ha habido un error a la hora de modificar o insertar o eliminar");
			rq.setAttribute("plantilla", "popup.html");
		} else if (codError >= 0) {
			rq.setAttribute("resultado", "Insertado o modificado o eliminar correctamente");
			rq.setAttribute("plantilla", "popup.html");
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

}
