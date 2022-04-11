package model;

import interfaces.StrategyLimite;


public class Comercial extends Avion  {

	
	
	public Comercial(String nombre, String marca, Piloto piloto) {
		super(nombre, marca, piloto);
		// TODO Auto-generated constructor stub
	}


	@Override
	public float limiteAltura() {
		// TODO Auto-generated method stub
		return 100;
	}
	@Override
	public float limiteVelocidad() {
		// TODO Auto-generated method stub
		return 500;
	}
	

}
