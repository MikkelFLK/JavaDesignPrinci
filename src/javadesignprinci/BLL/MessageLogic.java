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
import javadesignprinci.BLL.exceptions.BllException;
import javadesignprinci.DAL.MessageDAO;
import javadesignprinci.DAL.exceptions.DalException;

/**
 *
 * @author Jens Karlskov
 */
class MessageLogic implements IMechaChatLogicFacade
{

    private MessageDAO msgDAO = new MessageDAO();
//    private IMechaChatDalFacade dalFacade;
    private static MessageLogic instance;

    private MessageLogic()
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
    public Message logMessage(String msg)
    {
        try
        {
            return msgDAO.logMessage(msg);
        } catch (SQLException ex)
        {
            Logger.getLogger(MessageLogic.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void deleteMessage(Message message) throws BllException
    {
        try
        {
            
        }catch (DalException ex)
        {

        }
    }

    @Override
    public List<Message> getAllMessages() throws BllException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
