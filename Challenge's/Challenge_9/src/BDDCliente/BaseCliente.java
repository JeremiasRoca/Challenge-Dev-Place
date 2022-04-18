package BDDCliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class BaseCliente {

	private static final String urlServer = "jdbc:mysql://localhost:3306/bdd_challenge8";//local: mi puerto/ bdd
	private static final String userDb = "root";
	private static final String passDb = "";
	Connection conectar= null;
	
	
	public  BaseCliente() throws SQLException{
		
		try {
			this.conectar =DriverManager.getConnection(urlServer,userDb,passDb);
			
			String query ="SELECT * FROM cliente";
			Statement st = conectar.createStatement();
			
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				int id = rs.getInt("idCliente"); 
				String name = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				String dni = rs.getString("dni");
				Date fechaNacimiento = rs.getDate("fechaNacimiento");
				int idFacturacion = rs.getInt("idFacturacion");
				
				System.out.format("%s, %s, %s, %s, %s, %s\n", id,name,apellido,dni,fechaNacimiento,idFacturacion);
				
			}
			
			System.out.println("Conexion creada");
			}catch(SQLException e) {
			
		}
			
	}
	
	
	
	public Connection getConnection() {
		return this.conectar;
	}
	
	public void close() {
		 if (this.conectar != null) {
			try {
				this.conectar.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
