/**
 * Created by t00195834 on 21/09/2017.
 */


import javax.swing.*;
import java.awt.*;
public class Exercise2
{
    public static void main(String args[])
    {
        int i = 1, inches = 36;

        JTextArea jtextarea = new JTextArea(10,2);

        Font TextAreaFont = new Font("monospaced",Font.PLAIN,12);
        jtextarea.setFont(TextAreaFont);

        jtextarea.setText(String.format("%-10s%-10s\n", "Yards","Inches"));

        for(i=0;i<10;i++)
        {
            jtextarea.append("\n" + i + "    " + (i * inches));
        }
        JOptionPane.showMessageDialog(null, jtextarea,"Converter", JOptionPane.PLAIN_MESSAGE);
        jtextarea.setText(String.format("%-10s%-10s\n", "Yards","Inches"));
    }

}
