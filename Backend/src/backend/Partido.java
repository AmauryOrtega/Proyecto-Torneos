package backend;

public class Partido {

    private Jugador jugadorA;
    private Jugador jugadorB;
    private int puntajeA;
    private int puntajeB;
    private int ronda;
    private int ganador = -1;
    private static int ID = 0;
    private int id;

    public Partido(Jugador jugadorA, Jugador jugadorB, int ronda) {
        this.jugadorA = jugadorA;
        this.jugadorB = jugadorB;
        this.ronda = ronda;
        this.id = ID;
        ID++;
    }

    public int getRonda() {
        return ronda;
    }

    public void setRonda(int ronda) {
        this.ronda = ronda;
    }

    public Jugador getJugadorA() {
        return jugadorA;
    }

    public void setJugadorA(Jugador jugadorA) {
        this.jugadorA = jugadorA;
    }

    public Jugador getJugadorB() {
        return jugadorB;
    }

    public void setJugadorB(Jugador jugadorB) {
        this.jugadorB = jugadorB;
    }

    public int getPuntajeA() {
        return puntajeA;
    }

    private void setPuntajeA(int puntajeA) {
        this.puntajeA = puntajeA;
    }

    public int getPuntajeB() {
        return puntajeB;
    }

    private void setPuntajeB(int puntajeB) {
        this.puntajeB = puntajeB;
    }

    public void setPuntaje(int puntajeA, int puntajeB) {
        this.setPuntajeA(puntajeA);
        this.setPuntajeB(puntajeB);
    }

    public Jugador getGanador() {
        switch (ganador) {
            case -1:
                return null;
            case 0:
                return jugadorA;
            default:
                return jugadorB;
        }
    }

    public void setGanador(Jugador jugador) {
        if (jugador.igual(this.jugadorA)) {
            this.ganador = 0;
        } else if (jugador.igual(this.jugadorB)) {
            this.ganador = 1;
        }
    }

    @Override
    public String toString() {
        return "Partido#" + this.id + "{[" + ronda + "]" + jugadorA + "(" + puntajeA + ") - " + jugadorB + "(" + puntajeB + ")" + " => " + this.getGanador() + '}';
    }
    
    
}
