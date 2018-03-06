/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignprinci.DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javadesignprinci.BE.Message;

/**
 *
 * @author Jens Karlskov
 */
public class MessageDAO
{

    DataBaseConnector dbc = new DataBaseConnector();

    public Message logMessage(String text)
    {

        try (Connection con = dbc.getConnection())
        {

            Statement stmt = con.createStatement();
            String sql = "INSERT INTO Message (Text) VALUES (?)";
            PreparedStatement st = con.prepareStatement(sql);     //, stmt.RETURN_GENERATED_KEYS 

            st.setString(1, text.getText());

            st.execute();

        } catch (SQLException ex)
        {
            Logger.getLogger(MessageDAO.class.getText()).log(Level.SEVERE, null, ex);
        }
        return Message;
    }
}
