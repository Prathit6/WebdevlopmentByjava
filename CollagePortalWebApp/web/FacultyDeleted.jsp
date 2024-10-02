<%-- 
    Document   : FacultyDeleted
    Created on : 02-Oct-2024, 4:54:01 pm
    Author     : prathit
--%>

<%@page import="dto.FacultyDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remove Student</title>
    </head>
    <body>
        <%
        FacultyDTO remove=new FacultyDTO();
        
        %>
        
        <form action="RemoveFaculty" method="post">
             <table >
           
  
                <tr>
                    <td>Faculty ID</td>
                    <td><input type="number" name ="fid" placeholder="Enter Id"</td>
                </tr>
                 
                <tr>
                    <td><input type="submit" name="submit"></td>
                </tr>
        </table>
        </form>
        <h2>Faculty <%= remove.getFid()%> Deleted SucssesFully...<h2>

    </body>
</html>