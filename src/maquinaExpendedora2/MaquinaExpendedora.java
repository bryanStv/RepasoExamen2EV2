package maquinaExpendedora2;

public class MaquinaExpendedora {
    private int cajon;
    private int dinero;
    private int cambio;
    private int[] cambios;
    private int[] nMonedas;
    private int[] tickets;
    private int ticketElegido;
    public MaquinaExpendedora(){
        this.cajon = 9900;
        this.ticketElegido = -1;
        this.cambio = 0;
        this.cambios = new int[]{2000,1000,500,200,100,50,10,5,1};
        this.nMonedas = new int[cambios.length];
        this.tickets = new int[]{1500,1000,500};
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

    public int[] getCambios() {
        return cambios;
    }

    public void setCambios(int[] cambios) {
        this.cambios = cambios;
    }

    public int[] getnMonedas() {
        return nMonedas;
    }

    public void setnMonedas(int[] nMonedas) {
        this.nMonedas = nMonedas;
    }

    public int[] getTickets() {
        return tickets;
    }

    public void setTickets(int[] tickets) {
        this.tickets = tickets;
    }

    private void cambioAdevolver(int ticketElegido,int cantidad){
        int i = 0;
        this.cambio = cantidad - ticketElegido;
        System.out.println("Dinero a devolver: "+cambio);
        this.cajon -= cambio;
        while(true){
            if(i > this.cambios.length-1){
                break;
            }
            if(this.cambio >= cambios[i]){
                this.nMonedas[i] += 1;
                cambio -= cambios[i];
            }else{
                i++;
            }
        }
        for(int j = 0; j < nMonedas.length;j++){
            if(nMonedas[j] > 0){
                System.out.println(cambios[j]+" centimos x "+nMonedas[j]);
            }
        }
    }

    public void addCantidad(int indiceTicket,int cantidad){
        int ticketElegido = tickets[indiceTicket];
        if(ticketElegido <= cantidad){
            if(cantidad <= this.cajon){
                this.cajon += ticketElegido;
                cambioAdevolver(ticketElegido,cantidad);
            }else{
                throw new IllegalArgumentException("Por favor, introduce la cantidad exacta");
            }
        }else{
            throw new IllegalArgumentException("Cantidad Insuficiente, por favor, introduzca una cantidad correcta");
        }
    }
}
