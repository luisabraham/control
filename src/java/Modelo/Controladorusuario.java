/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author trdni
 */
public class Controladorusuario {
   /* public static void main(String[] args) {
        ConsultaUsuario on=new ConsultaUsuario();
        if(on.Autenticacion("Super","lima"))
        {
            System.out.println("esi");
        }else
            System.out.println("error");
    }*/
    public boolean Autenticacion(String user,String pass) 
    {
         PreparedStatement pat = null;
         ResultSet rs = null;
          try{
   
   pat =  Conexion.conectar().prepareStatement("Select * from usuarios where Usuario='"+user+"' and Password='"+pass+"' ");
   rs = pat.executeQuery();
   while(rs.next()){
      return true;
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
  
        return false;
    }
//----------------------------------------------------------------------------------------------------
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
public boolean crear_usuario(String Nombre, String Apellidos, String Usuario,String pass,String Tipo){
      
        PreparedStatement pat = null;
        
        try{
            String consulta = "insert into usuarios(Nombre, Apellidos, Usuario, Password,Tipousuario) values(?,?,?,?,?)"; 
            pat =  Conexion.conectar().prepareStatement(consulta);
            
            pat.setString(1,Nombre);
            pat.setString(2,Apellidos);
            pat.setString(3,Usuario);
            pat.setString(4,pass);
            pat.setString(5,Tipo);
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
/*public Usuario getUsuarios(int id)
   {
       Usuario u = null;
       PreparedStatement pat = null;
       ResultSet rs = null;
       try{
           String sql ="SELECT id_Usuario,Nombre,ApellidoP,ApellidoM,Usuario,Contrasena,Tipousuario,Dnombre FROM usuarios inner join departamento on usuarios.Departamento=departamento.iddepartamento where id_Usuario = '"+id+"'";
           pat =  Conexion.conectar().prepareStatement(sql);
           rs = pat.executeQuery();
         
         while (rs.next())
         {
            u = new Usuario(rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7),rs.getString(8));
          
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
     return u;  
   }
   
//------------------------------------------------------------------------------------
public boolean modificar_password(int id,String pass){
      boolean flag=false;
        PreparedStatement pat = null;
        try{
            String sql = "update usuarios set Contrasena='"+pass+"' where id_Usuario='"+id+"'";
            
            pat =  Conexion.conectar().prepareStatement(sql);
           
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
//--------------------------------------------------------------------------------------
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
 //--------------------------------------------------------------------------------
 public boolean restablecer_contrasena(String idUsuario,String contra){
        boolean flag=false;
        PreparedStatement pat = null;
        try{
            String sql = "update usuarios set Contrasena='"+contra+"' where Usuario='"+idUsuario+"'";
            
            pat =  Conexion.conectar().prepareStatement(sql);
           
            if(pat.executeUpdate() > 0)
            {
                flag = true;
            }
            
        }catch(Exception e){
            
        }finally{
            try{
            if( Conexion.conectar()!= null) 
                 Conexion.desconectar();
            if(pat != null) pat.close();
            }catch(Exception e){
                
            }
            return flag;
        }
             
    }*/
 
 public boolean disponibilidad_de_usuairo(String usuario){
  
  PreparedStatement pat = null;
  ResultSet rs = null;
  try{
  
   pat =  Conexion.conectar().prepareStatement("SELECT * FROM usuarios where Usuario='"+usuario+"' ");
   rs = pat.executeQuery();
   while(rs.next()){
    return true;
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
  return false;
 }  

    
}
