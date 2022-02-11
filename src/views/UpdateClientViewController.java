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
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import model.Client;
import model.Company;

/**
 * FXML Controller class
 *
 * @author Marcy GADEU
 */
public class UpdateClientViewController implements Initializable {

    @FXML
    private JFXTextField clientName;
    @FXML
    private JFXTextField mobile;
    @FXML
    private JFXTextField address;
    @FXML
    private JFXComboBox<String> city;
    @FXML
    private JFXComboBox<String> clientComboBox;
 ArrayList<String> list = new ArrayList<>();
 private Client toBeUpdated;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         for(Client client:Database.listOfClients)
        {
           list.add(client.getClientName());
        }
        clientComboBox.setItems(FXCollections.observableArrayList(list));
    }    

    
    @FXML
    private void selectComboBox(ActionEvent event) {
        String name  = clientComboBox.getSelectionModel().getSelectedItem();
        for(Client com: Database.listOfClients)
        {
            if(com.getClientName().equals(name))
            {
                toBeUpdated = com;
            }
        }
        
        clientName.setText(toBeUpdated.getClientName());
        
        mobile.setText(String.valueOf(toBeUpdated.getClientPhoneNumber()));
        
        address.setText(toBeUpdated.getClientAddress());
        city.setPromptText(toBeUpdated.getClientCity());
        
    }
    @FXML
    private void updateClient(ActionEvent event) throws ClassNotFoundException, IOException {
        Client newClient = new Client();
        newClient.setClientID(toBeUpdated.getClientID());
        newClient.setClientAddress(address.getText());
        newClient.setClientCity(city.getSelectionModel().getSelectedItem());
        newClient.setClientName(clientName.getText());
        newClient.setClientPhoneNumber(Integer.parseInt(mobile.getText()));
        Database.listOfClients.remove(toBeUpdated);
        Database.listOfClients.add(newClient);
        FileManagement.saveClientID();
        FileManagement.saveClients();
         Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Client Updated");
        alert.setContentText("Client Successfully Updated");
        alert.showAndWait();
    

    
}
}
