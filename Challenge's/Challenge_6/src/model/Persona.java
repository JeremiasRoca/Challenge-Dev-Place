package model;

import Interfaces.ISetter;

public abstract class Persona implements ISetter{

	private String nombre;
	private String apellido;
	private String nroIdentificacion;
	private String estadoCivil;
	/**
	 * @param nombre
	 * @param apellido
	 * @param nroIdentificacion
	 * @param estadoCivil
	 */
	public Persona(String nombre, String apellido, String nroIdentificacion, String estadoCivil) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroIdentificacion = nroIdentificacion;
		this.estadoCivil = estadoCivil;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", nroIdentificacion=" + nroIdentificacion
				+ ", estadoCivil=" + estadoCivil + "]";
	}
	
	
	@Override
	public void setter(String nuevo) {
		
		this.estadoCivil=nuevo;
		
	}
	
	
}
