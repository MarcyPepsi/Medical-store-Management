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
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import model.Company;
import model.Drug;
import Services.functions;
import javafx.scene.control.Alert;

/**
 * FXML Controller class
 *
 * @author Marcy GADEU
 */
public class AddStockController implements Initializable {

    @FXML
    private JFXTextField itemName;
    @FXML
    private JFXTextField itemPrice;
    @FXML
    private JFXTextField quantity;
    @FXML
    private JFXComboBox<String> company;
    @FXML
    private JFXTextField location;
    @FXML
    private JFXTextField expireDate;
    private ArrayList<String> list = new ArrayList<>();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        for (Company com : Database.listOfCompanies) {
            list.add(com.getCompanyName());
        }
        company.setItems(FXCollections.observableArrayList(list));
    }

    @FXML
    private void addNewStock(ActionEvent event) throws ParseException, ClassNotFoundException, IOException {
        Drug drug = new Drug();
        ArrayList<String> names = new ArrayList<>();
        drug.setDrugName(itemName.getText());
        for (Drug dr : Database.listOfDrugs) {
            names.add(dr.getDrugName());
        }
        for (String name : names) {

            if (drug.getDrugName().equals(name)) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText("Error!");
                alert.setContentText("Drug name already existed");
                alert.showAndWait();
            }
        }

        drug.setCompanyName(company.getSelectionModel().getSelectedItem());
        drug.setDrugID(Database.drugID);
        drug.setDrugPrice(Integer.parseInt(itemPrice.getText()));
        drug.setDrugQuantity(Integer.parseInt(quantity.getText()));
        drug.setLocation(location.getText());
        Date date = functions.haveDate(expireDate.getText());
        
        drug.setExpiryDate(date);
        Database.drugID++;
        Database.listOfDrugs.add(drug);
        FileManagement.saveDrugs();
        FileManagement.saveDrugID();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Company Added");
        alert.setContentText("Company Successfully Added");
        alert.showAndWait();
    }

}
