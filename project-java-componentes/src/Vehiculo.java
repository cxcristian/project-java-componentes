//TODO: Vehiculo Representa un vehículo genérico: identificación, marca, modelo, etc.
public class Vehiculo {
    //atributos de la clase vehiculo
    private String marca;
    private String modelo;
    private String matricula;
    private int anio;
    //atributos de la clase motor y transmision
    private  Motor motor;
    private Transmision transmision;
    //atributos de la clase chasis y neumatico
    private Chasis chasis;
    private Neumatico neumatico;


    //añadir metodo constructor
    public Vehiculo(String marca, String modelo, String matricula, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.anio = anio;
    }

    //Todo: geters propios de la clase vehiculo
    public String getMarca(){ return marca;}
    public String getModelo(){ return modelo;}
    public String getMatricula(){return matricula;}
    public int getAnio(){return anio;}
    // geters de motor y transmision
    public Motor getMotor(){ return motor;}
    public Transmision getTransmision(){return transmision;}
    //geters de chasis y neumatico
    public Chasis getChasis(){return chasis;}
    public Neumatico getNeumatico(){return neumatico;}


    //Todo: setters propios de la clase vehiculo
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
    //seters de motor y transmision
    public void setMotor(Motor motor){
        this.motor = motor;
    }
    public void setTransmision( Transmision transmision){
        this.transmision = transmision;
    }
    //setters de chasis y neumatico
    public void setChasis(Chasis chasis){
        this.chasis = chasis;
    }
    public void setNeumatico(Neumatico neumatico){
        this.neumatico = neumatico;
    }


}
