/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignprinci.GUI.Model;

import javadesignprinci.BE.Message;
import javadesignprinci.BLL.IMechaChatLogicFacade;
import javafx.collections.ObservableList;

/**
 *
 * @author Mikkel
 */
public class MessageLogModel
{

    private IMechaChatLogicFacade logicFacade;
    private ObservableList <Message> msg;

    public void logMessage(String text)
    {
        logicFacade.logMessage(text);
    }
}