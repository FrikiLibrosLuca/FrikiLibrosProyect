package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Libro {
	private String titulo;
	private String isbn;
	private LocalDate fechaEdicion;
	private String idioma;
	private String categoria;
	private String saga = null;
	private Autor autor;
	private String foto;
	private int stock;
	
	
	
	//////CONSTRUCTOR//////////
	public Libro() {
		super();
	}
	
		
	public Libro(String titulo, String isbn, LocalDate fechaEdicion, String idioma, String categoria, String saga,
			Autor autor, String foto, int stock) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.fechaEdicion = fechaEdicion;
		this.idioma = idioma;
		this.categoria = categoria;
		this.saga = saga;
		this.autor = autor;
		this.foto = foto;
		this.stock = stock;
	}



	public Libro(String titulo, String ISBN, LocalDate fechaEdicion, String idioma, String categoria, String saga,
			Autor autor, String foto) {
		super();
		this.titulo = titulo;
		this.isbn = ISBN;
		this.fechaEdicion = fechaEdicion;
		this.idioma = idioma;
		this.categoria = categoria;
		this.saga = saga;
		this.autor = autor;
		this.foto = foto;
	}

	//sin saga
	public Libro(String titulo, String ISBN, LocalDate fechaEdicion, String idioma, String categoria, Autor autor,
			String foto,int stock) {
		super();
		this.titulo = titulo;
		this.isbn = ISBN;
		this.fechaEdicion = fechaEdicion;
		this.idioma = idioma;
		this.categoria = categoria;
		this.autor = autor;
		this.foto = foto;
		this.stock = stock;
	}

	
	//sin autor y sin categoria
	public Libro(String titulo, String ISBN, LocalDate fechaEdicion, String idioma, String foto, int stock) {
		super();
		this.titulo = titulo;
		this.isbn = ISBN;
		this.fechaEdicion = fechaEdicion;
		this.idioma = idioma;
		this.foto = foto;
		this.stock = stock;
	}

	//sin autor 
	public Libro(String titulo, String ISBN, LocalDate fechaEdicion, String idioma, String categoria, String foto, int stock) {
		super();
		this.titulo = titulo;
		this.isbn = ISBN;
		this.fechaEdicion = fechaEdicion;
		this.idioma = idioma;
		this.categoria = categoria;
		this.foto = foto;
		this.stock = stock;
	}
	
	//sin categoria 
	public Libro(String titulo, String ISBN, LocalDate fechaEdicion, String idioma, Autor autor, String foto, int stock) {
		super();
		this.titulo = titulo;
		this.isbn = ISBN;
		this.fechaEdicion = fechaEdicion;
		this.idioma = idioma;
		this.autor = autor;
		this.foto = foto;
		this.stock = stock;
	}
	
	public Libro(String titulo, String ISBN, LocalDate fechaEdicion, String idioma, int stock) {
		super();
		this.titulo = titulo;
		this.isbn = ISBN;
		this.fechaEdicion = fechaEdicion;
		this.idioma = idioma;
		this.stock = stock;
	}
	
	
	/////gettes y settes////////
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	

	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public LocalDate getFechaEdicion() {
		return fechaEdicion;
	}

	public void setFechaEdicion(String fechaEdicion) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date = LocalDate.parse(fechaEdicion, formatter);		
		this.fechaEdicion = date;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		
		this.categoria = categoria;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
	public String getSaga() {
		return saga;
	}

	public void setSaga(String saga) {
		this.saga = saga;
	}
	
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	/////generar toString////////
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", ISBN=" + isbn + ", FechaEdicion=" + fechaEdicion + ", idioma=" + idioma
				+ ", categoria=" + categoria + ", autor=" + autor + ", foto=" + foto + "]";
	}

	
	//////hashCode y equals///////
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((fechaEdicion == null) ? 0 : fechaEdicion.hashCode());
		result = prime * result + ((foto == null) ? 0 : foto.hashCode());
		result = prime * result + ((idioma == null) ? 0 : idioma.hashCode());
		result = prime * result + ((saga == null) ? 0 : saga.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (categoria != other.categoria)
			return false;
		if (fechaEdicion == null) {
			if (other.fechaEdicion != null)
				return false;
		} else if (!fechaEdicion.equals(other.fechaEdicion))
			return false;
		if (foto == null) {
			if (other.foto != null)
				return false;
		} else if (!foto.equals(other.foto))
			return false;
		if (idioma == null) {
			if (other.idioma != null)
				return false;
		} else if (!idioma.equals(other.idioma))
			return false;
		if (saga == null) {
			if (other.saga != null)
				return false;
		} else if (!saga.equals(other.saga))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}	
	
	
	
}
