package BDDFacturacion;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Facturacion;

public class InsertFacturacion {

public boolean insertado = false;
	
	public InsertFacturacion(Facturacion fac) throws SQLException{
		
		BaseFacturacion dbc = new BaseFacturacion();
		if(dbc.getConnection()!= null) {
			try {
				String query= "INSERT INTO facturacion (nroFactura,fechaCompra,clienteCompra,vendedorFactura,detalleProductos) values(?,?,?,?,?)";
				PreparedStatement st = dbc.getConnection().prepareStatement(query);
				
				st.setInt(1, fac.getNroFactura());
				st.setDate(2, (Date) fac.getFechaCompra());
				st.setString(3, fac.getClienteCompra());
				st.setString(4, fac.getVendedorFactura());
				st.setString(5, fac.getDetalleProductos());
				st.executeUpdate();
				this.insertado = true;
			
			}catch(SQLException e) {
				System.out.println("Error al insertar");
				System.out.println(e.getStackTrace());
			}
		}
	}
	
	
	

	public boolean getInsertado() {
		return this.insertado;
	}

}
