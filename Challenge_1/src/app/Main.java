package app;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		float a,b,c,discriminante;
		int nota1,nota2,nota3;
		int nro1,nro2,nro3,mayor,menor;
		float peso,altura,MC;
		float promedio=0;
		String resultado = new String();
		String nro = new String();
		boolean flag=true;
		ArrayList<Integer> array = new ArrayList<Integer>(); 
		/*
		System.out.println("Ingrese su peso");
		peso = scan.nextFloat();
		
		System.out.println("Ingrese su altura");
		altura = scan.nextFloat();
		
		//1
		
		if(altura>0) {
			MC = peso/altura*altura;
			
			if(MC<20) {
				System.out.println("Mal estado");
			}else if(20<=MC && MC<22) {
				System.out.println("Bajo de Peso");
			}else if(22<=MC && MC<25) {
				System.out.println("Peso Normal");
			}else if (25<=MC && MC<30) {
				System.out.println("Sobrepeso");
			}else if(30<=MC && MC<=40) {
				System.out.println("Sobrepeso Cronico");
			}else if(MC>40) {
				System.out.println("Hospitalizado");
			}
			
			
		}else {
			System.out.println("Ingrese una altura valida");
		}
		*/
		
		//2
		/*Realizar un programa para el cálculo de las raíces de ecuación de segundo grado, 
		 * el programa debe diferenciar entre las raíces imaginarias, raíces distintas, raíces iguales.
		 * 
		 */
		/*
		System.out.println("Funcion= A x^2 + B x + C");
		System.out.println("Ingrese el valor de A:");
		a = scan.nextInt();
		System.out.println("Ingrese el valor de B:");
		b = scan.nextInt();
		System.out.println("Ingrese el valor de C:");
		c = scan.nextInt();
		
		discriminante = (b*b) - (4*a*c);
		if(discriminante>0) {
			System.out.println("Las raices son reales y diferentes");
		}else if (discriminante==0) {
			System.out.println("Las raices son reales e iguales");
		}else {
			System.out.println("Las raices son complejas y diferentes");
		}
		*/
		//3
		/*
		System.out.println("Ingrese nota nro° 1");
		nota1 = scan.nextInt();
		System.out.println("Ingrese nota nro° 2");
		nota2 = scan.nextInt();
		System.out.println("Ingrese nota nro° 3");
		nota3 = scan.nextInt();
		
		promedio = (nota1 + nota2 + nota3)/3;
		if(promedio<10) {
			resultado = "Reprobado";
		}else if (promedio>=10 && promedio<15) {
			resultado = "Aprobado";
		}else if(promedio>=15) {
			resultado = "Eximido";
		}
		
		System.out.println(resultado);
		*/
		
		//4
		/*
		System.out.println("Ingrese nro° 1");
		nro1 = scan.nextInt();
		System.out.println("Ingrese nro° 2");
		nro2 = scan.nextInt();
		System.out.println("Ingrese nro° 3");
		nro3 = scan.nextInt();
		
		mayor = nro1;
		if(nro1<nro2 && nro3<nro2) {
			mayor = nro2;
		}else if(nro1<nro3 && nro2<nro3) {
			mayor = nro3;
		}
		
		System.out.println("El mayor es: "+mayor);
		*/
		
		//5
		/*
		System.out.println("Ingrese nro° 1");
		nro1 = scan.nextInt();
		System.out.println("Ingrese nro° 2");
		nro2 = scan.nextInt();
		System.out.println("Ingrese nro° 3");
		nro3 = scan.nextInt();
		
		menor = nro1;
		if(nro1>nro2 && nro3>nro2) {
			menor = nro2;
		}else if(nro3<nro1 && nro3<nro2) {
			menor = nro3;
		}
		
		System.out.println("El menor es: "+menor);
		*/
		
		//6
		System.out.println("Ingrese un  nro");
		nro = scan.next();
		
		for(int i=0; i<nro.length();i++) {
			array.add(Character.getNumericValue(nro.charAt(i))) ;
		}
		System.out.println(array.toString());
		
		int i=0,j=array.size()-1;
		
		
		while(i<j && flag == true) {
			if(array.get(i).toString()==array.get(j).toString())  {
				flag=false;
			}
				
		else {
			i++;
			j--;
		}
		}
		
		if(flag) {
			System.out.println("El numero es CAPICUA");
		}else {
			System.out.println("El numero NO es CAPICUA");
		}
			
	}

	
}
