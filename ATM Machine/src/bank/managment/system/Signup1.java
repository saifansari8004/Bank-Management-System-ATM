package bank.managment.system;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class Signup1 extends JFrame implements ActionListener
{
    JLabel nameJLabel,fatherJLabel,dobJLabel,genderJLabel,emailJLabel,maritalJLabel,addressJLabel,cityJLabel,pincodeJLabel,stateJLabel,dateJLabel,monthJLabel,yearJLabel;
    JTextField nameJTextField,fatherJTextField,emailJTextField,addressJTextField , cityJTextField , stateJTextField,pinJTextField;
    JButton nextJButton;
    JDateChooser dateChooser;
    JRadioButton maleJRadioButton,femaleJRadioButton,marriedJRadioButton,unmarriedJRadioButton,otherJRadioButton;
    long random;
    
    Signup1()
    {
        setSize(800,820);
        setLocation(400,50);
        setLayout(null);
        setTitle("SignUp");
        
        Random ran=new Random();
        random=Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        JLabel formlblJLabel=new JLabel("Application Form No : "+random);
        formlblJLabel.setBounds(200, 50, 600, 50);
        formlblJLabel.setFont(new Font("Arial",Font.BOLD, 35));
        add(formlblJLabel);
        
        JLabel detailsJLabel=new JLabel("Page 1 : Personal Details");
        detailsJLabel.setBounds(280, 80, 300, 50);
        detailsJLabel.setFont(new Font("Arial",Font.BOLD, 22));
        add(detailsJLabel);
        
        getContentPane().setBackground(Color.WHITE);
        
        
        nameJLabel = new JLabel("Name :");
        nameJLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        nameJLabel.setBounds(100, 150, 200, 30);
        add(nameJLabel);
        
        nameJTextField=new JTextField();
        nameJTextField.setBounds(300, 150, 400, 30);
        nameJTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(nameJTextField);
        
        fatherJTextField=new JTextField();
        fatherJTextField.setBounds(300, 200, 400, 30);
        fatherJTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(fatherJTextField);
        
        fatherJLabel = new JLabel("Father's Name :");
        fatherJLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        fatherJLabel.setBounds(100, 200, 200, 30);
        add(fatherJLabel);
        
        dobJLabel = new JLabel("Date of Birth:");
        dobJLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        dobJLabel.setBounds(100, 250, 200, 30);
        add(dobJLabel);
        
        dateChooser=new JDateChooser();
        dateChooser.setBounds(300, 250, 400, 30);
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setFont(new Font("Raleway", Font.BOLD, 14));
        add(dateChooser);
        
        genderJLabel = new JLabel("Gender:");
        genderJLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        genderJLabel.setBounds(100,300, 200, 30);
        add(genderJLabel);
        
        maleJRadioButton=new JRadioButton("Male");
        maleJRadioButton.setBounds(300, 300, 80, 30);
        maleJRadioButton.setBackground(Color.WHITE);
        maleJRadioButton.setFont(new Font("Raleway", Font.BOLD, 14));
        add(maleJRadioButton);
        
        femaleJRadioButton=new JRadioButton("Female");
        femaleJRadioButton.setBounds(390, 300, 80, 30);
        femaleJRadioButton.setBackground(Color.WHITE);
        femaleJRadioButton.setFont(new Font("Raleway", Font.BOLD, 14));
        add(femaleJRadioButton);
        
        ButtonGroup btnGroup=new ButtonGroup();
        btnGroup.add(maleJRadioButton);
        btnGroup.add(femaleJRadioButton);
        
        emailJLabel = new JLabel("Email Address:");
        emailJLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        emailJLabel.setBounds(100, 350, 200, 30);
        add(emailJLabel);
        
        emailJTextField=new JTextField();
        emailJTextField.setBounds(300, 350, 400, 30);
        emailJTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(emailJTextField);
        
        marriedJRadioButton=new JRadioButton("Married");
        marriedJRadioButton.setBounds(300, 400, 85, 30);
        marriedJRadioButton.setBackground(Color.WHITE);
        marriedJRadioButton.setFont(new Font("Raleway", Font.BOLD, 14));
        add(marriedJRadioButton);
        
        unmarriedJRadioButton=new JRadioButton("Unmarried");
        unmarriedJRadioButton.setBounds(390, 400, 105, 30);
        unmarriedJRadioButton.setBackground(Color.WHITE);
        unmarriedJRadioButton.setFont(new Font("Raleway", Font.BOLD, 14));
        add(unmarriedJRadioButton);
        
        otherJRadioButton=new JRadioButton("Other");
        otherJRadioButton.setBounds(500, 400, 70, 30);
        otherJRadioButton.setBackground(Color.WHITE);
        otherJRadioButton.setFont(new Font("Raleway", Font.BOLD, 14));
        add(otherJRadioButton);
        
        ButtonGroup marritalGroup=new ButtonGroup();
        marritalGroup.add(marriedJRadioButton);
        marritalGroup.add(unmarriedJRadioButton);
        marritalGroup.add(otherJRadioButton);
              
        
        maritalJLabel = new JLabel("Marital Status:");
        maritalJLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        maritalJLabel.setBounds(100, 400, 200, 30);
        add(maritalJLabel);
        
        addressJLabel = new JLabel("Address:");
        addressJLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        addressJLabel.setBounds(100, 450, 200, 30);
        add(addressJLabel);
        
        addressJTextField=new JTextField();
        addressJTextField.setBounds(300, 450, 400, 30);
        addressJTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(addressJTextField);
        
        cityJLabel = new JLabel("City:");
        cityJLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        cityJLabel.setBounds(100, 500, 200, 30);
        add(cityJLabel);
        
        cityJTextField=new JTextField();
        cityJTextField.setBounds(300, 500, 400, 30);
        cityJTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(cityJTextField);
        
        pincodeJLabel = new JLabel("Pin Code:");
        pincodeJLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        pincodeJLabel.setBounds(100, 600, 200, 30);
        add(pincodeJLabel);
        
        pinJTextField=new JTextField();
        pinJTextField.setBounds(300, 600, 400, 30);
        pinJTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(pinJTextField);
        
        stateJLabel = new JLabel("State:");
        stateJLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        stateJLabel.setBounds(100, 550, 200, 30);
        add(stateJLabel);
        
        stateJTextField=new JTextField();
        stateJTextField.setBounds(300, 550, 400, 30);
        stateJTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(stateJTextField);
        
        
        
        nextJButton = new JButton("Next");
        nextJButton.setFont(new Font("Raleway", Font.BOLD, 14));
        nextJButton.setBackground(Color.BLACK);
        nextJButton.setForeground(Color.WHITE);
        nextJButton.setBounds(620,650,80,30);
        add(nextJButton);
        
        nextJButton.addActionListener(this); 
        
        
        
        
        
        
        
        
        
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String formno=""+random;
        String name=nameJTextField.getText();
        String fname=fatherJTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender= null;
        if(maleJRadioButton.isSelected())
        {
            gender="Male";
        }
        else if(femaleJRadioButton.isSelected())
        {
            gender="Female";
        }
        String email = emailJTextField.getText();
        
        String marrital=null;
        if(marriedJRadioButton.isSelected())
        {
            marrital="Married";
        }
        else if(unmarriedJRadioButton.isSelected())
        {
            marrital="Unmarried";
        }
        else if(otherJRadioButton.isSelected())
        {
            marrital="Other";
        }
        
        String address=addressJTextField.getText();
        String city = cityJTextField.getText();
        String state = stateJTextField.getText();
        String pin=pinJTextField.getText();
        
        try 
        {
            if(name.equals("") || fname.equals("") 
                    || dob.equals("")||gender.equals("")||email.equals("")||marrital.equals("")
                    || address.equals("") || city.equals("") || state.equals("") || pin.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Enter All Details");
            }
            else
            {
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marrital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                c.st.executeUpdate(query);
                
                setVisible(false);
                new Signup2(formno);
            }
            
        } catch (Exception e) 
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new Signup1();
    }
}
