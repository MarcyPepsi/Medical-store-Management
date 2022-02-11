/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import dao.Database;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Company;

/**
 * FXML Controller class
 *
 * @author Marcy GADEU
 */
public class CompanyListViewController implements Initializable {

    @FXML
    private TableView<Company> tableOfCompanies;
    @FXML
    private TableColumn<Company, Integer> companyIDCol;
    @FXML
    private TableColumn<Company, String> companyNameCol;
    @FXML
    private TableColumn<Company, Integer> phoneNumberCol;
    @FXML
    private TableColumn<Company, String> addressCol;
    @FXML
    private TableColumn<Company, String> contactPersonCol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         companyIDCol.setCellValueFactory(new PropertyValueFactory<>("companyID"));
        companyNameCol.setCellValueFactory(new PropertyValueFactory<>("companyName"));
        addressCol.setCellValueFactory(new PropertyValueFactory<>("companyAddress"));
        phoneNumberCol.setCellValueFactory(new PropertyValueFactory<>("mobile"));
        contactPersonCol.setCellValueFactory(new PropertyValueFactory<>("contactPerson"));
        //tableOfItems.setStyle("-fx-background-color: #33CC00; ");
        tableOfCompanies.getItems().clear();
         tableOfCompanies.setItems(FXCollections.observableArrayList(Database.listOfCompanies));
         tableOfCompanies.refresh();
    }    
    
}
