/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignprinci.BE;

/**
 *
 * @author Mikkel
 */
public class Message
{

    private int Id;
    private String Text;

    public int getId()
    {
        return Id;
    }

    public void setId(int Id)
    {
        this.Id = Id;
    }

    public String getText()
    {
        return Text;
    }

    public void setText(String Text)
    {
        this.Text = Text;
    }

    @Override
    public String toString()
    {
        return "Message{" + "Id=" + Id + ", Text=" + Text + '}';
    }

}
