/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author User
 */
public class ControladorCategoria {
    private String nombre;
    
    public boolean controladorNombre(){
        if(nombre.equals("Ingrese el nombre de la categoria")){
            return true;
        }
        if(nombre.equals("")){
            return true;
        }
        return (nombre == null)?true:false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
