package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
	
	protected Connection con;

	/**
	 */
	Conector() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				this.con = DriverManager.getConnection("jdbc:mysql://" + Config.HOST + "/" + Config.BBDD, Config.USERNAME, Config.PASSWORD);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		
	}

	public Connection getConexion() {
		return con;
	}

	public void setConexion(Connection conexion) {
		this.con = conexion;
	}
	
}