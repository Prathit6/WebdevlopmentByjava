/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author prathit
 */
public class TestSession3 extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
       
   
         HttpSession session =req.getSession(true);
        String Username = (String)session.getAttribute("uname");//data obj ki form mai aayega to pehle use 
        //String mai convert karna hoga 
        String Password = (String)session.getAttribute("upass");
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
       
        
   
        PrintWriter out = resp.getWriter();
        
      
        out.println("<html>"); 
        out.println("<head>");
        out.println("<title>HTTP Servlet</title>");
        out.println("</head>");  
        out.println("<body bgcolor='cyan'>");
        out.println("<h1>Hello! Welcome to my HTTP Servlet with Hidden TextField</h1>");
        
       
       out.println(firstName+"<br>");
       out.println(lastName+"<br>");
       out.println(Username+"<br>");
       out.println(Password+"<br>");
       
        
       
    
        out.println("</body>");
        out.println("</html>");
    }


}
