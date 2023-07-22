/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.recepcioncfim.modelo.vista;

/**
 *
 * @author Diego A Cuenca
 */
public class ManejadorPantalla {
  
 public static Vusers pantallaUsers;
 
 public static void abrirPantallaUsers(){
    
        pantallaUsers = new Vusers();
        pantallaUsers.setVisible(true);
        pantallaUsers.setLocationRelativeTo(null);
    
    }
 public static void cerrarPantallaEstudiante(){
    pantallaUsers.setVisible(false);
    pantallaUsers=null;
   
    
    }
}
