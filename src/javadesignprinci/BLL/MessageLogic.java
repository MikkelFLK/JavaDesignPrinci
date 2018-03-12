/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignprinci.BLL;

import javadesignprinci.BE.Message;
import javadesignprinci.DAL.MessageDAO;

/**
 *
 * @author Jens Karlskov
 */
class MessageLogic implements IMechaChatLogicFacade
{

    private MessageDAO msgDAO = new MessageDAO();

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
        return msgDAO.logMessage(msg);

    }

}
