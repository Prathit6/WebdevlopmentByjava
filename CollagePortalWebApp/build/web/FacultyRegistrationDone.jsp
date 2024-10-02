<%-- 
    Document   : FacultyRegistrationDone
    Created on : 29-Sept-2024, 1:24:46 pm
    Author     : prathit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Faculty Registration Sucssessful</title>
        <style>
            a{
                text-decoration:none;
            }
        </style>
    </head>
    <body >
        <h1>Hello Admin!</h1>
        <h2>Faculty Registration Successful...</h2>
        <table width="700">
            <tr>
                <td colspan="4">Students:</td>
            </tr>
             <tr>
                <td><strong><a href="addStudent.jsp">Add new Student</a></strong></td>
                <td><strong><a href="removeStudent.jsp">Remove Student</a></strong></td>
                <td><strong><a href="updateStudent.jsp">Update Student Records</a></strong></td>
                <td><strong><a href="viewStudent.jsp">View Student Records</a></strong></td>
            </tr>

            <tr>
                <td colspan="4">Faculties:</td>
            </tr>
            <tr>
                <td><strong><a href="addFaculty.jsp">Add new Faculty</a></strong></td>
                <td><strong><a href="removeFaculty.jsp">Remove Faculty</a></strong></td>
                <td><strong><a href="updateFaculty.jsp">Update Faculty Record</a></strong></td>
                <td><strong><a href="viewFaculty.jsp">View Faculty Record</a></strong></td>
            </tr>
        </table>
    </body>
</html>
