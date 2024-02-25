package libreria;

import java.util.HashSet;
import java.util.Set;

public class Editorial {
    private String codEd;
    private String nombre;
    private Set<Libro> libros;

    public Editorial(String codEd, String nombre) {
        this.codEd = codEd;
        this.nombre = nombre;
        this.libros = new HashSet<>();
    }

    public String getCodEd() {
        return codEd;
    }

    public void setCodEd(String codEd) {
        this.codEd = codEd;
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
        return this.codEd + "-" + this.nombre;
    }
}
