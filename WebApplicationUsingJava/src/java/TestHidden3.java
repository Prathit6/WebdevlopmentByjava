import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
This is the first type of session management: Hidden Text field
*/

/**
 *
 * @author prathit
 */
public class TestHidden3 extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        // Get parameters from the form
        String uname = req.getParameter("uname");
        String upass = req.getParameter("upass"); 
        
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        
        // Set content type for the response
   
        PrintWriter out = resp.getWriter();
        
        // Output HTML content
        out.println("<html>"); 
        out.println("<head>");
        out.println("<title>HTTP Servlet</title>");
        out.println("</head>");  // Fix: corrected closing of <head>
        out.println("<body bgcolor='cyan'>");
        out.println("<h1>Hello! Welcome to my HTTP Servlet with Hidden TextField</h1>");
        
       
        out.println("<h2>Username: " + uname + "</h2>");
        out.println("<h2>Password: " + upass + "</h2>");
        out.println("<h2>First Name: " + firstName + "</h2>");
        out.println("<h2>Last Name: " + lastName + "</h2>");
        
        
    
    
        out.println("</body>");
        out.println("</html>");
    }
}