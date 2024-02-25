package libreria;

public class Historico {
    private String fechaInicio;
    private String fechaFin;
    private Lector lector;
    private Ejemplar ejemplar;

    public Historico(String fechaInicio, String fechaFin, Lector lector, Ejemplar ejemplar) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.lector = lector;
        this.ejemplar = ejemplar;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    @Override
    public String toString() {
        return this.fechaInicio+"-"+this.fechaFin;
    }
}
