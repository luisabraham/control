<%-- 
    Document   : Versalon
    Created on : 28/05/2017, 07:59:26 PM
    Author     : trdni
--%>

<%@page import="Modelo.Tabla.Salontabla"%>
<%@page import="java.util.LinkedList"%>
<%@page import="java.util.LinkedList"%>
<%@page import="Modelo.Encapsulacion.Salon"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/tabla.css">
        <link rel="stylesheet" href="css/footer.css">
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
        
        <title>Ver salones</title>
    </head>
    <body>
        <a href=javascript:history.back(1)> <i class="fa fa-arrow-left" aria-hidden="true"></i>Regresar</a>
       <div class="container">
  BUSCAR:
  <input type="text" id="search" placeholder="  Nombre">
<section>
                <h1>TABLA</h1>
                <div class="tbl-header">
                    <table cellpadding="0" cellspacing="0" border="0" >
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Salón</th>
                                <th>Capacidad</th>
                                <th>Programas</th>
                                <th>Acciones</th>
                            </tr>
                        </thead>
                    </table>
                </div>
  <div class="fond">
                <div class="tbl-content">
                    <table id="tabla" cellpadding="0" cellspacing="0" border="0">
                        <tbody>
                            <%LinkedList<Salon> lista = Salontabla.getSalon();
                                for (int i=0;i<lista.size();i++)
                                {

                                   out.println("<tr>");
                                   out.println("<td id='use'>"+lista.get(i).getId()+"</td>");
                                   out.println("<td>"+lista.get(i).getSalon()+"</td>"); 
                                   out.println("<td>"+lista.get(i).getCapacidad()+"</td>");
                                   out.println("<td>"+lista.get(i).getProgramas()+"</td>");
                                   out.println("<td><a ID= 'eliminarSa' href='\'><i class='fa fa-times fa-2x'></i>Eliminar</a><a id='modificar' href='Modificarsalon.jsp?id="+lista.get(i).getId()+"'><br><i class='fa fa-pencil fa-2x'></i>Modificar</a></td>");
                                   out.println("</tr>");
                                }
                            %>     
                        </tbody>
                    </table>
                </div>
  </div>
            </section>
  </div>
        <footer>
	        <h2><i>Equipo</i>lalalal</h2>
        </footer>
                         <script type="text/javascript" src="js/jquery-3.1.0.min.js"></script>
        
        <script src="js/tabla.js"></script>
       
    </body>
</html>
