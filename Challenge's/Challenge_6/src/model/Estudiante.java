package model;

import Interfaces.ISetter;

public class Estudiante extends Persona implements ISetter{

	private String curso;
	
	
	public Estudiante(String nombre, String apellido, String nroIdentificacion, String estadoCivil,String curso) {
		super(nombre, apellido, nroIdentificacion, estadoCivil);
		
		this.curso=curso;
	}


	@Override
	public void setter(String nuevo) {
		curso=nuevo;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Estudiante [curso=" + curso + "]";
	}
	
	


	
	
}
