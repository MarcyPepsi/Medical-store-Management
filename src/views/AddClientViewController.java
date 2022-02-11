/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import dao.Database;
import dao.FileManagement;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import model.Client;

/**
 * FXML Controller class
 *
 * @author Marcy GADEU
 */
public class AddClientViewController implements Initializable {

    @FXML
    private JFXTextField clientName;
    @FXML
    private JFXTextField mobile;
    @FXML
    private JFXTextField address;
    @FXML
    private JFXComboBox<String> city;
    ArrayList<String> cities = new ArrayList<>();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        city.getItems().addAll("Douala","Yaounde","Bafoussam","Bafang");
        
    }    

    @FXML
    private void addNewClient(ActionEvent event) throws ClassNotFoundException, IOException {
        Client client = new Client();
        client.setClientName(clientName.getText());
        client.setClientAddress(address.getText());
        client.setClientID(Database.clientID);
        client.setClientPhoneNumber(Integer.parseInt(mobile.getText()));
        client.setDate(LocalDate.now());
        client.setClientCity(city.getSelectionModel().getSelectedItem());
        Database.clientID++;
        Database.listOfClients.add(client);
        FileManagement.saveClientID();
        FileManagement.saveClients();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Client Added");
        alert.setContentText("Client Successfully Added");
        alert.showAndWait();
        
    }
    
}
