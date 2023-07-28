
package bank.managment.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import java.util.Date;

public class Fast_cash extends JFrame implements ActionListener
{
    JLabel headJLabel;
    JButton hundredButton,fivehButton,thouButton,twotButton,fivetButton,tentButton,exitButton;
    String pin_no;
    public Fast_cash(String pin_no)
    {
        this.pin_no=pin_no;
        setSize(800,800);
        setLocation(300,0); 
        setLayout(null);
        setTitle("Transaction");
        setUndecorated(true);
        
        
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icons/atm.png"));
        Image i=img.getImage().getScaledInstance(800, 800,Image.SCALE_DEFAULT);
        ImageIcon img1=new ImageIcon(i);
        JLabel img_label=new JLabel(img1);
        img_label.setBounds(0, 0, 800, 800);
        add(img_label);
        
        headJLabel = new JLabel("Please Select Your Transaction");
        headJLabel.setForeground(Color.WHITE);
        headJLabel.setFont(new Font("System", Font.BOLD, 20));
        headJLabel.setBounds(165,210,700,35);
        img_label.add(headJLabel);
        
       
        hundredButton = new JButton("Rs. 100");
        hundredButton.setBounds(185,260,90,35);
        img_label.add(hundredButton);
        hundredButton.addActionListener(this);
        
        
        
        fivehButton = new JButton("Rs. 500");
        fivehButton.setBounds(340,260,90,35);
        img_label.add(fivehButton);
        fivehButton.addActionListener(this);
        
        thouButton = new JButton("Rs. 1000");
        thouButton.setBounds(185,305,90,35);
        img_label.add(thouButton);
        thouButton.addActionListener(this);
        
        twotButton = new JButton("Rs. 2000");
        twotButton.setBounds(340,305,90,35);
        img_label.add(twotButton);
        twotButton.addActionListener(this);
        
        
        fivetButton = new JButton("Rs. 5000");
        fivetButton.setBounds(185,350,90,35);
        img_label.add(fivetButton);
        fivetButton.addActionListener(this);
        
        tentButton = new JButton("Rs. 10000");
        tentButton.setBounds(340,350,90,35);
        img_label.add(tentButton);
        tentButton.addActionListener(this);
        
        exitButton = new JButton("BACK");
        exitButton.setBounds(250,395,120,35);
        img_label.add(exitButton);
        exitButton.addActionListener(this);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==exitButton)
        {
            setVisible(false);
            new transaction(pin_no);
        }
        else
        {
            String amt= ((JButton)ae.getSource()).getText().substring(4);
            Conn c1=new Conn();
            try 
            {
                ResultSet rs = c1.st.executeQuery("select * from bank where pin = '"+pin_no+"'");
                int balance = 0;
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
                if(ae.getSource() != exitButton && balance < Integer.parseInt(amt))
                {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                
                Date date = new Date();
                c1.st.executeUpdate("insert into bank values('"+pin_no+"', '"+date+"', 'Withdrawl', '"+amt+"')");
                JOptionPane.showMessageDialog(null, "Rs. "+amt+" Debited Successfully");
                    
                setVisible(false);
                new transaction(pin_no).setVisible(true);
                
            }
            catch (Exception e) 
            {
                
            }
        }
        
    }
    public static void main(String[] args) {
        new Fast_cash("");
    }
}
