package model;

import java.time.LocalDate;

public class Libro {
	private String titulo;
	private int ISBN;
	private LocalDate FechaEdicion;
	private String idioma;
	private Categoria categoria;
	private Autor autor;
	private String foto;
	
	//////CONSTRUCTOR//////////
	public Libro() {
		super();
	}

	public Libro(String titulo, int iSBN, LocalDate fechaEdicion, String idioma, Categoria categoria, Autor autor,
			String foto) {
		super();
		this.titulo = titulo;
		ISBN = iSBN;
		FechaEdicion = fechaEdicion;
		this.idioma = idioma;
		this.categoria = categoria;
		this.autor = autor;
		this.foto = foto;
	}

	//sin autor y sin categoria
	public Libro(String titulo, int iSBN, LocalDate fechaEdicion, String idioma, String foto) {
		super();
		this.titulo = titulo;
		ISBN = iSBN;
		FechaEdicion = fechaEdicion;
		this.idioma = idioma;
		this.foto = foto;
	}

	//sin autor 
	public Libro(String titulo, int iSBN, LocalDate fechaEdicion, String idioma, Categoria categoria, String foto) {
		super();
		this.titulo = titulo;
		ISBN = iSBN;
		FechaEdicion = fechaEdicion;
		this.idioma = idioma;
		this.categoria = categoria;
		this.foto = foto;
	}
	
	//sin categoria 
	public Libro(String titulo, int iSBN, LocalDate fechaEdicion, String idioma, Autor autor, String foto) {
		super();
		this.titulo = titulo;
		ISBN = iSBN;
		FechaEdicion = fechaEdicion;
		this.idioma = idioma;
		this.autor = autor;
		this.foto = foto;
	}
	
	
	/////gettes y settes////////
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public LocalDate getFechaEdicion() {
		return FechaEdicion;
	}

	public void setFechaEdicion(LocalDate fechaEdicion) {
		FechaEdicion = fechaEdicion;
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

	public void setCategoria(Categoria categoria) {
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
	
	
	/////generar toString////////
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", ISBN=" + ISBN + ", FechaEdicion=" + FechaEdicion + ", idioma=" + idioma
				+ ", categoria=" + categoria + ", autor=" + autor + ", foto=" + foto + "]";
	}	
	
}
