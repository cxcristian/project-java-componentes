//RegistroVehicular Datos del registro legal: matrícula, propietario, fecha de registro.
public class RegistroVehicular {
    //atributos de la clase RegstroVehicular
    private String matricula;
    private String propietario;
    private String fechaRegistro;

    //metodo constructor de RegistroVehicular
    public RegistroVehicular( String matricula, String propietario, String fechaRegistro){
        this.matricula = matricula;
        this.propietario = propietario;
        this.fechaRegistro = fechaRegistro;
    }

    //Geters
    public String getMatricula(){return matricula;}
    public String getPropietario(){ return propietario;}
    public String getFechaRegistro(){ return fechaRegistro;}

    //seters
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setPropietario(String propietario){
        this.propietario = propietario;
    }
    public void setFechaRegistro(String fechaRegistro){
        this.fechaRegistro = fechaRegistro;
    }
}