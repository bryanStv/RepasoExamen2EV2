package network;

public class Foto extends Publicacion{
    private Usuario usuario;
    private String Imagen;
    private String descripcion;

    public Foto(Usuario usuario, String foto, String descripcion) {
        super(usuario);
        this.Imagen = foto;
        this.descripcion = descripcion;
    }

    @Override
    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String imagen) {
        Imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString(){
        return this.Imagen + ": " + this.descripcion;
    }
}
