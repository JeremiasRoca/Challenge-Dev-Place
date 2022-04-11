package app;

import model.Avion;
import model.AvionesFactory;
import model.Caza;
import model.Piloto;
import model.Limite;

public class Main {

	public static void main(String[] args) {
		AvionesFactory factory = new AvionesFactory();
		
		Piloto pilo = new Piloto("pepe","ellido",1);
		Piloto pilo2 = new Piloto("papo","apido",5);
		
		Avion avion = factory.AvionesFactory("Caza", "nombre", "marca", pilo);
		Avion avion2 = factory.AvionesFactory("Carga", "21", "p88", pilo2);

		
		
		
		Caza cas= (Caza) factory.AvionesFactory("Caza", "nombre", "marca", pilo);
		
		
		Limite limite = new Limite(avion);
		
		Limite limite2 = new Limite(avion2);
		
		
		System.out.println(avion.toString());
		System.out.println("altura limite = "+limite.getLimiteAltura());
		System.out.println("velocidad limite = "+limite.getLimiteVelocidad());
		System.out.println("suma limites = "+limite.sumaLimite());
		System.out.println(avion2.toString());
		System.out.println("altura limite = "+limite2.getLimiteAltura());
		System.out.println("velocidad limite = "+limite2.getLimiteVelocidad());
		System.out.println("suma limites = "+limite2.sumaLimite());
	}

}
