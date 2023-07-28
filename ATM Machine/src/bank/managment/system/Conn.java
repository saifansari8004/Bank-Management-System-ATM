package bank.managment.system;

import java.sql.*;
 
public class Conn
{
    Connection con;
    Statement st;
    public Conn()
    {
        try
        {
            con=DriverManager.getConnection("jdbc:mysql:///bms","root","sa12345");
            st=con.createStatement();
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
    
    
}
