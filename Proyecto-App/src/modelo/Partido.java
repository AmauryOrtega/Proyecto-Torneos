package modelo;

public class Partido {

    private static int ID = 1;
    private final int id;
    private final Jugador jugadorA;
    private final Jugador jugadorB;
    private final int ronda;

    private int puntajeA;
    private int puntajeB;
    private int ganador = -1;

    public Partido(Jugador jugadorA, Jugador jugadorB, int ronda) {
        this.jugadorA = jugadorA;
        this.jugadorB = jugadorB;
        this.ronda = ronda;
        this.id = ID;
        ID++;
    }

    public int getId() {
        return id;
    }

    public Jugador getJugadorA() {
        return jugadorA;
    }

    public Jugador getJugadorB() {
        return jugadorB;
    }

    public int getRonda() {
        return ronda;
    }

    public int getPuntajeA() {
        return puntajeA;
    }

    public int getPuntajeB() {
        return puntajeB;
    }

    public void setPuntaje(int puntajeA, int puntajeB) {
        this.puntajeA = puntajeA;
        this.puntajeB = puntajeB;
    }

    public Jugador getGanador() {
        switch (this.ganador) {
            case -1:
                return null;
            case 0:
                return jugadorA;
            default:
                return jugadorB;
        }
    }

    public Jugador getPerdedor() {
        switch (this.ganador) {
            case -1:
                return null;
            case 0:
                return jugadorB;
            default:
                return jugadorA;
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
        return "Partido#" + this.id + " Ronda[" + ronda + "] ("
                + jugadorA.toStringCorto() + ") - (" + jugadorB.toStringCorto()
                + ") => " + this.getGanador().toStringCorto();
    }
}
