<%-- 
    Document   : login
    Created on : 15-oct-2014, 13:03:10
    Author     : inmaculada.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aplicación</title>
    </head>
    <body>
        <h1>Inicio de Sesión</h1>
        <form action="login">
            Usuario:
            <input type="text" id="usuario" name="usuario" 
                   placeholder="Usuario " label="Usuario: "/><br/>
            Password:
            <input type="password" id="password" name="password"
                   label="Password: "/><br/>
            <input type="submit" id="aceptar" name="aceptar"
                   value="Aceptar"/>
        </form>
    </body>
</html>


