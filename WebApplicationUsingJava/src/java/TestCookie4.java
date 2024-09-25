/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author prathit
 */
public class TestCookie4 extends HttpServlet {
public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
       

        
        
        
        Cookie Cookies[]=req.getCookies();
       
   
        PrintWriter out = resp.getWriter();
        
      
        out.println("<html>"); 
        out.println("<head>");
        out.println("<title>HTTP Servlet</title>");
        out.println("</head>");  
        out.println("<body bgcolor='cyan'>");
        out.println("<h1>Hello! Welcome to my HTTP Servlet with Hidden TextField</h1>");
        
       
      
       for(int i=0;i<Cookies.length;i++){
           out.println(Cookies[i].getName()+" = "+Cookies[i].getValue()+"<br>");
       }
         
    
        out.println("</body>");
        out.println("</html>");
    }

}
