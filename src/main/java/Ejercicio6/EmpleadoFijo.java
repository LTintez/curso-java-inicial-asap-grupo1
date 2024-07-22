package Ejercicio6;

public class EmpleadoFijo extends Empleado {
	private double sueldoBasico;

    public EmpleadoFijo(String dni, String nombre, String apellido, int anioIngreso, double sueldoBasico) {
        super(dni, nombre, apellido, anioIngreso);
        this.sueldoBasico = sueldoBasico;
    }
	

}
