package finalProject_db2.controller;

import finalProject_db2.application.AplicacionCliente;
import finalProject_db2.application.Cliente;
import finalProject_db2.application.Empleado;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class LoginViewEmpleadoController {

    @FXML
    private Button btnIniciarSesionEmpleado;

    @FXML
    private Text linkCrearCuenta;

    @FXML
    private TextField txtContrase�aEmpleado;

    @FXML
    private TextField txtCorreoEmpleado;


	private AplicacionCliente aplicacion;

	private Empleado empleado;



	 @FXML
	 void initialize() {

	   }


    @FXML
    void crearCuenta(MouseEvent event) {
    	aplicacion.registroEmpleado(empleado);
    }

    @FXML
    void iniciarSesionEmpleadoAction(ActionEvent event) {
    	 String correo = txtCorreoEmpleado.getText();
 	    String password = txtContrase�aEmpleado.getText();

 	    // Verificar si los campos est�n vac�os
 	    if (correo.isEmpty() || password.isEmpty()) {
 	        mostrarAlerta("Campos Vac�os", "Por favor, completa todos los campos.");
 	        return;
 	    }
 		//empleado.iniciarEmpleado();
 	    empleado.validarCredenciales(correo, password);
 	    boolean credencialesValidas = validarCredenciales(correo, password);

 	    if (credencialesValidas) {

 	        mostrarAlerta("Inicio de sesi�n exitoso", "�Bienvenido!" + correo);
 	    } else {
 	        // Si las credenciales son inv�lidas, muestra un mensaje de error
 	        mostrarAlerta("Error de inicio de sesi�n", "Correo o contrase�a incorrectos.");
 	    }
 	}

 	// M�todo para validar las credenciales (simulado, debes reemplazarlo con tu l�gica de validaci�n real)
 	private boolean validarCredenciales(String correo, String password) {

 		String respuesta =  empleado.validarCredenciales(correo,password);

 		if(respuesta != null){

 			String respuestaAux[] = respuesta.split(",");

 			empleado.setCorreo(respuestaAux[0]);
 			empleado.setPassword(respuestaAux[1]);

 			return true;
 		}else{
 			return false;
 		}

 	}

 	// M�todo para mostrar una alerta
 	private void mostrarAlerta(String titulo, String mensaje) {
 	    Alert alert = new Alert(AlertType.INFORMATION);
 	    alert.setTitle(titulo);
 	    alert.setHeaderText(null);
 	    alert.setContentText(mensaje);
 	    alert.showAndWait();
 	}




    public void setEmpleadoAplicacion(AplicacionCliente mainApplication, Empleado empleado) {
		this.aplicacion = mainApplication;
		this.empleado   = empleado;
	}

}
