/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import com.jfoenix.controls.JFXButton;
import dao.Database;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Company;
import model.Drug;

/**
 * FXML Controller class
 *
 * @author Marcy GADEU
 */
public class WelcomeViewController implements Initializable {

    @FXML
    private JFXButton openStockButton;
    @FXML
    private JFXButton openSellButton;
    @FXML
    private JFXButton openClientButton;
    @FXML
    private JFXButton openReportButton;
    @FXML
    private JFXButton openUserButton;
    @FXML
    private JFXButton openCompanyButton;
    @FXML
    private JFXButton openLogoutButton;
    @FXML
    private JFXButton openExitButton;
    @FXML
    private AnchorPane mainPane;

    @FXML
    private Label labelNberSale;
    @FXML
    private Label labelNberCompany;
    @FXML
    private Label labelNberStock;
    @FXML
    private Label labelFinance;
    private AnchorPane contentPane;
    private ArrayList<Company> companies = new ArrayList<Company>();
    private ArrayList<Drug> drugs = new ArrayList<Drug>();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        contentPane = mainPane;
        for(Company com :Database.listOfCompanies)
        {
            companies.add(com);
        }
        labelNberCompany.setText(String.valueOf(companies.size()));
         for(Drug dr :Database.listOfDrugs)
        {
            drugs.add(dr);
        }
        labelNberStock.setText(String.valueOf(drugs.size()));
    }

    @FXML
    private void openStock(ActionEvent event) throws IOException {
        contentPane.getChildren().clear();
        FXMLLoader fXMLLoader = new FXMLLoader(getClass().getResource("StockView.fxml"));
        Node node = fXMLLoader.load();
        contentPane.getChildren().add(node);
    }

    @FXML
    private void openSell(ActionEvent event) throws IOException {
        contentPane.getChildren().clear();
        FXMLLoader fXMLLoader = new FXMLLoader(getClass().getResource("SellView.fxml"));
        Node node = fXMLLoader.load();
        contentPane.getChildren().add(node);
    }

    @FXML
    private void openClient(ActionEvent event) throws IOException {
        contentPane.getChildren().clear();
        FXMLLoader fXMLLoader = new FXMLLoader(getClass().getResource("ClientView.fxml"));
        Node node = fXMLLoader.load();
        contentPane.getChildren().add(node);
    }

    @FXML
    private void openReport(ActionEvent event) {
    }

    @FXML
    private void openUser(ActionEvent event) {
    }

    @FXML
    private void openCompany(ActionEvent event) throws IOException {
        contentPane.getChildren().clear();
        FXMLLoader fXMLLoader = new FXMLLoader(getClass().getResource("CompanyView.fxml"));
        Node node = fXMLLoader.load();
        contentPane.getChildren().add(node);
    }

    @FXML
    private void openLogout(ActionEvent event) {
        Alert a = new Alert(Alert.AlertType.CONFIRMATION);
        a.setHeaderText("Sure to logout?");
        a.setContentText("Are you sure you wish to logout ?");
        a.resultProperty().addListener(new ChangeListener<ButtonType>() {
            @Override
            public void changed(ObservableValue<? extends ButtonType> observable, ButtonType oldValue, ButtonType newValue) {
                if (newValue == ButtonType.OK) {
                    try {
                        Parent tView = FXMLLoader.load(getClass().getResource("login.fxml"));
                        Scene scene = new Scene(tView);

                        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        window.setScene(scene);
                        window.centerOnScreen();
                        window.setResizable(false);
                        window.show();
                    } catch (IOException ex) {
                        Logger.getLogger(WelcomeViewController.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }

        });

        a.showAndWait();

    }

    @FXML
    private void openExit(ActionEvent event) {
         Alert a = new Alert(Alert.AlertType.CONFIRMATION);
        a.setHeaderText("Sure to Exit?");
        a.setContentText("Are you sure you wish to exit ?");
        a.resultProperty().addListener(new ChangeListener<ButtonType>() {
            @Override
            public void changed(ObservableValue<? extends ButtonType> observable, ButtonType oldValue, ButtonType newValue) {
                if (newValue == ButtonType.OK) {
                    Node source = (Node) event.getSource();
                    Stage stage = (Stage) source.getScene().getWindow();
                    stage.close();

                }
            }

        });
        a.showAndWait();

    }

    @FXML
    private void changeColor(MouseEvent event) {
        if (event.getSource() == openStockButton) {
            openStockButton.setStyle("-fx-background-color: #33CC00; ");
            openSellButton.setStyle("-fx-background-color: #F7FF3C; ");
            openClientButton.setStyle("-fx-background-color:#F7FF3C0 ; ");
            openClientButton.setStyle("-fx-background-color: #F7FF3C; ");
            openReportButton.setStyle("-fx-background-color: #F7FF3C; ");
            openUserButton.setStyle("-fx-background-color:#F7FF3C ; ");
            openCompanyButton.setStyle("-fx-background-color: #F7FF3C; ");
            openLogoutButton.setStyle("-fx-background-color: #F7FF3C; ");
            openExitButton.setStyle("-fx-background-color: #F7FF3C; ");

        } else if (event.getSource() == openSellButton) {
            openStockButton.setStyle("-fx-background-color: #F7FF3C; ");
            openSellButton.setStyle("-fx-background-color: #33CC00; ");
            openClientButton.setStyle("-fx-background-color:#F7FF3C0 ; ");
            openClientButton.setStyle("-fx-background-color: #F7FF3C; ");
            openReportButton.setStyle("-fx-background-color: #F7FF3C; ");
            openUserButton.setStyle("-fx-background-color:#F7FF3C ; ");
            openCompanyButton.setStyle("-fx-background-color: #F7FF3C; ");
            openLogoutButton.setStyle("-fx-background-color: #F7FF3C; ");
            openExitButton.setStyle("-fx-background-color: #F7FF3C; ");
        } else if (event.getSource() == openClientButton) {

            openStockButton.setStyle("-fx-background-color: #F7FF3C; ");
            openSellButton.setStyle("-fx-background-color: #F7FF3C; ");
            openClientButton.setStyle("-fx-background-color:#33CC00; ");
            //penClientButton.setStyle("-fx-background-color: #F7FF3C; ");
            openReportButton.setStyle("-fx-background-color: #F7FF3C; ");
            openUserButton.setStyle("-fx-background-color:#F7FF3C ; ");
            openCompanyButton.setStyle("-fx-background-color: #F7FF3C; ");
            openLogoutButton.setStyle("-fx-background-color: #F7FF3C; ");
            openExitButton.setStyle("-fx-background-color: #F7FF3C; ");

        } else if (event.getSource() == openReportButton) {
            openStockButton.setStyle("-fx-background-color: #F7FF3C; ");
            openSellButton.setStyle("-fx-background-color: #F7FF3C; ");
            openClientButton.setStyle("-fx-background-color:#F7FF3C ; ");
            openClientButton.setStyle("-fx-background-color: #F7FF3C; ");
            openReportButton.setStyle("-fx-background-color: #33CC00; ");
            openUserButton.setStyle("-fx-background-color:#F7FF3C ; ");
            openCompanyButton.setStyle("-fx-background-color: #F7FF3C; ");
            openLogoutButton.setStyle("-fx-background-color: #F7FF3C; ");
            openExitButton.setStyle("-fx-background-color: #F7FF3C; ");

        } else if (event.getSource() == openUserButton) {

            openStockButton.setStyle("-fx-background-color: #F7FF3C; ");
            openSellButton.setStyle("-fx-background-color: #F7FF3C; ");
            openClientButton.setStyle("-fx-background-color:#F7FF3C ; ");
            openClientButton.setStyle("-fx-background-color: #F7FF3C; ");
            openReportButton.setStyle("-fx-background-color: #F7FF3C; ");
            openUserButton.setStyle("-fx-background-color:#33CC00 ; ");
            openCompanyButton.setStyle("-fx-background-color: #F7FF3C; ");
            openLogoutButton.setStyle("-fx-background-color: #F7FF3C; ");
            openExitButton.setStyle("-fx-background-color: #F7FF3C; ");
        } else if (event.getSource() == openCompanyButton) {
            openStockButton.setStyle("-fx-background-color: #F7FF3C; ");
            openSellButton.setStyle("-fx-background-color: #F7FF3C; ");
            openClientButton.setStyle("-fx-background-color:#F7FF3C ; ");
            openClientButton.setStyle("-fx-background-color: #F7FF3C; ");
            openReportButton.setStyle("-fx-background-color: #F7FF3C; ");
            openUserButton.setStyle("-fx-background-color:#F7FF3C ; ");
            openCompanyButton.setStyle("-fx-background-color: #33CC00; ");
            openLogoutButton.setStyle("-fx-background-color: #F7FF3C; ");
            openExitButton.setStyle("-fx-background-color: #F7FF3C; ");
            
        
         } else if (event.getSource() == openLogoutButton) {
            openStockButton.setStyle("-fx-background-color: #F7FF3C; ");
            openSellButton.setStyle("-fx-background-color: #F7FF3C; ");
            openClientButton.setStyle("-fx-background-color:#F7FF3C ; ");
            openClientButton.setStyle("-fx-background-color: #F7FF3C; ");
            openReportButton.setStyle("-fx-background-color: #F7FF3C; ");
            openUserButton.setStyle("-fx-background-color:#F7FF3C ; ");
            openCompanyButton.setStyle("-fx-background-color: #F7FF3C; ");
            openLogoutButton.setStyle("-fx-background-color: #33CC00; ");
            openExitButton.setStyle("-fx-background-color: #F7FF3C; ");
            
        
          } else if (event.getSource() == openExitButton) {
            openStockButton.setStyle("-fx-background-color: #F7FF3C; ");
            openSellButton.setStyle("-fx-background-color: #F7FF3C; ");
            openClientButton.setStyle("-fx-background-color:#F7FF3C ; ");
            openClientButton.setStyle("-fx-background-color: #F7FF3C; ");
            openReportButton.setStyle("-fx-background-color: #F7FF3C; ");
            openUserButton.setStyle("-fx-background-color:#F7FF3C ; ");
            openCompanyButton.setStyle("-fx-background-color: #F7FF3C; ");
            openLogoutButton.setStyle("-fx-background-color: #F7FF3C; ");
            openExitButton.setStyle("-fx-background-color: #33CC00; ");
            
        }
    }

}
