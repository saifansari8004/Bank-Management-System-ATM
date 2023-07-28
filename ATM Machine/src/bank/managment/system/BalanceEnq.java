
package bank.managment.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;

public class BalanceEnq extends JFrame implements ActionListener
{
    JButton backButton;
    JLabel balJLabel;
    String pin;
    public BalanceEnq(String pin_no) 
    {
        pin = pin_no;
        setSize(800, 800);
        setLocation(300, 0);
        setLayout(null);
        setTitle("Balance Enquiry");
        setUndecorated(true);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icons/atm.png"));
        Image i = img.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
        ImageIcon img1 = new ImageIcon(i);
        JLabel img_label = new JLabel(img1);
        img_label.setBounds(0, 0, 800, 800);
        add(img_label);
        
        
        backButton = new JButton("BACK");
        backButton.setBounds(350,400,90,35);
        backButton.addActionListener(this);
        img_label.add(backButton);
        
        
        Conn c1=new Conn();
        int balance = 0;
        try 
            {
                ResultSet rs = c1.st.executeQuery("select * from bank where pin = '"+pin_no+"'");
                
                while (rs.next()) 
                {
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
        catch(Exception e)
        {
            System.out.println(e);   
        }
        
        balJLabel=new JLabel("Your Current Balance: Rs."+balance);
        balJLabel.setForeground(Color.WHITE);
        balJLabel.setFont(new Font("System", Font.BOLD, 16));
        balJLabel.setBounds(180,280,700,35);
        img_label.add(balJLabel);
            
            
            
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==backButton)
        {
            setVisible(false);
            new transaction(pin);
        }
    }
    public static void main(String[] args) {
        new BalanceEnq("");
    }
    
}
