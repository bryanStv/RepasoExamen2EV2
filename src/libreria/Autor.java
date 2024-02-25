package libreria;

import java.util.HashSet;
import java.util.Set;

public class Autor {
    private String codAut;
    private String nombre;
    private Set<Libro> libros;

    public Autor(String codAut, String nombre) {
        this.codAut = codAut;
        this.nombre = nombre;
        this.libros = new HashSet<>();
    }

    public String getCodAut() {
        return codAut;
    }

    public void setCodAut(String codAut) {
        this.codAut = codAut;
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
        return this.codAut + "-" + this.nombre;
    }
}
