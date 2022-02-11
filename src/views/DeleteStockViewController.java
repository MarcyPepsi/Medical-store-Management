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
import javafx.scene.control.Alert;
import model.Drug;

/**
 * FXML Controller class
 *
 * @author Marcy GADEU
 */
public class DeleteStockViewController implements Initializable {

    @FXML
    private JFXComboBox<String> comboBoxItemName;
    ArrayList<String> list = new ArrayList<>();
    Drug toBeDeleted ;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        for(Drug drug : Database.listOfDrugs)
        {
          list.add(drug.getDrugName());
        }
        comboBoxItemName.setItems(FXCollections.observableArrayList(list));
        
    }    

    @FXML
    private void selectComboBox(ActionEvent event) {
        String drugDelected = comboBoxItemName.getSelectionModel().getSelectedItem();
        for(Drug drug : Database.listOfDrugs)
        {
            if(drug.getDrugName().equals(drugDelected))
            {
                toBeDeleted = drug;
            }
        }
        
                }

    @FXML
    private void deleteStock(ActionEvent event) throws ClassNotFoundException, IOException {
        Database.listOfDrugs.remove(toBeDeleted);
        FileManagement.saveDrugs();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Drug Deleted");
        alert.setContentText("Drug Successfully Deleted");
        alert.showAndWait();
         for(Drug drug : Database.listOfDrugs)
        {
          list.add(drug.getDrugName());
        }
        comboBoxItemName.setItems(FXCollections.observableArrayList(list));
    }
    
}
