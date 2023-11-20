package finalProject_db2.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import finalProject_db2.connection.Conexion;

public class HiloEmpleadoServidor extends Thread {

	// aqui hace la conexion al bd

	private BufferedReader flujoEntradaComunicacion;
	private PrintWriter flujoSalidaComunicacion;

	//private ObjectOutputStream fuljoSalida;

	ServidorEmpleado servidor;
	private String tipoServicio;

	public void inicializar(BufferedReader in, PrintWriter out, ServidorEmpleado servidor) {

		this.flujoEntradaComunicacion = in;
		this.flujoSalidaComunicacion = out;
		this.servidor = servidor;
	}

	@Override
	public void run() {

		try {
			tipoServicio = flujoEntradaComunicacion.readLine();

			switch (tipoServicio) {

			case "validarCredencialesLogin":

				String correo = flujoEntradaComunicacion.readLine(); //Obtener los datos que envia el cliente al servidor
				String contrasenia = flujoEntradaComunicacion.readLine();

				//llamar metodos que se necesiten

				break;

			default:
				break;
			}


		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private String nombreMetodo(String parametros) {

		//Este bloque es obligatorio en todo metodo ------------------

		String consultaSQL = "CONSULTA";
		PreparedStatement consulta = null;
	    ResultSet resultadoConsulta = null;
	    Connection conexion = Conexion.getConnection();

	    //---------------------------------------------

		try {

			//Este bloque es obligatorio en todo metodo -----------------------
			consulta = conexion.prepareStatement(consultaSQL);
			resultadoConsulta = consulta.executeQuery();
			//--------------------------------------------------

			//Ciclo que recorreo los resultados
			while (resultadoConsulta.next()) {
				String codigo = resultadoConsulta.getString("codigo"); //trae el dato de la fila en la columna cedula;


			    String datos = codigo+",otros columnas separadas por comas"; //aqui almacenas los datos de la respuesta en strings

			    return datos;
            }

			return null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private void enviarMensaje(String mensaje) {
		flujoSalidaComunicacion.println(mensaje);
	}


}
