//TODO: Vehiculo Representa un vehículo genérico: identificación, marca, modelo, etc.
public class Vehiculo {
    //atributos de la clase vehiculo
    private String marca;
    private String modelo;
    private String matricula;
    private int anio;
    //atributos de otras clases

    //añadir metodo constructor
    public Vehiculo(String marca, String modelo, String matricula, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.anio = anio;
    }

    //Todo: geters
    public String getMarca(){ return marca;}
    public String getModelo(){ return modelo;}
    public String getMatricula(){return matricula;}
    public int getAnio(){return anio;}


    //Todo: setters
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }


}
