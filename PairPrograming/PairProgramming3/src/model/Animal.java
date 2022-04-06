package model;

public abstract class Animal {

	protected String nombre;
	protected int energia;
	protected boolean dormido;
	protected boolean ayunas;
	
	
	
	public Animal(String nombre) {
		this.nombre =nombre;
		this.energia =100;
		this.dormido = false;
		this.ayunas = false;
	}
	
	
	public abstract void jugar();
	public abstract void comer();
	public abstract void dormir();
	
	public  String estadoAnimo() {
		 String animo;
		if(energia<10) {
			animo= "Irritado";
		}else if(energia>=10&& energia<50) {
			animo = "Amigable";
			}else {
				animo = "Feliz";
			}
		
		return animo;
	}
	
	
	
	
	public int getEnergia() {
		return energia;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean getIsDormido() {
		return dormido;
	}
	
	public boolean getIsAyunas() {
		return ayunas;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", Estado de Animo=" + estadoAnimo() + ", dormido=" + dormido + ", ayunas=" + ayunas
				+ "]";
	}
	
	
	
	
}
