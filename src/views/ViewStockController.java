/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import dao.Database;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Drug;

/**
 * FXML Controller class
 *
 * @author Marcy GADEU
 */
public class ViewStockController implements Initializable {

    @FXML
    private TableView<Drug> tableOfDrugs;
    @FXML
    private TableColumn<Drug,Integer> drugIDCol;
    @FXML
    private TableColumn<Drug,String> drugNameCol;
    private TableColumn<Drug,String> drugLocationCol;
    @FXML
    private TableColumn<Drug,Integer> drugQtyCol;
    @FXML
    private TableColumn<Drug,Integer> drugPriceCol;
    @FXML
    private TableColumn<Drug,Date> drugDateCol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        drugIDCol.setCellValueFactory(new PropertyValueFactory<>("drugID"));
        drugNameCol.setCellValueFactory(new PropertyValueFactory<>("drugName"));
        drugDateCol.setCellValueFactory(new PropertyValueFactory<>("expiryDate"));
        drugPriceCol.setCellValueFactory(new PropertyValueFactory<>("drugPrice"));
        drugQtyCol.setCellValueFactory(new PropertyValueFactory<>("drugQuantity"));
        //tableOfItems.setStyle("-fx-background-color: #33CC00; ");
        tableOfDrugs.getItems().clear();
         tableOfDrugs.setItems(FXCollections.observableArrayList(Database.listOfDrugs));
         tableOfDrugs.refresh();
    }    
    
}
