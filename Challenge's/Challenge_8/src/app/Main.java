package app;

import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

import conexionBDconecxionBD.BaseDeDatos;
import conexionBDconecxionBD.Conexion;
import conexionBDconecxionBD.InsertClass;

public class Main {

	public static void main(String[] args) {
		InsertClass userinsert = null;
		try {
			userinsert = new InsertClass();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(userinsert.getInsertado()) {
			System.out.println("Se inserto el cliente");
		}else {
			System.out.println("Ocurrio un error");
		}
		
		
		
		
	}
}
