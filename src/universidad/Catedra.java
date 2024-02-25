package universidad;

import java.util.HashSet;
import java.util.Set;

public class Catedra {
    private String nombre;
    private Departamento departamento;
    private Facultad facultad;
    private Set<Adscrito> adscritos;

    public Catedra(String nombre, Facultad facultad) {
        this.nombre = nombre;
        this.departamento = null;
        this.facultad = facultad;
        this.adscritos = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public Set<Adscrito> getAdscritos() {
        return adscritos;
    }

    public void setAdscritos(Set<Adscrito> adscritos) {
        this.adscritos = adscritos;
    }
    public void addAdscrito(Adscrito adscrito){
        this.adscritos.add(adscrito);
    }
    @Override
    public String toString(){
        return this.nombre;
    }
}
