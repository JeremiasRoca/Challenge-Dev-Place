package model;

import Interfaces.ISetter;

public class Personal extends Persona implements ISetter{

	private int a�oIncorporacion;
	private String nroDespacho;
	
	public Personal(String nombre, String apellido, String nroIdentificacion, String estadoCivil,int a�oIncorporacion,String nroDespacho) {
		super(nombre, apellido, nroIdentificacion, estadoCivil);	
		this.a�oIncorporacion=a�oIncorporacion;
		this.nroDespacho=nroDespacho;
		
	}


	
	@Override
	public void setter(String nuevo) {
		nroDespacho=nuevo;
		
	}
	
	
	@Override
	public String toString() {
		return "Personal [a�oIncorporacion=" + a�oIncorporacion + ", nroDespacho=" + nroDespacho + "]";
	}


	
	

}
