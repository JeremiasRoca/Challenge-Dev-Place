package model;

import Interfaces.ISetter;

public class Personal extends Persona implements ISetter{

	private int añoIncorporacion;
	private String nroDespacho;
	
	public Personal(String nombre, String apellido, String nroIdentificacion, String estadoCivil,int añoIncorporacion,String nroDespacho) {
		super(nombre, apellido, nroIdentificacion, estadoCivil);	
		this.añoIncorporacion=añoIncorporacion;
		this.nroDespacho=nroDespacho;
		
	}


	
	@Override
	public void setter(String nuevo) {
		nroDespacho=nuevo;
		
	}
	
	
	@Override
	public String toString() {
		return "Personal [añoIncorporacion=" + añoIncorporacion + ", nroDespacho=" + nroDespacho + "]";
	}


	
	

}
