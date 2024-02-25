package banco;

import java.util.HashSet;
import java.util.Set;

public class Banco {
    private String nEnt;
    private String nombre;
    private Set<Sucursal> sucursales;

    public Banco(String nEnt, String nombre) {
        this.nEnt = nEnt;
        this.nombre = nombre;
        this.sucursales = new HashSet<>();
    }

    public String getnEnt() {
        return nEnt;
    }

    public void setnEnt(String nEnt) {
        this.nEnt = nEnt;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(Set<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public void addSucursal(Sucursal sucursal){
        this.sucursales.add(sucursal);
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s, ID Entidad: %s", this.nombre, this.nEnt);
    }
}
