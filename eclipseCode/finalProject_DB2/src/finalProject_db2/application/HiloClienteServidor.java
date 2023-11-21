package finalProject_db2.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import finalProject_db2.connection.Conexion;

public class HiloClienteServidor extends Thread {

	// aqui hace la conexion al bd

	private BufferedReader flujoEntradaComunicacion;
	private PrintWriter flujoSalidaComunicacion;

	// private ObjectOutputStream fuljoSalida;

	ServidorCliente servidor;
	private String tipoServicio;

	public void inicializar(BufferedReader in, PrintWriter out, ServidorCliente servidor) {

		this.flujoEntradaComunicacion = in;
		this.flujoSalidaComunicacion = out;
		this.servidor = servidor;
	}

	@Override
	public void run() {

		try {
			tipoServicio = flujoEntradaComunicacion.readLine();

			switch (tipoServicio) {

			case "iniciarAplicacion":
				enviarMensaje("autorizado");
				break;
			case "validarCredencialesLogin":

				String correo = flujoEntradaComunicacion.readLine();
				String contrasenia = flujoEntradaComunicacion.readLine();

				String datos = consultarUser(correo, contrasenia);

				if (datos != null) {
					enviarMensaje(datos);
				} else {
					enviarMensaje("NoValidado");
				}

				break;

			default:
				break;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private String consultarUser(String correo, String contrasenia) {

	    Connection conexion = Conexion.getConnection();
        CallableStatement retornoConexion = null;

		try {
			 // Llamar a la función utilizando un CallableStatement
			retornoConexion = conexion.prepareCall("{? = call validar_credenciales(?, ?}");

            // Configurar los parámetros de entrada y salida de la función
			retornoConexion.registerOutParameter(1, java.sql.Types.VARCHAR);
			retornoConexion.setString(2, correo);
			retornoConexion.setString(3, contrasenia);

            // Ejecutar la llamada a la función
			retornoConexion.execute();

			String resultado = retornoConexion.getString(1);

			if(resultado != null){
				return resultado;
			}

			return null;

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
            // Cerrar los recursos en un bloque finally para asegurar su liberación
            try {
                if (retornoConexion != null) {
                	retornoConexion.close();
                }
                if (conexion != null) {
                	conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
		return null;
	}

	private void enviarMensaje(String mensaje) {
		flujoSalidaComunicacion.println(mensaje);
	}

}
