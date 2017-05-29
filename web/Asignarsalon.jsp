<%-- 
    Document   : asignacionsalon
    Created on : 27/05/2017, 04:48:07 PM
    Author     : trdni
--%>

<%@page import="Modelo.Tabla.Salontabla"%>
<%@page import="java.util.LinkedList"%>
<%@page import="Modelo.Encapsulacion.Salon"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Asignacion De Salon</title>
         <script type="text/javascript" src="js/jquery-3.1.0.min.js"></script>
       <script type="text/javascript" src="js/jquery.timepicker.js"></script>
        <link rel="stylesheet" href="css/jquery.timepicker.css">
         <script type="text/javascript" src="js/herramientas.js"></script>
    </head>
    <body>
        <label>NRC</label>
        <input type="text" id="nrc">
         <label>Experiencia Educativa</label>
        <input type="text" id="ee">
         <label>Maestro</label>
        <input type="text" id="maestro">
         <label>Salon</label>
        <select id="salon" >
            <option  selected="selected">Elija salon</option>
            <%  LinkedList<Salon> lista = Salontabla.getSalon();
                for (int i=0;i<lista.size();i++)
                out.println("<option>"+lista.get(i).getSalon()+"</option>");  
            %>
       </select>  
        <label>Hora</label>
        
        <input  id="basicExample" type="text" class="time">
        <a id="Asignar">Envar</a>
        
    </body>
</html>
