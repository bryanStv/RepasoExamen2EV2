package libreria;

import java.util.HashSet;
import java.util.Set;

public class Lector {
    private String dni;
    private String nombre;
    private Set<Historico> historicos;

    public Lector(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.historicos = new HashSet<>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Historico> getHistoricos() {
        return historicos;
    }

    public void setHistoricos(Set<Historico> historicos) {
        this.historicos = historicos;
    }

    public void addHistorico(Historico historico){
        this.historicos.add(historico);
    }

    @Override
    public String toString() {
        return this.dni+"-"+this.nombre;
    }
}
