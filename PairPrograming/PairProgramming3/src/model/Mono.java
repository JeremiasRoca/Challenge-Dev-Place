package model;

public class Mono extends Animal{

	public Mono(String nombre) {
		super(nombre);
		
	}
	
	public void comerBanana() {
		if(energia<=90) {
			energia+=10;
		}
	}
	
	

	@Override
	public void jugar() {
		
	if(energia<=30 && !dormido) {
		dormido=true;
		ayunas=true;
	}else {
		energia-= 30;
	}
			
	}


	@Override
	public void comer() {
	if(ayunas && !dormido) {
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
		return "Mono []"+super.toString();
	}

}
