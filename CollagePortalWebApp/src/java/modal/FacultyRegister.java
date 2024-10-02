/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;

import db.dbconnector;
import dto.FacultyDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author prathit
 */
public class FacultyRegister {
     public boolean isRegisterfaculty( FacultyDTO faculty)
    {
        try
        {
            Connection con = dbconnector.getConnection();
            PreparedStatement pst = con.prepareStatement("INSERT INTO faculty VALUES (?,?,?,?,?,?,?,?)");
            
        
       
            pst.setString(1, faculty.getFid());
            pst.setString(2, faculty.getFpass());
            pst.setString(3, faculty.getFname());
            pst.setString(4, faculty.getFdob());
            pst.setString(5, faculty.getFaddress());
            pst.setString(6, faculty.getFcontect());
            pst.setString(7, faculty.getFcity());
            pst.setString(8, faculty.getFdept());

            
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
