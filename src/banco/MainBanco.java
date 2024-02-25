package banco;

import java.util.ArrayList;

public class MainBanco {
    public static void main(String[] args) {
        Banco bbva =  new Banco("123", "BBVA");
        Sucursal castellon = new Sucursal("2342", "Castellon", bbva);
        bbva.addSucursal(castellon);

        Cliente pepe = new Cliente("23434", "Pepe");
        Cliente maria = new Cliente("98764","María");
        Cliente juan = new Cliente("14725","Juan");
        ArrayList<Cliente> lc1 = new ArrayList<>();
        ArrayList<Cliente> lc2 = new ArrayList<>();
        lc1.add(pepe);
        lc1.add(maria);
        lc2.add(juan);

        CC cuenta1 = new CC("Cuenta Conjunta",castellon,lc1);
        CC cuenta2 = new CC("Cuenta única",castellon,lc2);
        castellon.addCC(cuenta1);
        castellon.addCC(cuenta2);

        pepe.addCC(cuenta1);
        maria.addCC(cuenta1);
        juan.addCC(cuenta2);

        Domiciliacion gas = new Domiciliacion("1",120,"GAS",cuenta1);
        Domiciliacion agua = new Domiciliacion("2",100,"Agua",cuenta2);
        Domiciliacion electricidad = new Domiciliacion("3",70,"Electricidad",cuenta2);
        cuenta1.addDomiciliacion(gas);
        cuenta2.addDomiciliacion(agua);
        cuenta2.addDomiciliacion(electricidad);

        Privilegio pCt1 = new Privilegio(cuenta1,maria,"Control Total");
        Privilegio pCt2 = new Privilegio(cuenta1,pepe,"Control Parcial");
        maria.addPrivilegio(pCt1);
        pepe.addPrivilegio(pCt2);
        cuenta1.addPrivilegio(pCt1);
        cuenta1.addPrivilegio(pCt2);

        Prestamo p1 = new Prestamo("1",500,castellon,juan);
        juan.addPrestamo(p1);
        castellon.addPrestamo(p1);

        System.out.println("Banco: "+bbva.getNombre());
        for(Sucursal s: bbva.getSucursales()){
            System.out.println("\tSucursal: "+s);
            for(CC cc: s.getCCs()){
                System.out.println("\t\tCuenta corriente: "+cc);
                System.out.println("\t\t\tDomiciliación: "+cc.getDomiciliaciones());
                for(Cliente c: cc.getClientes()){
                    System.out.println("\t\t\t\tCliente: "+c);
                    System.out.println("\t\t\t\tPrivilegio: "+c.getPrivilegios());
                    System.out.println("\t\t\t\tPréstamos: "+c.getPrestamos());
                }
            }
        }
    }
}
