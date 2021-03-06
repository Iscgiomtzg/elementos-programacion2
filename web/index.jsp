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
        <title>Exitium: Autenticación</title>
        <link rel="stylesheet" href="CSS/index_login.css">
        <link href='https://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Orbitron' rel='stylesheet' type='text/css'>
        <link rel="shortcut icon" type="image/x-icon" href="favicon1.ico" />

    </head>
    <body>
        <div class="todo">
        <div id="header">
            <h1>Identificate</h1>
        </div>
        <div id="form">
            <div class="centerTable">
            <form action="autenticar" method="POST">
                <table>
                  <tr> 
                      <td><INPUT type="text" name="user" placeholder="Usuario..." class="input_text"></td>
                  </tr>
                  <tr>
                      <td><INPUT type="password" name="password" placeholder="Contraseña..." class="input_text"></td>
                  </tr>
                </table>
                <input type="submit" value="Autenticar" class="boton">
                <div id="login_fail">
                <a href="">¿No tienes una cuenta?</a><br>
                <a href="">¿No puedes iniciar sesión?</a>
                </div>
            </form>
            </div>     
        </div>
        </div>
    </body>
</html>
