package network;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Publicacion {
    private static int contadorID = 0;
    private int ID;
    private Usuario usuario;
    private int likes;
    private Date fechaPub;
    private Set<Comentario> comentarios;

    public Publicacion(Usuario usuario) {
        this.usuario = usuario;
        this.ID = contadorID++;
        this.likes = 0;
        this.fechaPub = new Date();
        this.comentarios = new HashSet<>();
    }
    public void addComentario(Comentario comentario){
        this.comentarios.add(comentario);
    }
    public void like(){
        this.likes++;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Set<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(Set<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        String resultado = String.format("Publicación: %s Usuario: %s Likes: %d FechaPub: %s",this.ID,this.usuario,this.likes,this.fechaPub);
        return resultado;
    }
}
