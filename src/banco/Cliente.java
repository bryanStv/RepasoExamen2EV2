package banco;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
    private String DNI;
    private String nombre;
    private Set<CC> CCs;
    private Set<Prestamo> prestamos;
    private Set<Privilegio> privilegios;

    public Cliente(String DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.CCs = new HashSet<>();
        this.prestamos = new HashSet<>();
        this.privilegios = new HashSet<>();
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Set<Privilegio> getPrivilegios() {
        return privilegios;
    }

    public void setPrivilegios(Set<Privilegio> privilegios) {
        this.privilegios = privilegios;
    }

    public void addCC(CC cc){
        this.CCs.add(cc);
    }

    public void addPrestamo(Prestamo prestamo){
        this.prestamos.add(prestamo);
    }
    public void addPrivilegio(Privilegio privilegio){
        this.privilegios.add(privilegio);
    }
    @Override
    public String toString() {
        return this.nombre + " ("+this.DNI+")";
    }
}
