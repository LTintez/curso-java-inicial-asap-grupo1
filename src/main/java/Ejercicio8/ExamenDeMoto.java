package Ejercicio8;

public class ExamenDeMoto extends Examen {
    private static final int TOPE_CILINDRADA = 150;
    private static final int TIEMPO_MAXIMO_PERMITIDO = 120;
    private Moto moto;

    public ExamenDeMoto(String fecha, Persona persona, Moto moto){
        super(fecha, persona);
        this.moto = moto;
    }

    @Override
    public boolean isAprobado() {
        return false;
    }

    private int cantCircuitosAprobados(){
        int count = 0;
        for (Circuito circuito : circuitos){
            if (circuito.isAprobado()){
                count++;
            }
        }
        return count;
    }

    private boolean apruebaExamenMotoAltaCilindrada(){
        return cantCircuitosAprobados() == circuitos.size();
    }

    private boolean apruebaExamenMotoBajaCilindrada(){
        return cantCircuitosAprobados() >= circuitos.size() - 1;
    }

    private boolean cumpleTiempoTotal() {
        int totalTiempo = 0;
        for (Circuito circuito : circuitos) {
            totalTiempo += circuito.getTiempoEnSeg();
        }
        return totalTiempo <= TIEMPO_MAXIMO_PERMITIDO;
    }
}
