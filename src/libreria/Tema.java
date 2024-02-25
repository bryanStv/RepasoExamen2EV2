package libreria;

import java.util.HashSet;
import java.util.Set;

public class Tema {
    private String codT;
    private String nombre;
    private Set<Libro> libros;
    public Tema(String codT, String nombre) {
        this.codT = codT;
        this.nombre = nombre;
        this.libros = new HashSet<>();
    }

    public String getCodT() {
        return codT;
    }

    public void setCodT(String codT) {
        this.codT = codT;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Set<Libro> libros) {
        this.libros = libros;
    }

    public void addLibro(Libro libro){
        this.libros.add(libro);
    }

    @Override
    public String toString() {
        return this.codT + "-" + this.nombre;
    }
}
