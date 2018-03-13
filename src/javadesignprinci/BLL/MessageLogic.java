/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignprinci.BLL;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javadesignprinci.BE.Message;
import javadesignprinci.DAL.MessageDAO;

/**
 *
 * @author Jens Karlskov
 */
public class MessageLogic implements IMechaChatLogicFacade
{

    private MessageDAO msgDAO = new MessageDAO();

    private static MessageLogic instance;

    public MessageLogic()
    {

    }

    public static synchronized MessageLogic getInstance()
    {
        if (instance == null)
        {
            instance = new MessageLogic();
        }

        return instance;
    }

    @Override
    public Message logMessage(String msg) throws BllException
    {

        try
        {
            return msgDAO.logMessage(msg);
        } catch (SQLException ex)
        {
            throw new BllException(ex.getMessage(), ex);
        }
    }

    @Override
    public List<Message> loadAllMessages() throws BllException
    {
        try
        {
            return msgDAO.readAllMessages();
        } catch (SQLException ex)
        {
            throw new BllException(ex.getMessage(), ex);
        }
    }

}
