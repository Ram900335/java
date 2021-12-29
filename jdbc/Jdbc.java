
package newproject;

import java.sql.Connection;
import javax.swing.JOptionPane;


public class Jdbc 
{
    public static Connection connect()
    {
            Connection con = null;
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con=driverManager.getConnection("jdbc:mysql://localhost:3306/gowri","root","root");
                JOptionPane.showMessageDialog(null,"connection success");
                
            }catch (ClassNotFoundException e)
            {System.out.print("inter.DBConnect.connect()");}
            return con;
    }
   
}

 