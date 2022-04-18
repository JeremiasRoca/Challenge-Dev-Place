package BDDFacturacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class BaseFacturacion {

	private static final String urlServer = "jdbc:mysql://localhost:3306/bdd_challenge8";//local: mi puerto/ bdd
	private static final String userDb = "root";
	private static final String passDb = "";
	Connection conectar= null;
	
	
	public  BaseFacturacion() throws SQLException{
		
		try {
			this.conectar =DriverManager.getConnection(urlServer,userDb,passDb);
			
			String query ="SELECT * FROM facturacion";
			Statement st = conectar.createStatement();
			
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				int id = rs.getInt("idFacturacion"); 
				String nroFactura = rs.getString("nroFactura");
				Date fechaCompra = rs.getDate("fechaCompra");
				String clienteCompra = rs.getString("clienteCompra");
				String vendedorFactura = rs.getString("vendedorFactura");
				String detalleProductos = rs.getString("detalleProductos");
				
				System.out.format("%s, %s, %s, %s, %s, %s\n", id,nroFactura,fechaCompra,clienteCompra,vendedorFactura,detalleProductos);
				
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
