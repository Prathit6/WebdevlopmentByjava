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
<!-- <h1>Hello World!<%//out.print(i);%></h1>-->
        <!--this line is repleced by (<%=%>)-> this means println-->

-> agar hume koi method babanin hai isme to hum '<%!%> use karte hai then ye kya karta hai 
 if in case hum bina ! sign lagaye or ek method likhe to ye service method ke under method babani ki try 
 karta hai jo ki possible nhe hai method sirf class ke under banti hai 
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
       
        <h2>Hello world..<%=i%></h2>
        <%
        
            }
        %>
    </body> 
</html>


