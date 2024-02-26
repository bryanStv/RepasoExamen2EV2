package maquinaExpendedora2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    private static void menu(){
        Scanner tc = new Scanner(System.in);
        MaquinaExpendedora maquina = new MaquinaExpendedora();
        try{
            int c = 0;
            for(int t:maquina.getTickets()){
                System.out.println("Ticket nº"+ c++ +": "+t);
            }
            System.out.print("Elige el ticket que quieres: ");
            int ticketElegido = tc.nextInt();
            System.out.print("Introducir dinero: ");
            int cantidad = tc.nextInt();
            tc.close();
            maquina.setDinero(cantidad);
            System.out.println("Dinero pagado: "+maquina.getDinero());
            maquina.addCantidad(ticketElegido,cantidad);
        }catch (IllegalArgumentException e){
            e.getMessage();
            menu();
        }
    }
}
