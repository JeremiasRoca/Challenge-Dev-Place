package model;

public class Particular extends Vehiculo {

	private int nroPuertas;
	
	public Particular(String matricula,int nroPuertas) {
		super(matricula);
		this.nroPuertas=nroPuertas;
		
	}
	
	
	public int getNroPuertas(){
		return nroPuertas;
	}


	@Override
	public String toString() {
		return "Particular [nroPuertas=" + nroPuertas + "]"+super.toString();
	}
	
	

}
