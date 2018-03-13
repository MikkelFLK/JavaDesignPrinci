/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignprinci.GUI.Model;

import javadesignprinci.BE.Message;
import javadesignprinci.BLL.BllException;
import javadesignprinci.BLL.IMechaChatLogicFacade;
import javadesignprinci.BLL.MessageLogic;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Mikkel
 */
public class MessageLogModel
{

    private IMechaChatLogicFacade logicFacade;
    private ObservableList<Message> msgLog;

    public MessageLogModel()
    {
        logicFacade = new MessageLogic();
        msgLog = FXCollections.observableArrayList();
        
    }

    public void logMessage(String text) throws BllException
    {
        Message m = logicFacade.logMessage(text);
        msgLog.add(m);
    }

    public ObservableList<Message> getAllMessages()
    {
        return msgLog;
    }
}
