package finalProject_db2.application;

import java.io.*;
import java.net.*;

public class Cliente {


	int puerto;
	String host;
	String mensaje;

	String codigo;
	String correo;
	String password;

	// socket cliente
	Socket socketComunicacion;

	public Cliente(String host, int puerto) {
		this.puerto = puerto;
		this.host = host;
	}


	public void iniciarCliente() {

        String host = "localhost"; // La direcci�n IP o el nombre de host del servidor
        int puerto = 9999; // El puerto en el que el servidor est� escuchando

        try {
            // El cliente no necesita crear un nuevo socket, simplemente se conecta al servidor
            Socket socket = new Socket(host, puerto);

            // Obtener flujos de entrada y salida para comunicarse con el servidor
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));


            // Enviar usuario y contrase�a al servidor
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

		String host = "localhost"; // La direcci�n IP o el nombre de host del servidor
	        int puerto = 9999; // El puerto en el que el servidor est� escuchando

	        try {
	            // El cliente no necesita crear un nuevo socket, simplemente se conecta al servidor
	            Socket socket = new Socket(host, puerto);

	            // Obtener flujos de entrada y salida para comunicarse con el servidor
	            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
	            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));


	            // Enviar usuario y contrase�a al servidor
	            out.println("validarCredencialesLogin");
	            out.println(correoAux);
	            out.println(passwordAux);

	            // Recibir la respuesta del servidor
	            String respuesta = in.readLine();

	            mensaje = respuesta;

	            if(mensaje != null && !mensaje.equals("NoValidado")){
		            socket.close();
	            	return mensaje;
	            }else{
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


}