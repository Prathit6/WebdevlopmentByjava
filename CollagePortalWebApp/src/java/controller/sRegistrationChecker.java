package controller;




import dto.studentDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modal.RegistrationAuthenticator;

public class sRegistrationChecker extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("adminHome.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sid = req.getParameter("sid");
        String spass = req.getParameter("spass");
        String sname = req.getParameter("sname");
        String sdob = req.getParameter("sdob");
        String saddress = req.getParameter("saddress");
        String scontect = req.getParameter("scontect");
        String scity = req.getParameter("scity");
        String sdept = req.getParameter("sdept");

        

       studentDTO student = new studentDTO();
        student.setSid(sid);
        student.setSpass(spass); 
        student.setSname(sname);
        student.setSdob(sdob);
        student.setSaddress(saddress);
        student.setScontect(scontect);
        student.setScity(scity);
        student.setSdept(sdept);

        RegistrationAuthenticator Rauthenticator = new RegistrationAuthenticator();
        boolean Register = Rauthenticator.isRegister(student);

        if (Register) {
            resp.sendRedirect("studentRegistrationDone.jsp");
        } else {
            resp.sendRedirect("registrationFailed.jsp");
        }
    }
}
