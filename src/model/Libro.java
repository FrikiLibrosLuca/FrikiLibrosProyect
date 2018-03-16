package model;

import java.time.LocalDate;

public class Libro {
	private String titulo;
	private String ISBN;
	private LocalDate fechaEdicion;
	private String idioma;
	private Categoria categoria;
	private String saga = null;
	private Autor autor;
	private String foto;
	
	
	//////CONSTRUCTOR//////////
	public Libro() {
		super();
	}
	
	public Libro(String titulo, String ISBN, LocalDate fechaEdicion, String idioma, Categoria categoria, String saga,
			Autor autor, String foto) {
		super();
		this.titulo = titulo;
		this.ISBN = ISBN;
		this.fechaEdicion = fechaEdicion;
		this.idioma = idioma;
		this.categoria = categoria;
		this.saga = saga;
		this.autor = autor;
		this.foto = foto;
	}

	//sin saga
	public Libro(String titulo, String ISBN, LocalDate fechaEdicion, String idioma, Categoria categoria, Autor autor,
			String foto) {
		super();
		this.titulo = titulo;
		this.ISBN = ISBN;
		this.fechaEdicion = fechaEdicion;
		this.idioma = idioma;
		this.categoria = categoria;
		this.autor = autor;
		this.foto = foto;
	}

	
	//sin autor y sin categoria
	public Libro(String titulo, String ISBN, LocalDate fechaEdicion, String idioma, String foto) {
		super();
		this.titulo = titulo;
		this.ISBN = ISBN;
		this.fechaEdicion = fechaEdicion;
		this.idioma = idioma;
		this.foto = foto;
	}

	//sin autor 
	public Libro(String titulo, String ISBN, LocalDate fechaEdicion, String idioma, Categoria categoria, String foto) {
		super();
		this.titulo = titulo;
		this.ISBN = ISBN;
		this.fechaEdicion = fechaEdicion;
		this.idioma = idioma;
		this.categoria = categoria;
		this.foto = foto;
	}
	
	//sin categoria 
	public Libro(String titulo, String ISBN, LocalDate fechaEdicion, String idioma, Autor autor, String foto) {
		super();
		this.titulo = titulo;
		this.ISBN = ISBN;
		this.fechaEdicion = fechaEdicion;
		this.idioma = idioma;
		this.autor = autor;
		this.foto = foto;
	}
	
	public Libro(String titulo, String ISBN, LocalDate fechaEdicion, String idioma) {
		super();
		this.titulo = titulo;
		this.ISBN = ISBN;
		this.fechaEdicion = fechaEdicion;
		this.idioma = idioma;
	}
	
	
	/////gettes y settes////////
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public LocalDate getFechaEdicion() {
		return fechaEdicion;
	}

	public void setFechaEdicion(String fechaEdicion) {
		LocalDate fecha = null;
		fecha=LocalDate.parse(fechaEdicion);
				
		this.fechaEdicion = fecha;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = Categoria.valueOf(categoria);
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

	/////generar toString////////
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", ISBN=" + ISBN + ", FechaEdicion=" + fechaEdicion + ", idioma=" + idioma
				+ ", categoria=" + categoria + ", autor=" + autor + ", foto=" + foto + "]";
	}

	
	//////hashCode y equals///////
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ISBN == null) ? 0 : ISBN.hashCode());
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
		if (ISBN == null) {
			if (other.ISBN != null)
				return false;
		} else if (!ISBN.equals(other.ISBN))
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
