package maquinaExpendedora;

import java.util.Scanner;

public class MaquinaExpendedora {
    private int cajon;
    private int dinero;
    private int[] ticket;
    private int ticketElejido;
    public MaquinaExpendedora(int[] ticket){
        this.ticket = ticket;
        this.cajon = 20000; //200€
        this.dinero = 0;
    }

    public int getCajon() {
        return cajon;
    }

    public void setCajon(int cajon) {
        this.cajon = cajon;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int[] getTicket() {
        return ticket;
    }

    public void setTicket(int[] ticket) {
        this.ticket = ticket;
    }

    private void dineroAdevolver(){
        int[] cambios = {1000,500,200,100,50,20,10,5,1};
        int[] numeroMonedas = new int[cambios.length];
        int cambio = this.dinero - this.ticketElejido;
        this.cajon += this.ticketElejido;
        int contador = 0;
        while(true){
            if(contador > cambios.length-1){
                break;
            }
            if(cambio >= cambios[contador]){
                numeroMonedas[contador] += 1;
                cambio -= cambios[contador];
            }else{
                contador++;
            }
        }
        System.out.println("A devolver: ");
        for (int i = 0; i < cambios.length;i++){
            if(numeroMonedas[i] > 0){
                System.out.println("\t\t"+numeroMonedas[i]+" de "+cambios[i]+" céntimos");
            }
        }
    }
    public void ingresarDinero(){
        Scanner tc = new Scanner(System.in);
        for(int i = 0; i < this.ticket.length;i++){
            System.out.printf("Ticket nº%d: %d€\n",i,this.ticket[i]/100);
        }
        System.out.println("Cantidad actual: "+this.dinero/100+"€");
        System.out.print("Elija el nº del ticket que quiere: ");
        int indice = tc.nextInt();
        int ticketElejido = -1;
        if(indice <= this.ticket.length-1){
            ticketElejido = this.ticket[indice];
        }else{
            System.out.println("Ticket incorrecto, ingrese un ticket válido");
            ingresarDinero();
        }
        System.out.print("Ingrese la cantidad(en centimos): ");
        setDinero(getDinero()+tc.nextInt());
        if(this.dinero > 0){
            if(this.dinero <= this.cajon){
                if(ticketElejido <= this.dinero){
                    tc.close();
                    this.ticketElejido = ticketElejido;
                    dineroAdevolver();
                }else{
                    System.out.println("No ha introducido una cantidad suficiente para el ticket, por favor, añada más");
                    ingresarDinero();
                }
            }else throw new IllegalArgumentException("Por favor, ingrese la cantidad exacta");
        }else throw new IllegalArgumentException("Tienes que ingresar una cantidad positiva o mayor a 0");
    }
}
