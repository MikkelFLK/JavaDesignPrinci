/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignprinci.GUI.Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author morte
 */
public class LoginViewController implements Initializable
{

    @FXML
    private JFXTextField userNameField;
    @FXML
    private JFXTextField passwordField;
    @FXML
    private JFXButton createUserButton;
    @FXML
    private JFXButton quitButton;
    @FXML
    private JFXButton logInButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    

    @FXML
    private void createUserButtonOnAction(ActionEvent event)
    {
    }

    @FXML
    private void quitButtonOnAction(ActionEvent event)
    {
    }

    @FXML
    private void logInButtonOnAction(ActionEvent event)
    {
    }
    
}
