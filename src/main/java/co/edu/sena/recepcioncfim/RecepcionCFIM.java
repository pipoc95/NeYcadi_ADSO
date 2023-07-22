/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.sena.recepcioncfim;

import co.edu.sena.recepcioncfim.modelo.controlador.Conexion;
import co.edu.sena.recepcioncfim.modelo.vista.ManejadorPantalla;

/**
 *
 * @author Diego A Cuenca
 */
public class RecepcionCFIM {

    public static void main(String[] args) {
       Conexion.conectar();
       
        ManejadorPantalla.abrirPantallaUsers();
    }
}
