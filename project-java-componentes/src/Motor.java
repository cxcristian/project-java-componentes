//Motor Representa las características técnicas del motor: tipo, cilindrada, potencia.
public class Motor {
    //todo: hacer atributos de la calse motor
    private String tipo;
    private String cilindrada;
    private int potencia;
    

    //metodo constructor de motor
    public Motor(String tipo, String cilindrada, int potencia){
        this.tipo = tipo;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }
    //todo getter
    public String getTipo(){ return tipo;}
    public String getCilindrada(){ return cilindrada;}
    public int getPotencia(){ return potencia;}

    //todo: setters

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setCilindrada(String cilindrada){
        this.cilindrada = cilindrada;
    }
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
}
