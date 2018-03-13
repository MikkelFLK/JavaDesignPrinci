/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignprinci.BLL;

import java.sql.SQLException;
import java.util.List;
import javadesignprinci.BE.Message;
import javadesignprinci.BLL.exceptions.BllException;
import javadesignprinci.DAL.MessageDAO;
import javadesignprinci.DAL.exceptions.DalException;
import javadesignprinci.DAL.facade.IMechaChatDalFacade;

/**
 *
 * @author Jens Karlskov
 */
public class MessageLogic implements IMechaChatLogicFacade
{

    private MessageDAO msgDAO = new MessageDAO();
    private IMechaChatDalFacade dalFacade;
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
    public void deleteMessage(Message message) throws BllException
    {
        try
        {
            dalFacade.deleteMessage(message);
        } catch (DalException ex)
        {
            throw new BllException(ex.getMessage(), ex);
        }
    }

    @Override
    public List<Message> getAllMessages() throws BllException
    {
        try
        {
            return dalFacade.readAllMessages();
        } catch (DalException ex)
        {
            throw new BllException(ex.getMessage(), ex);
        }
    }

}
