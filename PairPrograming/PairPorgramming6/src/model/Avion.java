package model;

import interfaces.StrategyLimite;

public abstract class Avion implements StrategyLimite{

	
	private String nombre;
	private String marca;
	private Piloto piloto;
	/**
	 * @param nombre
	 * @param marca
	 * @param piloto
	 */
	
	
	public Avion(String nombre, String marca, Piloto piloto) {
		this.nombre = nombre;
		this.marca = marca;
		this.piloto = piloto;
	}
	@Override
	public String toString() {
		return "Avion [nombre=" + nombre + ", marca=" + marca + ", piloto=" + piloto + "]";
	}
	@Override
	public float limiteAltura() {
		// TODO Auto-generated method stub
		return 500;
	}
	@Override
	public float limiteVelocidad() {
		// TODO Auto-generated method stub
		return 200;
	}
	
	
	
	
	
	
}
