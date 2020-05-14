/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensaje;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author ramirosotelo
 */
public class Main {
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.println("----------------------");
            System.out.println("::Aplicacion de Mensajes::");
            System.out.println("1.Crear mensaje.");
            System.out.println("2.Listar mensajes.");
            System.out.println("3.Editar mensaje.");
            System.out.println("4.Eliminar mensaje.");
            System.out.println("5.Salir.");
            //leemos la opcion del usuario
            opcion = sc.nextInt();//nos permite leer el teclado y guardarlo en opcions
             switch(opcion){
            case 1:
                mensajesService.crearMensaje();
                break;
            case 2:
                mensajesService.listarMensaje();
                break;
            case 3:
                mensajesService.editarMensaje();
                break;
            case 4:
                mensajesService.borrarMensaje();
                break;
            default:
                break;
        }
        }while(opcion != 5);
        
       
    }
}
