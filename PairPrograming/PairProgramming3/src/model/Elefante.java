package model;

public class Elefante extends Animal {


	
	public Elefante(String nombre) {
		super(nombre);
	
	}

	@Override
	public void jugar() {
		
	if(!dormido && energia<50) {
		dormido=true;
	}else {
		energia-= 50;
	}
			
	}

	@Override
	public void comer() {
	if(!dormido && ayunas) {
		ayunas =false;
	}
		
	}

	
	
	@Override
	public void dormir() {
	if(energia<40 && !dormido) {
		dormido=true;
		energia=100;
		ayunas=true;
	}
		
	}

	@Override
	public String toString() {
		return "Elefante []"+super.toString();
	}

	

}
