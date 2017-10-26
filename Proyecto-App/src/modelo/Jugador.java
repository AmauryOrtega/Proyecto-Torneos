package modelo;

public class Jugador {

    private String nombres;
    private String apellidos;
    private int edad;
    private String identificacion;
    private String tipoIdentificacion;
    private String cinturon;
    private String sexo;
    private float estatura;

    public Jugador(String nombres, String apellidos, int edad, String identificacion, String tipoIdentificacion, String cinturon, String sexo, float estatura) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.identificacion = identificacion;
        this.tipoIdentificacion = tipoIdentificacion;
        this.cinturon = cinturon;
        this.sexo = sexo;
        this.estatura = estatura;
    }

    public Jugador(String nombre) {
        this.nombres = nombre;
    }

    public Jugador(String nombres, String identificacion) {
        this.nombres = nombres;
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        //return "Jugador{" + "nombres=" + nombres + '}';
        return nombres;
    }

    public boolean igual(Jugador jugador) {
        return this.nombres.equals(jugador.nombres) && this.identificacion.equals(jugador.identificacion);
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getCinturon() {
        return cinturon;
    }

    public void setCinturon(String cinturon) {
        this.cinturon = cinturon;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

}
