package BaseDDCliente;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import model.Cliente;

public class InsertCliente {

public boolean insertado = false;
	
	public InsertCliente(Cliente cli) throws SQLException{
		
		BDDCliente dbc = new BDDCliente();
		if(dbc.getConnection()!= null) {
			try {
				String query= "INSERT INTO cliente (nombre,apellido,dni,fechaNacimiento,idFacturacion) values(?,?,?,?,?)";
				PreparedStatement st = dbc.getConnection().prepareStatement(query);
				
				st.setString(1, cli.getNombre());
				st.setString(2, cli.getApellido());
				st.setString(3, cli.getDni());
				st.setDate(4, (Date) cli.getFechaNacimiento());
				st.setInt(5, cli.getIdFacturacion());
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
