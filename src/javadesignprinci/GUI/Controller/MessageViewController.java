/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignprinci.GUI.Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import java.io.FileWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Mikkel
 */
public class MessageViewController implements Initializable
{

    @FXML
    private JFXTextArea messageHistory;
    @FXML
    private TextField messageField;
    @FXML
    private JFXButton btnSendMessage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
        
    }    

    
    
    @FXML
    private void sendMessage(ActionEvent event)
    {
     String s = messageField.getText();
     
     messageHistory.setText(s);
     
     
    
    }
    
}
