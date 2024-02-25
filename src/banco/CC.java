package banco;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CC {
    private String nCC;
    private Sucursal sucursal;
    private ArrayList<Cliente> clientes;
    private Set<Domiciliacion> domiciliaciones;
    private Set<Privilegio> privilegios;
    public CC(String nCC, Sucursal sucursal, ArrayList<Cliente> clientes) {
        this.nCC = nCC;
        this.sucursal = sucursal;
        this.clientes = clientes;
        this.domiciliaciones = new HashSet<>();
        this.privilegios = new HashSet<>();
    }

    public String getnCC() {
        return nCC;
    }

    public void setnCC(String nCC) {
        this.nCC = nCC;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Set<Domiciliacion> getDomiciliaciones() {
        return domiciliaciones;
    }

    public void setDomiciliaciones(Set<Domiciliacion> domiciliaciones) {
        this.domiciliaciones = domiciliaciones;
    }

    public Set<Privilegio> getPrivilegios() {
        return privilegios;
    }

    public void setPrivilegios(Set<Privilegio> privilegios) {
        this.privilegios = privilegios;
    }

    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public void addDomiciliacion(Domiciliacion domiciliacion){
        this.domiciliaciones.add(domiciliacion);
    }
    public void addPrivilegio(Privilegio privilegio){
        this.privilegios.add(privilegio);
    }
    @Override
    public String toString() {
        return this.nCC;
    }
}
