package model;

public class Cuadrado extends Forma{

	private float lado;

	/**
	 * @param lado
	 */
	public Cuadrado(float lado) {
		this.lado = lado;
	}

	@Override
	public float calculaPerimetro() {
		return lado*4;
	}

	@Override
	public float calculaArea() {
		return lado*lado;
	}
	
	
}
