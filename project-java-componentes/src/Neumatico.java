//Neumatico Representa una llanta: marca, tamaño, presión.
public class Neumatico {
    //atributos neumatico
    private String marca;
    private double tamaño;
    private double presion;

    //metodo constructor neumatico

    public Neumatico(String marca, double tamaño, double presion){
        this.marca = marca;
        this.tamaño = tamaño;
        this.presion = presion;
    }

    //getesr
    public String getMarca(){ return marca;}
    public double getTamaño (){ return tamaño;}
    public double getPresion (){ return presion;}

    //Seter
    public void setMarca(String marca) { this.marca = marca; }
    public void setTamaño(double tamaño) { this.tamaño = tamaño; } 
    public void setPresion(double presion) { this.presion = presion; }
}
