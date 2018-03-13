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
import javadesignprinci.BE.Message;
import javadesignprinci.BLL.exceptions.BllException;
import javadesignprinci.GUI.Model.MessageLogModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Mikkel
 */
public class MessageViewController implements Initializable
{

    @FXML
    private TextField messageField;
    @FXML
    private JFXButton btnSendMessage;
    @FXML
    private ListView<Message> messageLog;
    
    private MessageLogModel msgModel = new MessageLogModel();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        messageLog.setItems(msgModel.getAllMessages());
        msgModel.getAllMessages();
        
    }    
        
    @FXML
    private void sendMessage(ActionEvent event) throws BllException
    {
        String text = messageField.getText();
        msgModel.logMessage(text);
    }
    
}
