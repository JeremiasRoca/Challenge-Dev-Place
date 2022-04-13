package conexionBDconecxionBD;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateClass {
	public boolean insertado = false;
	public UpdateClass() throws SQLException{
		BaseDeDatos dbc = new BaseDeDatos();
		if(dbc.getConnection()!=null) {
			try {
				String query= "UPDATE cliente SET nombre =?,apellido=? where id =?";
				String query2= "DELETE cliente where id=?";
				PreparedStatement st = dbc.getConnection().prepareStatement(query);
				st.setString(1, "chocho");
				st.setString(2, "tota");
				st.setInt(1,4);
				st.executeUpdate();
			}catch(Exception e) {
				System.out.println("error al insertar");
			}
		}
		
	}

}
