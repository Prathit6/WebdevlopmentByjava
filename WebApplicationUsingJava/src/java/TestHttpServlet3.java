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
public class TestHttpServlet3 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Redirect to login page for GET requests
        resp.sendRedirect("login.html");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("uname");
        String upass = req.getParameter("upass");
        
        // Database related variables
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        String tablepass = null;

        try {
            // Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded!");

            // Establish connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sig_practices_iist?characterEncoding=UTF-8", "prathit-dode", "@ptcdode");
            System.out.println("Connected");

            // Create statement
            st = con.createStatement();

            // Query to get the password for the provided username
            String query = "SELECT upass FROM login_info WHERE uname='" + uname + "'";
            rs = st.executeQuery(query);
 
       if(rs.next()){
       
        tablepass=getString(1);
            
       
       }
       con.close();
       
    } catch(ClassNotFoundException e){
       
           System.out.println(e);
       
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
