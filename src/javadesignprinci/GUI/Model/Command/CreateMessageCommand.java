/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignprinci.GUI.Model.Command;

import javadesignprinci.BE.Message;
import javadesignprinci.BLL.exceptions.BllException;
import javadesignprinci.GUI.Model.MessageLogModel;

/**
 *
 * @author Frederik Bærbar
 */
public class CreateMessageCommand implements ICommand
{

    private MessageLogModel receiver;
    private Message message;
    private String text;

    public CreateMessageCommand(MessageLogModel receiver, String text)
    {
        this.receiver = receiver;
        this.text = text;
    }

    @Override
    public void execute() throws BllException
    {
        message = receiver.logMessage(text);
    }

    @Override
    public void undo() throws BllException
    {
        receiver.deleteMessage(message);
    }

}
