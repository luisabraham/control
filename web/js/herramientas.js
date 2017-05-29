/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Funcion para iniciar seccion
$ (function(){
    $ ('#inicio').click(function (e){
        e.preventDefault();
        var usuario = $('#usuario').val();
        var pass = $('#password').val(); 
       var data={usuario:usuario,pass:pass};
        $.post("Autentificacion",data,function(res,est,jqXHR){
            var a=res;
            if (a == 1)
                location.href="Menu.jsp";
            else
                alert(res);
        });       
    });
    
});
// Funcion de registrar usuario
$ (function(){
$('#Crearusuario').click(function(e){
    e.preventDefault();
    var nombre = $('#nombre').val();
    nombre= nombre.toUpperCase();
    var apellidos = $('#apellidos').val();
    apellidos=apellidos.toUpperCase();
    
    var Tipo = $('#Tipo').val();
    var usuario = $('#usuario').val();
  
    
    if(nombre == '')
    {
        alert("Nombre vacio");
        return false;
    } 
    if(apellidos == '')
    {
        alert("Apellidos vacio");
        return false;
        
    } 
     if(usuario == '')
    {
        alert("Usuario vacio");
        return false
    }
 if(Tipo == 'Elija tipo de usuario')
    {
        
       alert("Elija un tipo de usuario");
       return false;
    } 
    
    
    /*if(pass == "")
    {
     alert("Contraseña esta vacio");  return false; 
    } */                      
             var data={nombre:nombre,apellidos:apellidos,usuario:usuario,Tipo:Tipo};                 
             $.post("Crearusuario",data,function(res,est,jqXHR){     
                 
                 if(res==1){
                     alert("El usuario ya existe");
                  }else{
                     alert(res);
                    var op = confirm("Desea registrar otro usuario");
                    if(op)
                        location.href="Crearusuario.jsp"; 
                    else
                       location.href="Menu.jsp";     
                }    
        });       
      
});
});
//Funcion para crear salones
$ (function(){
$('#Crearsalon').click(function(e){
    e.preventDefault();
    var salon = $('#salon').val();
    salon= salon.toUpperCase();
    var capacidad = $('#capacidad').val();
    capacidad=capacidad.toUpperCase();
    var programas = $('#programas').val();
    programas=programas.toUpperCase();
    
    if(salon == '')
    {
        alert("Salon vacio");
        return false;
    } 
    if(isNaN($('#capacidad').val()) || capacidad == '')
    {
        alert("capacidad es numerico");
        return false;
        
    } 
     if(programas == '')
    {
        alert("Software vacio");
        return false
    }
 
    
    
    /*if(pass == "")
    {
     alert("Contraseña esta vacio");  return false; 
    } */                      
             var data={salon:salon,capacidad:capacidad,programas:programas};                 
             $.post("Crearsalon",data,function(res,est,jqXHR){     
                 
                 
                     alert(res);
                    var op = confirm("Desea registrar otro salon");
                    if(op)
                        location.href="Crearsalon.jsp"; 
                    else
                       location.href="Menu.jsp";     
                  
        });       
      
});
});
//Funcion para crear carrera
$ (function(){
$('#Crearcarrera').click(function(e){
    e.preventDefault();
    var carrera = $('#carrera').val();
    carrera= carrera.toUpperCase();
    
     if(carrera == '')
    {
        alert("Carrera vacio");
        return false
    }
                    
             var data={carrera:carrera};                 
             $.post("Crearcarrera",data,function(res,est,jqXHR){     
                 
                 
                     alert(res);
                    var op = confirm("Desea registrar otra carrera");
                    if(op)
                        location.href="Crearcarrera.jsp"; 
                    else
                       location.href="Menu.jsp";     
                  
        });   
      
});
});
//funcion del seletor de hora

  $(function() {
                    $('#basicExample').timepicker(
                    {'disableTimeRanges': [['00:00', '7:00'],['22:00', '23:59']],'step': 1 ,'timeFormat': 'H:i'});
                });
//Funcion para crear una asignar salon
$ (function(){
$('#Asignar').click(function(e){
    e.preventDefault();
    var nrc = $('#nrc').val();
    var ee = $('#ee').val();
    ee= ee.toUpperCase();
    var maestro = $('#maestro').val();
    maestro= maestro.toUpperCase();
    var salon = $('#salon').val();
   var hora = $('#basicExample').val();
    
     if(isNaN($('#nrc').val()) || nrc == '')
    {
        alert("Nrc es numerico");
        return false;
        
    } 
     if(ee == '')
    {
        alert("Experiencia Educativa vacio");
        return false
    }
     if(maestro == '')
    {
        alert(" Maestro vacio");
        return false
    }
     if(salon == 'Elija salon')
    {
        alert(" Elija un salon");
        return false
    }
     if(hora == '')
    {
        alert(" Hora vacia");
        return false
    }
                    
             var data={nrc:nrc,ee:ee,maestro:maestro,salon:salon,hora:hora};                 
             $.post("Asignar",data,function(res,est,jqXHR){     
                 
                 
                     alert(res);
                    var op = confirm("Desea Asignar otro salon");
                    if(op)
                        location.href="Asignarsalon.jsp"; 
                    else
                       location.href="Menu.jsp";     
                  
        });       
      
});
});