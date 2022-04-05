package app;

import model.Cancion;
import model.ListaDefault;
import model.ListaPremium;

public class Main {

	public static void main(String[] args) {
	
Cancion can = new Cancion("ddd", 5);
Cancion can1 = new Cancion("aaa", 4);
Cancion can2= new Cancion("ccc", 3);
Cancion can3 = new Cancion("bbb", 2);

Cancion can4 = new Cancion("fff", 5);
Cancion can5 = new Cancion("ttt", 4);
Cancion can6= new Cancion("iii", 3);
Cancion can7 = new Cancion("pppp", 2);




ListaDefault listaD = new ListaDefault();
listaD.addLista(can);
listaD.addLista(can1);
listaD.addLista(can2);
listaD.addLista(can3);

ListaPremium listaP = new ListaPremium();
listaP.addLista(can4);
listaP.addLista(can5);
listaP.addLista(can6);
listaP.addLista(can7);

System.out.println("DEFAULT");
listaD.reproducirLista();
System.out.println("PREMIUM");
listaP.reproducirLista();




	}

}
