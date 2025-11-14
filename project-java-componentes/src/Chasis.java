//Chasis Información sobre el tipo de chasis, dimensiones y peso.
public class Chasis {
    //atributos de la clase chasis
    private String tipo;
    private double peso;
    private double ancho;
    private double largo;
    private double alto;

    //metodod constructor de chasis
    public Chasis(String tipo, double peso, double ancho, double largo, double alto){
        this.tipo =tipo;
        this.peso = peso;
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
    }

    //geters
     public String getTipo() { return tipo; }
     public double getPeso(){return peso;}
     public double getAncho(){return ancho;}
     public double getLargo(){return largo;}
     public double getAlto(){return alto;}

     //setters
    
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setLargo(double largo) { this.largo = largo; }
    public void setAncho(double ancho) { this.ancho = ancho; }
    public void setPeso(double peso) { this.peso = peso; }
    public void setAlto(double alto) { this.alto = alto; }
}   
