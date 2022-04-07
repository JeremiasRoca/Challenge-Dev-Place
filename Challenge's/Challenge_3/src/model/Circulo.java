package model;



public class Circulo extends Forma {

	private float radio;

	/**
	 * @param radio
	 */
	public Circulo(float radio) {
		this.radio = radio;
	}

	@Override
	public float calculaPerimetro() {
	
		return (float) (radio*2*Math.PI);
	}

	@Override
	public float calculaArea() {
		return (float) (Math.PI*radio*radio);
	}
	
	
}
