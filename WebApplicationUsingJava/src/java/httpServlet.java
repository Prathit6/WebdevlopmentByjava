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
/*
-> this is the very basic code of httpservlet (Get and Post method ).
-> doGet Mehod ->When html/body/form->action->get hoga to servlet do get method call karega or 
  sath he doGet method bydefult call  hoti hai chahe  post bani ho ya nhi 
*/
public class httpServlet extends HttpServlet {

   @Override
   public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
      PrintWriter out =resp.getWriter();
      out.println("<html>");
      out.println("<head>");
      out.println("<title>HTTP Servlet</title>");
      out.println("<head>");
      out.println("<body bgcolor=cyan>");
      out.println("<h1>Hello! Welcome my HTTP Servlet-Get</h1>");
      out.println("<form action = httpServlet method = post >");
      out.println("<input type=submit>");
      out.println("</form>");
      out.println("</body>");
      out.println("</html>");
       
    
    }

 
  
   @Override
  public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         
        
     
      
      PrintWriter out =resp.getWriter();
      out.println("<html>");
      out.println("<head>");
      out.println("<title>HTTP Servlet</title>");
      out.println("<head>");
      out.println("<body bgcolor=cyan>");
      out.println("<h1>Hello all to my HTTP Servlet-Post</h1>");
      
      out.println("</body>");
      out.println("</html>");
    }

}
