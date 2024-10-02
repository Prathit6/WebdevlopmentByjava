/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dto.FacultyDTO;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modal.FacultyRegister;


/**
 *
 * @author prathit
 */
public class addFaculty extends HttpServlet {

   @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("adminHome.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fid = req.getParameter("fid");
        String fpass = req.getParameter("fpass");
        String fname = req.getParameter("fname");
        String fdob = req.getParameter("fdob");
        String faddress = req.getParameter("faddress");
        String fcontect = req.getParameter("fcontect");
        String fcity = req.getParameter("fcity");
        String fdept = req.getParameter("fdept");

        

        FacultyDTO faculty = new FacultyDTO();
         
        
         faculty.setFid(fid);
         faculty.setFpass(fpass); 
         faculty.setFname(fname);
         faculty.setFdob(fdob);
         faculty.setFaddress(faddress);
         faculty.setFcontect(fcontect);
         faculty.setFcity(fcity);
         faculty.setFdept(fdept);

      FacultyRegister fr = new FacultyRegister();
        boolean fRegister = fr.isRegisterfaculty(faculty);

        if (fRegister) {
            resp.sendRedirect("FacultyRegistrationDone.jsp");
        } else {
            resp.sendRedirect("registrationFailed.jsp");
        }
    }
}
