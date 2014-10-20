
package persistencia;

import datos.contactoDatos;
import java.util.Map;

public interface contactoDaoI {
    
    public Map<String, Object> registroContacto(contactoDatos cont);
}


