package banco;

public class Prestamo {
    private String numP;
    private int cantidad;
    private Sucursal sucursal;
    private Cliente cliente;

    public Prestamo(String numP, int cantidad, Sucursal sucursal, Cliente cliente) {
        this.numP = numP;
        this.cantidad = cantidad;
        this.sucursal = sucursal;
        this.cliente = cliente;
    }

    public String getNumP() {
        return numP;
    }

    public void setNumP(String numP) {
        this.numP = numP;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return this.numP + " " + this.cantidad;
    }
}
