package finalProject_db2.controller;

import java.net.URL;
import java.util.ResourceBundle;

import finalProject_db2.application.AplicacionCliente;
import finalProject_db2.application.Cliente;
import javafx.fxml.FXML;

public class HomeClienteViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

	private Cliente cliente;

	private AplicacionCliente aplicacion;

    @FXML
    void initialize() {

    }

	public void setClienteAplicacion(AplicacionCliente aplicacionCliente, Cliente cliente) {

		this.cliente = cliente;
		this.aplicacion = aplicacionCliente;
	}

}
