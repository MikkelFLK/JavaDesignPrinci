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
import java.util.logging.Level;
import java.util.logging.Logger;
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

    private MessageLogModel msgModel;

    /**
     * Initializes the controller class
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        try
        {
            msgModel = new MessageLogModel();
        } catch (BllException ex)
        {
            System.out.println("Error");
        }
        messageLog.setItems(msgModel.loadAllMessages());

    }

    @FXML
    private void sendMessage(ActionEvent event) throws BllException
    {
        String text = messageField.getText();
        try
        {
            msgModel.logMessage(text);
        } catch (BllException ex)
        {
            displayException(ex);
        }
        messageLog.setItems(msgModel.getAllMessages());
    }

    private void displayException(BllException ex)
    {
        System.out.println("I should display an error message wit the text: " + ex.getMessage());
        ex.printStackTrace();
    }

}
