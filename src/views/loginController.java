/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Marcy GADEU
 */
public class loginController implements Initializable {
    
    private Label label;
    @FXML
    private TextField userName;
   
    @FXML
    private Label info;
    @FXML
    private PasswordField password;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
         
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loginAction(ActionEvent event) throws IOException {
        
        if(userName.getText().equals("marcy")&& password.getText().equals("cycy")){
        Parent root = FXMLLoader.load(getClass().getResource("WelcomeView.fxml"));

            Scene scene = new Scene(root);

            Stage st = new Stage();
            st.setScene(scene);
            //st.getIcons().add(new Image(Main.class.getResourceAsStream("/Resources/images/logopkf.jpg")));
            st.setResizable(false);
            st.show();
            Node source = (Node) event.getSource();
            Stage stage = (Stage) source.getScene().getWindow();
            stage.close();
    }
        else if(!(userName.getText().equals("marcy"))){
            info.setStyle("-fx-background-color: #FF0000; ");
            info.setText("Wrong user name");
           
        } else if(!(password.getText().equals("cycy"))){
            info.setStyle("-fx-background-color: #FF0000; ");
            info.setText("Wrong  password");
           
        }
    }
    
}
