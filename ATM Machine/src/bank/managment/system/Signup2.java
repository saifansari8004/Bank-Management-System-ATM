
package bank.managment.system;


import javax.swing.*;
import java.util.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class Signup2 extends JFrame implements ActionListener
{
    JLabel relegionJLabel,categoryJLabel,IncomeJLabel,QualificationJLabel,EducationJLabel,OccupationJLabel,PANJLabel,AadharJLabel,senJLabel,accountJLabel;
    JTextField panJTextField,adharJTextField;
    JButton nextJButton;
    JRadioButton yesJRadioButton,noJRadioButton,yesaccJRadioButton,noaccJRadioButton;
    String random;
    JComboBox relJComboBox ,catJComboBox,incomeJComboBox,eduJComboBox,occJComboBox;
    
    Signup2(String formno)
    {
        setSize(800,820);
        setLocation(400,50);
        setLayout(null);
        setTitle("SignUp");
        random=formno;
        
        JLabel adddetailsJLabel=new JLabel("Page 2: Additional Details");
        adddetailsJLabel.setBounds(280, 50, 300, 50);
        adddetailsJLabel.setFont(new Font("Arial",Font.BOLD, 22));
        add(adddetailsJLabel);
        
        getContentPane().setBackground(Color.WHITE);
        
        
        relegionJLabel = new JLabel("Relegion :");
        relegionJLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        relegionJLabel.setBounds(100, 150, 200, 30);
        add(relegionJLabel);
        
        String religion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        relJComboBox = new JComboBox(religion);
        relJComboBox.setBackground(Color.WHITE);
        relJComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        relJComboBox.setBounds(300, 150, 400, 30);
        relJComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        add(relJComboBox);
        
        
        categoryJLabel = new JLabel("Category :");
        categoryJLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        categoryJLabel.setBounds(100, 200, 200, 30);
        add(categoryJLabel);
        
        String category[] = {"General","OBC","SC","ST","Other"};
        catJComboBox = new JComboBox(category);
        catJComboBox.setBackground(Color.WHITE);
        catJComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        catJComboBox. setBounds(300, 200, 400, 30);
        catJComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        add(catJComboBox);
        
        IncomeJLabel = new JLabel("Income :");
        IncomeJLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        IncomeJLabel.setBounds(100, 250, 200, 30);
        add(IncomeJLabel);
        
        String income[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        incomeJComboBox = new JComboBox(income);
        incomeJComboBox.setBackground(Color.WHITE);
        incomeJComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        incomeJComboBox. setBounds(300, 250, 400, 30);
        incomeJComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        add(incomeJComboBox);
        
        EducationJLabel = new JLabel("Educational");
        EducationJLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        EducationJLabel.setBounds(100,320, 200, 30);
        add(EducationJLabel);
        QualificationJLabel = new JLabel("Qualification :");
        QualificationJLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        QualificationJLabel.setBounds(100, 345, 200, 30);
        add(QualificationJLabel);
        
        String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        eduJComboBox = new JComboBox(education);
        eduJComboBox.setBackground(Color.WHITE);
        eduJComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        eduJComboBox. setBounds(300, 330, 400, 30);
        eduJComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        add(eduJComboBox);
        
        
        
        
   
              
        
        OccupationJLabel = new JLabel("Occupation :");
        OccupationJLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        OccupationJLabel.setBounds(100, 400, 200, 30);
        add(OccupationJLabel);
        
        String occupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        occJComboBox = new JComboBox(occupation);
        occJComboBox.setBackground(Color.WHITE);
        occJComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        occJComboBox. setBounds(300, 400, 400, 30);
        occJComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        add(occJComboBox);
        
        
        PANJLabel = new JLabel("PAN Number:");
        PANJLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        PANJLabel.setBounds(100, 450, 200, 30);
        add(PANJLabel);
        
        panJTextField=new JTextField();
        panJTextField.setBounds(300, 450, 400, 30);
        panJTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(panJTextField);
        
        AadharJLabel = new JLabel("Aadhar Number :");
        AadharJLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        AadharJLabel.setBounds(100, 500, 200, 30);
        add(AadharJLabel);
        
        adharJTextField=new JTextField();
        adharJTextField.setBounds(300, 500, 400, 30);
        adharJTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(adharJTextField);
        
        senJLabel = new JLabel("Senior Citizen :");
        senJLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        senJLabel.setBounds(100, 550, 200, 30);
        add(senJLabel);
        
        yesJRadioButton=new JRadioButton("Yes");
        yesJRadioButton.setBounds(300, 550, 60, 30);
        yesJRadioButton.setBackground(Color.WHITE);
        yesJRadioButton.setFont(new Font("Raleway", Font.BOLD, 14));
        add(yesJRadioButton);
        
        noJRadioButton=new JRadioButton("No");
        noJRadioButton.setBounds(370, 550, 60, 30);
        noJRadioButton.setBackground(Color.WHITE);
        noJRadioButton.setFont(new Font("Raleway", Font.BOLD, 14));
        add(noJRadioButton);
        
        ButtonGroup senbtnGroup=new ButtonGroup();
        senbtnGroup.add(yesJRadioButton);
        senbtnGroup.add(noJRadioButton);
        
        accountJLabel = new JLabel("Existing Account :");
        accountJLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        accountJLabel.setBounds(100, 600, 200, 30);
        add(accountJLabel);
        
        yesaccJRadioButton=new JRadioButton("Yes");
        yesaccJRadioButton.setBounds(300, 600, 60, 30);
        yesaccJRadioButton.setBackground(Color.WHITE);
        yesaccJRadioButton.setFont(new Font("Raleway", Font.BOLD, 14));
        add(yesaccJRadioButton);
        
        noaccJRadioButton=new JRadioButton("No");
        noaccJRadioButton.setBounds(370, 600, 60, 30);
        noaccJRadioButton.setBackground(Color.WHITE);
        noaccJRadioButton.setFont(new Font("Raleway", Font.BOLD, 14));
        add(noaccJRadioButton);
        
        ButtonGroup accbtnGroup=new ButtonGroup();
        accbtnGroup.add(yesaccJRadioButton);
        accbtnGroup.add(noaccJRadioButton);
        
        
        
        
        nextJButton = new JButton("Next");
        nextJButton.setFont(new Font("Raleway", Font.BOLD, 14));
        nextJButton.setBackground(Color.BLACK);
        nextJButton.setForeground(Color.WHITE);
        nextJButton.setBounds(620,650,80,30);
        add(nextJButton);
        
        nextJButton.addActionListener(this); 
        
        JLabel formnoJLabel = new JLabel("Form No: "+formno);
        formnoJLabel.setFont(new Font("Raleway", Font.BOLD, 12));
        formnoJLabel.setBounds(620,10,150,30);
        add(formnoJLabel);
        
        
        
        
        
        
        
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String formno = random;
        String religion = (String)relJComboBox.getSelectedItem(); 
        String category = (String)catJComboBox.getSelectedItem();
        String income = (String)incomeJComboBox.getSelectedItem();
        String education = (String)eduJComboBox.getSelectedItem();
        String occupation = (String)occJComboBox.getSelectedItem();
        
        String pan = panJTextField.getText();
        String aadhar = adharJTextField.getText();
        
        String scitizen = "";
        if(yesJRadioButton.isSelected()){ 
            scitizen = "Yes";
        }
        else if(noJRadioButton.isSelected()){ 
            scitizen = "No";
        }
           
        String eaccount = "";
        if(yesaccJRadioButton.isSelected()){ 
            eaccount = "Yes";
        }else if(noaccJRadioButton.isSelected()){ 
            eaccount = "No";
        }
        
        try
        {
            if(religion.equals("") || category.equals("") 
                    || education.equals("")||occupation.equals("")||income.equals("")
                    || pan.equals("") || aadhar.equals("") || scitizen.equals("") || eaccount.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Enter All Details");
            }
            else
            {
                Conn c2=new Conn();
                String query="insert into signup2 values('"+formno+"','"+religion+"' , '"+category+"' ,'"+income+"' ,'"+education+"' , '"+occupation+"' , '"+pan+"' , '"+aadhar+"' , '"+scitizen+"' , '"+eaccount+"')";
                c2.st.executeUpdate(query);
                
                new Signup3(formno).setVisible(true);
                setVisible(false);
            }
            
        }
        catch(Exception ex)
        {
             
        }
    
               
    }

    public static void main(String[] args) 
    {
        new Signup2("");
    }
}
