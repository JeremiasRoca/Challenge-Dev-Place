package model;

public abstract class Usuario {

	private String nombre;
	private String apellido;
	private String email;
	private Cancion[] listaCanciones;
	private int topeCanciones=-1;
	
	/**
	 * @param nombre
	 * @param apellido
	 * @param email
	 */
	public Usuario(String nombre, String apellido, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.listaCanciones= new Cancion[50];
	}
	
	
	

	public void addCancion(Cancion cancion) {
		listaCanciones[++topeCanciones]=cancion;
	}

	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + "]";
	}
	
	
}
