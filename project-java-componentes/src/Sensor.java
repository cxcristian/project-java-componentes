//Sensor Modela un sensor individual del vehículo (velocidad, temperatura, presión,etc).


public class Sensor {
    private double velocidad;
    private double temperatura;
    private double presion;
    private double nivelCombustible;
    
    public Sensor(double velocidad, double temperatura, double presion, double nivelCombustible) {
        this.velocidad = velocidad;
        this.temperatura = temperatura;
        this.presion = presion;
        this.nivelCombustible = nivelCombustible;
    }
    public double getVelocidad(){return velocidad;}
    public double getTemperatura(){return temperatura;}
    public double getPresion(){return presion;}
    public double getNivelCombustible(){return nivelCombustible;}

    public void setVelocidad(double velocidad){this.velocidad = velocidad;}
    public void setTemperatura(double temperatura){this.temperatura = temperatura;}
    public void setPresion(double presion){this.presion = presion;}
    public void setNivelCombustible(double nivelCombustible){this.nivelCombustible = nivelCombustible;}
}
