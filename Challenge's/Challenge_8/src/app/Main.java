package app;

import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

import BaseDDCliente.InsertCliente;
import model.Cliente;

public class Main {

	public static void main(String[] args)throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("hola");
		
		int opcion=0;
		do {
			menu();
			opcion = scan.nextInt();
			
			switch(opcion) {
			case 1:
				/*
				Producto pro1 = new Producto("123asd",12.5,2,100,1,false);
				Producto pro2 = new Producto("321dfg",10.5,5,150,2,false);
				Producto pro3 = new Producto("147ttt",52.5,10,100,3,false);
				Producto pro4 = new Producto("999jhg",92.5,3,1000,1,false);
				InsertClass userinsert1 = new InsertClass(pro1);
				InsertClass userinsert2 = new InsertClass(pro2);
				InsertClass userinsert3 = new InsertClass(pro3);
				InsertClass userinsert4 = new InsertClass(pro4);
				if(userinsert1.getInsertado()) {
					 System.out.println("Registro 1 Insertado");
				}
				else {
					 System.out.println("Registro No Insertado");
				}
				if(userinsert2.getInsertado()) {
					 System.out.println("Registro 1 Insertado");
				}
				else {
					 System.out.println("Registro No Insertado");
				}
				if(userinsert3.getInsertado()) {
					 System.out.println("Registro 1 Insertado");
				}
				else {
					 System.out.println("Registro No Insertado");
				}
				if(userinsert4.getInsertado()) {
					 System.out.println("Registro 1 Insertado");
				}
				else {
					 System.out.println("Registro No Insertado");
				}
				*/
				break;
			case 2:
				/*
				Date d1 = new Date(2000-03-04);
				Vendedor vend1 = new Vendedor("pepe","perez","12345678", "los tronxos 123",13000.0,d1,1);
				Vendedor vend2 = new Vendedor("pepe2","GOMEZ","4654", "los tronxos 1423",1000.0,d1,2);
				Vendedor vend3 = new Vendedor("pepe3","REMIREZ","111111", "los tronxos 10",130000.0,d1,1);
				Vendedor vend4 = new Vendedor("pepe4","ROCA","852852", "los tronxos 1111",15000.0,d1,3);
				Vendedor vend5 = new Vendedor("pepe5","GONZALEZ","999987", "los tronxos 200",155000.0,d1,2);
				
				InsertClass vendinsert1 = new InsertClass(vend1);
				InsertClass vendinsert2 = new InsertClass(vend2);
				InsertClass vendinsert3 = new InsertClass(vend3);
				InsertClass vendinsert4 = new InsertClass(vend4);
				InsertClass vendinsert5 = new InsertClass(vend5);
				if(vendinsert1.getInsertado()) {
					 System.out.println("Registro 1 Insertado");
				}
				else {
					 System.out.println("Registro No Insertado");
				}
				if(vendinsert2.getInsertado()) {
					 System.out.println("Registro 2 Insertado");
				}
				else {
					 System.out.println("Registro No Insertado");
				}
				if(vendinsert3.getInsertado()) {
					 System.out.println("Registro 3 Insertado");
				}
				else {
					 System.out.println("Registro No Insertado");
				}
				if(vendinsert4.getInsertado()) {
					 System.out.println("Registro 4 Insertado");
				}
				else {
					 System.out.println("Registro No Insertado");
				}
				if(vendinsert5.getInsertado()) {
					 System.out.println("Registro 5 Insertado");
				}
				else {
					 System.out.println("Registro No Insertado");
				}
				*/
				break;
			case 3:
				
				Date d2 = new Date(2000-05-16);
				Cliente cli1 = new Cliente("pepo","perez","12345678", d2,1);
				Cliente cli2 = new Cliente("pepo2","GOMEZ","4654",d2,2);
				Cliente cli3 = new Cliente("pepo3","REMIREZ","111111",d2,1);
				Cliente cli4 = new Cliente("pepo4","ROCA","852852", d2,3);
				Cliente cli5 = new Cliente("pepo5","GONZALEZ","999987", d2,2);
				
			
				InsertCliente cliInsert1 = new InsertCliente(cli1);
				InsertCliente cliInsert2 = new InsertCliente(cli2);
				InsertCliente cliInsert3 = new InsertCliente(cli3);
				InsertCliente cliInsert4 = new InsertCliente(cli4);
				InsertCliente cliInsert5 = new InsertCliente(cli5);
				if(cliInsert1.getInsertado()) {
					 System.out.println("Registro 1 Insertado");
				}
				else {
					 System.out.println("Registro No Insertado");
				}
				if(cliInsert2.getInsertado()) {
					 System.out.println("Registro 2 Insertado");
				}
				else {
					 System.out.println("Registro No Insertado");
				}
				if(cliInsert3.getInsertado()) {
					 System.out.println("Registro 3 Insertado");
				}
				else {
					 System.out.println("Registro No Insertado");
				}
				if(cliInsert4.getInsertado()) {
					 System.out.println("Registro 4 Insertado");
				}
				else {
					 System.out.println("Registro No Insertado");
				}
				if(cliInsert5.getInsertado()) {
					 System.out.println("Registro 5 Insertado");
				}
				else {
					 System.out.println("Registro No Insertado");
				}
				
				
				break;
			case 4:
				/*
				Date d3 = new Date(2000-05-16);
				Facturacion fac1 = new Facturacion(123,d3,"pepo4","pepe2","a");
				Facturacion fac2 = new Facturacion(123,d3,"pepo2","pepe3","a");
				Facturacion fac3 = new Facturacion(123,d3,"pepo3","pepe4","a");
				InsertClass facInsert1 = new InsertClass(fac1);
				InsertClass facInsert2 = new InsertClass(fac2);
				InsertClass facInsert3 = new InsertClass(fac3);
				
				if(facInsert1.getInsertado()) {
					 System.out.println("Registro 1 Insertado");
				}
				else {
					 System.out.println("Registro No Insertado");
				}
				if(facInsert2.getInsertado()) {
					 System.out.println("Registro 2 Insertado");
				}
				else {
					 System.out.println("Registro No Insertado");
				}
				if(facInsert3.getInsertado()) {
					 System.out.println("Registro 3 Insertado");
				}
				else {
					 System.out.println("Registro No Insertado");
				}
				*/
				break;
			default:
				System.out.println("\nIngrese una opcion valida\n");
				break;
			}
			
			
		}while(opcion!=0);
		
		
	}
	
	public static void menu() {
		System.out.println("\n\t\t\t<<<MENU>>>");
		System.out.println("|1|.carga producto");
		System.out.println("|2|.vendedor");
		System.out.println("|3|.cliente");
		System.out.println("|4|.factura");
	}
}
