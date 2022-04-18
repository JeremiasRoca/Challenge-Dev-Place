package BDDProducto;

import java.sql.PreparedStatement;
import java.sql.SQLException;


import model.Producto;

public class InsertProducto {

public boolean insertado = false;
	
	public InsertProducto(Producto pro) throws SQLException{
		
		BaseProducto dbc = new BaseProducto();
		if(dbc.getConnection()!= null) {
			try {
				String query= "INSERT INTO productos (codigoProducto,precioUnitario,cantidad,stockMinimo,idFacturacion,vendido) values(?,?,?,?,?,?)";
				PreparedStatement st = dbc.getConnection().prepareStatement(query);
			
				st.setString(1, pro.getCodigoProducto());
				st.setDouble(2, pro.getPrecioUnitario());
				st.setInt(3, pro.getCantidad());
				st.setInt(4, pro.getStockMinimo());
				st.setInt(5, pro.getIdFacturacion());
				st.setBoolean(6, pro.isVendido());
				
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
