package model;

public class Asesino extends Personaje{

	public Asesino(String nombre,int da�o) {
		super(nombre);
		setAtaque(da�o);
		setDefensa(30);
		
	}
	
	 public void ataqueEspecial(Personaje personaje) {
	    	if(isAtaqueEspecial()) {
	    		personaje.setVida(getVida()-(getAtaque()/2));
	    		setAtaqueEspecial(false);
	    	personaje.setEnergia(getEnergia()-30);
	    	}else {
	    		System.out.println("Ya se utilizo este ataque");
	    	}
	    	
	    }

}
