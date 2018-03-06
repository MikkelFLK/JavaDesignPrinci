/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignprinci.BLL;

/**
 *
 * @author Jens Karlskov
 */
public class MessageLogic
{
    private IMechaChatLogicFacade logicFacade;
    
    public void logMessage(String text)
    {
        logicFacade.logMessage(text);
    }
}
