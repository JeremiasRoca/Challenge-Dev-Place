package model;

public class Ahorcado {

	private String palabra;
	private String letra;
	private String[] letraPalabra;
	private String[] letrasCorrectasPalabra;
	private  int contador = -1;
	
	public Ahorcado(String palabra) {
		this.palabra = palabra;
	}
	
	public void insertLetra(String letra) {
		this.letra=letra;
	}
	
	
	public boolean verifiLetra () {
		boolean flag =false;
		this.letraPalabra = this.letra.split("");
		this.letrasCorrectasPalabra = new String[this.letraPalabra.length];
		this.contador++;
		
		for(int i=0;i<this.letraPalabra.length;i++) {
			if(this.letraPalabra[i].equals(this.letra)) {
				this.letrasCorrectasPalabra[this.contador] = this.letra;
				flag= true;
			}else {
				flag= false;
			}
		}
		return flag;
	}
	
	public void puntos() {
		
	}
	
		
	
	
		
	}
	
	
	
}
