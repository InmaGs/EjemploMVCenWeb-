
package actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import datos.contactoDatos;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import persistencia.contactoDao;
import servicios.contactoServicio;

public class contactoAction extends ActionSupport 
    implements ModelDriven<contactoDatos>{
    
    //Instanciamos un objeto del tipo que devuelve contactoDatos
    private contactoDatos contacto = new contactoDatos();
    
    //Inyectamos bean
    @Autowired
    public contactoServicio cs;
    
    //Método execute
    public String execute(){
        //Invocamos un mapa que obtiene el resultado del registro
        //del contacto        
        Map<String, Object> resul = cs.registroContacto(contacto);
        
        //Instanciamos una lista de errores
        contactoDao err = new contactoDao();
        List<String> lista = err.getErrorList(resul);
        
        //Preguntamos por la lista de errores, para arrojar un 
        //resultado u otro
        if(lista.isEmpty())        
            return SUCCESS;
        else
            return ERROR;
    }
    
    //Método getModel()
    public contactoDatos getModel(){
        return this.contacto;
    }    
}


