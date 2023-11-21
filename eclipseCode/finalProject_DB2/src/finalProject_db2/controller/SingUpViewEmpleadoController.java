package finalProject_db2.controller;

import java.time.LocalDate;

import finalProject_db2.application.AplicacionCliente;
import finalProject_db2.application.Cliente;
import finalProject_db2.application.Empleado;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SingUpViewEmpleadoController {

    @FXML
    private ComboBox<String> boxEstadoCivil;

    @FXML
    private ComboBox<String> boxTipoEmpleado;

    @FXML
    private Button btnCrearCuenta;

    @FXML
    private Button btnVolver;

    @FXML
    private DatePicker dateFechaNacimiento;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtPassword;

	private AplicacionCliente aplicacion;

	private Empleado empleado;

	Object estadoCivilSeleccionado;

	 @FXML
	 void initialize() {
		 //ObservableList<String> estadosCiviles = FXCollections.observableArrayList("Soltero", "Casado", "Divorciado", "Viudo", "Unión Libre");
	    	//boxEstadoCivil.setItems(estadosCiviles);

	    	ObservableList<String> tipoEmpleados = FXCollections.observableArrayList("Administrador", "Recepcionista");
	    	boxTipoEmpleado.setItems(tipoEmpleados);


	    	String nombresEmpleados = empleado.obtenerEmpleados();

	        // Configurar el ComboBox con los nombres de empleados
	        boxEstadoCivil.getItems().add(nombresEmpleados);
	        boxEstadoCivil.setValue(nombresEmpleados);





	    }

    @FXML
    void btnCrearCuentaAction(ActionEvent event) {

    	String nombre = txtNombre.getText();
        String telefono = txtTelefono.getText();
        String cedula = txtCedula.getText();
        String correo = txtCorreo.getText();
        String direccion = txtDireccion.getText();
        String password = txtPassword.getText();
        LocalDate fechaNacimiento = dateFechaNacimiento.getValue();
        String estadoCivil = (String) boxEstadoCivil.getValue();
        String tipoEmpleado = (String) boxTipoEmpleado.getValue();




        System.out.println(fechaNacimiento);

        if (nombre.isEmpty() || cedula.isEmpty() || correo.isEmpty() || telefono.isEmpty() ||
            direccion.isEmpty() || password.isEmpty() || fechaNacimiento == null || estadoCivil == null) {

            System.out.println("Por favor, completa todos los campos.");
            return ;
        }

        // Crear un nuevo objeto Empleado con los datos proporcionados
        String empleadoNuevo = cedula +"," + nombre +"," + correo +"," + password +"," +telefono +"," +estadoCivil +"," + direccion +"," +fechaNacimiento +"," + tipoEmpleado;


        // Registra al empleado en la aplicación (ajusta según tu lógica de aplicación)

        empleado.registrarEmpleado(empleadoNuevo);

        // Puedes agregar más lógica según sea necesario

        // Por ejemplo, cerrar la ventana actual después de crear la cuenta
        Stage stage = (Stage) btnCrearCuenta.getScene().getWindow();
        stage.close();

    }

    @FXML
    void btnVolverAction(ActionEvent event) {

    	aplicacion.inicioEmpleado(empleado);

    }

    @FXML
    void estadoCivilAction(ActionEvent event) {
    	String nombresEmpleados = empleado.obtenerEmpleados();

        // Configurar el ComboBox con los nombres de empleados
        boxEstadoCivil.getItems().add(nombresEmpleados);
        boxEstadoCivil.setValue(nombresEmpleados);


    }

    @FXML
    void tipoEmpleadoAction(ActionEvent event) {

    }

    public void setEmpleadoAplicacion(AplicacionCliente mainApplication, Empleado empleado) {
		this.aplicacion = mainApplication;
		this.empleado   = empleado;
	}

}
