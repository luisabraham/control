/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.PreparedStatement;

/**
 *
 * @author trdni
 */
public class Controladorasignacion {
    public boolean asignar_salon(String nrc,String ee,String maestro,int salon,String hora,int usuario){
      
        
        PreparedStatement pat = null;
        
        try{
            String consulta = "insert into asignacion(Nrc,Experiencia,Maestro,Salon,Horario,Usuario) values(?,?,?,?,?,?)"; 
            pat =  Conexion.conectar().prepareStatement(consulta);
            
            pat.setString(1,nrc);
            pat.setString(2,ee);
            pat.setString(3,maestro);
            pat.setInt(4,salon);
            pat.setString(5,hora);
            pat.setInt(6,usuario);
            
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
}
