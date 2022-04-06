package app;

import model.Pila;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pila pilita = new Pila (5);
Integer nro1 = 5;
Integer nro2 = 15;
Integer nro3 = 25;
Integer nro4 = 55;
if(!pilita.full()) {
	pilita.push(nro1);
}
if(!pilita.full()) {
	pilita.push(nro2);
}
if(!pilita.full()) {
	pilita.push(nro3);
}
if(!pilita.full()) {
	pilita.push(nro4);
}
if(!pilita.empty()) {
	System.out.println("Desapilo el tope de valor: "+pilita.pop());
}
if(!pilita.empty()) {
	System.out.println("En el tope esta el valor : "+pilita.top());
}

System.out.println("La cantidad actual de los elementos de la pila es: "+pilita.cantidad());

pilita.ViewPila();

	}

}
