package universidad;

public class Adscrito {
    private Profesor profesor;
    private Catedra catedra;
    private String fecha;

    public Adscrito(Profesor profesor, Catedra catedra, String fecha) {
        this.profesor = profesor;
        this.catedra = catedra;
        this.profesor = null;
        this.fecha = fecha;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Catedra getCatedra() {
        return catedra;
    }

    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString(){
        return this.fecha;
    }
}
