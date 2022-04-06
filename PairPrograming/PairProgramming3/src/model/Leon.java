package model;

public class Leon extends Animal{

	public Leon(String nombre) {
		super(nombre);
	
	}
	@Override
	public void jugar() {
		
	if(!dormido && energia<=40) {
		dormido=true;
		ayunas=true;
	}else {
		energia-= 40;
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
		return "Leon []"+ super.toString();
	}
	
	

}
