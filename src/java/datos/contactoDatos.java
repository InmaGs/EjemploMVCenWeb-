
package datos;

import java.io.Serializable;

public class contactoDatos implements Serializable {
    
    private String nombre, apellidos, telefono, dni;
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    
    public String getDni(){
        return dni;
    }
    
    public void setDni(String dni){
        this.dni=dni;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    
    //Se sobreescribe el método toString
    @Override
    public String toString(){
        return "contactoDatos [nombre="+nombre+", apellidos="+apellidos+
                ", dni="+dni+", telefono="+telefono+"]";
    }    
}

