
package persistencia;

import datos.contactoDatos;
import datos.outputDatos;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class contactoDao extends parentDao implements contactoDaoI{
    //Creamos una lista para los errores que se pudieran ocasionar
    private List<String> errorList = new ArrayList<String>();
    
    //Método que regristra el contacto
    @Override
    public Map<String, Object> registroContacto(contactoDatos contacto){
                
        //Creamos objeto para activar la conexión con la BD
        contactoProc proc = new contactoProc(data);
               
        //Obtención de los datos
        String nombre_in=contacto.getNombre();
        String apellidos_in=contacto.getApellidos();
        String dni_in = contacto.getDni();
        String telefono_in=contacto.getTelefono();
        
        //Mapeamos el resultado, que llamará al método execute
        Map<String, Object> map=proc.execute(nombre_in,
                apellidos_in,dni_in,telefono_in);
        
        //Añadimos los errores a la lista
        errorList=getErrorList(map);
        
        return map;
    }
    
    //Elaboramos la lista de errores
    public List<String> getErrorList(Map<String,Object> map){
        if(map!=null){
            List<outputDatos> list = 
                    (List<outputDatos>) map.get("contacto_out");
            if(list!=null){
                for(outputDatos output:list){
                    if(output.getCodError()!=null){
                        errorList.add(output.getCodError()+": "
                                +output.getMsgError());
                    }
                }
            }
        }
        return errorList;
    }
}


