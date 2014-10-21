
package persistencia;

import datos.contactoDatos;
import datos.outputDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
//import org.springframework.jdbc.core.ResultSetExtractor;

public class ContactoDao extends parentDao {
    //Creamos una lista para los errores que se pudieran ocasionar
    private List<String> errorList = new ArrayList<String>();
    JdbcTemplate temp= new JdbcTemplate(data);
    
    //Método que muestra la lista de contactos existentes
    public List<contactoDatos> getContacto(){
        List<contactoDatos> contactos = temp.query("SELECT * FROM contactos", new contactoMapper());
        return contactos;
    }
    
    //Método que regristra el contacto
    public void registroContacto (contactoDatos contacto)throws SQLException{
                
        //Instanciamos la conexión con la base de datos
        //procedente de parentDao
        
        //Obtención de los datos
        String nombre_in=contacto.getNombre();
        String apellidos_in=contacto.getApellidos();
        String dni_in = contacto.getDni();
        String telefono_in=contacto.getTelefono();
        
        //Sentencia a ejecutar
        String sql = "UPDATE contactos SET Nombre='"+nombre_in+", Apellidos='"+
                apellidos_in+"', DNI='"+dni_in+"',Telefono='"+telefono_in+"'";
               
        temp.execute(sql);
        String exc = temp.getExceptionTranslator().toString();
        errorList.add(exc);
    }

    
    //Elaboramos la lista de errores
    public List<String> getErrorList(){        
        return errorList;
    }
    
    //De esta clase se va a obtener el bean para las búsquedas (?)
    private static class contactoMapper implements ParameterizedRowMapper<contactoDatos>{
        
        @Override
        public contactoDatos mapRow(ResultSet rs, int rowNum) throws SQLException{
            
            contactoDatos cont = new contactoDatos();
            
            cont.setNombre(rs.getString("Nombre"));
            cont.setApellidos(rs.getString("Apellidos"));
            cont.setDni(rs.getString("DNI"));
            cont.setTelefono(rs.getString("Telefono"));
            
            return cont;
        }
    }
}


