package model;

import interfaces.StrategyLimite;

public class Caza extends Avion {

	public Caza(String nombre, String marca, Piloto piloto) {
		super(nombre, marca, piloto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Caza  "+super.toString();
	}

	
	@Override
	public float limiteAltura() {
		// TODO Auto-generated method stub
		return 1500;
	}
	@Override
	public float limiteVelocidad() {
		// TODO Auto-generated method stub
		return 750;
	}
	

	
	
	
}
