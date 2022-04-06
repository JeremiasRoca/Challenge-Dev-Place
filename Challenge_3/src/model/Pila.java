package model;

import java.util.EmptyStackException;

public class Pila {

	
	private int size;
	private Object array[];
	int tope=-1;
	
	
	
	public Pila(int size) {
		if(size<=0) {
			throw new IllegalArgumentException("Cantidad de elementos no valida");
		}
		this.size = size;
		this.array = new Object[size];
	}
	
	public void push(Object dato) {
		array[++this.tope]=dato;
	}
	
	public Object pop() {
		return array[this.tope--];
	}
	
	public Object top() {
		return array[tope];
	}
	
	public boolean empty() {
		return tope<0;
	}
	
	public boolean full() {
		return tope==size-1;
	}
	
	public int cantidad() {
		return tope+1;
	}
	
	public void ViewPila() {
		for(int i=0;i<=tope;i++) {
			System.out.print(" |"+array[i].toString()+"| ");
		}
	}
	
	//problema como hago para sumar un objeto???
	private int sumaRecursiva(int n) {
		if(n==1) {
			return 1;
			
		}else {
			return n + sumaRecursiva(n-1);
		}
		
	}
	
	public void muestraPilaGuia(int nro) {
		if(nro<=tope) {
			
			for(int i=tope;tope>=nro;i--) {
				System.out.print(" |"+array[i].toString()+"| ");
			}
		}
		
		
	}
	
	
}
