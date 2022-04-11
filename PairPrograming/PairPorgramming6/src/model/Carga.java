package model;

import interfaces.StrategyLimite;


public class Carga extends Avion {

	public Carga(String nombre, String marca, Piloto piloto) {
		super(nombre, marca, piloto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Carga  "+super.toString();
	}

	@Override
	public float limiteAltura() {
		// TODO Auto-generated method stub
		return 750;
	}
	@Override
	public float limiteVelocidad() {
		// TODO Auto-generated method stub
		return 250;
	}
	
	

}
