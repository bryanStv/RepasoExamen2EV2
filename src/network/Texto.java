package network;

public class Texto extends Publicacion{
    private Usuario usuario;
    private String text;
    public Texto(Usuario usuario,String text){
        super(usuario);
        this.text = text;
    }

    @Override
    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
