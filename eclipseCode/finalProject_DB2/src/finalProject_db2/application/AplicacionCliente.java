package finalProject_db2.application;

import java.io.IOException;

import finalProject_db2.controller.LoginViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainApplication extends Application {

	// Atributos de la clase Aplicacion

	private Stage stage;

	// Metodo Star de la clase Aplicacion

	@Override
	public void start(Stage primaryStage) throws Exception {

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
			loader.setLocation(MainApplication.class.getResource("../view/loginView.fxml"));

			AnchorPane rootLayout =  loader.load();

			LoginViewController loginViewController = loader.getController();
			Scene scene = new Scene(rootLayout);
			stage.setScene(scene);

			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}














