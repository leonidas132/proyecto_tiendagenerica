package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	Connection cnn;

	public Connection conexionbd() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Conexion Ok");
		} catch (ClassNotFoundException e) {
			System.out.println("Error en Driver" + e);
		}
		try {
			cnn=DriverManager.getConnection("jdbc:mysql://localhost/tiendagenerica","root","Axel2013");
			System.out.println("Conexion Ok");
		} catch (SQLException e) {
			System.out.println("Error con la URL" + e);
		}
		
		return cnn;
	}
}
