/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensaje;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ramirosotelo
 */
public class Conexion {
    
   public Connection get_connection(){
       Connection connection = null;
       try{
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/mensajes_app","root","");
           if(connection != null){
                System.out.println("La conexion fue existosa");
           }
       }catch(SQLException e){
            System.out.println(e);

       }
    return connection;
   }
  
}
