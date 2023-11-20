package finalProject_db2.application;

import java.io.IOException;

public class AplicacionServerCliente {

	public static void main(String[] args) {

		ServidorCliente servidorCliente = new ServidorCliente(9999);
		try {
			servidorCliente.runServer();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
