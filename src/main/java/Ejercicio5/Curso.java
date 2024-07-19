package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    public static final int MAX_BECADOS = 5;
    public int cursoId;
    public String titulo;
    public double precio;
    public int valoracion;
    public Usuario autor;
    public List<Usuario> suscriptos;
    public List<Usuario> becados;
    public List<Leccion> lecciones;

    public Curso(int id, String titulo, double precio, int valoracion, Usuario autor){
        this.cursoId = id;
        this.titulo = titulo;
        this.precio = precio;
        this.valoracion = valoracion;
        this.autor = autor;
        this.suscriptos = new ArrayList<>();
        this.becados = new ArrayList<>();
    }

    public int getCursoId(){
        return cursoId;
    }

    public Usuario getAutor(){
        return autor;
    }

    public List<Usuario> getSuscriptos(){
        return suscriptos;
    }

    public List<Usuario> getBecados(){
        return becados;
    }

    public boolean estaSuscripto(Usuario usuario){
        return suscriptos.contains(usuario);
    }

    public void suscribir(Usuario usuario){
        suscriptos.add(usuario);
    }

    public boolean cuposBecadosLleno() {
        int becadosSuscritos = 0;
        for (Usuario suscriptor : suscriptos) {
            if (suscriptor.IsEsBecado()) {
                becadosSuscritos++;
            }
        }
        return becadosSuscritos == MAX_BECADOS;
    }

}
