package finalProject_db2.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    static Connection conexion = null;

	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String usuario = "FINAL_PROJECT";
	private static String contrase�a = "123";


	public static Connection getConnection(){

		 try {
			 	// Establecer la conexi�n
	            conexion = DriverManager.getConnection(url, usuario, contrase�a);

	    		return conexion;

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		return conexion;
	}
}
