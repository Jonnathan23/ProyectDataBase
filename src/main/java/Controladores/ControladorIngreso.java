/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author User
 */
public class ControladorIngreso {
    private String usuario;
    private String contrasena;
    
    public boolean controlUsuario(){
        if(this.usuario.equals("Ingrese la cedula del usuario")){
            return true;
        }        
        return (usuario == null)?true:false;
        
    }
    public boolean controlContrasena(){
        if(String.valueOf(this.contrasena).equals("************")){
            return true;
        }
        return (this.contrasena == null)?true:false;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
}
