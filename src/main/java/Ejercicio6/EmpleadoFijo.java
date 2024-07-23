package Ejercicio6;

public class EmpleadoFijo extends Empleado {
	private double sueldoBasico;
	private int anioActual = 2024;
	

    public EmpleadoFijo(String dni, String nombre, String apellido, int anioIngreso, double sueldoBasico, int anioActual) {
        super(dni, nombre, apellido, anioIngreso);
        this.sueldoBasico = sueldoBasico;
        this.anioActual = 2024;
        
    }
	

}
