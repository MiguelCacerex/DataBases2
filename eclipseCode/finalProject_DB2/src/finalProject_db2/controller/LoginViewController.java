package finalProject_db2.controller;


import finalProject_db2.application.AplicacionCliente;
import finalProject_db2.application.Cliente;
import finalProject_db2.application.Empleado;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.input.MouseEvent;
public class LoginViewController {

    @FXML
    private Button btnIniciarSesion;

    @FXML
    private Text linkEmpleado;

    @FXML
    private Text linkResgistrate;

    @FXML
    private TextField txtCorreo;

    @FXML
    private PasswordField txtPassword;

	private AplicacionCliente aplicacion;

	private Cliente cliente;

	private Empleado empleado;

    @FXML
    void initialize() {

    }

    @FXML
    void abrirSingUpView(MouseEvent event) {
    	aplicacion.showSignUp(cliente);
    }

    @FXML
    void entrarAdmin(MouseEvent event) {
     aplicacion.inicioEmpleado(empleado);
    }

	public void setClienteAplicacion(AplicacionCliente mainApplication, Cliente cliente, Empleado empleado) {
		this.aplicacion = mainApplication;
		this.cliente    = cliente;
		this.empleado   = empleado;
	}

	@FXML
	void btnActionInciarSesion(ActionEvent event) {
	    String correo = txtCorreo.getText();
	    String password = txtPassword.getText();

	    // Verificar si los campos están vacíos
	    if (correo.isEmpty() || password.isEmpty()) {
	        mostrarAlerta("Campos Vacíos", "Por favor, completa todos los campos.");
	        return;
	    }
		cliente.iniciarCliente();
	    boolean credencialesValidas = validarCredenciales(correo, password);

	    if (credencialesValidas) {
	        mostrarAlerta("Inicio de sesión exitoso", "¡Bienvenido de nuevo!");
	        aplicacion.showHomeCliente(cliente);
	    } else {
	        mostrarAlerta("Error de inicio de sesión", "Correo o contraseña incorrectos.");
	    }
	}

	// Método para validar las credenciales (simulado, debes reemplazarlo con tu lógica de validación real)
	private boolean validarCredenciales(String correo, String password) {

		String respuesta =  cliente.validarCredenciales(correo,password);

		if(respuesta != null){

			String respuestaAux[] = respuesta.split(",");

			cliente.setCodigo(respuestaAux[0]);
			cliente.setCorreo(respuestaAux[1]);

			return true;
		}else{
			return false;
		}
	}

	// Método para mostrar una alerta
	private void mostrarAlerta(String titulo, String mensaje) {
	    Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle(titulo);
	    alert.setHeaderText(null);
	    alert.setContentText(mensaje);
	    alert.showAndWait();
	}


}





