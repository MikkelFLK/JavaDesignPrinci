/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignprinci.BLL;

import java.util.List;
import javadesignprinci.BE.Message;
import javadesignprinci.BLL.exceptions.BllException;

/**
 *
 * @author Mikkel
 */
public interface IMechaChatLogicFacade
{
    
    public void deleteMessage(Message message)throws BllException;
    
    public List<Message> getAllMessages() throws BllException;

    public Message logMessage(String msg) throws BllException;

}
