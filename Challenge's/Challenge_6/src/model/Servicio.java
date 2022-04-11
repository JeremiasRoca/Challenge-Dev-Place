package model;

import Interfaces.ISetter;

public class Servicio extends Personal implements ISetter{

	private String seccion;
	
	public Servicio(String nombre, String apellido, String nroIdentificacion, String estadoCivil, int añoIncorporacion,
			String nroDespacho,String seccion) {
		super(nombre, apellido, nroIdentificacion, estadoCivil, añoIncorporacion, nroDespacho);
		
		this.seccion = seccion;
	}

	

	@Override
	public void setter(String nuevo) {
		seccion=nuevo;
		
	}
	
	
	@Override
	public String toString() {
		return "Servicio [seccion=" + seccion + "]";
	}
	
	

}
