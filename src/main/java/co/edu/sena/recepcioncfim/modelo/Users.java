/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.recepcioncfim.modelo;


/**
 *
 * @author Diego A Cuenca
 */
public class Users {
    
  private  int id;
  private String email;
  private String nombre;
  private String apellido;
  private String fechaContratacion;
  private String rol;

    public Users(int id, String email, String nombre, String apellido, String fechaContratacion, String rol) {
        this.id = id;
        this.email = email;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaContratacion = fechaContratacion;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Users{" + "id=" + id + ", email=" + email + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaContratacion=" + fechaContratacion + ", rol=" + rol + '}';
    }

   
    
    
    
    
    
}
