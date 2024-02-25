package banco;

public class Domiciliacion {
    private String numD;
    private int precio;
    private String descripcion;
    private CC cuenta;

    public Domiciliacion(String numD, int precio, String descripcion, CC cuenta) {
        this.numD = numD;
        this.precio = precio;
        this.descripcion = descripcion;
        this.cuenta = cuenta;
    }

    public String getNumD() {
        return numD;
    }

    public void setNumD(String numD) {
        this.numD = numD;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public CC getCuenta() {
        return cuenta;
    }

    public void setCuenta(CC cuenta) {
        this.cuenta = cuenta;
    }
    @Override
    public String toString() {
        return this.numD + " " + this.descripcion + " " + this.precio;
    }
}
