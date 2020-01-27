package traningandplacement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TraningandPlacement {
 Connection conn=null;
    public static Connection connDB()
        {
         try {
               Class.forName("com.mysql.jdbc.Driver");
               Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/traning_and_placement","root","oracle");
               return conn;
             } 
         catch (ClassNotFoundException | SQLException e)
            {
               JOptionPane.showMessageDialog(null, e);
            }
         return null;
        }
}