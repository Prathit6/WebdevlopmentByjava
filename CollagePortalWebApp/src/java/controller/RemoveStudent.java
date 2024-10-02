
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dto.studentDTO;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modal.StudentRemove;

/**
 *
 * @author prathit
 */
public class RemoveStudent extends HttpServlet {

  @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("adminHome.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sid = req.getParameter("sid");
       
        

        studentDTO student = new studentDTO();
        student.setSid(sid);
        

    StudentRemove Delete = new StudentRemove();
        boolean StudentDeleted = Delete.isRemove(student);

        if (StudentDeleted) {
            resp.sendRedirect("studentDeleted.jsp");
        } else {
            resp.sendRedirect("registrationFailed.jsp");
        }
    }
}
