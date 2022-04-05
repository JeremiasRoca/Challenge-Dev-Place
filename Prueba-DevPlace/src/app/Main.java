package app;

import java.util.Scanner;

import model.Triangulo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int lado1,lado2,lado3;
		boolean flag=true;
		int nro;
		
		System.out.println("Ingrese lado nro° 1");
		lado1 = scan.nextInt();
		System.out.println("Ingrese lado nro° 2");
		lado2 = scan.nextInt();
		System.out.println("Ingrese lado nro° 3");
		lado3 = scan.nextInt();
		
		Triangulo tri = new Triangulo(lado1,lado2,lado3);
		
		int ejemplo[]= {1,2,4,5};
		
		for(int i=0;i<ejemplo.length;i++) {
			System.out.println("valor: "+ejemplo[i]);
		}
		
		System.out.println(tri.quienSoy());
		
		        
		System.out.println("Ingrese un numero");
		nro = scan.nextInt();
		
		//flag =esPrimo(nro);
		flag = esPrimoSwitch(nro);
		if(flag) {
			System.out.println("Es primo");
		}else {
			System.out.println("No es primo");
		}
		
		
	}
	
	public static boolean esPrimo(int nro) {

		boolean flag=true;
		
		if(nro>0 && nro<=14) {
			
			
			int cont=0;
			
			for(int i=1; i<nro;i++) {
				if(nro%i==0) {
					cont++;
				}
			}
			
			if(cont!=1) {
				flag =false;
			}
			

		}
		return flag;
	}
	
	public static boolean esPrimoSwitch(int nro) {
		boolean flag =true;
		
		switch(nro) {
		case 4:
		case 6:
		case 8:
		case 9:
		case 10:
		case 12:
		case 14:
			flag= false;
			break;
			
		}
		return flag;
	}
	
	

}
