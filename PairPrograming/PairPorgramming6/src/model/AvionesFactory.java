package model;

public class AvionesFactory {

	public Avion AvionesFactory(String avion,String nombre, String marca, Piloto piloto){
		
		if(avion.equals("Caza")) {
			return new Caza(nombre, marca, piloto); 
		}else if(avion.equals("Carga")) {
			return new Carga(nombre, marca, piloto); 
		}else if(avion.equals("Comercial")){
			return new Comercial(nombre, marca, piloto); 
		}else {
			return null;
		}
		
		
	}
	
	
	
}
