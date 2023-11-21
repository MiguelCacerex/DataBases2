package finalProject_db2.controller;

import finalProject_db2.application.AplicacionCliente;
import finalProject_db2.application.Empleado;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;

public class GestionServicioAdicionalViewController {

    @FXML
    private Button btnActualizarAutomovil;

    @FXML
    private Button btnActualizarServicioAdicional;

    @FXML
    private Button btnAgregarAutomovil;

    @FXML
    private Button btnAgregarServicioAdicional;

    @FXML
    private Button btnEliminarAutomovil;

    @FXML
    private Button btnEliminarServicioAdicional;

    @FXML
    private Button btnNuevoAutomovil;

    @FXML
    private Button btnNuevoServicioAdicional;

    @FXML
    private TableColumn<?, ?> columCapacidadAutomovil;

    @FXML
    private TableColumn<?, ?> columCodigoAutomovil;

    @FXML
    private TableColumn<?, ?> columCodigoServicioAdicional;

    @FXML
    private TableColumn<?, ?> columColorAutomovil;

    @FXML
    private TableColumn<?, ?> columDescripcionServicioAdicional;

    @FXML
    private TableColumn<?, ?> columEstadoAutomovil;

    @FXML
    private TableColumn<?, ?> columGamaAutomovil;

    @FXML
    private TableColumn<?, ?> columMarcaAutomovil;

    @FXML
    private TableColumn<?, ?> columNombreServicioAdicional;

    @FXML
    private TableColumn<?, ?> columNumPuestosAutomoviles;

    @FXML
    private TableColumn<?, ?> columPlacaAutomovil;

    @FXML
    private TableColumn<?, ?> columPrecioRentaDiaAutomoviles;

    @FXML
    private TableColumn<?, ?> columServicioAdicional;

    @FXML
    private TableColumn<?, ?> columTipoAutomovil;

    @FXML
    private ComboBox<?> comboEstadoAutomovil;

    @FXML
    private ComboBox<?> comboGamaAutomovil;

    @FXML
    private ComboBox<?> comboMarcaAutomovil;

    @FXML
    private ComboBox<?> comboTipoAutomovil;

    @FXML
    private ImageView imagenAutomovil;

    @FXML
    private Tab tabAutomoviles;

    @FXML
    private Tab tabServiciosAdicionales;

    @FXML
    private TableView<?> tableAutomoviles;

    @FXML
    private TableView<?> tableServiciosAdicionales;

    @FXML
    private TextField txtColorAutomovil;

    @FXML
    private TextArea txtDescripcionServicioAdicional;

    @FXML
    private TextField txtNombreServicioAdicional;

    @FXML
    private TextField txtNumPuestosAutomovil;

    @FXML
    private TextField txtPlacaAutomovil;

    @FXML
    private TextField txtPrecioRentaDiaAutomovil;

    @FXML
    private TextField txtPrecioServicioAdicional;

    @FXML
    private TextField txtTipoCombustibleAutomovil;

    private AplicacionCliente aplicacion;

 	private Empleado empleado;

    @FXML
    void actualizarAutomovilAction(ActionEvent event) {

    }

    @FXML
    void actualizarServicioAdicionalAction(ActionEvent event) {

    }

    @FXML
    void agregarAutomovilAction(ActionEvent event) {

    }

    @FXML
    void agregarServicioAdicionalAction(ActionEvent event) {

    }

    @FXML
    void eliminarAutomovilAction(ActionEvent event) {

    }

    @FXML
    void eliminarServicioAdicionalAction(ActionEvent event) {

    }

    @FXML
    void estadoAutomovilAction(ActionEvent event) {

    }

    @FXML
    void gamaAutomovilAction(ActionEvent event) {

    }

    @FXML
    void marcaAutomovilAction(ActionEvent event) {

    }

    @FXML
    void nuevoAutomovilAction(ActionEvent event) {

    }

    @FXML
    void nuevoServicioAdicionalAction(ActionEvent event) {

    }

    @FXML
    void tipoAutomovilAction(ActionEvent event) {

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