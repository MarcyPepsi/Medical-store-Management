/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author Marcy GADEU
 */
public class StockViewController implements Initializable {

    @FXML
    private JFXButton addStockButton;
    @FXML
    private JFXButton deleteStockButton;
    @FXML
    private JFXButton updateStockButton;
    @FXML
    private JFXButton viewStockButton;
    @FXML
    private StackPane containStackPane;
    private StackPane contentPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        contentPane= containStackPane;
    }    

    @FXML
    private void openAddStock(ActionEvent event) throws IOException {
        contentPane.getChildren().clear();
        FXMLLoader fXMLLoader = new FXMLLoader(getClass().getResource("addStock.fxml"));
        Node node = fXMLLoader.load();
        contentPane.getChildren().add(node);
    }

    @FXML
    private void openDeleteStock(ActionEvent event) throws IOException {
        contentPane.getChildren().clear();
        FXMLLoader fXMLLoader = new FXMLLoader(getClass().getResource("DeleteStockView.fxml"));
        Node node = fXMLLoader.load();
        contentPane.getChildren().add(node);
    }

    @FXML
    private void openUpdateStock(ActionEvent event) throws IOException {
        contentPane.getChildren().clear();
        FXMLLoader fXMLLoader = new FXMLLoader(getClass().getResource("UpdateStockView.fxml"));
        Node node = fXMLLoader.load();
        contentPane.getChildren().add(node);
    }

    @FXML
    private void openViewStock(ActionEvent event) throws IOException {
        contentPane.getChildren().clear();
        FXMLLoader fXMLLoader = new FXMLLoader(getClass().getResource("ViewStock.fxml"));
        Node node = fXMLLoader.load();
        contentPane.getChildren().add(node);
    }
    
}
