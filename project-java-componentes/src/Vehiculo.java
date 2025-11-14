//TODO: Vehiculo Representa un vehículo genérico: identificación, marca, modelo, etc.
public class Vehiculo {
    //atributos de la clase vehiculo
    private String marca;
    private String modelo;
    private String matricula;
    private int anio;
    //atributos de la clase Motor y Transmision
    private  Motor motor;
    private Transmision transmision;
    //atributos de la clase Chasis y Neumatico
    private Chasis chasis;
    private Neumatico neumatico;
    //atributos de la clase SistemaElectrico y SistemaFrenos
    private SistemaElectrico sistemaElectrico;
    private SistemaFrenos sistemaFrenos;
    //atributos de las clases RegistroVehicular, Mantenimiento, Sensor
    private RegistroVehicular registroVehicular;
    private Mantenimiento mantenimiento;
    private Sensor sensor;



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
    //seters de SistemaElectrico y SistemaFreanos
    public SistemaElectrico getSistemaElectrico(){return sistemaElectrico;}
    public SistemaFrenos getSistemaFrenos(){return sistemaFrenos;}
    //geters de las clases RegistroVehicular, Mantenimiento, Sensor
    public RegistroVehicular getRegistroVehicular(){return registroVehicular;}
    public Mantenimiento getMantenimiento(){return mantenimiento;}
    public Sensor getSensor(){return sensor;}


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
    //seters de SistemaElectrico y SistemaFrenos
    public void setSistemaElectrico(SistemaElectrico sistemaElectrico){
        this.sistemaElectrico = sistemaElectrico;
    }
    public void setSistemaFrenos(SistemaFrenos sistemaFrenos){
        this.sistemaFrenos = sistemaFrenos;
    }
    //seters de las clases RegistroVehicular, Mantenimiento, Sensor
    public void setRegistroVehicular(RegistroVehicular registroVehicular){
        this.registroVehicular = registroVehicular;
    }
    public void setMantenimiento(Mantenimiento mantenimiento){
        this.mantenimiento = mantenimiento;
    }
    public void setSensor(Sensor sensor){
        this.sensor = sensor;
    }

}
