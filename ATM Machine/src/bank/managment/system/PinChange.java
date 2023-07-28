package bank.managment.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PinChange extends JFrame implements ActionListener,KeyListener
{

    JPasswordField newField, renewField;
    JButton changeButton, backButton;
    JLabel newJLabel, renewJLabel;
    String pin;

    public PinChange(String pin_no) {
        pin = pin_no;
        setSize(800, 800);
        setLocation(300, 0);
        setLayout(null);
        setTitle("Pin Change");
        setUndecorated(true);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icons/atm.png"));
        Image i = img.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
        ImageIcon img1 = new ImageIcon(i);
        JLabel img_label = new JLabel(img1);
        img_label.setBounds(0, 0, 800, 800);
        add(img_label);

        JLabel textpin = new JLabel("CHANGE YOUR PIN");
        textpin.setForeground(Color.WHITE);
        textpin.setFont(new Font("System", Font.BOLD, 20));
        textpin.setBounds(210, 260, 500, 35);
        img_label.add(textpin);

        newJLabel = new JLabel("New PIN: ");
        newJLabel.setForeground(Color.WHITE);
        newJLabel.setFont(new Font("System", Font.BOLD, 16));
        newJLabel.setBounds(190, 305, 120, 25);
        img_label.add(newJLabel);
        
        newField=new JPasswordField();
        newField.setFont(new Font("Raleway", Font.BOLD, 25));
        newField.setBounds(300,305,100,27);
        img_label.add(newField);
        
        
        
        renewJLabel = new JLabel("Re-Enter PIN: ");
        renewJLabel.setForeground(Color.WHITE);
        renewJLabel.setFont(new Font("System", Font.BOLD, 16));
        renewJLabel.setBounds(190, 340, 120, 25);
        img_label.add(renewJLabel);
        
        renewField=new JPasswordField();
        renewField.setFont(new Font("Raleway", Font.BOLD, 25));
        renewField.setBounds(300,340,100,27);
        img_label.add(renewField);
        
        changeButton = new JButton("CHANGE");
        changeButton.setBounds(200,390,90,35);
        changeButton.addActionListener(this);
        img_label.add(changeButton);
        
        backButton = new JButton("BACK");
        backButton.setBounds(320,390,90,35);
        backButton.addActionListener(this);
        img_label.add(backButton);
        

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==backButton)
        {
            setVisible(false);
            new transaction(pin);
        }
        else if(ae.getSource()==changeButton)
        {
            try 
            {
                String npin = newField.getText();
                String rpin = renewField.getText();
                
                if(!npin.equals(rpin))
                {
                    JOptionPane.showMessageDialog(null, "PIN not Match");
                    return;
                }
                
                if(npin.equals("") || rpin.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Enter PIN");
                    return;
                }
                
                Conn c1=new Conn();
                String q1 = "update bank set pin = '"+rpin+"' where pin = '"+pin+"' ";
                String q2 = "update login set pin = '"+rpin+"' where pin = '"+pin+"' ";
                String q3 = "update signup3 set pin = '"+rpin+"' where pin = '"+pin+"' ";

                c1.st.executeUpdate(q1);
                c1.st.executeUpdate(q2);
                c1.st.executeUpdate(q3);
                
                JOptionPane.showMessageDialog(null,"PIN Changed Successfully");
                
                setVisible(false);
                new transaction(rpin).setVisible(true);
            }
            catch (Exception e) 
            {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        new PinChange("");
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
