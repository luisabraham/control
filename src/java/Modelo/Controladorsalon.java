/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Encapsulacion.Salon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author trdni
 */
public class Controladorsalon {
    
/*public  Usuario consultarUsuario(String usuario){
  Usuario busuario=null;
  PreparedStatement pat = null;
  ResultSet rs = null;
  try{
  
   pat =  Conexion.conectar().prepareStatement("SELECT id_Usuario,Nombre,ApellidoP,ApellidoM,Usuario,Contrasena,Tipousuario,Dnombre FROM usuarios inner join departamento on usuarios.Departamento=departamento.iddepartamento where usuario='"+usuario+"' ");
   rs = pat.executeQuery();
   while(rs.next()){
    busuario=new Usuario(rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7),rs.getString(8));
   }
  
  }catch(Exception e){
       
   }finally{
        try{
           if( Conexion.conectar()!= null) Conexion.desconectar();
           if(pat != null)pat.close();
           if(rs != null)rs.close();
           }catch(Exception e){
           }
   }
  return busuario;
 }    */
//.........................................................................................
public boolean crear_salon(String salon, int capacidad, String programa){
      
        PreparedStatement pat = null;
        
        try{
            String consulta = "insert into salon(Nombre, Capacidad, Programas) values(?,?,?)"; 
            pat =  Conexion.conectar().prepareStatement(consulta);
            
            pat.setString(1,salon);
            pat.setInt(2,capacidad);
            pat.setString(3,programa);
           
            if(pat.executeUpdate()==1){
                return true;
            }
        }catch(Exception ex){
            System.err.println("Error" + ex);
        }finally{
            try {
            if( Conexion.conectar()!= null)  Conexion.desconectar();
            if(pat != null) pat.close();
            }catch(Exception e)
            {
                System.err.println("Error" + e);
            }
        }
        
        
        return false;
    }

//------------------------------------------------------------------------------------------
public Salon getSalon(String nsalon)
   {
       Salon salon = null;
       PreparedStatement pat = null;
       ResultSet rs = null;
       try{
           String sql ="SELECT * FROM salon where Nombre = '"+nsalon+"'";
           pat =  Conexion.conectar().prepareStatement(sql);
           rs = pat.executeQuery();
         
         while (rs.next())
         {
            salon = new Salon(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getString(4));
          
         }
       }catch(Exception e){
       
   }finally{
        try{
           if( Conexion.conectar() != null) Conexion.desconectar();
           if(pat != null)pat.close();
           if(rs != null)rs.close();
           }catch(Exception e){
           }
   }
     return salon;  
   }
   
//------------------------------------------------------------------------------------
/*
public boolean eliminarUsuario(String Usuario){
        boolean flag=false;
        PreparedStatement pat = null;
        try{
            String sql = "delete from usuarios where Usuario=?";
            
            pat =  Conexion.conectar().prepareStatement(sql);
            pat.setString(1, Usuario);
            if(pat.executeUpdate() > 0)
            {
                flag = true;
            }
            
        }catch(Exception e){
            
        }finally{
            try{
            if( Conexion.conectar()!= null) 
                Conexion.desconectar();
            }catch(Exception e){
                
            }
            return flag;
        }
             
    }
//---------------------------------------------------------------------------------------
 public boolean modificar_usuario(int id,String Nombre, String ApellidoP, String ApellidoM,String Tipo){
      
        PreparedStatement pat = null;
        
        try{
            String consulta = "update usuarios set Nombre= '"+Nombre+"', ApellidoP= '"+ApellidoP+"', ApellidoM= '"+ApellidoM+"',Tipousuario= '"+Tipo+"' where Id_Usuario = '"+id+"'"; 
            pat =  Conexion.conectar().prepareStatement(consulta);
           
            if(pat.executeUpdate()== 1){
                return true;
            }
            
        }catch(Exception ex){
            System.err.println("Error" + ex);
        }finally{
            try {
            if( Conexion.conectar()!= null)  Conexion.desconectar();
            if(pat != null) pat.close();
            }catch(Exception e)
            {
                System.err.println("Error" + e);
            }
        }
        
        
        return false;
    }
 
 */

    
}
