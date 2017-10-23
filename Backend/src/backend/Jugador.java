package backend;

import java.util.Objects;

public class Jugador {

    private String nombre;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        //return "Jugador{" + "nombre=" + nombre + '}';
        return nombre;
    }

    public boolean igual(Jugador jugador) {
        return this.nombre.equals(jugador.nombre);
    }
}
