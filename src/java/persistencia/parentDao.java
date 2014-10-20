
package persistencia;

import javax.sql.DataSource;

public abstract class parentDao {
    
    protected DataSource data;
    
    public void setDataSource(DataSource data){
        this.data=data;
    }
}


