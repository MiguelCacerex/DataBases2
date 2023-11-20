package finalProject_db2.application;

import java.io.IOException;
import finalProject_db2.controller.LoginViewController;
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




	/*METODOS PARA MOSTRAR OTRA INTERFACE
	public void inicioEmplado(Empleado empleado) {
		try {
			FXMLLoader loader = new FXMLLoader();
			//Cambiar por la ruta de tu vista
			loader.setLocation(AplicacionCliente.class.getResource("../view/loginView.fxml"));

			AnchorPane rootLayout =  loader.load();

			//cambiar por el nombre de tu controlador
			LoginViewController loginViewController = loader.getController(  );
			loginViewController.setClienteAplicacion(this,empleado);
			Scene scene = new Scene(rootLayout);
			stage.setScene(scene);

			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	*/

}














