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
public class TestHidden2 extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
       resp.sendRedirect("TestHidden1");
    }

  public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
      
        String uname = req.getParameter("uname");
        String upass = req.getParameter("upass"); 
        
       
     
        
        PrintWriter out = resp.getWriter();
        
      
        out.println("<html>"); 
        out.println("<head>");
        out.println("<title>HTTP Servlet</title>");
        out.println("</head>"); 
        out.println("<body bgcolor='cyan'>");
        out.println("<h1>Hello! Welcome to my HTTP Servlet with Hidden TextField</h1>");
        
       
       out.println("<form action = TestHidden3 method=post>");
        
       
        out.println("<h2>FirstName:<input type=text name=firstName placeholder=Enter Your firstName /></h2>");
        out.println("<h2>LastName:<input type=text name=lastName placeholder=Enter your LastName /></h2>");
  
        
       
        out.println("<h2><input type=hidden name=uname value="+uname+" /></h2>");
        out.println("<h2><input type=hidden name=upass value="+upass+"/></h2>");
        out.println("<input type=submit value = login />");
        
        
       
        out.println("</form>");
        
        
        
    
    
        out.println("</body>");
        out.println("</html>");
    }

}
