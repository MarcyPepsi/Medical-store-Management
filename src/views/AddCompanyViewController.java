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
import java.util.ResourceBundle;
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
public class AddCompanyViewController implements Initializable {

    @FXML
    private JFXTextField mobile;
    @FXML
    private JFXTextField address;
    @FXML
    private JFXTextField companyName;
    @FXML
    private JFXTextField contactPerson;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addNewClient(ActionEvent event) throws ClassNotFoundException, IOException {
        Company company = new Company();
        company.setCompanyName(companyName.getText());
        company.setCompanyAddress(address.getText());
        company.setContactPerson(contactPerson.getText());
        company.setMobile(Integer.parseInt(mobile.getText()));
        company.setCompanyID(Database.companyID);
        Database.listOfCompanies.add(company);
        Database.companyID++;
        FileManagement.saveCompanyID();
        FileManagement.saveCompanies();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Company Added");
        alert.setContentText("Company Successfully Added");
        alert.showAndWait();
    }
    
}
