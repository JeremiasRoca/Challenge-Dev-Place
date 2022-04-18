package BDDVendedor;

import java.sql.PreparedStatement;
import java.sql.SQLException;



import model.Vendedor;

public class InsertVendedor {


public boolean insertado = false;
	
	public InsertVendedor(Vendedor vend) throws SQLException{
		
		BaseVendedor dbc = new BaseVendedor();
		if(dbc.getConnection()!= null) {
			try {
				String query= "INSERT INTO vendedor (nombre,apellido,dni,direccion,salario,fechaNacimiento,idFacturacion) values(?,?,?,?,?,?,?)";
				PreparedStatement st = dbc.getConnection().prepareStatement(query);
				
				st.setString(1,vend.getNombre());
				st.setString(2, vend.getApellido());
				st.setString(3, vend.getDni());
				st.setString(3, vend.getDireccion());
				st.setDouble(3, vend.getSalario());
				st.setDate(4, (java.sql.Date) vend.getFechaNacimiento());
				st.setInt(5, vend.getIdFacturacion());
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
