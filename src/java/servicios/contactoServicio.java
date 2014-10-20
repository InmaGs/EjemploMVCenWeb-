
package servicios;

import datos.contactoDatos;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import persistencia.contactoDaoI;

//Anotamos la clase como controlador de la capa servicios
@Service
public class contactoServicio {
    
    //Anotamos como bean 
    @Autowired
    private contactoDaoI contacto;
    
    public Map<String, Object> registroContacto(contactoDatos cont){
        return contacto.registroContacto(cont);
    }
}

