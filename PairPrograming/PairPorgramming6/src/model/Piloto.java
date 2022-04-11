package model;

public class Piloto {

	private String nombre,apellido;
	private int antiguedad;
	/**
	 * @param nombre
	 * @param apellido
	 * @param antiguedad
	 */
	public Piloto(String nombre, String apellido, int antiguedad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.antiguedad = antiguedad;
	}
	@Override
	public String toString() {
		return "Piloto [nombre=" + nombre + ", apellido=" + apellido + ", antiguedad=" + antiguedad + "]";
	}
	
	
	
	
}
