/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import com.jfoenix.controls.JFXButton;
import dao.Database;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import model.Client;

/**
 * FXML Controller class
 *
 * @author Marcy GADEU
 */
public class ClientViewViewController implements Initializable {

    @FXML
    private TableView<Client> tableOfClients;
    @FXML
    private TableColumn<Client, Integer> clientIDCol;
    @FXML
    private TableColumn<Client, String> clientNameCol;
    @FXML
    private TableColumn<Client, Integer> phoneNumberCol;
    @FXML
    private TableColumn<Client, String> addressCol;
    @FXML
    private TableColumn<Client, String> cityCol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        clientIDCol.setCellValueFactory(new PropertyValueFactory<>("clientID"));
        clientNameCol.setCellValueFactory(new PropertyValueFactory<>("clientName"));
        phoneNumberCol.setCellValueFactory(new PropertyValueFactory<>("clientPhoneNumber"));
       cityCol.setCellValueFactory(new PropertyValueFactory<>("clientCity"));
       addressCol.setCellValueFactory(new PropertyValueFactory<>("clientAddress"));
       tableOfClients.getItems().clear();
         tableOfClients.setItems(FXCollections.observableArrayList(Database.listOfClients));
         tableOfClients.refresh();
    }    

    
}
