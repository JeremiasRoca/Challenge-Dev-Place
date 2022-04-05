package model;

import java.util.ArrayList;
import java.util.Arrays;

import Interfaces.IReproducir;

public class ListaPremium implements IReproducir{

private ArrayList<Cancion> array;
	
	
	

	public ListaPremium() {
		this.array =  new ArrayList<Cancion>();
	}
	
	public  void addLista(Cancion son) {
		array.add(son);
	}
	

	@Override
	public void eliminaLista(String nombre) {
		boolean flag=false;
		int i=0;
		while(!flag && i<array.size()) {
			if(array.get(i).getNombre().equals(nombre)){
				flag=true;
				array.remove(i);	
			}
			i++;
		}
		
		
		
	}
	
	public void ordenaLista() {
		Cancion aux;
		for (int i = 0; i < array.size() - 1; i++) {
	        for (int j = i + 1; j < array.size(); j++) {
	        	if(array.get(i).getNombre().compareTo( array.get(j).getNombre())>0) {// segunda cadena es mas grande
	       
	                aux = array.get(i);
	                array.add(i, array.get(j));
	                array.add(j, aux);
	     
	            }
	        }
	    }
		
		
		System.out.println("\n");
		for(int i=0;i<array.size();i++) {
			
				System.out.print(array.get(i).toString()+" - ");
			
			
		}
	}
	
	
	public float duracionTotal() {
		float total=0;
		
		for(int i=0; i<array.size();i++) {
			total =total+ array.get(i).getDuracion();
		}
		
		return total;
	}
	
	
	@Override
	public void reproducirLista() {
		float duracion = duracionTotal();
		System.out.println("Lista se reproduce a gusto del usuario");
		System.out.println("La duracion total de la lista es: "+ duracion);
		//muestra lista
		
		for(int i=0;i<array.size();i++) {
			System.out.println(array.get(i).toString());
		}
		
	}

}
