package finalProject_db2.application;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainApplication extends Application {

	// Atributos de la clase Aplicacion

	private Stage stage;

	// Metodo Star de la clase Aplicacion

	@Override
	public void start(Stage primaryStage) throws Exception {

		this.stage = primaryStage;
		this.stage.setTitle("WorldTravel");
		ShowLogin();
	}

	/**
	 * Este es el metodo main de la clase aplicacion
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

	private void ShowLogin() {
		// TODO Auto-generated method stub

	}

}
