//SistemaElectrico Describe el sistema eléctrico: batería, luces, sensores.
public class SistemaElectrico {
    //atributos
    private int bateria;
    private boolean luces;
    private boolean estadoSensores;

    public SistemaElectrico(int bateria, boolean luces, boolean estadoSensores){
        this.bateria = bateria;
        this.luces = luces;
        this.estadoSensores = estadoSensores;

    }
    public int getBateria(){ return bateria;}
    public boolean getLuces(){return luces;}
    public boolean getEstadoSensores(){return estadoSensores;}

    public void setBateria(int bateria){this.bateria = bateria;}
    public void setLuces(boolean luces){this.luces = luces;}
    public void getEstadoSensores(boolean estadoSensores){this.estadoSensores = estadoSensores;}

}
