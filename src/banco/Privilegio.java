package banco;

public class Privilegio {
    private CC cc;
    private Cliente cliente;
    private String privilegio;

    public Privilegio(CC cc, Cliente cliente, String privilegio) {
        this.cc = cc;
        this.cliente = cliente;
        this.privilegio = privilegio;
    }

    public CC getCc() {
        return cc;
    }

    public void setCc(CC cc) {
        this.cc = cc;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(String privilegio) {
        this.privilegio = privilegio;
    }

    @Override
    public String toString() {
        return this.privilegio;
    }
}
