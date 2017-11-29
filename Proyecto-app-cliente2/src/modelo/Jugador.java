package modelo;

public class Jugador {

    private final String nombre_completo;
    private final String cedula;
    private final String cinturon;
    private final String sexo;
    private final float peso;
    private final int edad;
    private final float estatura;

    public Jugador(String nombre_completo, String cedula, String cinturon, String sexo, float peso, int edad, float estatura) {
        this.nombre_completo = nombre_completo;
        this.cedula = cedula;
        this.cinturon = cinturon;
        this.sexo = sexo;
        this.peso = peso;
        this.edad = edad;
        this.estatura = estatura;
    }

    public Jugador(String nombre_completo, String cedula) {
        this.nombre_completo = nombre_completo;
        this.cedula = cedula;
        this.cinturon = "";
        this.sexo = "";
        this.peso = 0;
        this.edad = 0;
        this.estatura = 0;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCinturon() {
        return cinturon;
    }

    public String getSexo() {
        return sexo;
    }

    public float getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public boolean igual(Jugador jugador) {
        return this.nombre_completo.equals(jugador.nombre_completo) && this.cedula.equals(jugador.cedula);
    }

    @Override
    public String toString() {
        return "Jugador{" + nombre_completo + ", CC." + cedula + ", cinturon=" + cinturon + ", sexo=" + sexo + ", peso=" + peso + ", edad=" + edad + ", estatura=" + estatura + '}';
    }

}
