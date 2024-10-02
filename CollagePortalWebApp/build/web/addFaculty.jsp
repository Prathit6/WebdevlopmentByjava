<%-- 
    Document   : addFaculty
    Created on : 28-Sept-2024, 2:16:45 pm
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
        <form action="addFaculty" method="POST">
             <table >
            
             
                <tr>
                    <td>Faculty Id</td>
                    <td><input type="text" name="fid" placeholder="Enter Id"></td>
                </tr>
               <tr>
                    <td>Faculty password</td>
                    <td><input type ="password" name="fpass" placeholder="Enter Password"></td>
                </tr>
                <tr>
                    <td>Faculty Name</td>
                    <td><input name="fname" placeholder="Enter Name"></td>
                </tr>
                 
                <tr>
                    <td> faculty Date Of Birth </td>
                    
                    <td><input name="fdob" type="date"></td>
                </tr>
                <tr>
                    <td>Faculty Address</td>
                    <td><input type="text" name="faddress"  placeholder="Enter Address"></td>
                </tr>
                 <tr>
                    <td>Faculty Contect</td>
                    <td><input type="number" name="fcontect"  placeholder="Enter Contect"></td>
                </tr>
                <tr>
                    <td>Faculty city</td>
                    <td><input type="text" name="fcity"  placeholder="Enter City"></td>
                </tr>
                <tr>
                    <td>Faculty Department </td>
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

