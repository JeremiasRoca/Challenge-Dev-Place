package PairProgramming;

import java.util.Scanner;

public class MainEjercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio2) Pide el nombre de un alumno y sus notas y calcula la nota mas alta, la mas baja, el promedio y muestra todas sus notas
		Scanner scan = new Scanner(System.in);
		String nombre;
		int op=1;
		int nota;
		
		System.out.println("Indique su nombre: ");
		nombre = scan.next();
		
		Alumno alum = new Alumno(nombre);
		
		while(op==1) {
			System.out.println("Agregue una nota: ");
			nota = scan.nextInt();
			alum.agregarNota(nota);
			System.out.println("Si desea ingresar otra nota ingrese 1, de caso contrario ingrese 0");
			op = scan.nextInt();
		}
		
		System.out.println("Alumno: "+alum.getNombre());
		System.out.println("La nota mas alta es: "+alum.getNotaMasAlta());
		System.out.println("La nota mas baja es: "+alum.getNotaMasBaja());
		System.out.println("El promedio es: "+alum.getPromedio());
		alum.aprobacion();
		alum.getNotas();
	}

}
