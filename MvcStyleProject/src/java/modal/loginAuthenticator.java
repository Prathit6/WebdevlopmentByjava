/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*package modal;

import db.dbConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static javax.swing.UIManager.getString;

/**
 *
 * @author prathit
 */
/*
public class loginAuthenticator {
    public boolean islogin(String uname,String upass){
        Connection con = null;
        ResultSet rs = null;
       String tablepass = null;
       
       try{
           Statement st = dbConnector.getStatement(); 
           String query = "SELECT upass FROM login_info WHERE uname='" + uname + "'"; 
           System.out.println(query);
           rs = st.executeQuery(query);
           
           
        
        if(rs.next()){
       
        tablepass=getString(1);
            
       
       }
       con.close();
       
    } 
      
       catch(SQLException e){
           
           System.out.println(e);
       }
       
    if(uname!=null && upass!=null && !uname.trim().equals("") && upass.equals(tablepass)){
      return true;  
    }
    else{
        return false;
    }
    }
}


*/
package modal;

import db.dbConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class loginAuthenticator {
    public boolean islogin(String uname, String upass) {
        Connection con = null;
        ResultSet rs = null;
        String tablepass = null;

        try {
            Statement st = dbConnector.getStatement(); // Retrieve the statement from the dbConnector
            String query = "SELECT upass FROM login_info WHERE uname='" + uname + "'";
            System.out.println(query);

            rs = st.executeQuery(query);

            if (rs.next()) {
                tablepass = rs.getString(1); // Changed from `getString` to `rs.getString(1)`
            }

        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e);
        } finally {
            // Ensure the connection is closed properly
            try {
                if (con != null) {
                    con.close(); // Close connection only if it's not null
                }
            } catch (SQLException e) {
                System.out.println("Error closing the connection: " + e);
            }
        }

        // Check login credentials
        if (uname != null && upass != null && !uname.trim().equals("") && upass.equals(tablepass)) {
            return true;
        } else {
            return false;
        }
    }
}
