/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author Marcy GADEU
 */
public class ClientViewController implements Initializable {
    @FXML
    private StackPane containStackPane;
    @FXML
    private JFXButton addClientButton;
    @FXML
    private JFXButton deleteClientButton;
    @FXML
    private JFXButton updateClientButton;
    @FXML
    private JFXButton viewClientButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void openAddClient(ActionEvent event) throws IOException {
        containStackPane.getChildren().clear();
        FXMLLoader fXMLLoader = new FXMLLoader(getClass().getResource("AddClientView.fxml"));
        Node node = fXMLLoader.load();
        containStackPane.getChildren().add(node);
    }

    @FXML
    private void openDeleteClient(ActionEvent event) throws IOException {
         containStackPane.getChildren().clear();
        FXMLLoader fXMLLoader = new FXMLLoader(getClass().getResource("DeleteClientView.fxml"));
        Node node = fXMLLoader.load();
        containStackPane.getChildren().add(node);
    }

    @FXML
    private void openUpdateClient(ActionEvent event) throws IOException {
        containStackPane.getChildren().clear();
        FXMLLoader fXMLLoader = new FXMLLoader(getClass().getResource("UpdateClientView.fxml"));
        Node node = fXMLLoader.load();
        containStackPane.getChildren().add(node);
    }

    @FXML
    private void openViewClient(ActionEvent event) throws IOException {
        containStackPane.getChildren().clear();
        FXMLLoader fXMLLoader = new FXMLLoader(getClass().getResource("ClientViewView.fxml"));
        Node node = fXMLLoader.load();
        containStackPane.getChildren().add(node);
    }
    
}
