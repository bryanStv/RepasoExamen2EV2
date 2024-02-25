package network;

import java.util.HashSet;
import java.util.Set;

public class Usuario {
    private String nombre;
    private int ID;
    private static int IDCounter = 0;
    private Set<Publicacion> publicaciones;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.ID = IDCounter++;
        publicaciones = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Set<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(Set<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public void addPublicacion(Publicacion publicacion){
        this.publicaciones.add(publicacion);
    }

    @Override
    public String toString() {
        String resultado = String.format("Usuario: %s ID: %s",this.nombre,this.ID);
        return resultado;
    }
}
