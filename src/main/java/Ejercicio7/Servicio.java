package Ejercicio7;

public abstract class Servicio implements Facturable {
    private String nombre;
    public int cantHoras;

    public Servicio(String nombre, int cantHoras){
        this.nombre = nombre;
        this.cantHoras = cantHoras;
    }

    @Override
    public double getMontoFacturacion() {
        return 0;
    }

    public double getValorHora() {
        return 0;
    }

    public double calcularPrecio(){
        return this.cantHoras * getValorHora();
    };

    public abstract double getPrecio();
    //get valorHora;
}
