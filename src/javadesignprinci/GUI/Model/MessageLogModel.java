/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignprinci.GUI.Model;

import static com.sun.org.apache.xml.internal.serializer.utils.Utils.messages;
import javadesignprinci.BE.Message;
import javadesignprinci.BLL.IMechaChatLogicFacade;
import javadesignprinci.BLL.exceptions.BllException;
import javafx.collections.ObservableList;

/**
 *
 * @author Mikkel
 */
public class MessageLogModel
{

    private IMechaChatLogicFacade logicFacade;
    private ObservableList<Message> msgLog;

    
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

    public void deleteMessage(Message message)
    {
        logicFacade.deleteMessage(message);
        messages.remove(message);
    }
    
    
    
}
