/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;


import db.dbconnector;
import dto.studentDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author prathit
 */
//This Registration Authenticator bydefult for student

    public class RegistrationAuthenticator {
      
    public boolean isRegister(studentDTO student)
    {
        try
        {
            Connection con = dbconnector.getConnection();
            PreparedStatement pst = con.prepareStatement("INSERT INTO student VALUES (?,?,?,?,?,?,?,?)");
            
        
       
            pst.setString(1, student.getSid());
            pst.setString(2, student.getSpass());
            pst.setString(3, student.getSname());
            pst.setString(4, student.getSdob());
            pst.setString(5, student.getSaddress());
            pst.setString(6, student.getScontect());
            pst.setString(7, student.getScity());
            pst.setString(8, student.getSdept());

            
            int i = pst.executeUpdate();
            if(i>0)
            {
                return true;
            }
        }
         catch(SQLException e)
        {
            System.out.println(e);
        }
        return false;
}
    
    }

/*
public class RegistrationAuthenticator {
     public boolean islogin(studentDTO student) {
        Connection con = null;
        ResultSet rs = null;
        String tablepass = null;
        
        String sid = student.getSid();
        String spass = student.getSpass();
        String sname = student.getSname();
        String sdob = student.getSdob();
        String saddress = student.getSaddress();
        String scontects = student.getScontect();
        String scity = student.getScity();
        String sdept = student.getSdept();

        try {
            Statement st = dbconnector .getStatement(); // Retrieve the statement from the dbConnector
            String query = "insert into student values('"+sid+"','"+spass+"','"+sname+"','"+sdob+"','"+saddress+"','"+scontects+"','"+scity+"','"+sdept+"')";
            System.out.println(query);

            rs = st.executeQuery(query);
             int i=st.executeUpdate(query);
             
             
            if(i>0){
       
           
           System.out.println("record Inserted..");
               
            
       }
       else{
       
       
            System.out.println("Record insertion fail");
       
       }

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
        if (sid != null && spass != null && !sid.trim().equals("") && spass.equals(tablepass)) {
            return true;
        } else {
            return false;
        }
    }*/