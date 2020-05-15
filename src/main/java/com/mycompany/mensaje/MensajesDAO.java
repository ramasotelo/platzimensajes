/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensaje;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ramirosotelo
 */
public class MensajesDAO {
    public static void crearMensajesDB(Mensajes mensaje){
        Conexion db_connect = new Conexion();
        try(Connection conexion = db_connect.get_connection()){
            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO `mensajes` (`mensaje`, `autor_mensaje`) VALUES (?, ?) ";
                ps=conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutor_mensaje());
                ps.executeUpdate();
                System.out.println("--Mensaje Creado--");
            }catch(SQLException ex){
                System.out.println(ex);
            }
                    
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public static void leerMensajesDB(){
        Conexion db_connect = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try(Connection conexion = db_connect.get_connection()){
           String query = "SELECT * FROM `mensajes` ";
           ps = conexion.prepareStatement(query);
           rs= ps.executeQuery();//metodo que ejecuta la consulta,no tiene transaccion como el executeUpdate
           
           while(rs.next()){//el metodo next()se fija si hay datos,es decir, se lee mientras rs tenga datos
               System.out.println("ID:"+rs.getInt("id_mensaje")+"\nAutor:"+rs.getString("autor_mensaje")+"\nFecha del mensaje:"+
                       rs.getString("fecha_mensaje")+"\nMensaje: "+rs.getString("mensaje")+"\n----------------------------------");
           }
        }catch(SQLException e){
            System.out.println("No se pudieron recuperar los mensajes");
            System.out.println(e);
        }
    }
    
    public static void borrarMensajeDB(int id_mensaje){
        
    }
    
    public static void actualizarMensajeDB(Mensajes mensaje){
        
    }
}
