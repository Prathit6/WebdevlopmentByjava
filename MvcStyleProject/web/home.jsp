<%-- 
    Document   : home
    Created on : 26-Sept-2024, 8:52:14 am
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
        <a href="logout.jsp">SignOut</a>
        <%
         String uname =(String)session.getAttribute("uname");
         if (uname == null || uname.trim().equals("")){
         
            response.sendRedirect("login.html");
             
            }
            
        
        %>
        <h1>Hello <%=uname%></h1>
        <h1>Login Sucssesful...</h1>
    </body>
</html>
