<%-- 
    Document   : logout.jsp
    Created on : 26-Sept-2024, 10:19:22 pm
    Author     : prathit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            session.invalidate();
         response.sendRedirect("login.html");
        
        %>
    </body>
</html>
