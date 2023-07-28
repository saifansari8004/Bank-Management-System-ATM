package bank.managment.system;
import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener,KeyListener
{
    JButton signinJButton  ,signupJButton,clearJButton,exitButton;
    JTextField cardtextField;
    JPasswordField pinPasswordField;
    Login()
    {
        setSize(800, 500);
        this.setTitle("ATM");
        this.setLocation(350,200);
        setLayout(null);
        setUndecorated(true);
        
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icons/logo1.png"));
        Image i=img.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon img1=new ImageIcon(i);
        JLabel logo_label=new JLabel(img1);
        logo_label.setBounds(90, 50, 100, 100);
        add(logo_label);
        
        getContentPane().setBackground(Color.WHITE);
        
        JLabel titlelbl=new JLabel();
        titlelbl.setText("Welcome to ATM");
        titlelbl.setFont(new Font("Arial",Font.BOLD, 35));
        titlelbl.setBounds(250, 70, 350, 50);
        add(titlelbl);
        
        
        JLabel cardlbl=new JLabel();
        cardlbl.setText("Card Number :");
        cardlbl.setFont(new Font("Arial",Font.BOLD, 28));
        cardlbl.setBounds(150, 170, 200, 50);
        add(cardlbl);
        
        
        JLabel pinlbl=new JLabel();
        pinlbl.setText("Enter PIN :");
        pinlbl.setBounds(150, 250, 200, 50);
        add(pinlbl);
        pinlbl.setFont(new Font("Arial",Font.BOLD, 28));
        
        
        cardtextField=new JTextField();
        cardtextField.setBounds(350, 170, 300, 50);
        cardtextField.setFont(new Font("Arial",Font.BOLD, 25));
        cardtextField.addKeyListener(this);
        add(cardtextField);
        
        
        pinPasswordField=new JPasswordField();
        pinPasswordField.setBounds(350, 250, 300, 50);
        pinPasswordField.setFont(new Font("Arial",Font.BOLD, 25));
        add(pinPasswordField);
        pinPasswordField.addKeyListener(this);
        
        signinJButton=new JButton("SignIn");
        signinJButton.setBounds(280, 320, 100, 40);
        signinJButton.setFont(new java.awt.Font("Arial", 1, 14));
        signinJButton.setBackground(Color.BLACK);
        signinJButton.setForeground(Color.WHITE);
        signinJButton.addActionListener(this);
        add(signinJButton);
        
        clearJButton=new JButton("Clear");
        clearJButton.setBounds(420, 320, 100, 40);
        clearJButton.setBackground(Color.BLACK);
        clearJButton.setFont(new java.awt.Font("Arial", 1, 14));
        clearJButton.setForeground(Color.WHITE);
        clearJButton.addActionListener(this);
        add(clearJButton);
        
        signupJButton=new JButton("SignUp");
        signupJButton.setBounds(280, 390, 240, 40);
        signupJButton.setBackground(Color.BLACK);
        signupJButton.setFont(new java.awt.Font("Arial", 1, 14));
        signupJButton.setForeground(Color.WHITE);
        signupJButton.addActionListener(this);
        add(signupJButton);
        
        exitButton=new JButton("Exit");
        exitButton.setBounds(700, 20, 55,25);
        exitButton.setBackground(Color.RED);
        exitButton.setFont(new java.awt.Font("Arial", Font.BOLD, 10));
        exitButton.setForeground(Color.WHITE);
        exitButton.addActionListener(this);
        add(exitButton);
        
        
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == clearJButton)
        {
            cardtextField.setText(" ");
            pinPasswordField.setText("");
        }
        else if(ae.getSource() == signinJButton)
        {
            Conn c=new Conn();
            String cardno = cardtextField.getText();
            String pin_no = pinPasswordField.getText();
            
            String query = "select * from login where cardnumber='"+cardno+"' and pin='"+pin_no+"'";
            try 
            {
                ResultSet rs=c.st.executeQuery(query);
                if(rs.next())
                {
                    setVisible(false);
                    new transaction(pin_no).setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Incorrect Pin");
                }
            } catch (Exception e)
            {
                System.out.println(e);
            }
            
        }
        else if(ae.getSource() == signupJButton)
        {
            setVisible(false);
            new Signup1().setVisible(true);
        }
        else if(ae.getSource()==exitButton)
        {
            int res = JOptionPane.showConfirmDialog(this,"Do you want to close?");
            if(res == JOptionPane.YES_OPTION)
            {
                this.dispose();
            }
        }
    }
    
    public void keyTyped(KeyEvent ke)
    {
        char ch = ke.getKeyChar();
        if(Character.isDigit(ch) == false)
        {
            ke.consume();
        }
    }
    public static void main(String[] args) 
    {
        new Login();
    }

    public void keyPressed(KeyEvent e) 
    {
        
    }
    
    public void keyReleased(KeyEvent e) 
    {
    
    }
       
}
