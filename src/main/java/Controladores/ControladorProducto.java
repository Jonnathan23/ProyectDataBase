/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author User
 */
public class ControladorProducto {
    private String codigoBarras;
    private String nombre;
    private String precio;
    private String stock;
    private String categoria;
    
    public boolean controladorCodigo(){
        if(this.codigoBarras.equals("Ingrese el codigo de barras")){
            return true;
        }
        return (this.codigoBarras == null)?true:false;
    }
    
    public boolean controladorNombre(){
        if(this.nombre.equals("Ingrese el nombre del producto")){
            return true;
        }
        return (this.nombre == null)?true:false;
    }
    
    public boolean controladorPrecio(){
        if(this.precio.equals("Precio")){
            return true;
        }
        return (this.precio == null)?true:false;
    }
    
    public boolean controladorStock(){
        if(this.stock.equals("Stock")){
            return true;
        }
        return (this.stock == null)?true:false;
    }
    
    public boolean controladorCategoria(){
        
        return (this.categoria == null)?true:false;
    }
    
    
}
