package app;

import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		int opcion=0,opcion1=0,opcion2=0,nro1=0,nro2=0;
		boolean valido=true,valido1=true,valido2=true;
		
		int array[]= new int[10];
		
		do {
			menuPrincipal();
			opcion=scan.nextInt();
			
			switch(opcion) {
			
			case 1:
				do {
					
					
					menu();
					opcion1=scan.nextInt();
					
					if(opcion1>0 && opcion1<5) {
						System.out.println("Ingrese un numero");
						nro1=scan.nextInt();
						System.out.println("Ingrese otro numero");
						nro2=scan.nextInt();
					}
					
				
					
					switch(opcion1) {
					case 1:
						System.out.println("El resultado de la suma entre "+nro1+" + "+nro2+" es: "+ suma(nro1, nro2));
						break;
					case 2:
						System.out.println("El resultado de la resta entre "+nro1+" - "+nro2+" es: "+ resta(nro1, nro2));	
						break;
					case 3:
						System.out.println("El resultado de la multiplicacion entre "+nro1+" * "+nro2+" es: "+ multiplicacion(nro1, nro2));
						break;
					case 4:
						if(nro2!=0) {
							System.out.println("El resultado de la division entre "+nro1+" / "+nro2+" es: "+ division(nro1, nro2));
						}else {
							System.out.println("Error matematico!!!!");
						}
						break;
					case 0:
						valido1 = false;
						break;
					default:
						System.out.println("Opcion ingresada no valida");
						break;	
					}
					
				}while(valido1==true);
				break;
				
			case 2:
				viewMinusculas();
				break;
				
			case 3:
				cargaArray(array);
				do {
					
					menu2();
					opcion2=scan.nextInt();
					
					switch(opcion2) {
					case 1:
						System.out.println("El mayor es: " + buscaMayor(array));
						break;
					case 2: 
						System.out.println("El menor es: "+ buscaMenor(array));
						break;
					case 3:
						System.out.println("Numeros Pares:\n");
						MuestraPares(array);
						break;
					case 4: 
						System.out.println("Numeros Impares:\n");
						MuestraImpares(array);
						break;
					case 5:
						System.out.println("Antes de ordenar\n");
						MuestraArray(array);
						
						System.out.println("Ordenacion Ascendente");
					
						OrdenacionAscendente(array);
						
						MuestraArray(array);
						
						break;
					case 6: 
						System.out.println("Antes de ordenar\n");
						MuestraArray(array);
						
						System.out.println("Ordenacion Descendente");
						
						OrdenacionDescendente(array);
						
						MuestraArray(array);
						break;
					case 0:
						valido2 = false;
						break;
					default:
						System.out.println("Opcion ingresada no valida");
						break;
					}
				}while(valido2==true);
				
				
				cargaArray(array);
				MuestraArray(array);
				
				OrdenacionAscendente(array);
				
				MuestraArray(array);
				
				OrdenacionDescendente(array);
				
				MuestraArray(array);
				break;
			case 0:
				valido =false;
				break;
			default:
				System.out.println("Opcion ingresada no valida");
				break;
				
			}
		
		
		
		}while(valido == true);

	}

	public static void menuPrincipal() {
		System.out.println("\n\t\t<<<Challenge 2>>>\n\n");
		System.out.println("|1|. Calculadora");
		System.out.println("|2|. View Minusculas ");
		System.out.println("|3|. Array");
		System.out.println("\n\n|0|. Para salir...");
		}
	
	//1
	public static void menu() {
	System.out.println("\n\t\t<<<CALCULADORA>>>\n\n");
	System.out.println("|1|. SUMA");
	System.out.println("|2|. RESTA");
	System.out.println("|3|. MULTIPLICACION");
	System.out.println("|4|. DIVISION");
	System.out.println("\n\n|0|. Para salir...");
	}
	
	public static int suma(int nro1,int nro2){
		return nro1+nro2;
	}
	
	public static int resta(int nro1,int nro2){
		return nro1-nro2;
	}
	
	public static int multiplicacion(int nro1,int nro2){
		return nro1*nro2;
	}
	
	public static float division(int nro1,int nro2){
		return nro1/nro2;
	}
	
	//2
	public static void viewMinusculas() {
		
		for(char i = 97; i<123;i++) {
			System.out.print(i+" - ");
		}
	}
	
//3
	
	public static void menu2() {
		System.out.println("\n\n\t\t<<<ARRAY>>>\n\n");
		System.out.println("|1|. Mayor numero");
		System.out.println("|2|. Menor numero");
		System.out.println("|3|. Numeros pares");
		System.out.println("|4|. Numeros impares");
		System.out.println("|5|. Ordenamiento de manera ascendente");
		System.out.println("|6|. Ordenamiento de manera descendente");
		System.out.println("\n\n|0|. Para salir...");
		}
	
	public static void cargaArray(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.println("Ingrese el "+(i+1)+ " nro:");
			array[i]=scan.nextInt(); 
		}
	}
	
	public static int buscaMayor(int array[]) {
		int mayor = 0,i=0;
		
		if(i<array.length) {
			mayor = array[i];	
			i++;
		}
		while(i<array.length) {
			if(array[i]>mayor) {
				mayor = array[i];
			}
			i++;
		}
		
		
		return mayor;
	}
	
	public static int buscaMenor(int array[]) {
	int menor = 0,i=0;
		
		if(i<array.length) {
			menor = array[i];	
			i++;
		}
		while(i<array.length) {
			if(array[i]<menor) {
				menor = array[i];
			}
			i++;
		}
		
		
		return menor;
	}
	
	public static void MuestraPares(int array[]) {
		System.out.println("\n");
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				System.out.print(array[i]+" - ");
			}
			
		}
	}
	
public static void MuestraImpares(int array[]) {
	System.out.println("\n");
	for(int i=0;i<array.length;i++) {
		if(array[i]%2!=0) {
			System.out.print(array[i]+" - ");
		}
		
	}
	}

public static void MuestraArray(int array[]) {
	System.out.println("\n");
	for(int i=0;i<array.length;i++) {
		
			System.out.print(array[i]+" - ");
		
		
	}
	}

public static void OrdenacionAscendente(int array[]) {
	int aux=0;
	for (int i = 0; i < array.length - 1; i++) {
        for (int j = i + 1; j < array.length; j++) {
            if (array[i] > array[j]) {
                // ...intercambiarlos, es decir, mover el actual a la derecha y el de la derecha al actual
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
            }
        }
    }
	
}
public static void OrdenacionDescendente(int array[]) {
	int aux=0;
	for (int i = 0; i < array.length - 1; i++) {
        for (int j = i + 1; j < array.length; j++) {
            if (array[i] < array[j]) {
                // ...intercambiarlos, es decir, mover el actual a la derecha y el de la derecha al actual
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
            }
        }
    }
}

	
	
	
	
	
}


