package PairProgramming;

import java.util.ArrayList;

public class Mazo {
	private ArrayList<Integer> cartas = new ArrayList<Integer>();

	public Mazo() {
	}
	
	public void barajar() {
		for(int i=0;i<10;i++) {
			cartas.add((int) (Math.random()*10));
		}
	}
	
	public int sacarCarta() {
		int carta;
		carta = cartas.get(cartas.size()-1);
		cartas.remove(cartas.size()-1);
		return carta;
	}

	public ArrayList<Integer> getCartas() {
		return cartas;
	}

	public boolean mazoVacio() {
		if(cartas.size()==0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void mostrarMazo() {
		for(int i=0;i<cartas.size();i++) {
			System.out.print(cartas.get(i)+" ");
		}
	}
	
}
