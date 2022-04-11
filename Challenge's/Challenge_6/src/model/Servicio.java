package model;

import Interfaces.ISetter;

public class Servicio extends Personal implements ISetter{

	private String seccion;
	
	public Servicio(String nombre, String apellido, String nroIdentificacion, String estadoCivil, int a�oIncorporacion,
			String nroDespacho,String seccion) {
		super(nombre, apellido, nroIdentificacion, estadoCivil, a�oIncorporacion, nroDespacho);
		
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
