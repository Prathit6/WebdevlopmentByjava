/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author prathit
 */
public class LoginChecker extends HttpServlet {

    @Override
   public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("index.html");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String uname=req.getParameter("uname");
      String upass=req.getParameter("upass");
      
      PrintWriter out =resp.getWriter();
      out.println("<html>");
      out.println("<head>");
      out.println("<title>HTTP Servlet</title>");
      out.println("<head>");
      out.println("<body bgcolor=cyan>");
      out.println("<h1>Hello all to my HTTP Servlet-Post</h1>");
     
     
      
      
      if(uname!=null && upass!=null && !uname.trim().equals("") && uname.equalsIgnoreCase("prathit") && upass.equals("12345")){
    
                //out.println("<h1>Login sucssessFul...</h1>");
                resp.sendRedirect("home.jsp");
                    
      }
      else{
          
                //out.println("<h1 bgcolor=rad>Login Faild...</h1>");
                resp.sendRedirect("login.html");
      }
      
      out.println("</body>");
      out.println("</html>");
    }
    }


  

