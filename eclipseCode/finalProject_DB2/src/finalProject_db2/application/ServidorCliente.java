package finalProject_db2.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorCliente {

	int puerto;
	ServerSocket serverComunicacion;

	PrintWriter outCliente;
	BufferedReader inCliente;

	// private DataInputStream flujoEntradaComunicacion;
	// private DataOutputStream flujoSalidaComunicacion;

	/*
	 * Constructor de la clase
	 */
	public ServidorCliente(int puerto) {
		this.puerto = puerto;
	}

	public void runServer() throws IOException {

		serverComunicacion = new ServerSocket(puerto);

		while (true) {

			System.out.println("<----------------------------Servidor Cliente---------------------------->");
			Socket socketComunicacionCliente = null;

			socketComunicacionCliente = serverComunicacion.accept();

			System.out.println("Conexión establecida");

			inCliente = new BufferedReader(new InputStreamReader(socketComunicacionCliente.getInputStream()));
			outCliente = new PrintWriter(socketComunicacionCliente.getOutputStream(), true);


			iniciarHiloClienteServidor();
		}

	}

	private void iniciarHiloClienteServidor() {

		HiloClienteServidor hiloClienteServidor = new HiloClienteServidor();

		hiloClienteServidor.inicializar(inCliente, outCliente, this);

		hiloClienteServidor.start();
	}


}
