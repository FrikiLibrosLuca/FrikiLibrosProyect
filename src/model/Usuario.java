package model;

public class Usuario {
	private String usuario;
	private String correo;
	private String contrasena;
	private boolean privilegios;
	
	////constructor
	public Usuario() {
		super();
	}
	public Usuario(String usuario, String correo, String contrasena, boolean privilegios) {
		super();
		this.usuario = usuario;
		this.correo = correo;
		this.contrasena = contrasena;
		this.privilegios = privilegios;
	}
	
	///gettes y settes
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public boolean isPrivilegios() {
		return privilegios;
	}
	public void setPrivilegios(boolean privilegios) {
		this.privilegios = privilegios;
	}
	
	
	/////toString
	@Override
	public String toString() {
		return "Usuario [usuario=" + usuario + ", correo=" + correo + ", contrasena=" + contrasena + ", privilegios="
				+ privilegios + "]";
	}
	
	
	///hashCode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contrasena == null) ? 0 : contrasena.hashCode());
		result = prime * result + ((correo == null) ? 0 : correo.hashCode());
		result = prime * result + (privilegios ? 1231 : 1237);
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		Usuario other = (Usuario) obj;
		if (contrasena == null) {
			if (other.contrasena != null)
				return false;
		} else if (!contrasena.equals(other.contrasena))
			return false;
		if (correo == null) {
			if (other.correo != null)
				return false;
		} else if (!correo.equals(other.correo))
			return false;
		if (privilegios != other.privilegios)
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	
}