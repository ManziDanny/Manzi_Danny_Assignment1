<%-- 
    Document   : ForgetPassword
    Created on : Sep 25, 2023, 9:57:53 AM
    Author     : Danny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forget Password</title>
        <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            text-align: center;
            background-image: linear-gradient(rgba(0,0,0,0.75),rgba(0,0,0,0.75)),url(password.jpg);
        }

        h1 {
            color: #fff;
        }

        form {
            margin-top: 20px;
        }

        input[type="submit"] {
            background-color: #007BFF;
            color: #fff;
            border: none;
            padding: 10px 20px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
    </head>
    <body>
        <%
          if(session.getAttribute("username") == null){
            
               response.sendRedirect("index.html");
            }
        
        %>
        <h1>Forget Password Page</h1>
        
        <form action="LogoutServlet">
            <input type="submit" value="Log Out">
        </form>
    </body>
</html>
