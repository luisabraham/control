/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Tabla;

import Modelo.Conexion;
import Modelo.Encapsulacion.Salon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author trdni
 */
public class Salontabla {
   

   public static LinkedList<Salon> getSalon()
   {
       
      LinkedList<Salon> listaSalon=new LinkedList<Salon>();
      try
      {
        
        PreparedStatement pat = null;
      
        ResultSet rs = null;
        String Consulta;
        
         Consulta = "Select * from salon ORDER BY Nombre";
       
         pat =  Conexion.conectar().prepareStatement(Consulta);
          rs = pat.executeQuery(Consulta);
     
          
         while (rs.next())
         {
            Salon salon = new Salon(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getString(4));
          
            listaSalon.add(salon);
         }
         rs.close();
         pat.close();
          Conexion.desconectar();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return listaSalon;
   }
   

}

