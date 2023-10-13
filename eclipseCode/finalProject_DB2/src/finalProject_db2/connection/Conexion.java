package finalProject_db2.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {

    static Connection conexion = null;
    static PreparedStatement consulta = null;
    static ResultSet resultado = null;

	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String usuario = "FINAL_PROJECT";
	private static String contraseña = "123";


	public static Connection getConnection(String peticionSql){

		 try {

			 	// Establecer la conexión
	            conexion = DriverManager.getConnection(url, usuario, contraseña);

	            System.out.println("Conexion establecida");


	            String sql = "Select * from employees";

	            // Preparar la consulta
	            consulta = conexion.prepareStatement(sql);

	            // Ejecutar la consulta y obtener el resultado
	            resultado = consulta.executeQuery();

	            // Procesar el resultado aquí (por ejemplo, imprimir los resultados)
	            while (resultado.next()) {
	            	System.out.println(resultado);
	            }
	    		return conexion;

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            // Cerrar recursos en un bloque finally
	            try {
	                if (resultado != null) resultado.close();
	                if (consulta != null) consulta.close();
	                if (conexion != null) conexion.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
		return conexion;
	}

	public static void main(String[] args) {
		getConnection("sql");
	}

}
