package finalProject_db2.application;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
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

public class Client extends Application {

    private static final String SERVER_IP = "localhost";
    private static final int PORT = 12345;
	private Stage stage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
    	this.stage = primaryStage;
		this.stage.setTitle("Cliente");

        new Thread(() -> {
            try {
                Socket socket = new Socket(SERVER_IP, PORT);
                DataInputStream in = new DataInputStream(socket.getInputStream());
                String welcomeMessage = in.readUTF();
               /*
                Platform.runLater(() -> {
                    primaryStage.setTitle("Cliente Conectado");
                    root.getChildren().clear();
                    root.getChildren().add(new Label(welcomeMessage));
                });
                */
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
























