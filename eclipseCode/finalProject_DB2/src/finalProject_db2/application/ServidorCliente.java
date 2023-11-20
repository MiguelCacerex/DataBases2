package finalProject_db2.application;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import finalProject_db2.controller.LoginViewController;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Server extends Application {

	private Stage stage;

    private static final int PORT = 12345;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Servidor");
        StackPane root = new StackPane();
        root.getChildren().add(new Label("Esperando clientes..."));
        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.show();

    	this.stage = primaryStage;
		this.stage.setTitle("Cliente");

        new Thread(() -> {
            try {
                ServerSocket serverSocket = new ServerSocket(PORT);
                while (true) {
                    Socket clientSocket = serverSocket.accept();
                    Platform.runLater(() -> showLogin());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
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














