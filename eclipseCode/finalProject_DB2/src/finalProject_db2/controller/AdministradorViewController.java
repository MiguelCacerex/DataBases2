package finalProject_db2.controller;

import finalProject_db2.application.AplicacionCliente;
import finalProject_db2.application.Empleado;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;

public class AdministradorViewController {

    @FXML
    private Button btnCerrarSesionEmpleado;

    @FXML
    private Button btnEditarDatosEmpleado;

    @FXML
    private Button btnGestionArticuloEmpleado;

    @FXML
    private Button btnGestionEmpleado;

    @FXML
    private Button btnGestionInfraestructuraEmpleado;

    @FXML
    private Button btnGestionPaqueteEmpleado;

    @FXML
    private Button btnGestionServicioAdicionalEmpleado;

    @FXML
    private ImageView imagenPerfil;

    @FXML
    private Label labelCorreoEmpleado;

    @FXML
    private Label labelDireccionEmpleado;

    @FXML
    private Label labelEstadoCivilEmpleado;

    @FXML
    private Label labelFechaNacimientoEmpleado;

    @FXML
    private Label labelNombreEmpleado;

    @FXML
    private Label labelTelefonoEmpleado;

    @FXML
    private Label labelTipoEmpleado;

    private AplicacionCliente aplicacion;

	private Empleado empleado;


    @FXML
    void cerrarSesionEmpleadoAction(ActionEvent event) {
    	aplicacion.inicioEmpleado(empleado);
    }

    @FXML
    void editarDatosEmpleadoAction(ActionEvent event) {

    }

    @FXML
    void gestionarArticuloEmpleadoAction(ActionEvent event) {
    	aplicacion.gestionarArticuloAdministrador(empleado);
    }

    @FXML
    void gestionarEmpleadoAction(ActionEvent event) {
    	aplicacion.gestionarEmpleadoAdministrador(empleado);
    }

    @FXML
    void gestionarInfraestructuraEmpleadoAction(ActionEvent event) {
    	aplicacion.gestionarInfraestructuraAdministrador(empleado);
    }

    @FXML
    void gestionarPaqueteEmpleadoAction(ActionEvent event) {
    	aplicacion.gestionarPaqueteAdministrador(empleado);
    }

    @FXML
    void gestionarServicioAdicionalEmpleadoAction(ActionEvent event) {
    	aplicacion.gestionarServicioAdicionaldministrador(empleado);
    }


 // Método para mostrar una alerta
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