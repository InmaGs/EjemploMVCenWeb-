<%-- 
    Document   : contactoKO
    Created on : 16-oct-2014, 14:51:53
    Author     : inmaculada.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aplicación</title>
    </head>
    <body>
        <h1>Contacto KO</h1>
        <p>
            Lo sentimos, ha habido un error con la base de datos.
            El contacto <s:property value="nombre"/>, 
            <s:property value="apellidos" /> no ha podido ser añadido
            correctamente a la base de datos.
        </p>
    </body>
</html>


