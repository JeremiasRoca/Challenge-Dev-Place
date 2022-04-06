package app;

import java.util.Scanner;

import model.Animal;
import model.Elefante;
import model.Leon;
import model.Mono;

public class Main {

	public static void main(String[] args) {
		
		 Animal [][] zoologico= new Animal [3][4];
	        Scanner teclado=new Scanner(System.in);
	        int opcion,opcion2;
	        int cantMonos=0;
	        int cantElefantes=0;
	        int cantLeones=0;
	        String nombre;
	        int x,y;
	        
	        do {
	        	 System.out.println("---------------------------------------------------------------");
	            System.out.println("=Menu Zoologico=");
	            System.out.println("1) Ingresar animal");
	            System.out.println("2) Ver Animal (jaula)");
	            System.out.println("3) Interactuar con animal");
	           System.out.println("4) Mostrar zoologico");
	            
	            System.out.println("0) para salir...");
	            opcion = teclado.nextInt();
	            switch(opcion) {
	                case 1: 
	                    System.out.println("Como se llama? ");
	                    nombre=teclado.next();
	                    System.out.println("Que tipo de animal (1.Mono | 2.Leon | 3.Elefante");
	                    opcion2=teclado.nextInt();
	                    switch(opcion2) {
	                        case 1: 
	                        	
	                            if (cantMonos<4) {
	                            	
	                                zoologico[0][cantMonos]=new Mono(nombre);
	                                cantMonos++;
	                            }else {
	                                System.out.println("Ya esta llena la jaula de Monos");
	                            }
	                            
	                            break;
	                        case 2: 
	                            if (cantLeones<4) {
	                                zoologico[1][cantLeones]=new Leon(nombre);
	                                cantLeones++;
	                            }else {
	                                System.out.println("Ya esta llena el corral de Leones");
	                            }
	                            break;
	                        case 3: 
	                            if (cantElefantes<4) {
	                                zoologico[2][cantElefantes]=new Elefante(nombre);
	                                cantElefantes++;
	                            }else {
	                                System.out.println("Ya esta llena el corral de Elefantes");
	                            }
	                            break;
	                        }
	                    break;
	                    
	                case 2:
	                    System.out.println("En que jaula esta el animal (x,y)");
	                    System.out.print("X= ");
	                    x=teclado.nextInt();
	                    System.out.print("Y= ");
	                    y=teclado.nextInt();
	                    System.out.println("------------------------------------");
	                    System.out.print("==>");
	                    System.out.println( zoologico[x][y].toString());
	                   
	                    break;
	                    
	                case 3:
	                    System.out.println("En que jaula esta el animal (x,y)");
	                    System.out.print("X= ");
	                    x=teclado.nextInt();
	                    System.out.print("Y= ");
	                    y=teclado.nextInt();
	                    System.out.print("Opciones=> 1. Jugar | 2. Darle de Comer | 3. Preguntarle como esta? | 4.Mandarlo a dormir = ");
	                    opcion2=teclado.nextInt();
	                    switch(opcion2) {
	                        case 1:
	                            if (zoologico[x][y]!= null) {
	                                zoologico[x][y].jugar();
	                                if(!zoologico[x][y].getIsDormido()) {
	                                	System.out.println(zoologico[x][y].getNombre() + " se divirtio! ");
	                                }else {
	                                	System.out.println("No pudo Jugar, esta durmiendo");
	                                }
	                                	
	                                
	                            }
	                            break;
	                        case 2:
	                            if (zoologico[x][y]!= null) {
	                            	
	                                zoologico[x][y].comer();
	                                if(zoologico[x][y].getIsDormido()) {
	                                	System.out.println("Esta durmiendo, no puede comer");
	                                }else if(!zoologico[x][y].getIsAyunas()) {
	                                	System.out.println("Ya comio");
	                                }else {
	                                	System.out.println(" A "+zoologico[x][y].getNombre() + " le gusto la comida! ");
	                                }
	                                
	                            };
	                            break;
	                        case 3:
	                            if (zoologico[x][y]!= null) {
	                                System.out.println(zoologico[x][y].getNombre() + " esta "+zoologico[x][y].estadoAnimo());
	                            };
	                            break;
	                        case 4:
	                            if (zoologico[x][y]!= null) {
	                                zoologico[x][y].dormir();
	                                System.out.println(zoologico[x][y].getNombre() +" esta dormido  zzzZZZZ ");
	                            };
	                            break;
	                        
	                    }  
	                case 4:
	                	mostrarZoo(zoologico);
	                	break;
	            }       
	                  
	            
	        }while (opcion!=0);
	    }
	
	private static void mostrarZoo(Animal[][] z) {
		System.out.println("|X/Y|__0__________1__________2__________3_________");
		for (int f=0;f<z.length;f++) {
			System.out.print(f+"|");
			for(int c=0;c<z[0].length;c++) {
				if (z[f][c]!=null) {
					System.out.print("  "+z[f][c].getNombre().toUpperCase()+"  ");
				}else {
					System.out.print("   VACIA    ");
				}
			}
			System.out.println("");
		}
	}
}
	
		
		
		
