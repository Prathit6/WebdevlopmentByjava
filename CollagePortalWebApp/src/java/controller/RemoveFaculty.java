



package controller;

import dto.FacultyDTO;
import dto.studentDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modal.FacultyRemove;
import modal.RegistrationAuthenticator;
import modal.StudentRemove;

/**
 *
 * @author prathit
 */
public class RemoveFaculty extends HttpServlet {
  @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("adminHome.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fid = req.getParameter("fid");
       
        

        FacultyDTO faculty = new FacultyDTO();
        faculty.setFid(fid);
        

    FacultyRemove Delete = new FacultyRemove();
        boolean FacultyDeleted = Delete.isDelete(faculty);

        if (FacultyDeleted) {
            resp.sendRedirect("FacultyDeleted.jsp");
        } else {
            resp.sendRedirect("registrationFailed.jsp");
        }
    }
   
}
