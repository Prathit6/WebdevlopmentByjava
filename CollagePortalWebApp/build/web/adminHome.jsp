<%-- 
    Document   : home
    Created on : 28-Sept-2024, 1:52:13 pm
    Author     : prathit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Home page</title>
    </head>
    <body>
        <h1>Hello Admin</h1>
        <table width="700">
            <tr>
                <td colspan="4">Students:</td>
            </tr>
            <tr>
                <td><strong><a href="addStudent.jsp" style="text-decoration:none;">Add new Student</a></strong></td>
                <td><strong><a href="removeStudent.jsp" style="text-decoration:none;">Remove Student</a></strong></td>
                <td><strong><a href="updateStudent.jsp" style="text-decoration:none;">Update Student Records</a></strong></td>
                <td><strong><a href="viewStudent.jsp"style="text-decoration:none;">View Student Records</a></strong></td>
            </tr>

            <tr>
                <td colspan="4">Faculties:</td>
            </tr>
            <tr>
                <td><strong><a href="addFaculty.jsp"style="text-decoration:none;">Add new Faculty</a></strong></td>
                <td><strong><a href="removeFaculty.jsp"style="text-decoration:none;">Remove Faculty</a></strong></td>
                <td><strong><a href="updateFaculty.jsp"style="text-decoration:none;">Update Faculty Records</a></strong></td>
                <td><strong><a href="viewFaculty.jsp"style="text-decoration:none;">View Faculty Records</a></strong></td>
            </tr>
        </table>

    </body>
</html>
