package bank.managment.system;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Signup3 extends JFrame implements ActionListener
{
    JRadioButton savingButton,fdButton,rdButton,currButton;
    JCheckBox atmBox,ibBox,mbBox,emailBox,chequeBox,estmtBox,notebBox;
    JButton submitButton,cancelButton;
    String formno;
    
    public Signup3(String formno)
    {
        this.formno = formno;
        setSize(800,820);
        setLocation(400,50);
        setLayout(null);
        setTitle("SignUp");
        
        
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icons/logo.png"));
        Image i=img.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon img1=new ImageIcon(i);
        JLabel logo_label=new JLabel(img1);
        logo_label.setBounds(120, 10, 100, 100);
        add(logo_label);
        
        
        JLabel accdetailsJLabel=new JLabel("Page 3: Account Details");
        accdetailsJLabel.setBounds(280, 50, 300, 50);
        accdetailsJLabel.setFont(new Font("Arial",Font.BOLD, 22));
        add(accdetailsJLabel);
        
        getContentPane().setBackground(Color.WHITE);
        
        
        JLabel accJLabel = new JLabel("Account Type:");
        accJLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        accJLabel.setBounds(100,140,200,30);
        add(accJLabel);
        
        savingButton = new JRadioButton("Saving Account");
        savingButton.setFont(new Font("Raleway", Font.BOLD, 16));
        savingButton.setBackground(Color.WHITE);
        savingButton.setBounds(100,180,150,30);
        add(savingButton);       
        
        fdButton = new JRadioButton("Fixed Deposit Account");
        fdButton.setFont(new Font("Raleway", Font.BOLD, 16));
        fdButton.setBackground(Color.WHITE);
        fdButton.setBounds(350,180,300,30);
        add(fdButton);  
        
        currButton = new JRadioButton("Current Account");
        currButton.setFont(new Font("Raleway", Font.BOLD, 16));
        currButton.setBackground(Color.WHITE);
        currButton.setBounds(100,220,250,30);
        add(currButton);
        
        rdButton = new JRadioButton("Recurring Deposit Account");
        rdButton.setFont(new Font("Raleway", Font.BOLD, 16));
        rdButton.setBackground(Color.WHITE);
        rdButton.setBounds(350,220,250,30);
        add(rdButton);
        
        ButtonGroup accountGroup = new ButtonGroup();
        accountGroup.add(savingButton);
        accountGroup.add(fdButton);
        accountGroup.add(currButton);
        accountGroup.add(rdButton);
        
        JLabel carJLabel = new JLabel("Card Number:");
        carJLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        carJLabel.setBounds(100,300,200,30);
        add(carJLabel);
        
        
        JLabel dummyJLabel = new JLabel("XXXX-XXXX-XXXX-4184");
        dummyJLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        dummyJLabel.setBounds(330,300,250,30);
        add(dummyJLabel);
        
        
        JLabel cardnumJLabel= new JLabel("(Your 16-digit Card number)");
        cardnumJLabel.setFont(new Font("Raleway", Font.BOLD, 12));
        cardnumJLabel.setBounds(100,330,200,20);
        add(cardnumJLabel);
        
        
        JLabel noteJLabel = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        noteJLabel.setFont(new Font("Raleway", Font.BOLD, 12));
        noteJLabel.setBounds(330,330,500,20);
        add(noteJLabel);
        
        JLabel pinJLabel = new JLabel("PIN:");
        pinJLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        pinJLabel.setBounds(100,370,200,30);
        add(pinJLabel);
        
        JLabel pinxJLabel = new JLabel("XXXX");
        pinxJLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        pinxJLabel.setBounds(330,370,200,30);
        add(pinxJLabel);
    
        JLabel passJLabel = new JLabel("(4-digit password)");
        passJLabel.setFont(new Font("Raleway", Font.BOLD, 12));
        passJLabel.setBounds(100,400,200,20);
        add(passJLabel);
    
        JLabel serviceJLabel = new JLabel("Services Required:");
        serviceJLabel.setFont(new Font("Raleway", Font.BOLD, 18));
        serviceJLabel.setBounds(100,450,200,30);
        add(serviceJLabel);
        
        JLabel formnoJLabel = new JLabel("Form No: "+formno);
        formnoJLabel.setFont(new Font("Raleway", Font.BOLD, 12));
        formnoJLabel.setBounds(620,10,150,30);
        add(formnoJLabel);
        
        
        atmBox = new JCheckBox("ATM CARD");
        atmBox.setBackground(Color.WHITE);
        atmBox.setFont(new Font("Raleway", Font.BOLD, 16));
        atmBox.setBounds(100,500,200,30);
        add(atmBox);

        
        ibBox = new JCheckBox("Internet Banking");
        ibBox.setBackground(Color.WHITE);
        ibBox.setFont(new Font("Raleway", Font.BOLD, 16));
        ibBox.setBounds(350,500,200,30);
        add(ibBox);
        
        mbBox = new JCheckBox("Mobile Banking");
        mbBox.setBackground(Color.WHITE);
        mbBox.setFont(new Font("Raleway", Font.BOLD, 16));
        mbBox.setBounds(100,550,200,30);
        add(mbBox);
        
        emailBox = new JCheckBox("EMAIL Alerts");
        emailBox.setBackground(Color.WHITE);
        emailBox.setFont(new Font("Raleway", Font.BOLD, 16));
        emailBox.setBounds(350,550,200,30);
        add(emailBox);
        
        chequeBox = new JCheckBox("Cheque Book");
        chequeBox.setBackground(Color.WHITE);
        chequeBox.setFont(new Font("Raleway", Font.BOLD, 16));
        chequeBox.setBounds(100,600,200,30);
        add(chequeBox);
        
        estmtBox = new JCheckBox("E-Statement");
        estmtBox.setBackground(Color.WHITE);
        estmtBox.setFont(new Font("Raleway", Font.BOLD, 16));
        estmtBox.setBounds(350,600,200,30);
        add(estmtBox);
        
        notebBox = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.",true);
        notebBox.setBackground(Color.WHITE);
        notebBox.setFont(new Font("Raleway", Font.BOLD, 12));
        notebBox.setBounds(100,680,600,20);
        add(notebBox);
        
        
        submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Raleway", Font.BOLD, 14));
        submitButton.setBackground(Color.BLACK);
        submitButton.setForeground(Color.WHITE);
        submitButton.setBounds(250,720,100,30);
        add(submitButton);
        submitButton.addActionListener(this);
        
        
        
        cancelButton = new JButton("Cancel");
        cancelButton.setFont(new Font("Raleway", Font.BOLD, 14));
        cancelButton.setBackground(Color.BLACK);
        cancelButton.setForeground(Color.WHITE);
        cancelButton.setBounds(420,720,100,30);
        add(cancelButton);
        cancelButton.addActionListener(this);
        
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == submitButton)
        {
            String atype = null;
            if(savingButton.isSelected()){ 
                atype = "Saving Account";
            }
            else if(fdButton.isSelected()){ 
                atype = "Fixed Deposit Account";
            }
            else if(currButton.isSelected()){ 
                atype = "Current Account";
            }else if(rdButton.isSelected()){ 
                atype = "Recurring Deposit Account";
            }
            
            Random ran = new Random();
            long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
            String cardno = "" + Math.abs(first7);
            
            long first3 = (ran.nextLong() % 9000L) + 1000L;
            String pin = "" + Math.abs(first3);
            
            String service = "";
            if(atmBox.isSelected()){ 
                service = service + " ATM Card";
            }
            if(ibBox.isSelected()){ 
                service = service + " Internet Banking";
            }
            if(mbBox.isSelected()){ 
                service = service + " Mobile Banking";
            }
            if(emailBox.isSelected()){ 
                service = service + " EMAIL Alerts";
            }
            if(chequeBox.isSelected()){ 
                service = service + " Cheque Book";
            }
            if(estmtBox.isSelected()){ 
                service = service + " E-Statement";
            }
            
            String confirm=null;
            if(notebBox.isSelected())
            {
                confirm = "Done";
            }
            
            try 
            {
                if(atype.equals("") || confirm.equals("") )
                {
                    JOptionPane.showMessageDialog(null,"Select Account Type and Confirm Details");
                }
                
                else
                {
                    Conn c=new Conn();
                    String query1="insert into signup3 values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+service+"')";
                    String query2="insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c.st.executeUpdate(query1);
                    c.st.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\n Pin:"+ pin);
                    
                    setVisible(false);
                    new Deposit(pin).setVisible(true);
                }
            }
            catch (Exception e) 
            {
                System.out.println(e);
            }
        }
        else if(ae.getSource()==cancelButton)
        {
            setVisible(false);
            new Login().setVisible(true);
        }
   
    }
    
    public static void main(String[] args) {
        new Signup3("");
    }
    
}
