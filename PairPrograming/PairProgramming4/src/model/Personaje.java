package model;

public class Personaje {

	

	    private String nombre;
	    private int vida;
	    private int ataque;
	    private int energia;
	    private int defensa;
	    private boolean ataqueEspecial;
	    
	    public Personaje(String nombre) {
	        this.nombre = nombre;
	        this.vida = 100;
	        this.ataque = 25;
	        this.energia = 200;
	        this.defensa = 50;
	        this.ataqueEspecial = true;
	    }
	    public String getNombre() {
	        return nombre;
	    }
	    protected void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
	    public int getVida() {
	        return vida;
	    }
	    protected void setVida(int vida) {
	        this.vida = vida;
	    }
	    public int getAtaque() {
	        return ataque;
	    }
	    protected void setAtaque(int ataque) {
	        this.ataque = ataque;
	    }
	    public int getEnergia() {
	        return energia;
	    }
	    protected void setEnergia(int energia) {
	        this.energia = energia;
	    }
	    public int getDefensa() {
	        return defensa;
	    }
	    protected void setDefensa(int defensa) {
	        this.defensa = defensa;
	    }
	    
	    
	    
	    public boolean isAtaqueEspecial() {
			return ataqueEspecial;
		}
		protected void setAtaqueEspecial(boolean ataqueEspecial) {
			this.ataqueEspecial = ataqueEspecial;
		}
		public void atacar(Personaje personaje) {
	        int defensa = personaje.defensa;
	        int ataque =this.ataque;
	     
	        if (defensa > 0) {
	            if (defensa >= this.ataque) {
	                personaje.defensa -= this.ataque;
	            }else{
	                int ataqueDirecto = ataque -defensa;
	                personaje.vida -= ataqueDirecto; 
	            }
	        }
	        else {
	            personaje.vida -= this.ataque;
	        }
	        this.energia-= 40;
	    }
	    
	    
	    
	    
	    
	    public void defender() {
	    	this.defensa+=5;
	    	this.energia-=40;
	    }
	    public void descansar() {
	    	this.energia+=70;
	    }
	    
	    public void ataqueEspecial(Personaje personaje) {
	    	if(ataqueEspecial) {
	    		personaje.vida-= 30;
	    		this.ataqueEspecial=false;
	    		  this.energia-= 30;
	    	}else {
	    		System.out.println("Ya se utilizo este ataque");
	    	}
	    	
	    }
	    
	    
	    
		@Override
		public String toString() {
			
			if(vida<0) {
				return "\t\t\t||" + nombre + "||\n vida= MUERTO  - ataque=" + ataque + " - energia=" + energia
						+ " - defensa=" + defensa + " - ataqueEspecial=" + ataqueEspecial + "";
			}else {
				return "\t\t\t||" + nombre + "||\n vida=" + vida + " - ataque=" + ataque + " - energia=" + energia
						+ " - defensa=" + defensa + " - ataqueEspecial=" + ataqueEspecial + "";
			}
			
		}
	    
	
}
