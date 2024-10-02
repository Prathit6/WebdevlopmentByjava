<%-- 
    Document   : removeFaculty
    Created on : 28-Sept-2024, 2:18:51 pm
    Author     : prathit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remove Faculty</title>
    </head>
    <body>
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
       

    </body>
</html>