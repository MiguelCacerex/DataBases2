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

public class GestionArticuloViewController {

    @FXML
    private Button btnActualizarArticulo;

    @FXML
    private Button btnAgregarArticulo;

    @FXML
    private Button btnEliminarArticulo;

    @FXML
    private Button btnNuevoArticulo;

    @FXML
    private TableColumn<?, ?> columCodigoArticulo;

    @FXML
    private TableColumn<?, ?> columDescripcionArticulo;

    @FXML
    private TableColumn<?, ?> columEstadoArticulo;

    @FXML
    private TableColumn<?, ?> columNombreArticulo;

    @FXML
    private TableColumn<?, ?> columPrecioArticulo;

    @FXML
    private TableColumn<?, ?> columTipoArticulo;

    @FXML
    private TableColumn<?, ?> columUnidadesStockArticulo;

    @FXML
    private ComboBox<?> comboEstadoArticulo;

    @FXML
    private ComboBox<?> comboTipoArticulo;

    @FXML
    private ImageView imagenHotel;

    @FXML
    private Tab tabHoteles;

    @FXML
    private TableView<?> tableArticulos;

    @FXML
    private TextArea txtDescripcionArticulo;

    @FXML
    private TextField txtNombreArticulo;

    @FXML
    private TextField txtPrecioArticulo;

    @FXML
    private TextField txtUnidadesStockArticulo;

    private AplicacionCliente aplicacion;

	private Empleado empleado;

    @FXML
    void actualizarArticuloAction(ActionEvent event) {

    }

    @FXML
    void agregarArticuloAction(ActionEvent event) {

    }

    @FXML
    void eliminarHotelAction(ActionEvent event) {

    }

    @FXML
    void estadoArticuloAction(ActionEvent event) {

    }

    @FXML
    void nuevoArticuloAction(ActionEvent event) {

    }

    @FXML
    void tipoArticuloAction(ActionEvent event) {

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
