package finalProject_db2.application;

import java.io.*;
import java.net.*;

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

        String host = "localhost"; // La dirección IP o el nombre de host del servidor
        int puerto = 9999; // El puerto en el que el servidor está escuchando

        try {
            // El cliente no necesita crear un nuevo socket, simplemente se conecta al servidor
            Socket socket = new Socket(host, puerto);

            // Obtener flujos de entrada y salida para comunicarse con el servidor
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


	public boolean validarCredenciales(String correoAux, String passwordAux) {

		String host = "localhost"; // La dirección IP o el nombre de host del servidor
	        int puerto = 9999; // El puerto en el que el servidor está escuchando

	        try {
	            // El cliente no necesita crear un nuevo socket, simplemente se conecta al servidor
	            Socket socket = new Socket(host, puerto);

	            // Obtener flujos de entrada y salida para comunicarse con el servidor
	            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
	            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));


	            // Enviar usuario y contraseña al servidor
	            out.println("validarCredencialesLogin");
	            out.println(correoAux);
	            out.println(passwordAux);

	            // Recibir la respuesta del servidor
	            String respuesta = in.readLine();

	            mensaje = respuesta;

	            if(mensaje.equals("validado")){
		            socket.close();
	            	return true;
	            }else{
		            socket.close();
	            	return false;
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
			return false;
	}
}