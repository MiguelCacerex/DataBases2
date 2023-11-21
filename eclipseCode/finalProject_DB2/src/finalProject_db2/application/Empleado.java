package finalProject_db2.application;

import java.io.*;
import java.net.*;

import finalProject_db2.model.EmpleadoModel;

public class Empleado {

	int puerto;
	String host;
	String mensaje;

	String codigo;
	String correo;
	String password;

	// socket cliente
	Socket socketComunicacion;

	public Empleado(String host, int puerto) {
		this.puerto = puerto;
		this.host = host;
	}

	public void iniciarEmpleado() {

		String host = "localhost"; // La dirección IP o el nombre de host del
									// servidor
		int puerto = 7777; // El puerto en el que el servidor está escuchando

		try {
			// El cliente no necesita crear un nuevo socket, simplemente se
			// conecta al servidor
			Socket socket = new Socket(host, puerto);

			// Obtener flujos de entrada y salida para comunicarse con el
			// servidor
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// Enviar tarea al sevidor
			out.println("iniciarAplicacion");

			// Recibir la respuesta del servidor
			String respuesta = in.readLine();

			mensaje = respuesta;

			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String validarCredenciales(String correoAux, String passwordAux) {

		String host = "localhost"; // La dirección IP o el nombre de host del
									// servidor
		int puerto = 7777; // El puerto en el que el servidor está escuchando

		try {
			// El cliente no necesita crear un nuevo socket, simplemente se
			// conecta al servidor
			Socket socket = new Socket(host, puerto);

			// Obtener flujos de entrada y salida para comunicarse con el
			// servidor
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// Enviar usuario y contraseña al servidor
			out.println("validarCredencialesLogin");
			out.println(correoAux);
			out.println(passwordAux);

			// Recibir la respuesta del servidor
			String respuesta = in.readLine();

			mensaje = respuesta;

			if (mensaje != null && !mensaje.equals("NoValidado")) {
				socket.close();
				return mensaje;
			} else {
				socket.close();
				return null;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}



	public String registrarEmpleado(String empleadoNuevo) {

		String host = "localhost"; // La dirección IP o el nombre de host del
									// servidor
		int puerto = 7777; // El puerto en el que el servidor está escuchando

		try {
			// El cliente no necesita crear un nuevo socket, simplemente se
			// conecta al servidor
			Socket socket = new Socket(host, puerto);

			// Obtener flujos de entrada y salida para comunicarse con el
			// servidor
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// Enviar usuario y contraseña al servidor
			out.println("registrarEmpleado");
			out.println(empleadoNuevo);



			// Recibir la respuesta del servidor
			String respuesta = in.readLine();

			mensaje = respuesta;

			if (mensaje != null && !mensaje.equals("Empleado NO registrado")) {
				socket.close();
				return mensaje;
			} else {
				socket.close();
				return null;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}



	public String obtenerEmpleados() {

		String host = "localhost"; // La dirección IP o el nombre de host del
									// servidor
		int puerto = 7777; // El puerto en el que el servidor está escuchando

		try {
			// El cliente no necesita crear un nuevo socket, simplemente se
			// conecta al servidor
			Socket socket = new Socket(host, puerto);

			// Obtener flujos de entrada y salida para comunicarse con el
			// servidor
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// Enviar usuario y contraseña al servidor
			out.println("obtenerEmpleados");



			// Recibir la respuesta del servidor
			String respuesta = in.readLine();

			mensaje = respuesta;


			if (mensaje != null && !mensaje.equals("Empleados NO encontrados")) {
				socket.close();
				return mensaje;
			} else {
				socket.close();
				return null;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}







	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



}