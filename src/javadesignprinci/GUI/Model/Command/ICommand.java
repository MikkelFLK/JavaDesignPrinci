/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignprinci.GUI.Model.Command;

import javadesignprinci.BLL.exceptions.BllException;

/**
 *
 * @author Frederik Bærbar
 */
public interface ICommand
{

    public void execute() throws BllException;

    public void undo() throws BllException;

}
