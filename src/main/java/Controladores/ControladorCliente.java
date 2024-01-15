/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author User
 */
public class ControladorCliente {
 
    private String ci;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;

    public boolean controladorCi(){
        if(this.ci.equals("Ingresar el numero de cedula")){
            return true;
        }
        return (this.ci == null)?true:false;
    }
    public boolean controladorNombre(){
        if(this.nombre.equals("Ingresar el nombre")){
            return true;
        }
        return (this.nombre == null)?true:false;
    } 
    public boolean controladorApellido(){
        if(this.apellido.equals("Ingresar el apellido")){
            return true;
        }
        return (this.apellido == null)?true:false;
    } 
    public boolean controladorDireccion(){
        if(this.direccion.equals("Ingrese la direccion completa")){
            return true;
        }
        return (this.direccion == null)?true:false;
    } 
    public boolean controladorTelefono(){
        if(this.telefono.equals("Ingresar el numero de telefono")){
            return true;
        }
        return (this.telefono == null)?true:false;
    } 
    public boolean controladorEmail(){
        if(this.email.equals("Ingresar el correo electronico")){
            return true;
        }
        return (this.email == null)?true:false;
    } 

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
