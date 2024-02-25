package banco;

import java.util.HashSet;
import java.util.Set;

public class Sucursal {
    private String nSuc;
    private String nombre;
    private Banco banco;
    private Set<CC> CCs;
    private Set<Prestamo> prestamos;

    public Sucursal(String nSuc, String nombre, Banco banco) {
        this.nSuc = nSuc;
        this.nombre = nombre;
        this.banco = banco;
        this.CCs = new HashSet<>();
        this.prestamos = new HashSet<>();
    }

    public String getnSuc() {
        return nSuc;
    }

    public void setnSuc(String nSuc) {
        this.nSuc = nSuc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    public Set<CC> getCCs() {
        return CCs;
    }

    public void setCCs(Set<CC> CCs) {
        this.CCs = CCs;
    }
    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public void addCC(CC cc){
        this.CCs.add(cc);
    }

    public void addPrestamo(Prestamo prestamo){
        this.prestamos.add(prestamo);
    }

    @Override
    public String toString() {
        return this.nombre + ": " + this.nSuc;
    }
}
