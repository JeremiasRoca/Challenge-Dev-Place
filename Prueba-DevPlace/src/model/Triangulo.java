package model;

public class Triangulo {

	private int lado1;
	private int lado2;
	private int lado3;
	
	
	
	
	public Triangulo() {
		
	}
	
	public Triangulo(int lado1, int lado2, int lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}




	public String quienSoy() {
		String tipo = new String();
		int opcion=0;
		if(lado1 == lado2 && lado2 == lado3) {
			opcion = 1;
		}else if((lado1 == lado2 && lado2!=lado3) || (lado1==lado3 && lado1 != lado2) || lado2 == lado3 && lado2!=lado1) {
			opcion = 2;
		}else {
			opcion = 3;
		}
		
		switch (opcion) {
		case 1:
			tipo = "Equilatero";
			break;
		case 2:
			tipo = "Isosceles";
			break;
		case 3:
			tipo = "Escaleno";
			break;
		}
		
		return tipo;
	}
	
}
