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
public class TestCookie3 extends HttpServlet {

  public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
       

        
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        
        Cookie Cookies[]=req.getCookies();
        Cookie c3= new Cookie("firstName",firstName);
        Cookie c4= new Cookie("lastName",lastName);
        resp.addCookie(c3);
        resp.addCookie(c4);
   
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
       out.println("<h3>Click on subumit for next page</h3>");
         out.println("<form action=TestCookie4 method=post>");
         out.println("<input type=submit value = submit >");
         out.println("</form>");
    
        out.println("</body>");
        out.println("</html>");
    }

}
