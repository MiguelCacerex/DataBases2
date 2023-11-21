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

public class GestionInfraestructuraViewController {

    @FXML
    private Button btnActualizarHabitacion;

    @FXML
    private Button btnActualizarHotel;

    @FXML
    private Button btnActualizarInstalacion;

    @FXML
    private Button btnAgregarHabitacion;

    @FXML
    private Button btnAgregarHotel;

    @FXML
    private Button btnAgregarInstalacion;

    @FXML
    private Button btnEliminarHabitacion;

    @FXML
    private Button btnEliminarHotel;

    @FXML
    private Button btnEliminarInstalacion;

    @FXML
    private Button btnNuevaHabitacion;

    @FXML
    private Button btnNuevaInstalacion;

    @FXML
    private Button btnNuevoHotel;

    @FXML
    private TableColumn<?, ?> columCapacidadHabitacion;

    @FXML
    private TableColumn<?, ?> columCiudadHotel;

    @FXML
    private TableColumn<?, ?> columCodigoHabitacion;

    @FXML
    private TableColumn<?, ?> columCodigoHotel;

    @FXML
    private TableColumn<?, ?> columCodigoInstalacion;

    @FXML
    private TableColumn<?, ?> columCorreoHotel;

    @FXML
    private TableColumn<?, ?> columDescripcionInstalacion;

    @FXML
    private TableColumn<?, ?> columDireccionHotel;

    @FXML
    private TableColumn<?, ?> columEstadoHbaitacion;

    @FXML
    private TableColumn<?, ?> columHotelAsociadoHabitacion;

    @FXML
    private TableColumn<?, ?> columHotelInstalacion;

    @FXML
    private TableColumn<?, ?> columNivelHabitacion;

    @FXML
    private TableColumn<?, ?> columNombreHotel;

    @FXML
    private TableColumn<?, ?> columNombreInstalacion;

    @FXML
    private TableColumn<?, ?> columNumCuartosHabitacion;

    @FXML
    private TableColumn<?, ?> columPrecioNocheHabitacion;

    @FXML
    private TableColumn<?, ?> columTelefonoHotel;

    @FXML
    private TableColumn<?, ?> columTipoHabitacion;

    @FXML
    private TableColumn<?, ?> columTipoHotel;

    @FXML
    private TableColumn<?, ?> columTipoInstalacion;

    @FXML
    private ComboBox<?> comboCiudadHotel;

    @FXML
    private ComboBox<?> comboEstadoHabitacion;

    @FXML
    private ComboBox<?> comboHotelAsociadoHabitacion;

    @FXML
    private ComboBox<?> comboHotelAsociadoInstalacion;

    @FXML
    private ComboBox<?> comboNivelHabitacion;

    @FXML
    private ComboBox<?> comboTipoHabitacion;

    @FXML
    private ComboBox<?> comboTipoHotel;

    @FXML
    private ComboBox<?> comboTipoInstalacion;

    @FXML
    private ImageView imagenHabitacion;

    @FXML
    private ImageView imagenHotel;

    @FXML
    private ImageView imagenInstalacion;

    @FXML
    private Tab tabHabitaciones;

    @FXML
    private Tab tabHoteles;

    @FXML
    private Tab tabInstalaciones;

    @FXML
    private TableView<?> tableHabitaciones;

    @FXML
    private TableView<?> tableHoteles;

    @FXML
    private TableView<?> tableInstalaciones;

    @FXML
    private TextField txtCapacidadHabitacion;

    @FXML
    private TextField txtCorreoHotel;

    @FXML
    private TextArea txtDescripcionInstalacion;

    @FXML
    private TextArea txtDireccionHotel;

    @FXML
    private TextField txtNombreHotel;

    @FXML
    private TextField txtNombreInstalacion;

    @FXML
    private TextField txtNumCuartosHabitacion;

    @FXML
    private TextField txtPrecioNocheHabitacion;

    @FXML
    private TextField txtTelefonoHotel;

    private AplicacionCliente aplicacion;

   	private Empleado empleado;

    @FXML
    void actualizarHabitacionAction(ActionEvent event) {

    }

    @FXML
    void actualizarHotelAction(ActionEvent event) {

    }

    @FXML
    void actualizarInstalacionAction(ActionEvent event) {

    }

    @FXML
    void agregarHabitacionAction(ActionEvent event) {

    }

    @FXML
    void agregarHotelAction(ActionEvent event) {

    }

    @FXML
    void agregarInstalacionAction(ActionEvent event) {

    }

    @FXML
    void ciudadHotelAction(ActionEvent event) {

    }

    @FXML
    void eliminarHabitacionAction(ActionEvent event) {

    }

    @FXML
    void eliminarHotelAction(ActionEvent event) {

    }

    @FXML
    void eliminarInstalacionAction(ActionEvent event) {

    }

    @FXML
    void estadoHabitacionAction(ActionEvent event) {

    }

    @FXML
    void hotelAsociadoHabitacionAction(ActionEvent event) {

    }

    @FXML
    void hotelAsociadoInstalacionAction(ActionEvent event) {

    }

    @FXML
    void nivelHabitacionAction(ActionEvent event) {

    }

    @FXML
    void nuevaHabitacionAction(ActionEvent event) {

    }

    @FXML
    void nuevaInstalacionAction(ActionEvent event) {

    }

    @FXML
    void nuevoHotelAction(ActionEvent event) {

    }

    @FXML
    void tipoHabitacionAction(ActionEvent event) {

    }

    @FXML
    void tipoHotelAction(ActionEvent event) {

    }

    @FXML
    void tipoInstalacionAction(ActionEvent event) {

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