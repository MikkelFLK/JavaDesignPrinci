/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignprinci.DAL.facade;

import java.util.List;
import javadesignprinci.BE.Message;
import javadesignprinci.DAL.exceptions.DalException;


/**
 *
 * @author pgn
 */
public interface IMechaChatDalFacade
{

    public Message createMessage(String msg) throws DalException;

    public void deleteMessage(Message message) throws DalException;

    public List<Message> readAllMessages() throws DalException;

}
