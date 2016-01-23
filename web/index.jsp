<%-- 
    Document   : index
    Created on : 22/01/2016, 08:41:45 PM
    Author     : T-101
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Autenticación</h1>
        <form action="autenticar" method="POST">
            <p>
                Usuario: <INPUT type="text" name="user" placeholder="Escribe tu usuario..."><br><br>
                Password: <INPUT type="password" name="password" placeholder="Escribe tu contraseña..."><br><br>
                <INPUT type="submit" value="Ir a autenticación."
            </p>
        </form>
    </body>
</html>
