package network;

public class Comentario {
    private Publicacion publicacion;
    private Usuario usuario;
    private String texto;
    public Comentario(Publicacion publicacion,Usuario usuario,String texto){
        this.publicacion = publicacion;
        this.usuario = usuario;
        this.texto = texto;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString(){
        return this.texto +" comentado por "+this.usuario;
    }
}
