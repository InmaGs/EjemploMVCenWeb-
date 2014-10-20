
package persistencia;

import datos.outputDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class outputRowMapper implements RowMapper<outputDatos>{
    
    public outputDatos mapRow(ResultSet rs, int NumCol) throws SQLException{
        
        outputDatos out = new outputDatos();
        
        out.setCodError(rs.getString(1));
        out.setMsgError(rs.getString(2));
        out.setValor(rs.getString(3));
        
        return out;
    }    
}



