package finalProject_db2.application;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

		String consultaSQL = "SELECT * FROM cliente WHERE correo = '"+correo+"' AND password = '"+contrasenia+"'";
		PreparedStatement consulta = null;
	    ResultSet resultadoConsulta = null;
	    Connection conexion = Conexion.getConnection();

		try {
			consulta = conexion.prepareStatement(consultaSQL);
			resultadoConsulta = consulta.executeQuery();

			while (resultadoConsulta.next()) {
				String codigo = resultadoConsulta.getString("cedula");
				String email = resultadoConsulta.getString("correo");

			    String datos = codigo+","+email;

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
