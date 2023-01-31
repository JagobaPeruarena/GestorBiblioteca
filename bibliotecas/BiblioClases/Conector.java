package BiblioClases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
	Connection con;
	public void Conectar() throws ClassNotFoundException, SQLException {
		final String HOST="jdbc:mysql://localhost/";
		final String BBDD="biblioteca";
		final String USERNAME="root";
		final String PASSWORD="";
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(HOST+BBDD,USERNAME,PASSWORD);
	
	}
	public void cerrar() throws SQLException {
		con.close();
	}
	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}
	
}
