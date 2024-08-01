package Ejercicio8;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class SedeDeLicencias {
    private List<Examen> examenes;

    public SedeDeLicencias(){
        this.examenes = new ArrayList<>();
    }

    public void agregarExamen(Examen examen){
        this.examenes.add(examen);
    }

    public String obtenerInforme(){
        double porcentajeDeReprobados = porcentajeDeReprobados();
        double promTiempoAutosAprobados = promTiempoAutosAprobados();
        Informe informe = new Informe(porcentajeDeReprobados, promTiempoAutosAprobados);
        Gson gson = new Gson();
        return gson.toJson(informe);
    }

    private double porcentajeDeReprobados() {
        int totalExamenes = examenes.size();
        int examenesReprobados = 0;
        for (Examen examen : examenes) {
            if (!examen.isAprobado()) {
                examenesReprobados++;
            }
        }
        return ((double) examenesReprobados / totalExamenes) * 100;
    }

    private double promTiempoAutosAprobados() {
        int totalTiempo = 0;
        int count = 0;
        for (Examen examen : examenes) {
            if (examen instanceof ExamenDeAuto && examen.isAprobado()) {
                totalTiempo += ((ExamenDeAuto) examen).getTiempoDelCircuito();
                count++;
            }
        }
        return count > 0 ? (double) totalTiempo / count : 0;
    }

}
