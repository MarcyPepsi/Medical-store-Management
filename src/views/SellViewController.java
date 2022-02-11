/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextField;
import dao.Database;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Marcy GADEU
 */
public class SellViewController implements Initializable {

    @FXML
    private JFXComboBox<String> comboxBoxCategory;
    @FXML
    private JFXTextField searchBar;
    @FXML
    private JFXTextField itemName;
    @FXML
    private JFXTextField price;
    @FXML
    private Spinner<?> snipper;
    @FXML
    private JFXTextField total;
    @FXML
    private TableView<?> tableOfOrders;
    @FXML
    private TableColumn<?, ?> drugNameCol;
    @FXML
    private TableColumn<?, ?> unitpriceCol;
    @FXML
    private TableColumn<?, ?> quantityCol;
    @FXML
    private TableColumn<?, ?> priceCol;
    @FXML
    private JFXButton btnPrint;
    @FXML
    private Label grandTotal;
    @FXML
    private JFXListView<?> listOfItems;
    @FXML
    private JFXTextField clientPhone;
    @FXML
    private JFXComboBox<String> comboxBoxClientName;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        for(Database.listOfClients);
    }    

    @FXML
    private void selectedDrug(ActionEvent event) {
    }

    @FXML
    private void searchAction(ActionEvent event) {
    }

    @FXML
    private void keySearch(KeyEvent event) {
    }

    @FXML
    private void snipperClicked(MouseEvent event) {
    }

    @FXML
    private void addToCart(ActionEvent event) {
    }

    @FXML
    private void removeOrder(ActionEvent event) {
    }

    @FXML
    private void printOrder(ActionEvent event) {
    }

    @FXML
    private void itemSelected(MouseEvent event) {
    }

    @FXML
    private void addListOfOrder(ActionEvent event) {
    }

    @FXML
    private void comboxBoxClientSelected(ActionEvent event) {
    }
    
}
