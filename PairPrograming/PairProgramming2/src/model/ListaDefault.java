package model;

import java.util.ArrayList;

import Interfaces.IReproducir;

public class ListaDefault implements IReproducir{

private ArrayList<Cancion> array;
	
	
	

	public ListaDefault() {
		this.array =  new ArrayList<Cancion>();
	}
	
	public  void addLista(Cancion son) {
		array.add(son);
	}
	
	
	@Override
	public void eliminaLista(String nombre) {
		System.out.println("Debe comprar Premium para esta funcion");
	}
	


	@Override
	public void reproducirLista() {
		
		System.out.println("Lista se reproduce en forma ordenada");
		
		//muestra lista
		for(int i=0;i<array.size();i++) {
			System.out.println(array.get(i).toString());
		}
		
		
	}

}
