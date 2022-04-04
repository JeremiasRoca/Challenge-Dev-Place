package app;

import java.util.Scanner;

import model.Triangulo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		Triangulo tri = new Triangulo(1,1,2);
		System.out.println(tri.quienSoy());
		
		boolean flag=true;
		int nro;
		
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
