package finalProject_db2.application;

import java.io.IOException;

public class AplicacionServerEmpleado {

	public static void main(String[] args) {

		ServidorEmpleado servidorEmpleado = new ServidorEmpleado(7777);
		try {
			servidorEmpleado.runServer();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
