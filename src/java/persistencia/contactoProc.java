package persistencia;

import java.sql.Types;
import javax.sql.DataSource;
import oracle.jdbc.driver.OracleTypes;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

public class contactoProc extends StoredProcedure{
    
    private static final String proc = "Tabla.procedimiento";
    
    public contactoProc(DataSource data){
        //En cualquier clase que extienda a otra (herencia Hija-Madre), 
        //la primera línea del constructor de la hija tiene que ser 
        //una llamada al constructor de la madre con:
        super(data, proc);
        
        //Declaración de parámetros de entrada
        declareParameter(new SqlParameter("nombre_in", Types.VARCHAR));
        declareParameter(new SqlParameter("apellidos_in", Types.VARCHAR));
        declareParameter(new SqlParameter("dni_in", Types.VARCHAR));
        declareParameter(new SqlParameter("telefono_in", Types.VARCHAR));
        
        //Declaración de parámetros de salida
        declareParameter(new SqlOutParameter("contacto_out", 
                OracleTypes.CURSOR, new outputRowMapper()));
        compile();
        
    }
}




