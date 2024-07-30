package Ejercicio8;

class Circuito implements Evaluable {
    private static final int NUMERO_FALTAS_PERMITIDAS = 2;
    private int tiempo;
    private int numeroFaltas;

    public Circuito(int tiempo, int numeroFaltas) {
        this.tiempo = tiempo;
        this.numeroFaltas = numeroFaltas;
    }

    public int getTiempo() {
        return tiempo;
    }

    public int getNumeroFaltas() {
        return numeroFaltas;
    }

    @Override
    public boolean isAprobado() {
        return numeroFaltas <= NUMERO_FALTAS_PERMITIDAS;
    }
}
