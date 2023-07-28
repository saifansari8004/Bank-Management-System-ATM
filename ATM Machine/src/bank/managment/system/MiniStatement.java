
package bank.managment.system;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class MiniStatement extends JFrame implements ActionListener
{
    String pin;
    JButton backButton;
    public MiniStatement(String pin_no)
    {
        pin = pin_no;
        
        setSize(440,500);
        setLocation(375,100); 
        setLayout(null);
        setTitle("Mini Statement");
        setUndecorated(true);
        
        getContentPane().setBackground(Color.WHITE);
        
        JLabel bankLabel = new JLabel("Indian Bank");
        bankLabel.setBounds(150, 30, 200, 30);
        bankLabel.setFont(new Font("System", Font.BOLD, 22));
        add(bankLabel);
        
        JLabel cardLabel = new JLabel();
        cardLabel.setBounds(50, 70, 400, 25);
        cardLabel.setFont(new Font("System", Font.BOLD, 17));
        add(cardLabel);
        
        int balance =0;
        
        try 
        {
            Conn c1 = new Conn();
            ResultSet rs = c1.st.executeQuery("select * from login where pin = '"+pin+"'");
            while(rs.next())
            {
                cardLabel.setText("Card Number: "+ rs.getString("cardnumber").substring(0 , 4)+"-XXXX-XXXX-"+ rs.getString("cardnumber").substring(12));
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        JLabel text = new JLabel();
        text.setBounds(30, 90, 400, 300);
        text.setFont(new Font("System", Font.BOLD, 14));
        add(text);
        
        try 
        {
            Conn c2 = new Conn();
            ResultSet rs=c2.st.executeQuery("select * from bank where pin = '"+pin+"'");
            while(rs.next())
            {
                text.setText(text.getText() +"<html>"+ rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br>");
                if (rs.getString("type").equals("Deposit")) 
                {
                    balance += Integer.parseInt(rs.getString("amount"));
                }
                else 
                {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
        
        
        JLabel bal = new JLabel("Total Balance: Rs."+balance);
        bal.setBounds(220, 410, 200, 25);
        bal.setFont(new Font("System", Font.BOLD, 14));
        add(bal);
        
        backButton = new JButton("BACK");
        backButton.setBounds(170,450,90,35);
        backButton.addActionListener(this);
        backButton.setBackground(Color.BLACK);
        backButton.setFont(new java.awt.Font("Arial", 1, 14));
        backButton.setForeground(Color.WHITE);
        add(backButton);
        
        
        setVisible(true);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==backButton)
        {
            setVisible(false);
        }
    }
    public static void main(String[] args) 
    {
        new MiniStatement("");
        
    }
}
