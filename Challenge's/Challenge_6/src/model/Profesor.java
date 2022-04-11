package model;

import Interfaces.ISetter;

public class Profesor extends Persona implements ISetter{

	private String departamento;
	
	public Profesor(String nombre, String apellido, String nroIdentificacion, String estadoCivil,String departamento) {
		super(nombre, apellido, nroIdentificacion, estadoCivil);


		this.departamento=departamento;
	}


	@Override
	public void setter(String nuevo) {
		departamento=nuevo;
		
	}
	
	@Override
	public String toString() {
		return "Profesor [departamento=" + departamento + "]";
	}

	
	
}
