package conexionBDconecxionBD;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertClass {

	public boolean insertado = false;
	
	public InsertClass() throws SQLException{
		
		BaseDeDatos dbc = new BaseDeDatos();
		if(dbc.getConnection()!= null) {
			try {
				String query= "INSERT INTO cliente (nombre,apellido,dni,fechaNacimiento,idFacturacion) values(?,?,?,?,?)";
				PreparedStatement st = dbc.getConnection().prepareStatement(query);
				
				st.setString(1, "jere");
				st.setString(2, "roca");
				st.setString(3, "42630125");
				st.setString(4, null);
				st.setString(5, "1");
				
				st.executeUpdate();
				
				this.insertado = true;
			}catch(SQLException e) {
				System.out.println("Error al insertar");
				System.out.println(e.getStackTrace());
			}
		}else {
			
		}
	}
	
	public boolean getInsertado() {
		return this.insertado;
	}
}
