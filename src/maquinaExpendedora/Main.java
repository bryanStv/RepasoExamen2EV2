package maquinaExpendedora;

public class Main {
    public static void main(String[] args) {
        int[] ticket = {2000,1000,500};
        MaquinaExpendedora maquina = new MaquinaExpendedora(ticket);
        try{
            maquina.ingresarDinero();
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
