<%-- 
    Document   : Crearsalon
    Created on : 24/05/2017, 12:38:25 AM
    Author     : trdni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Crear Salon</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="js/jquery-3.1.0.min.js"></script>
        <script type="text/javascript" src="js/herramientas.js"></script>
        
    </head>
    <body>
        <form>
        <label>Nombre del salon:</label>
        <input type="text" id="salon">
        <label>Capacidad de alumnos:</label>
        <input type="text" id="capacidad">
        <label>Software con el que cuenta</label>
        <textarea id="programas"></textarea>
        <a id="Crearsalon">Enviar</a>
        </form>
    </body>
</html>
