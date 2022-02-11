/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import com.jfoenix.controls.JFXComboBox;
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
import model.Client;

/**
 * FXML Controller class
 *
 * @author Marcy GADEU
 */
public class DeleteClientViewController implements Initializable {

    @FXML
    private JFXComboBox<String> comboBoxItemName;
    ArrayList<String> list = new ArrayList<>();
    private Client clientToBeDeleted;

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
        comboBoxItemName.setItems(FXCollections.observableArrayList(list));
    }    

    @FXML
    private void selectComboBox(ActionEvent event) {
    }

    @FXML
    private void deleteClient(ActionEvent event) throws ClassNotFoundException, IOException {
       String name = comboBoxItemName.getSelectionModel().getSelectedItem();
       for(Client client: Database.listOfClients)
       {
           if(client.getClientName().equals(name))
           {
             clientToBeDeleted = client;  
           }
       }
       Database.listOfClients.remove(clientToBeDeleted);
        FileManagement.saveClients();
         for(Client client:Database.listOfClients)
        {
           list.add(client.getClientName());
        }
        comboBoxItemName.setItems(FXCollections.observableArrayList(list));
        
        
    }
    
}
