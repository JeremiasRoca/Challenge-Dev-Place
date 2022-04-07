package model;

public class Mago extends Personaje{

	private int cont;
	
	public Mago(String nombre) {
		super(nombre);
		setVida(80);
		
		cont=2;
	}
	
	public Mago(String nombre, int vida) {
		super(nombre);
		setVida(vida);
		cont=2;
	}
	
	public void ataqueEspecial(Personaje personaje) {
    	if(isAtaqueEspecial()) {
    		personaje.setVida(getVida()-50);
    	personaje.setEnergia(getEnergia()-30);
    	if(cont>0) {
    		cont--;
    	}else {
    		setAtaqueEspecial(false);
    	}
    	
    	}else {
    		System.out.println("Ya se utilizo este ataque");
    	}
    	
    }
	

}
