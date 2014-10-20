<%-- 
    Document   : addContacto
    Created on : 15-oct-2014, 15:16:54
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
        <h1>Añadir Contacto</h1>
        <form>
            Nombre: <input type="text" id="nombre" name="nombre"/><br/>
            Apellidos: <input type="text" id="apellidos" name="apellidos"/><br/>
            DNI: <input type="text" id="dni" name="dni"/><br/>
            Teléfono: <input type="text" id="telefono" name="telefono"/><br/>
            <input type="submit" value="Añadir"/>
        </form>
    </body>
</html>

