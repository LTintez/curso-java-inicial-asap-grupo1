package Ejercicio8;

class Circuito implements Evaluable {
    private static final int NUMERO_FALTAS_PERMITIDAS = 2;
    private int tiempoEnSeg;
    private int faltas;

    public Circuito(int tiempoEnSeg, int faltas) {
        this.tiempoEnSeg = tiempoEnSeg;
        this.faltas = faltas;
    }

    public int getTiempoEnSeg() {
        return tiempoEnSeg;
    }

    public int getFaltas() {
        return faltas;
    }

    @Override
    public boolean isAprobado() {
        return faltas <= NUMERO_FALTAS_PERMITIDAS;
    }
}
