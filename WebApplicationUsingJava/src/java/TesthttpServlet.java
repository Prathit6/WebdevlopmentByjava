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

This is the Example of Http servlet for Batter 
understanding of Get Method and Set method

*/
public class TesthttpServlet extends HttpServlet {

    @Override
   public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
      PrintWriter out =resp.getWriter();
      out.println("<html>");
      out.println("<head>");
      out.println("<title>HTTP Servlet</title>");
      out.println("<head>");
      out.println("<body bgcolor=cyan>");
      out.println("<h1>Hello! Welcome my HTTP Servlet-Get</h1>");
      out.println("<form action = TesthttpServlet method = post >");
      out.println("<h2>UserName: <input type=text name=uname></h2>");
      out.println("<h2>UserName: <input type=text name=upass></h2>");
      out.println("<input type=submit>");
      out.println("</form>");
      out.println("</body>");
      out.println("</html>");
       
    
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
     
      //out.println("<h2>Your User name is "+uname+"</h2>");
     // out.println("<h2>Your password is "+upass+"</h2>");->kabhi bhi username and password ko directly nhe dikhana chahiye security puprpuose se
      
      
      if(uname!=null && upass!=null && !uname.trim().equals("") && uname.equalsIgnoreCase("prathit") && upass.equals("12345")){
    
                out.println("<h1>Login sucssessFul...</h1>");
                    
      }
      else{
          
                out.println("<h1 bgcolor=rad>Login Faild...</h1>");
      }
      
      out.println("</body>");
      out.println("</html>");
    }


}
