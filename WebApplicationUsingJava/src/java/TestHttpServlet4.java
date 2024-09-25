import db.dbConnector;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static javax.swing.UIManager.getString;

/**
 * Servlet implementation class TestHttpServlet3
 *
 * @author prathit
 */

/*

we can 't create database connection inside the servlet 
for JDBC we have to create a pakage inside it create a java class and 
import that class into which servlet we need databasde connection

*/
public class TestHttpServlet4 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        resp.sendRedirect("login.html");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("uname");
        String upass = req.getParameter("upass");
        
       
        Statement st = null;
        ResultSet rs = null;
        String tablepass = null;

        try {
          
           st=dbConnector.getStatement();


           
            String query = "SELECT upass FROM login_info WHERE uname='" + uname + "'";
            rs = st.executeQuery(query);
 
       if(rs.next()){
       
        tablepass=getString(1);
            
       
       }
      
       
    } 
       catch(SQLException e){
           
           System.out.println(e);
       }
       
      PrintWriter out =resp.getWriter();
      out.println("<html>");
      out.println("<head>");
      out.println("<title>HTTP Servlet</title>");
      out.println("<head>");
      out.println("<body bgcolor=cyan>");
      out.println("<h1>Hello all to my HTTP Servlet-Post</h1>");
     
      //out.println("<h2>Your User name is "+uname+"</h2>");
     // out.println("<h2>Your password is "+upass+"</h2>");->kabhi bhi username and password ko directly nhe dikhana chahiye security puprpuose se
      
      
      if(uname!=null && upass!=null && !uname.trim().equals("") &&  upass.equals(tablepass)){
    
                //out.println("<h1>Login sucssessFul...</h1>");
                resp.sendRedirect("home.html");
                    
      }
      else{
          
                //out.println("<h1 bgcolor=rad>Login Faild...</h1>");
                resp.sendRedirect("loginFailed.html");
      }
      
      out.println("</body>");
      out.println("</html>");
    }


}
