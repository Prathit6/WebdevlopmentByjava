<%-- 
    Document   : studenthome
    Created on : 28-Sept-2024, 4:51:33 pm
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
            
         String sid =(String)session.getAttribute("sid");
         if (sid == null || sid.trim().equals("")){
         
            response.sendRedirect("login.html");
             
            }
            
        
        %>
        <h1>Hello <%=sid%></h1>
        <h1>Login Sucssesful...</h1>
    </body>
</html>
