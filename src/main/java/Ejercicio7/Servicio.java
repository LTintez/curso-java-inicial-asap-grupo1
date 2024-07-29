package Ejercicio7;

public class Servicio implements Facturable {
    private String nombre;
    private int cantHoras;

    public Servicio(String nombre, int cantHoras){
        this.nombre = nombre;
        this.cantHoras = cantHoras;
    }

    @Override
    public double montoFacturacion() {
        return 0;
    }

    public double getValorHora() {
        return 0;
    }

    public double calcularPrecio(){
        return this.cantHoras * getValorHora();
    };

    //get precio;
    //get valorHora;
}
