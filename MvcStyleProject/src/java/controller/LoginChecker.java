package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modal.loginAuthenticator;

public class LoginChecker extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("index.html");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("uname");
        String upass = req.getParameter("upass");

        loginAuthenticator authenticator = new loginAuthenticator();
        boolean login = authenticator.islogin(uname, upass);

        if (login) {
         
            HttpSession session = req.getSession(true);
            session.setAttribute("uname", uname);
            resp.sendRedirect("home.jsp");
        } else {
     
            resp.sendRedirect("login.html");
        }
    }
}
