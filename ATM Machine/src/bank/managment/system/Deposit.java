
package bank.managment.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener,KeyListener
{
    JTextField amtField;
    JButton DepositButton,BackButton;
    JLabel textJLabel1,textJLabel2;
    String pin;
    public Deposit(String pin_no) 
    {
        pin = pin_no;
        setSize(800,800);
        setLocation(300,0); 
        setLayout(null);
        setTitle("Deposit Amount");
        setUndecorated(true);
        
        
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icons/atm.png"));
        Image i=img.getImage().getScaledInstance(800, 800,Image.SCALE_DEFAULT);
        ImageIcon img1=new ImageIcon(i);
        JLabel img_label1=new JLabel(img1);
        img_label1.setBounds(0, 0, 800, 800);
        add(img_label1);
        
        textJLabel1 = new JLabel("ENTER AMOUNT YOU WANT ");
        textJLabel1.setForeground(Color.WHITE);
        textJLabel1.setFont(new Font("System", Font.BOLD, 18));
        textJLabel1.setBounds(180,250,700,35);
        img_label1.add(textJLabel1);
        
        textJLabel2 = new JLabel("TO DEPOSIT: ");
        textJLabel2.setForeground(Color.WHITE);
        textJLabel2.setFont(new Font("System", Font.BOLD, 18));
        textJLabel2.setBounds(180,280,150,35);
        img_label1.add(textJLabel2);
        
        amtField = new JTextField();
        amtField.setFont(new Font("Raleway", Font.BOLD, 22));
        amtField.setBounds(300,285,120,25);
        amtField.addKeyListener(this);
        img_label1.add(amtField);
        
        DepositButton = new JButton("DEPOSIT");
        DepositButton.setBounds(250,330,100,35);
        DepositButton.addActionListener(this);
        img_label1.add(DepositButton);
        
        BackButton = new JButton("BACK");
        BackButton.setBounds(250,370,100,35);
        BackButton.addActionListener(this);
        img_label1.add(BackButton);
        
        
        
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            String amt = amtField.getText();
            Date date = new Date();
            if(ae.getSource()==DepositButton)
            {
                if(amtField.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please Enter Valid Amount");
                }
                else
                {
                    Conn c1 = new Conn();
                    c1.st.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Deposit', '"+amt+"')");
                    JOptionPane.showMessageDialog(null, "Rs. "+amt+" Deposited Successfully");
                    setVisible(false);
                    new transaction(pin).setVisible(true);
                }

            }
            else if(ae.getSource()==BackButton)
            {
                setVisible(false);
                new transaction(pin).setVisible(true);
            }
            
        } catch (Exception e) 
        {
            System.out.println(e);
        }
        
    }
    public static void main(String[] args) 
    {
        new Deposit("");
    }

    public void keyTyped(KeyEvent ke) 
    {
        char ch = ke.getKeyChar();
        if(Character.isDigit(ch) == false)
        {
            ke.consume();
        }
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) 
    {
    }
}
