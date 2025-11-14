//Mantenimiento Historial y programación de mantenimientos realizados.
public class Mantenimiento {
    private String descripcion;
    private String fecha;
    private double costo;
    private boolean realizado; // el true = ya se hizo, false = programado para el futuro

    public Mantenimiento(String descripcion, String fecha, double costo, boolean realizado) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.costo = costo;
        this.realizado = realizado;
    }

    // Getters y Setters
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public double getCosto() { return costo; }
    public void setCosto(double costo) { this.costo = costo; }

    public boolean isRealizado() { return realizado; }
    public void setRealizado(boolean realizado) { this.realizado = realizado; }
}