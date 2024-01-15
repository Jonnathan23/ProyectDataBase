
package Controladores;

/**
 *
 * @author Kristina
 */
public class ControladorUsuario {
    
    private String usuario;
    private String nombre;
    private String contrasena;
    private String confirmaContrasena;
    
    public boolean controladorUsuario(){
        if(this.usuario.equals("Ingrese el numero de CI")){
            return true;
        }
        return (this.usuario == null)?true:false;
    }

        public boolean controladorNombre(){
        if(this.nombre.equals("Ingrese el nombre del usuario")){
            return true;
        }
        return (this.nombre == null)?true:false;
    }
        
    public boolean controladorContrasena(){
        if(this.contrasena.equals("************")){
            return true;
        }
        return (this.contrasena == null)?true:false;
    }
    
    public boolean controladorConfirmarContrasena(){
        if(this.confirmaContrasena.equals("************")){
            return true;
        }
        return (this.confirmaContrasena == null)?true:false;
    }



    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getConfirmaContrasena() {
        return confirmaContrasena;
    }

    public void setConfirmaContrasena(String confirmaContrasena) {
        this.confirmaContrasena = confirmaContrasena;
    }
    
   
    
}