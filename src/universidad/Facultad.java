package universidad;

import java.util.HashSet;
import java.util.Set;

public class Facultad {
    private String nombre;
    private Set<Catedra> catedras;

    public Facultad(String nombre) {
        this.nombre = nombre;
        this.catedras = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(Set<Catedra> catedras) {
        this.catedras = catedras;
    }

    public void addCatedra(Catedra catedra){
        this.catedras.add(catedra);
    }

    @Override
    public String toString(){
        return this.nombre;
    }
}
