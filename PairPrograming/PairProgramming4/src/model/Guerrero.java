package model;

public class Guerrero extends Personaje {
	
	
	public Guerrero(String nombre,int vida) {
		super(nombre);
		setVida(vida);
		setDefensa(70);
	}
	
	 public void defender() {
	    	setDefensa(getDefensa()+5);
	    	setEnergia(getEnergia()-40);

	    }


	 

}
