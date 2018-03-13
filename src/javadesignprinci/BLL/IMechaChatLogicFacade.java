/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignprinci.BLL;

import java.util.List;
import javadesignprinci.BE.Message;


/**
 *
 * @author Mikkel
 */
public interface IMechaChatLogicFacade
{

    public Message logMessage(String msg) throws BllException;
    
    public List<Message> loadAllMessages() throws BllException; 

}
