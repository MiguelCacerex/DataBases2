package finalProject_db2.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorEmpleado {

	int puerto;
	ServerSocket serverComunicacion;

	PrintWriter outEmpleado;
	BufferedReader inEmpleado;

	// private DataInputStream flujoEntradaComunicacion;
	// private DataOutputStream flujoSalidaComunicacion;

	/*
	 * Constructor de la clase
	 */
	public ServidorEmpleado(int puerto) {
		this.puerto = puerto;
	}

	public void runServer() throws IOException {

		serverComunicacion = new ServerSocket(puerto);

		while (true) {

			System.out.println("<----------------------------Servidor Empleado---------------------------->");
			Socket socketComunicacionEmpleado = null;

			socketComunicacionEmpleado = serverComunicacion.accept();
			System.out.println("Conexión establecida");

			inEmpleado = new BufferedReader(new InputStreamReader(socketComunicacionEmpleado.getInputStream()));
			outEmpleado = new PrintWriter(socketComunicacionEmpleado.getOutputStream(), true);


			iniciarHiloEmpleadoServidor();
		}

	}


	private void iniciarHiloEmpleadoServidor() {

		HiloEmpleadoServidor hiloEmpleadoServidor = new HiloEmpleadoServidor();

		hiloEmpleadoServidor.inicializar(inEmpleado, outEmpleado, this);

		hiloEmpleadoServidor.start();
	}

}
