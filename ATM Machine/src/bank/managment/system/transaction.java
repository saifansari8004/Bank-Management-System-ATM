
package bank.managment.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class transaction extends JFrame implements ActionListener
{
    JLabel headJLabel;
    JButton depositButton,withdrawlButton,fastButton,miniButton,pinButton,balanceButton,exitButton;
    String pin_no;
    public transaction(String pin_no)
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
        
       
        depositButton = new JButton("DEPOSIT");
        depositButton.setBounds(120,260,150,35);
        img_label.add(depositButton);
        depositButton.addActionListener(this);
        
        
        
        withdrawlButton = new JButton("CASH WITHDRAWL");
        withdrawlButton.setBounds(345,260,150,35);
        img_label.add(withdrawlButton);
        withdrawlButton.addActionListener(this);
        
        fastButton = new JButton("FAST CASH");
        fastButton.setBounds(120,305,150,35);
        img_label.add(fastButton);
        fastButton.addActionListener(this);
        
        miniButton = new JButton("MINI STATEMENT");
        miniButton.setBounds(345,305,150,35);
        img_label.add(miniButton);
        miniButton.addActionListener(this);
        
        
        pinButton = new JButton("PIN CHANGE");
        pinButton.setBounds(120,350,150,35);
        img_label.add(pinButton);
        pinButton.addActionListener(this);
        
        balanceButton = new JButton("BALANCE ENQUIRY");
        balanceButton.setBounds(345,350,150,35);
        img_label.add(balanceButton);
        balanceButton.addActionListener(this);
        
        exitButton = new JButton("LOGOUT");
        exitButton.setBounds(345,395,150,35);
        img_label.add(exitButton);
        exitButton.addActionListener(this);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==exitButton)
        {
            int res = JOptionPane.showConfirmDialog(this,"Do you want to Logout?");
            if(res == JOptionPane.YES_OPTION)
            {
                this.dispose();
                new Login().setVisible(true);
            }
            
        }
        else if(ae.getSource()==depositButton)
        {
            setVisible(false);
            new Deposit(pin_no).setVisible(true);
        }
        else if(ae.getSource()==withdrawlButton)
        {
            setVisible(false);
            new Withdrawl(pin_no).setVisible(true);
        }
        else if(ae.getSource()==fastButton)
        {
            setVisible(false);
            new Fast_cash(pin_no);
        }
        else if(ae.getSource()==pinButton)
        {
            setVisible(false);
            new PinChange(pin_no).setVisible(true);
        }
        else if(ae.getSource()==balanceButton)
        {
            setVisible(false);
            new BalanceEnq(pin_no);
        }
        else if(ae.getSource()==miniButton)
        {
            new MiniStatement(pin_no).setVisible(true);
        }
    }
    public static void main(String[] args) {
        new transaction("");
    }
}
