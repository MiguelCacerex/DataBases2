package finalProject_db2.controller;

import finalProject_db2.application.AplicacionCliente;
import finalProject_db2.application.Empleado;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;

public class GestionEmpleadoViewController {

    @FXML
    private Button btnActualizarEmpleado;

    @FXML
    private Button btnAgregarEmpleado;

    @FXML
    private Button btnEliminarEmpleado;

    @FXML
    private Button btnNuevoEmpleado;

    @FXML
    private TableColumn<?, ?> columCodigoEmpleado;

    @FXML
    private TableColumn<?, ?> columCorreoEmpleado;

    @FXML
    private TableColumn<?, ?> columDireccionEmpleado;

    @FXML
    private TableColumn<?, ?> columEstadoCivilEmpleado;

    @FXML
    private TableColumn<?, ?> columFechaNacimientoEmpleado;

    @FXML
    private TableColumn<?, ?> columNombreEmpleadod;

    @FXML
    private TableColumn<?, ?> columTelefonoEmpleado;

    @FXML
    private TableColumn<?, ?> columTipoEmpleado;

    @FXML
    private ComboBox<?> comboTipoEmpleado;

    @FXML
    private DatePicker dateFechaNacimientoEmpleado;

    @FXML
    private ImageView imagenEmpleado;

    @FXML
    private Tab tabAutomoviles;

    @FXML
    private TableView<?> tableEmpleados;

    @FXML
    private TextField txtCorreoEmpleado;

    @FXML
    private TextField txtDireccionEmpleado;

    @FXML
    private TextField txtEstadoCivilEmpleado;

    @FXML
    private TextField txtNombreEmpleado;

    @FXML
    private TextField txtPasswordEmpleado;

    @FXML
    private TextField txtTelefonoEmpleado;

    private AplicacionCliente aplicacion;

   	private Empleado empleado;

    @FXML
    void actualizarEmpleadoAction(ActionEvent event) {

    }

    @FXML
    void agregarEmpleadoAction(ActionEvent event) {

    }

    @FXML
    void eliminarEmpleadoAction(ActionEvent event) {

    }

    @FXML
    void marcaAutomovilAction(ActionEvent event) {

    }

    @FXML
    void nuevoEmpleadoAction(ActionEvent event) {

    }


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