/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignprinci.GUI.Model;

import javadesignprinci.BE.Message;
import javadesignprinci.BLL.IMechaChatLogicFacade;
import javadesignprinci.BLL.exceptions.BllException;
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

    public MessageLogModel() throws BllException
    {
        logicFacade = new MessageLogic();
        msgLog = FXCollections.observableArrayList();
        msgLog.addAll(logicFacade.loadAllMessages());
    }

    /**
     * Adds a new message to the log.
     *
     * @param text The text of the message.
     * @return
     * @throws BllException
     */
    public Message logMessage(String text) throws BllException
    {
        Message m = logicFacade.logMessage(text);
        msgLog.add(m);
        return m;
    }

    public ObservableList<Message> getAllMessages()
    {
        return msgLog;
    }


    public ObservableList<Message> loadAllMessages()
    {
        return msgLog;
    }

    public void deleteMessage(Message message) throws BllException
    {
        logicFacade.deleteMessage(message);
        msgLog.remove(message);
    }

}
