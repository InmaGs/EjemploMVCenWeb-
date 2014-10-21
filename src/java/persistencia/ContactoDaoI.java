
package persistencia;

import datos.contactoDatos;
import java.util.List;

public interface ContactoDaoI {
    
    public List<contactoDatos> getContacto();
    
    public void registroContacto(contactoDatos cont);
}


