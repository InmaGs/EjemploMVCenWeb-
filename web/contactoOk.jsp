<%-- 
    Document   : contactoOk
    Created on : 16-oct-2014, 14:47:26
    Author     : inmaculada.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- Añadimos librerías de struts para utilizar algunos de los objetos
que se utilizan en la clase -->
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aplicación</title>
    </head>
    <body>
        <h1>Contacto OK</h1>
        <p>
            El contacto <s:property value="nombre"/>, 
            <s:property value="apellidos" /> ha sido añadido
            correctamente a la base de datos.
        </p>
    </body>
</html>


