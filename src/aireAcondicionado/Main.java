package aireAcondicionado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner tc = new Scanner(System.in);
            Aire a1 = new Aire("Aire acondicionado 1");
            a1.setTemperatura(5);
            int indice = -1;
            while(true){
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("Temperatura actual: "+a1.getTemperatura());
                System.out.println("Subir temperatura(2): ");
                System.out.println("Bajar temperatura(1): ");
                System.out.println("Salir(0): ");
                System.out.print("Opción elegida: ");
                indice = tc.nextInt();
                switch (indice){
                    case 0:
                        System.exit(0);
                    case 1:
                        a1.bajar();
                        break;
                    case 2:
                        a1.subir();
                        break;
                }
            }
        }catch (IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
