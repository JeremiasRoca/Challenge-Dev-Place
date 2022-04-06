package model;

import java.util.Arrays;

public class UsuarioPremium extends Usuario{
	
	public String[] artistasFavoritos;
	public int contArtistasFav=0;
	
	public UsuarioPremium(String nombre, String apellido, String email) {
		super(nombre, apellido, email);
		this.artistasFavoritos = new String[20];
	}
		
		public void addArtistaFav(String artista) {
			this.artistasFavoritos[contArtistasFav++]=artista;
			
		}

		@Override
		public String toString() {
			return super.toString()+"UsuarioPremium [artistasFavoritos=" + Arrays.toString(artistasFavoritos) + ", contArtistasFav="
					+ contArtistasFav + "]";
		}
		
		
		
		
		// TODO Auto-generated constructor stub
	

}
