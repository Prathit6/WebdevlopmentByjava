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
public class FacultyRemove {
    public boolean isDelete(FacultyDTO faculty) {
        boolean f = false;
        String query = "DELETE FROM faculty WHERE fid = ?";

        try (Connection con = dbconnector.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, faculty.getFid()); 
            int i = ps.executeUpdate();

            if (i > 0) {
                f = true;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return f;
    }
}
