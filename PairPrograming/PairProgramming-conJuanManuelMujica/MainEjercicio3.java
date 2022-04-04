package PairProgramming;

public class MainEjercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Jugador1=0,Jugador2=0;
		Mazo mazo = new Mazo();
		mazo.barajar();
		boolean par = true;
		
		mazo.mostrarMazo();
		
		while(!mazo.mazoVacio()) {
			
			while(par && !mazo.mazoVacio()) {
				Jugador1++;
				if(mazo.sacarCarta()%2==0) {
					par=true;
				} else {
					par=false;
				}
			}
			par = true;
			while(par && !mazo.mazoVacio()) {
				Jugador2++;
				if(mazo.sacarCarta()%2==0) {
					par=true;
				} else {
					par=false;
				}
			}
			par=true;
		}
		mazo.mostrarMazo();
		System.out.println("\n"+Jugador1+" "+Jugador2);
		
		if(Jugador1>Jugador2) {
			System.out.println("Gano el Jugador 1. Tiene "+Jugador1+" cartas");
		} else if(Jugador2>Jugador1) {
			System.out.println("Gano el Jugador 2. Tiene "+Jugador2+" cartas");
		} else {
			System.out.println("Empataron");
		}
	}

}
