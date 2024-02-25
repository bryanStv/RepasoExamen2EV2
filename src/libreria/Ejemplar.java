package libreria;

import java.util.HashSet;
import java.util.Set;

public class Ejemplar {
    private String nRed;
    private Libro libro;
    private Set<Historico> historicos;
    private Set<String> fechaPrestamos;

    public Ejemplar(String nRed, Libro libro) {
        this.nRed = nRed;
        this.libro = libro;
        this.historicos = new HashSet<>();
        this.fechaPrestamos = new HashSet<>();
    }

    public String getnRed() {
        return nRed;
    }

    public void setnRed(String nRed) {
        this.nRed = nRed;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    public Set<Historico> getHistoricos() {
        return historicos;
    }

    public void setHistoricos(Set<Historico> historicos) {
        this.historicos = historicos;
    }

    public Set<String> getFechaPrestamos() {
        return fechaPrestamos;
    }

    public void setFechaPrestamos(Set<String> fechaPrestamos) {
        this.fechaPrestamos = fechaPrestamos;
    }

    public void addHistorico(Historico historico){
        this.historicos.add(historico);
    }
    public void addFechaPrestamo(String fechaPrestamo){
        this.fechaPrestamos.add(fechaPrestamo);
    }
    @Override
    public String toString() {
        return this.nRed;
    }
}
