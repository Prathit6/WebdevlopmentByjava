package modal;

import db.dbconnector;
import dto.studentDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentRemove {
    public boolean isRemove(studentDTO student) {
        boolean f = false;
        String query = "DELETE FROM student WHERE sid = ?";

        try (Connection con = dbconnector.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, student.getSid()); // Assuming getSid() returns the student's ID
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
