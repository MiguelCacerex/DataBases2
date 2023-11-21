package finalProject_db2.controller;

import finalProject_db2.application.AplicacionCliente;
import finalProject_db2.application.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class SingUpViewController {

    @FXML
    private ComboBox<String> boxCiudad;

    @FXML
    private Button btnCrearCuenta;

    @FXML
    private Button btnVolver;

    @FXML
    private DatePicker dateFechaNacimiento;

    @FXML
    private TextField txtApellido;

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

	private Cliente cliente;

	private AplicacionCliente aplicacion;

    @FXML
    void btnCrearCuentaAction(ActionEvent event) {
    	btnCrearCuenta();
    }

    @FXML
    void btnVolverAction(ActionEvent event) {
    	aplicacion.showLogin();
    }

	public void setClienteAplicacion(AplicacionCliente aplicacion, Cliente cliente) {

		this.cliente = cliente;
		this.aplicacion = aplicacion;

	}

    void btnCrearCuenta() {
        if (camposValidos()) {


        } else {
            mostrarAlerta("Error", "Por favor, complete todos los campos correctamente.");
        }
    }

    // Método para verificar la validez de los campos
    private boolean camposValidos() {
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String cedula = txtCedula.getText();
        String correo = txtCorreo.getText();
        String direccion = txtDireccion.getText();
        String password = txtPassword.getText();
        String ciudad = boxCiudad.getValue();
        String fechaNacimiento = dateFechaNacimiento.getEditor().getText(); // Obtener el valor del DatePicker

        // Verificar si algún campo está vacío o si la selección en el ComboBox es nula
        return !nombre.isEmpty() && !apellido.isEmpty() && !cedula.isEmpty() && !correo.isEmpty()
                && !direccion.isEmpty() && !password.isEmpty() && ciudad != null && !fechaNacimiento.isEmpty();
    }

    // Método para mostrar un mensaje de alerta en caso de campos inválidos
    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

}
