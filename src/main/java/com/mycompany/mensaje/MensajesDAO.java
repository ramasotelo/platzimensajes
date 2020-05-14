/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensaje;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author ramirosotelo
 */
public class MensajesDAO {
    public static void crearMensajesDB(Mensajes mensaje){
        Conexion db_connect = new Conexion();
        try(Connection conexion = db_connect.get_connection()){
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public static void leerMensajesDB(){
        
    }
    
    public static void borrarMensajeDB(int id_mensaje){
        
    }
    
    public static void actualizarMensajeDB(Mensajes mensaje){
        
    }
}
