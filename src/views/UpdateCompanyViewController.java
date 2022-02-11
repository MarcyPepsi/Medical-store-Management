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
import model.Company;

/**
 * FXML Controller class
 *
 * @author Marcy GADEU
 */
public class UpdateCompanyViewController implements Initializable {

    @FXML
    private JFXTextField mobile;
    @FXML
    private JFXTextField address;
    @FXML
    private JFXTextField contactPerson;
    @FXML
    private JFXComboBox<String> comboBoxCompanyName;
    Company toBeUpdated;
    @FXML
    private JFXTextField companyName;
    private ArrayList<String> list = new ArrayList<>();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
        for(Company com: Database.listOfCompanies)
        {
           list.add(com.getCompanyName());
        }
         comboBoxCompanyName.setItems(FXCollections.observableArrayList(list));
    } 
     @FXML
    private void selectCompanyName(ActionEvent event) {
        String name  = comboBoxCompanyName.getSelectionModel().getSelectedItem();
        for(Company com: Database.listOfCompanies)
        {
            if(com.getCompanyName().equals(name))
            {
                toBeUpdated = com;
            }
        }
        companyName.setText(toBeUpdated.getCompanyName());
        mobile.setText(String.valueOf(toBeUpdated.getMobile()));
        address.setText(toBeUpdated.getCompanyAddress());
        contactPerson.setText(toBeUpdated.getContactPerson());
    }

    @FXML
    private void updateCompany(ActionEvent event) throws ClassNotFoundException, IOException {
        Company newCompany = new Company();
        newCompany.setCompanyID(toBeUpdated.getCompanyID());
        Database.listOfCompanies.remove(toBeUpdated);
        newCompany.setCompanyName(companyName.getText());
        newCompany.setCompanyAddress(address.getText());
        newCompany.setContactPerson(contactPerson.getText());
        newCompany.setMobile(Integer.parseInt(mobile.getText()));
        
        Database.listOfCompanies.add(newCompany);
        System.out.println(newCompany.getCompanyAddress());
        FileManagement.saveCompanyID();
        FileManagement.saveCompanies();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Company Updated");
        alert.setContentText("Company Successfully Updated");
        alert.showAndWait();
    }

   
    
}
