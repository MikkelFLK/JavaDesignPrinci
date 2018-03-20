/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignprinci.GUI.Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

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
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/javadesignprinci/GUI/View/CreateUserView.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            CreateUserViewController ctrl = fxmlLoader.getController();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("Create User");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        } catch (IOException ex)
        {
            Logger.getLogger(LoginViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void quitButtonOnAction(ActionEvent event)
    {
        System.exit(0);
    }

    @FXML
    private void logInButtonOnAction(ActionEvent event)
    {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/javadesignprinci/GUI/View/MessageView.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            MessageViewController ctrl = fxmlLoader.getController();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        } catch (IOException ex)
        {
            Logger.getLogger(LoginViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
