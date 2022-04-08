package model;

public class Secretario extends Empleado{
	
	
	private int nroDespacho;
	private int nroFax;
	
	
	

	public Secretario(String nombre, String apellido, int dni, String direccion, String telefono, double salario,int nroDesp, int nroF) {
		super(nombre, apellido, dni, direccion, telefono, salario);
		if(getAntiguedad()>0) {
			salario= salario *1.05* getAntiguedad();
		}
		
		this.nroDespacho = nroDesp;
		this.nroFax = nroF;	
	}




	@Override
	public String toString() {
		return "Secretario "+super.toString()+"[nroDespacho=" + nroDespacho + ", nroFax=" + nroFax + "]";
	}
	
	
	
	

}
