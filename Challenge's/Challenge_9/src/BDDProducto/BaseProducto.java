package BDDProducto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class BaseProducto {

	private static final String urlServer = "jdbc:mysql://localhost:3306/bdd_challenge8";//local: mi puerto/ bdd
	private static final String userDb = "root";
	private static final String passDb = "";
	Connection conectar= null;
	
	
	public  BaseProducto() throws SQLException{
		
		try {
			this.conectar =DriverManager.getConnection(urlServer,userDb,passDb);
			
			String query ="SELECT * FROM productos";
			Statement st = conectar.createStatement();
			
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				int id = rs.getInt("idProducto"); 
				String codigoProducto = rs.getString("nombre");
				int precioUnitario = rs.getInt("precioUnitario");
				int cantidad = rs.getInt("cantidad");
				int stockMinimo = rs.getInt("stockMinimo");
				int idFacturacion = rs.getInt("idFacturacion");
				boolean vendido = rs.getBoolean("vendido");
				
				
				System.out.format("%s, %s, %s, %s, %s, %s, %s\n", id,codigoProducto,precioUnitario,cantidad,stockMinimo,idFacturacion,vendido);
				
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
