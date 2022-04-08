package model;

public class Cliente {

	
	private String nombre;
	private String apellido;
	private int dni;
	private String direccion;
	private String telefono;
	/**
	 * @param nombre
	 * @param apellido
	 * @param dni
	 * @param direccion
	 * @param telefono
	 */
	public Cliente(String nombre, String apellido, int dni, String direccion, String telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", direccion=" + direccion
				+ ", telefono=" + telefono + "]";
	}
	
	
	
}
