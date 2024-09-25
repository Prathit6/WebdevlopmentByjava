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

/**
 *
 * @author prathit
 */
public class TestSession1 extends HttpServlet {

  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
       
        
        PrintWriter out = resp.getWriter();
        
        
        out.println("<html>"); 
        out.println("<head>");
        out.println("<title>session management</title>");
        out.println("</head>"); 
        out.println("<body bgcolor='cyan'>");
        out.println("<h1>Hello! Welcome to my HTTP Servlet with Hidden TextField</h1>");
        out.println("<form action = TestSession2 method=post>");
        
       
        out.println("<h2>UserName:<input type=text name=uname placeholder=Enter Username Here /></h2>");
        out.println("<h2>Password:<input type=password name=upass placeholder=Enter password Here /></h2>");
        out.println("<input type=submit value =login />");
        out.println("</form>");
        
    
    
        out.println("</body>");
        out.println("</html>");
    }
}
