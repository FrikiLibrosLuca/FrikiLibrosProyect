package model;

public class Autor {
	
	
	String apellidoAutor, nombreAutor;
	
	
	public Autor(){
		
	}
	
	public Autor(String nombreAutor, String apellidoAutor){
		this.nombreAutor=nombreAutor;
		this.apellidoAutor=apellidoAutor;
	}

	public String getApellidoAutor() {
		return apellidoAutor;
	}

	public void setApellidoAutor(String apellidoAutor) {
		this.apellidoAutor = apellidoAutor;
	}

	public String getNombreAutor() {
		return nombreAutor;
	}

	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidoAutor == null) ? 0 : apellidoAutor.hashCode());
		result = prime * result + ((nombreAutor == null) ? 0 : nombreAutor.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Autor [apellidoAutor= " + apellidoAutor + ", nombreAutor= " + nombreAutor + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		if (apellidoAutor == null) {
			if (other.apellidoAutor != null)
				return false;
		} else if (!apellidoAutor.equals(other.apellidoAutor))
			return false;
		if (nombreAutor == null) {
			if (other.nombreAutor != null)
				return false;
		} else if (!nombreAutor.equals(other.nombreAutor))
			return false;
		return true;
	}
	
	

}
