<%-- 
    Document   : studentDeleted
    Created on : 29-Sept-2024, 2:08:22 pm
    Author     : prathit
--%>

<%@page import="dto.studentDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remove Student</title>
    </head>
    <body>
        <%
        studentDTO remove=new studentDTO();
        
        %>
        
        <form action="RemoveStudent" method="post">
             <table >
           
  
                <tr>
                    <td>Student ID</td>
                    <td><input type="number" name ="sid" placeholder="Enter Id"</td>
                </tr>
                 
                <tr>
                    <td><input type="submit" name="submit"></td>
                </tr>
        </table>
        </form>
        <h2>Student <%= remove.getSid()%> Deleted SucssesFully...<h2>

    </body>
</html>