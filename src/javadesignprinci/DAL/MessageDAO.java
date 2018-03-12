/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignprinci.DAL;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

    public Message logMessage(String text) throws SQLException
    {

        try (Connection con = dbc.getConnection())
        {

            Statement stmt = con.createStatement();
            String sql = "INSERT INTO Message (Text) VALUES (?)";
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);     //, stmt.RETURN_GENERATED_KEYS 

            st.setString(1, text);

            st.execute();
            ResultSet rs = st.getGeneratedKeys();
            rs.next();

            Message m = new Message();
            m.setId(rs.getInt("Id"));
            m.setText(text);
            return m;

        }
    }
}
