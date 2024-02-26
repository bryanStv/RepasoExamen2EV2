package aireAcondicionado;

public class Aire {
    private String nombre;
    private int tempMax;
    private int temperatura;
    private int temMin;

    public Aire(String nombre) {
        this.nombre = nombre;
        this.tempMax = 35;
        this.temMin = 5;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTempMax() {
        return tempMax;
    }

    public void setTempMax(int tempMax) {
        this.tempMax = tempMax;
    }

    public int getTemMin() {
        return temMin;
    }

    public void setTemMin(int temMin) {
        this.temMin = temMin;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        if(temperatura <= tempMax && temperatura >= temMin){
            this.temperatura = temperatura;
        }else throw new IllegalArgumentException("Por favor, especifica una temperatura correcta");
    }

    public void subir(){
        if(temperatura < tempMax){
            this.temperatura++;
        }else throw new IllegalArgumentException("No se puede subir la temperatura a más de "+this.tempMax);
    }

    public void bajar(){
        if(temperatura > temMin){
            this.temperatura--;
        }else throw new IllegalArgumentException("No se puede bajar la temperatura a menos de "+this.temMin);
    }
    @Override
    public String toString() {
        return this.nombre + " -> " + this.temMin + " - " +this.tempMax;
    }
}
