/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensaje;

import java.util.Scanner;

/**
 *
 * @author ramirosotelo
 */
public class mensajesService {
    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje: ");
        String mensaje = sc.nextLine(); // el metodo nextLine es paraleer string de la clase Scanner
    
        System.out.println("ingrese tu nombre:");
        String nombre = sc.nextLine();
        
        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);
        MensajesDAO.crearMensajesDB(registro);
    }
    
    public static void listarMensaje(){
        MensajesDAO.leerMensajesDB();
    }
    
    public static void borrarMensaje(){
        
    }
    
    public static void editarMensaje(){
        
    }
}
