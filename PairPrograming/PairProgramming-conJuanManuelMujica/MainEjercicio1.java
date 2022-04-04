package PairProgramming;

import java.util.Scanner;

public class MainEjercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio1) Elegir una figura y calcular el perimetro,area,lado mas largo
		
		int op;
		Scanner scan = new Scanner(System.in); 
		System.out.print("Ingrese la figura que desea calcular su perimetro,area y lado mas largo (1.Triangulo, 2.Cuadrado, 3.Rectangulo):\nOp: ");
		op = scan.nextInt();
		
		switch(op) {
			case 1:
				Triangulo tri = new Triangulo(2,4,3,3,4);
				System.out.println("Area= "+ tri.area());
				System.out.println("Perimetro= "+tri.perimetro());
				System.out.println("Lado mas largo= "+tri.ladoMasLargo());
				System.out.println("Tipo de triangulo"+tri.quienSoy());
				break;
			case 2: 
				Cuadrado cuad = new Cuadrado(4);
				System.out.println("Area= "+cuad.area());
				System.out.println("Perimetro= "+cuad.perimetro());
				System.out.println("Lado mas largo= "+cuad.ladoMasLargo());
				break;
			case 3:
				Rectangulo rec = new Rectangulo(4,5);
				System.out.println("Area= "+rec.area());
				System.out.println("Perimetro= "+rec.perimetro());
				System.out.println("Lado mas largo= "+rec.ladoMasLargo());
				break;
		}
	}

}
