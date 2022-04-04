package PairProgramming;

public class Rectangulo {
	private int ancho,alto;

	public Rectangulo(int ancho, int alto) {
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public int area() {
		return ancho*alto;
	}
	
	public int perimetro() {
		return ancho*2+alto*2;
	}
	
	public int ladoMasLargo() {
		if(ancho>alto) {
			return ancho;
		} else {
			return alto;
		}
	}
}
