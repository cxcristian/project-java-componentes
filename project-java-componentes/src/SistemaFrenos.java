//SistemaFrenos Información sobre frenos: tipo, discos, ABS, estado.
public class SistemaFrenos {
  
    private String tipo;
    private String estado;  
    private boolean abs;
    private int discos;

    public SistemaFrenos(String tipo, String estado, boolean abs, int discos){
        this.tipo = tipo;
        this.estado = estado;
        this.abs = abs;
        this.discos = discos;
    }

    public String getTipo(){return tipo;}
    public String getEstado(){return estado;}
    public boolean getAbs(){return abs;}
    public int getDiscos(){return discos;}

    public void setTipo(String tipo){this.tipo = tipo;}
    public void setEstado(String estado){this.estado = estado;}
    public void setAbs(boolean abs){this.abs = abs;}
    public void setDiscos(int discos){this.discos = discos;}
}
