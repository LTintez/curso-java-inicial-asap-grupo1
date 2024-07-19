package Ejercicio5;

public class Usuario {
    public int usuarioId;
    public String nombre;
    public String email;
    public boolean esBecado;

    public Usuario (int id, String nombre, String email, boolean esBecado){
        this.usuarioId = id;
        this.nombre = nombre;
        this.email = email;
        this.esBecado = esBecado;
    }

    public int getUsuarioId(){
        return usuarioId;
    }

    public boolean IsEsBecado(){
        return esBecado;
    }


}
