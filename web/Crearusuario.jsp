<%-- 
    Document   : Crearusuario
    Created on : 23/05/2017, 06:34:25 PM
    Author     : trdni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear Usuario</title>
        <script type="text/javascript" src="js/jquery-3.1.0.min.js"></script>
        <script type="text/javascript" src="js/herramientas.js"></script>
    </head>
    <body>
        <form>
            <label>Nombre:</label>
            <input type="text" id="nombre">
            <label>Apellidos:</label>
            <input type="text" id="apellidos">
            <label>Usuario:</label>
            <input type="text" id="usuario">
            <label>Tipo de Usuario:</label>
            <select class="form-control input-sm" name="Tipo" id="Tipo">
                <option selected="selected">Elija tipo de usuario</option>
                <option value="admin" >Adminustrador</option>
                <option value="jefe">Jefe de carrera</option>
                <option value="encargado">Encargado de Computo</option>
                <option value="dersec">Director/Secretario</option>
            </select>
            <a id="Crearusuario">Enviar</a>
        </form>
    </body>
</html>
