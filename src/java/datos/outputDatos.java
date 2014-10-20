
package datos;

public class outputDatos {
    
    private String codError, msgError, valor;
    
    public String getCodError(){
        return codError;
    }
    
    public void setCodError(String codError){
        this.codError=codError;
    }
    
    public String getMsgError(){
        return msgError;
    }
    
    public void setMsgError(String msgError){
        this.msgError=msgError;
    }
    
    public String getValor(){
        return valor;
    }
    
    public void setValor(String valor){
        this.valor=valor;
    }
    
    //Sobreescribimos método
    @Override
    public String toString(){
        return "output [codErro="+codError+", msgError="
                +msgError+", valor="+valor+"]";
    }    
}


