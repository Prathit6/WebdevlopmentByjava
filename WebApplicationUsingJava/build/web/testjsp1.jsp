<%-- 
    Document   : TestJsp1
    Created on : 26-Sept-2024, 4:09:15 am
    Author     : prathit
--%>



<%--
Jsp Means html  ke code mai java ko merge karna 
-> ye jo jsp page hai isme hum bydefult jo code likenge wo 
   HTML mai count hoga or or jisme (<% java code %>)only inke bicha ka code  
he java code mai count hoga 
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test Jsp page </title>
    </head>
    <body>
        <%
        for(int i=0;i<5;i++)
        {
        
        %>
        <h1>Hello World!"<%out.print(i);%>"</h1>
        
       
        <%
        
            }
        %>
    </body> 
</html>

