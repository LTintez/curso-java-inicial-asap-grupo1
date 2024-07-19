package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Asapdemy {

    public List<Usuario> usuarios;
    public List<Categoria> categorias;
    public List<Curso> cursos;

    public Asapdemy() {
        this.usuarios = new ArrayList<>();
        this.categorias = new ArrayList<>();
    }

    private Usuario buscarUsuario(int usuarioId) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsuarioId() == usuarioId) {
                return usuario;
            }
        }
        return null;
    }

    private Curso buscarCurso(int cursoId) {
        for (Curso curso : cursos) {
            if (curso.getCursoId() == cursoId) {
                return curso;
            }
        }
        return null;
    }

    public Resultado suscribirseACurso(int usuarioId, int cursoId){
        return null;
    }

    //public void agregarUsuario(Usuario){}



    //public void agregarCategoria(){}



    //public void mostrarResultadoAlSuscribirseACurso(){}


}
