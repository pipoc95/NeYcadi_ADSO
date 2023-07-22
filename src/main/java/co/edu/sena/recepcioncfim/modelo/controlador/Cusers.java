/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.recepcioncfim.modelo.controlador;

import co.edu.sena.recepcioncfim.modelo.Users;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego A Cuenca
 */
public class Cusers {
    
    public void registarUser(Users e) {

        try {
            Statement st = Conexion.getConect().createStatement();
            st.execute("insert into users values ('" + e.getId() + "','" + e.getEmail() + "','" + e.getNombre() + "','" + e.getApellido() + "','" + e.getFechaContratacion() +"','" + e.getRol() + "'  ) ");
            JOptionPane.showMessageDialog(null, "Registrado");

        } catch (SQLException ex) {
            Logger.getLogger(Cusers.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void modificarUser(Users e){
      try {
              Statement st =Conexion.getConect().createStatement();
              st.execute("update users set email_use= '"+e.getEmail()+"',nom_use='"+e.getNombre()+"',ape_use='"+e.getApellido()+"',fchc_use='"+e.getFechaContratacion()+"',rol_use='"+e.getRol()+"' where id_use='"+e.getId()+"'  ");
              JOptionPane.showMessageDialog(null, "Actualizado");
              
      } catch (SQLException ex) {
              Logger.getLogger(Cusers.class.getName()).log(Level.SEVERE, null, ex);
          }
                
    }
    
    public ResultSet consultarUser(){
     ResultSet rs = null;
        try {
            Statement st = Conexion.getConect().createStatement();
            rs = st.executeQuery("select * from users");
           

        } catch (SQLException ex) {
            Logger.getLogger(Cusers.class.getName()).log(Level.SEVERE, null, ex);
           
        }

        return rs;   
    }
    
    public ResultSet consultarUserId(int codigo) {
    
         ResultSet rs = null;

        try {
            Statement st = Conexion.getConect().createStatement();
            rs = st.executeQuery("select * from users where id_use = '" + codigo + "'");

        } catch (SQLException ex) {
            Logger.getLogger(Cusers.class.getName()).log(Level.SEVERE, null, ex);

        }
        return rs;  
    }
    
    public void eliminarUser(int codigo){
     try {
            Statement st = Conexion.getConect().createStatement();
            st.execute("delete from users where id_use='"+codigo+"'");
            JOptionPane.showMessageDialog(null, "Eliminado");

        } catch (SQLException ex) {
            Logger.getLogger(Cusers.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problemas,No Elimino");
        }
   
    }
    
    public void pintarTabla(JTable  tabla, ResultSet rs){
    
         DefaultTableModel modelo= new DefaultTableModel();
        
        modelo.addColumn("Id");
        modelo.addColumn("Email");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Fecha Contratacion");
        modelo.addColumn("Rol");
      
        
          try {
              
              while (rs.next()) {
                  
                  String [] fila= {rs.getString("id_use"),rs.getString("email_use"),rs.getString("nom_use"),rs.getString("ape_use"),rs.getString("fchc_use"),rs.getString("rol_use")};
                  modelo.addRow(fila);
              } 
          
              tabla.setModel(modelo);
          
          } catch (SQLException ex) {
              Logger.getLogger(Cusers.class.getName()).log(Level.SEVERE, null, ex);
}
    }
}
