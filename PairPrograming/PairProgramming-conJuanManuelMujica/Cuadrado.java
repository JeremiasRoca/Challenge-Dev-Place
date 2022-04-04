package PairProgramming;

public class Cuadrado {
	private int lado;

	public Cuadrado(int lado) {
		this.lado = lado;
	}
	
	public int area() {
		return (int) Math.pow(lado, 2);
	}
	
	public int perimetro() {
		return 4*lado;
	}
	
	public int ladoMasLargo() {
		return lado;
	}
	
}
