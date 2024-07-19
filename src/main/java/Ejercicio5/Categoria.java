package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

    public int id;
    public String nombre;
    public List<Curso> cursos;

    public Categoria(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
    }


    public Curso buscarCurso(int id) {
        for (Curso curso : cursos) {
            if (curso.getCursoId() == id) {
                return curso;
            }
        }
        return null;
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }
}
