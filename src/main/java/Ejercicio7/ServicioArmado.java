package Ejercicio7;


public class ServicioArmado  extends Servicio{
    private static final double VALOR_HORA = 250;

    public ServicioArmado(String nombre, int horas){
        super(nombre, horas);
    }

    @Override
    public double getPrecio() {
        return cantHoras * VALOR_HORA;
    }



}
