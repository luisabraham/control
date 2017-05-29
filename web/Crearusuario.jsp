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
        <link rel="stylesheet" href="css/formulario.css">
        <link rel="stylesheet" href="css/footer.css">
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
        <script type="text/javascript" src="js/jquery-3.1.0.min.js"></script>
        <script type="text/javascript" src="js/herramientas.js"></script>
    </head>
    <body>
        
        <form>
	    <h1>Crear Usuario:</h1>
	    
    <div class="contentform">
    	<!--<div id="sendmessage"> Your message has been sent successfully. Thank you. </div>-->


    	<div class="leftcontact">
			      <div class="form-group">
			        <p>Nombre<span>*</span></p>
			        <span class="icon-case"><i class="fa fa-male"></i></span>
				        <input type="text" name="nom" id="nombre" data-rule="required" data-msg="Vérifiez votre saisie sur les champs : Le champ 'Nom' doit être renseigné."/>
                <div class="validation"></div>
       </div> 

            <div class="form-group">
            <p>Apellidos <span>*</span></p>
            <span class="icon-case"><i class="fa fa-user"></i></span>
				<input type="text" name="apellidos" id="apellidos" data-rule="required" data-msg="Vérifiez votre saisie sur les champs : Le champ 'Prénom' doit être renseigné."/>
                <div class="validation"></div>
			</div>

	</div>

	<div class="rightcontact">	

			<div class="form-group">
			<p>Usuario <span>*</span></p>
			<span class="icon-case"><i class="fa fa-user"></i></span>
				<input type="text" name="usuario" id="usuario" data-rule="required" data-msg="Vérifiez votre saisie sur les champs : Le champ 'Ville' doit être renseigné."/>
                <div class="validation"></div>
			</div>	

			

			<div class="form-group">
			<p>Tipo de usuario<span>*</span></p>
			<span class="icon-case"><i class="fa fa-info"></i></span>
                        <select  name="Tipo" id="Tipo">
                            <option selected="selected">Elija tipo de usuario</option>
                            <option value="admin" >Administrador</option>
                            <option value="jefe">Jefe de carrera</option>
                            <option value="encargado">Encargado de Computo</option>
                            <option value="dersec">Director/Secretario</option>
                        </select>
                <input type="text" name="fonction" id="fonction" data-rule="required" data-msg="Vérifiez votre saisie sur les champs : Le champ 'Fonction' doit être renseigné."/>
                <div class="validation"></div>
			</div>

			
		
	</div>
	</div>
<button type="submit" id="Crearusuario" class="bouton-contact">Enviar</button>
	
</form>	
        <footer>
	        <h2><i>Equipo</i>lalalal</h2>
        </footer>
    </body>
</html>
