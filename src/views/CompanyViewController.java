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
public class CompanyViewController implements Initializable {

    @FXML
    private StackPane containStackPane;
    @FXML
    private JFXButton addCompanyButton;
    @FXML
    private JFXButton updateCompanyButton;
    @FXML
    private JFXButton viewClompanyButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void openAddCompany(ActionEvent event) throws IOException {
        containStackPane.getChildren().clear();
        FXMLLoader fXMLLoader = new FXMLLoader(getClass().getResource("AddCompanyView.fxml"));
        Node node = fXMLLoader.load();
        containStackPane.getChildren().add(node);
    }

    @FXML
    private void openUpdateCompany(ActionEvent event) throws IOException {
        containStackPane.getChildren().clear();
        FXMLLoader fXMLLoader = new FXMLLoader(getClass().getResource("UpdateCompanyView.fxml"));
        Node node = fXMLLoader.load();
        containStackPane.getChildren().add(node);
    }

    @FXML
    private void openViewCompany(ActionEvent event) throws IOException {
        containStackPane.getChildren().clear();
        FXMLLoader fXMLLoader = new FXMLLoader(getClass().getResource("CompanyListView.fxml"));
        Node node = fXMLLoader.load();
        containStackPane.getChildren().add(node);
    }

    
}
