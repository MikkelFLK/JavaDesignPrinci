/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignprinci.GUI.Controller;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javadesignprinci.BE.Message;
import javadesignprinci.BLL.exceptions.BllException;
import javadesignprinci.GUI.Model.Command.ICommand;
import javadesignprinci.GUI.Model.MessageLogModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.stage.Modality;
import javafx.stage.Stage;

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

    private Stack<ICommand> undos;
    private Stack<ICommand> redos;

    private KeyCombination keysUndo;
    private KeyCombination keysRedo;
    @FXML
    private MenuItem addCollaboratorButton;
    /**
     * Initializes the controller class
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {

        keysRedo = new KeyCodeCombination(KeyCode.Y, KeyCodeCombination.CONTROL_DOWN);
        keysUndo = new KeyCodeCombination(KeyCode.Z, KeyCodeCombination.CONTROL_DOWN);



//        try
//        {
//            msgModel = new MessageLogModel();
//            undos = new Stack<>();
//            redos = new Stack<>();
//            messageLog.setCellFactory(new Callback<ListView<Message>, ListCell<Message>>()
//            {
//                @Override
//                public ListCell<Message> call(ListView<Message> param)
//                {
//                    ListCell<Message> cell = new ListCell<Message>()
//                    {
//                        @Override
//                        protected void updateItem(Message item, boolean empty)
//                        {
//                            super.updateItem(item, empty);
//                            if (!empty && item != null)
//                            {
//                                setText("#" + item.getId() + ": " + item.getText());
//                            } else
//                            {
//                                setText(null);
//                                setGraphic(null);
//                            }
//                        }
//                    };
//                    return cell;
//                }
//            });
//            messageLog.setItems(msgModel.getAllMessages());
//            initKeyHandling();
//            
//        } catch (BllException ex)
//        {
//            displayException(ex);
//        }
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

    private void initKeyHandling()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @FXML
    private void OnActionAddCollaborator(ActionEvent event)
    {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/javadesignprinci/GUI/View/AddCollaborator.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            AddCollaboratorController ctrl = fxmlLoader.getController();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("Add Collaborator");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        } catch (IOException ex)
        {
            Logger.getLogger(LoginViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    }



