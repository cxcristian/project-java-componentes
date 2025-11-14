//Transmision Describe el sistema de transmisión: tipo, marchas, tracción.
public class Transmision{
    //atributos de la clase TRANSMISION

    private String tipo;
    private int marchas;
    private String traccion;

    //metodo constructor de la tranmision
    public  Transmision(String tipo, int marchas, String traccion){
        this.tipo = tipo;
        this.marchas = marchas;
        this.traccion = traccion;
    }
    //geters;

    public String getTipo(){return tipo;}
    public int getMarchas(){return marchas;}
    public String getTraccion(){return traccion;}

    //setters;

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setMarchas(int marchas){
        this.marchas = marchas;
    }
    public void setTraccion(String traccion){
        this.traccion = traccion;
    }
}