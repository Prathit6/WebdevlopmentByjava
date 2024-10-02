<%-- 
    Document   : addStudent
    Created on : 28-Sept-2024, 2:22:04 pm
    Author     : prathit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add student Page</title>
    </head>
    <body>
        <h1>
            Hello Admin!
        </h1>
        <form action="sRegistrationChecker" method="POST">
             <table >
            
             
                <tr>
                    <td>Enter Id</td>
                    <td><input type="text" name="sid" placeholder="Enter Id"></td>
                </tr>
               <tr>
                    <td>Enter password</td>
                    <td><input type ="password" name="spass" placeholder="Enter Password"></td>
                </tr>
                <tr>
                    <td>Enter Name</td>
                    <td><input name="sname" placeholder="Enter Name"></td>
                </tr>
                 
                <tr>
                    <td> Student Date Of Birth </td>
                    
                    <td><input name="sdob" type="date"></td>
                </tr>
                <tr>
                    <td>Student Address</td>
                    <td><input type="text" name="saddress"  placeholder="Enter Address"></td>
                </tr>
                 <tr>
                    <td>Student Contect</td>
                    <td><input type="number" name="scontect"  placeholder="Enter Contect"></td>
                </tr>
                <tr>
                    <td>Student city</td>
                    <td><input type="text" name="scity"  placeholder="Enter City"></td>
                </tr>
                <tr>
                    <td>Select Department </td>
                    <td>
                      <SELECT name="sdept">
                    <option><strong>CSE</strong></option>
                    <option><strong>AIML</strong></option>
                    <option><strong>IT</strong></option>
                    <option><strong>EC</strong></option>
                </SELECT>
                    </td>
                </tr>
                 <tr>
                <td></td>
                <td>
                    <input type="reset" />
                    <input type="submit" value="Add" />
                </td>
            </tr>  
               
                   
                
        </table>
        </form>
       

        
    </body>
</html>
