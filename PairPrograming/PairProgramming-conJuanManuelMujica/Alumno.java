package PairProgramming;

import java.util.ArrayList;

public class Alumno {
	private	String nombre;
	private ArrayList<Integer> notas = new ArrayList<Integer>();
	public Alumno(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarNota(int nota) {
		notas.add(nota);
	}
	
	public int getNotaMasAlta() {
		int notaMasAlta=0;
		for(int i=0;i<notas.size();i++) {
			if(notas.get(i)>notaMasAlta) {
				notaMasAlta = notas.get(i);
			}
		}
		return notaMasAlta;
	}
	
	public float getPromedio() {
		int sumaNotas=0;
		for(int i=0;i<notas.size();i++) {
			sumaNotas+=notas.get(i);
		}
		return sumaNotas/notas.size();
	}
	
	public int getNotaMasBaja() {
		int notaMasBaja=notas.get(0);
		for(int i=1;i<notas.size();i++) {
			if(notaMasBaja>notas.get(i)) {
				notaMasBaja=notas.get(i);
			}
		}
		return notaMasBaja;
	}
	
	public void getNotaMayorA(int nota) {
		System.out.println("Notas: ");
		for(int i=0;i<notas.size();i++) {
			if(notas.get(i)>=nota) {
				System.out.println(notas.get(i));
			}
		}
	}
	
	public void getNotas() {
		System.out.println("Notas: ");
		for(int i=0;i<notas.size();i++) {
			System.out.println(notas.get(i));
		}
	}
	
	public void aprobacion() {
		float promedio = this.getPromedio();
		//op=1 desaprobado, op=2 habilitado, op=3 promocionado
		int op;		
		if(promedio<4) {
			op=1;
		} else if(promedio>=4 && promedio<7) {
			op=2;
		} else {
			op=3;
		}
		
		switch(op) {
		case 1:
			System.out.println("El alumno esta desaprobado");
			break;
		case 2:
			System.out.println("El alumno esta habilitado");
			break;
		case 3:
			System.out.println("El alumno esta promocionado");
			break;
		}
	}

	public String getNombre() {
		return nombre;
	}
	
	
	
	
}
