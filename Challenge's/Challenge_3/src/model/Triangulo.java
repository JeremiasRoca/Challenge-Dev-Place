package model;

public class Triangulo extends Forma {

	private  float lado1;
	private  float lado2;
	private  float lado3;
	private float altura;
	
	
	/**
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 */
	public Triangulo(float lado1, float lado2, float lado3,float altura) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.altura = altura;
	}

	@Override
	public float calculaPerimetro() {
		return lado1+lado2+lado3;
	}

	@Override
	public float calculaArea() {
		return (lado1*altura)/2;
	}

}
