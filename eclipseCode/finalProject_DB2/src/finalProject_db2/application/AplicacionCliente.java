package finalProject_db2.application;

import java.io.IOException;

import finalProject_db2.controller.HomeClienteViewController;
import finalProject_db2.controller.LoginViewController;

import finalProject_db2.controller.LoginViewEmpleadoController;
import finalProject_db2.controller.SingUpViewEmpleadoController;

import finalProject_db2.controller.SingUpViewController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AplicacionCliente extends Application {

	// Atributos de la clase Aplicacion

	private Stage stage;
	private Cliente cliente;
	private Empleado empleado;

	// Metodo Star de la clase Aplicacion

	@Override
	public void start(Stage primaryStage) throws Exception {

		this.cliente = new Cliente("localhost",9999);
		this.stage = primaryStage;
		this.stage.setTitle("WorldTravel");

		this.empleado = new Empleado("localhost",7777);
		this.stage = primaryStage;
		this.stage.setTitle("WorldTravel");

		showLogin();
	}

	/**
	 * Este es el metodo main de la clase aplicacion
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

	public void showLogin() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(AplicacionCliente.class.getResource("../view/loginView.fxml"));

			AnchorPane rootLayout =  loader.load();

			LoginViewController loginViewController = loader.getController();
			loginViewController.setClienteAplicacion(this,cliente,empleado);
			Scene scene = new Scene(rootLayout);
			stage.setScene(scene);

			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void showSignUp(Cliente cliente) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(AplicacionCliente.class.getResource("../view/SignUpView.fxml"));

			AnchorPane rootLayout =  loader.load();

			SingUpViewController signUpViewController = loader.getController();
			signUpViewController.setClienteAplicacion(this,cliente);
			Scene scene = new Scene(rootLayout);
			stage.setScene(scene);

			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void showHomeCliente(Cliente cliente) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(AplicacionCliente.class.getResource("../view/HomeClienteView.fxml"));

			AnchorPane rootLayout =  loader.load();

			HomeClienteViewController homeClienteViewController = loader.getController();
			homeClienteViewController.setClienteAplicacion(this,cliente);
			Scene scene = new Scene(rootLayout);
			stage.setScene(scene);

			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




	//Interfaces del empleado

	public void inicioEmpleado(Empleado empleado) {
		try {
			FXMLLoader loader = new FXMLLoader();

			loader.setLocation(AplicacionCliente.class.getResource("../view/loginViewEmpleado.fxml"));

			AnchorPane rootLayout =  loader.load();

			LoginViewEmpleadoController loginViewEmpleadoController = loader.getController(  );
			loginViewEmpleadoController.setEmpleadoAplicacion(this,empleado);
			Scene scene = new Scene(rootLayout);
			stage.setScene(scene);

			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void registroEmpleado(Empleado empleado) {
		try {
			FXMLLoader loader = new FXMLLoader();

			loader.setLocation(AplicacionCliente.class.getResource("../view/SingUp.fxml"));

			AnchorPane rootLayout =  loader.load();

			SingUpViewEmpleadoController SingUpViewEmpleadoController = loader.getController(  );
			SingUpViewEmpleadoController.setEmpleadoAplicacion(this,empleado);
			Scene scene = new Scene(rootLayout);
			stage.setScene(scene);

			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





}














