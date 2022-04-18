package com.proyect.mongo.ProyectMongo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner (System.in);
    	
    	int opcion=0;
    	String nombre,apellido,dni,direccion;
    	
    	MongoClient mongoClient = MongoClients.create();
        List<Document> database = mongoClient.listDatabases().into(new ArrayList<Document>());//lista la bdd
           
        //database.forEach(db->System.out.println(db.toJson())); muestra las bdd que tengo
        
        MongoDatabase BaseDatos =mongoClient.getDatabase("Users");//nos permite conectarnos con una BDD
        
        //BaseDatos.createCollection("usuario");
               
        MongoCollection<Document> userData =  BaseDatos.getCollection("usuario");//trae datos de books
    	do {
    		menu();
    		opcion=scan.nextInt();
    		
    		switch(opcion) {
    		case 1:
    			System.out.println("Ingrese un nombre");
    			nombre=scan.next();
    			
    			System.out.println("Ingrese un apellido");
    			apellido=scan.next();
    			
    			System.out.println("Ingrese un dni");
    			dni=scan.next();
    			
    			System.out.println("Ingrese una direccion");
    			direccion=scan.next();
    			
    			Document listadInsert = new Document("nombre",nombre).append("apellido", apellido).append("dni", dni).append("direccion", direccion);
    	        userData.insertOne(listadInsert); //inserta uno
    	        //userData2.insertMany(database); ->inserta varios documentos
    			break;
    		case 2:
    			 
    		       
    		      // Document result = userData.find().first();//find selecciono el primer registro
    			 System.out.println("Ingrese el dni a buscar");
    			 dni = scan.next();
    			       			 
    			Document consulta = new Document ("dni",dni);
       			FindIterable<Document> result2 = userData.find().filter(consulta);
       			
       			System.out.println(result2.toString());
       			
    			 
    			break;
    		case 3:
    			System.out.println("Ingrese el dni a eliminar");
    			dni = scan.next();
    			Document elimina = new Document ("dni",dni);
    			userData.findOneAndDelete(elimina);
    			System.out.println("DNI Eliminado");
    		
    			break;
    		case 4:
    			System.out.println("Listado Completo\n\n");
    			MongoCursor<Document> result4 = userData.find().iterator();//recorro la coleccion
    		
    		       while(result4.hasNext()){
    		    	  
    		    	   System.out.println(result4.next().toString());
    		       }
    		       
    			break;
    		}
    		
    	}while(opcion!=0);
    	
     
        
        
           
    
      
       
       //userData2.findOneAndDelete(listadInsert); //elimina uno
    }
    
    public static void menu() {
		System.out.println("\n\t\t\t<<<MENU>>>");
		System.out.println("|1|.Registrar datos");
		System.out.println("|2|.Consultar datos");
		System.out.println("|3|.Elimina datos");
		System.out.println("|4|.Listado general");
	}
    
}