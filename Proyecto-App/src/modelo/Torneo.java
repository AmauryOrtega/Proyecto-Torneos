package modelo;

import java.util.ArrayList;
import java.util.Random;

public class Torneo {

    private Integer estado;
    private ArrayList<Jugador> jugadores;
    private ArrayList<Jugador> jugadores_bak;
    private ArrayList<Jugador> extras;
    private ArrayList<Jugador> extras_bak;
    private ArrayList<Partido> partidos;

    public Torneo(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
        this.jugadores_bak = (ArrayList<Jugador>) jugadores.clone();
        this.partidos = new ArrayList<>();
        this.extras = new ArrayList<>();
        // # de Extras
        // Posible cambio aqui
        Random r = new Random();
        if (this.jugadores.size() % 2 == 0) {
            this.extras.add(this.jugadores.remove(r.nextInt(this.jugadores.size())));
            this.extras.add(this.jugadores.remove(r.nextInt(this.jugadores.size())));
        } else {
            this.extras.add(this.jugadores.remove(r.nextInt(this.jugadores.size())));
        }
        this.extras_bak = (ArrayList<Jugador>) this.extras.clone();
        // Primera ronda de partidos
        this.estado = 0;
        int n_partidos = this.jugadores.size() / 2;
        for (int i = 0; i < n_partidos; i++) {
            this.partidos.add(
                    new Partido(
                            this.jugadores.remove(r.nextInt(this.jugadores.size())),
                            this.jugadores.remove(r.nextInt(this.jugadores.size())),
                            this.estado)
            );
        }
    }

    public Integer getEstado() {
        return estado;
    }

    public ArrayList<Jugador> getJugadores_bak() {
        return jugadores_bak;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public ArrayList<Jugador> getExtras() {
        return extras;
    }

    public void setExtras(ArrayList<Jugador> extras) {
        this.extras = extras;
    }

    public ArrayList<Partido> getPartidosActuales() {
//        this.partidos.stream().filter((partido) -> (partido.getRonda() == this.estado)).forEachOrdered(lista::add);
        ArrayList<Partido> lista = new ArrayList<>();
        for (Partido partido : this.partidos) {
            if (partido.getRonda() == this.estado) {
                lista.add(partido);
            }
        }
        return lista;
    }

    public void siguienteRonda() {

        if (this.estado == 0) {
            ArrayList<Jugador> ganadores = new ArrayList<>();
            for (Partido partido : this.getPartidosActuales()) {
                ganadores.add(partido.getGanador());
            }
            // https://www.printyourbrackets.com/seededbrackets.html
            // Con esto, los byers deben ser escogidos bien en el constructor
            // Explicacion https://www.printyourbrackets.com/how-byes-work-in-a-tournament.html
            if (this.extras.size() % 2 == 0) {
                // 2 extras
            } else {
                // 1 extra
            }

//            for (int i = 0; i < n_partidos; i++) {
//                this.partidos.add(
//                        new Partido(
//                                this.jugadores.remove(r.nextInt(this.jugadores.size())),
//                                this.jugadores.remove(r.nextInt(this.jugadores.size())),
//                                this.estado)
//                );
//            }
        } else {
            
        }
        this.estado += 1;
    }
}
