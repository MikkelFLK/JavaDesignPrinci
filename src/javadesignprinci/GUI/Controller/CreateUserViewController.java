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
public class CreateUserViewController implements Initializable
{

    @FXML
    private JFXTextField createUserUsernameField;
    @FXML
    private JFXTextField CreateUserEmailField;
    @FXML
    private JFXTextField createUserPasswordField;
    @FXML
    private JFXTextField createUserPasswordAgainField;
    @FXML
    private JFXButton createUserCancelButton;
    @FXML
    private JFXButton createUserCreateButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    

    @FXML
    private void createUserCancelButtonOnAction(ActionEvent event)
    {
    }

    @FXML
    private void createUserCreateButtonOnAction(ActionEvent event)
    {
    }
    
}
