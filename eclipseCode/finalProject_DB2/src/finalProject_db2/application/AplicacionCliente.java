package finalProject_db2.application;

import java.io.IOException;


import javax.management.Notification;
import finalProject_db2.controller.AdministradorViewController;
import finalProject_db2.controller.GestionArticuloViewController;
import finalProject_db2.controller.GestionEmpleadoViewController;
import finalProject_db2.controller.GestionInfraestructuraViewController;
import finalProject_db2.controller.GestionPaqueteViewController;
import finalProject_db2.controller.GestionServicioAdicionalViewController;
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



	public void cargarInicioAdministrador(Empleado empleado) {
		try {
			FXMLLoader loader = new FXMLLoader();

			loader.setLocation(AplicacionCliente.class.getResource("../view/AdministradorView.fxml"));

			AnchorPane rootLayout =  loader.load();

			AdministradorViewController AdministradorViewController = loader.getController(  );
			AdministradorViewController.setEmpleadoAplicacion(this,empleado);
			Scene scene = new Scene(rootLayout);
			stage.setScene(scene);

			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void gestionarArticuloAdministrador(Empleado empleado) {
		try {
			FXMLLoader loader = new FXMLLoader();

			loader.setLocation(AplicacionCliente.class.getResource("../view/GestionArticuloView.fxml"));

			AnchorPane rootLayout =  loader.load();

			GestionArticuloViewController GestionArticuloViewController  = loader.getController(  );
			GestionArticuloViewController.setEmpleadoAplicacion(this,empleado);
			Scene scene = new Scene(rootLayout);
			stage.setScene(scene);

			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void gestionarEmpleadoAdministrador(Empleado empleado) {
		try {
			FXMLLoader loader = new FXMLLoader();

			loader.setLocation(AplicacionCliente.class.getResource("../view/GestionEmpleadoView.fxml"));

			AnchorPane rootLayout =  loader.load();

			GestionEmpleadoViewController GestionEmpleadoViewController  = loader.getController(  );
			GestionEmpleadoViewController.setEmpleadoAplicacion(this,empleado);
			Scene scene = new Scene(rootLayout);
			stage.setScene(scene);

			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void gestionarInfraestructuraAdministrador(Empleado empleado) {
		try {
			FXMLLoader loader = new FXMLLoader();

			loader.setLocation(AplicacionCliente.class.getResource("../view/GestionInfraestructuraView.fxml"));

			AnchorPane rootLayout =  loader.load();

			GestionInfraestructuraViewController GestionInfraestructuraViewController  = loader.getController(  );
			GestionInfraestructuraViewController.setEmpleadoAplicacion(this,empleado);
			Scene scene = new Scene(rootLayout);
			stage.setScene(scene);

			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void gestionarPaqueteAdministrador(Empleado empleado) {
		try {
			FXMLLoader loader = new FXMLLoader();

			loader.setLocation(AplicacionCliente.class.getResource("../view/GestionPaqueteView.fxml"));

			AnchorPane rootLayout =  loader.load();

			GestionPaqueteViewController GestionPaqueteViewController  = loader.getController(  );
			GestionPaqueteViewController.setEmpleadoAplicacion(this,empleado);
			Scene scene = new Scene(rootLayout);
			stage.setScene(scene);

			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	public void gestionarServicioAdicionaldministrador(Empleado empleado) {
		try {
			FXMLLoader loader = new FXMLLoader();

			loader.setLocation(AplicacionCliente.class.getResource("../view/GestionServicioAdicionalView.fxml"));

			AnchorPane rootLayout =  loader.load();

			GestionServicioAdicionalViewController GestionServicioAdicionalViewController  = loader.getController(  );
			GestionServicioAdicionalViewController.setEmpleadoAplicacion(this,empleado);
			Scene scene = new Scene(rootLayout);
			stage.setScene(scene);

			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




}














