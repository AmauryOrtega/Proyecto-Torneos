package modelo;

import java.util.ArrayList;
import java.util.Random;

public class Torneo {

    private final String cinturon;
    private final String sexo;
    private final String edad;
    private final String deporte;
    private final String peso;

    private int ronda;

    private ArrayList<Jugador> jugadores;
    private final ArrayList<Jugador> jugadores_bak;

    private ArrayList<Jugador> extras;
    private final ArrayList<Jugador> extras_bak;

    private ArrayList<Partido> partidos;

    private Torneo mini_torneo_tercerista;

    public Torneo(ArrayList<Jugador> jugadores, String cinturon, String sexo, String edad, String deporte, String peso) {
        this.jugadores = jugadores;
        this.jugadores_bak = (ArrayList<Jugador>) jugadores.clone();
        this.partidos = new ArrayList<>();
        this.extras = new ArrayList<>();
        // Escogiendo extras de Extras
        Random r = new Random();
        for (int i = 0; i < this.numero_byes(this.jugadores.size()); i++) {
            this.extras.add(this.jugadores.remove(r.nextInt(this.jugadores.size())));
        }
        this.extras_bak = (ArrayList<Jugador>) this.extras.clone();
        // Primera ronda de partidos
        this.ronda = 0;
        int n_partidos = this.jugadores.size() / 2;
        for (int i = 0; i < n_partidos; i++) {
            this.partidos.add(new Partido(
                    this.jugadores.remove(r.nextInt(this.jugadores.size())),
                    this.jugadores.remove(r.nextInt(this.jugadores.size())),
                    this.ronda)
            );
        }
        this.cinturon = cinturon;
        this.sexo = sexo;
        this.edad = edad;
        this.deporte = deporte;
        this.peso = peso;
    }

    public int getRonda() {
        return ronda;
    }

    public ArrayList<Jugador> getJugadores_bak() {
        return jugadores_bak;
    }

    public void setRonda(int ronda) {
        this.ronda = ronda;
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
//        this.partidos.stream().filter((partido) -> (partido.getRonda() == this.ronda)).forEachOrdered(lista::add);
        ArrayList<Partido> lista = new ArrayList<>();
        for (Partido partido : this.partidos) {
            if (partido.getRonda() == this.ronda) {
                lista.add(partido);
            }
        }
        return lista;
    }

    public ArrayList<Jugador> getExtras_bak() {
        return extras_bak;
    }

    public Torneo getMini_torneo_tercerista() {
        return mini_torneo_tercerista;
    }

    public void setMini_torneo_tercerista(Torneo mini_torneo_tercerista) {
        this.mini_torneo_tercerista = mini_torneo_tercerista;
    }

    public void siguienteRonda() {
        ArrayList<Jugador> ganadores = new ArrayList<>();
        // Llenando ganadores
        for (Partido partido : this.getPartidosActuales()) {
            ganadores.add(partido.getGanador());
        }
        if (this.ronda == 0) {
            // Solo si hay numero_byes, los agrega
            for (Jugador bye : this.getExtras()) {
                ganadores.add(bye);
            }
        }
        // Creando partidos con ganadores de la ronda anterior
        if (ganadores.size() != 1) {
            this.ronda++;
            int n_partidos = ganadores.size() / 2;
            Random r = new Random();
            for (int i = 0; i < n_partidos; i++) {
                this.partidos.add(new Partido(
                        ganadores.remove(r.nextInt(ganadores.size())),
                        ganadores.remove(r.nextInt(ganadores.size())),
                        this.ronda)
                );
            }
        }
    }

    public void iniciarMiniTorneo() {
        if (this.getGanador() != null) {
            ArrayList<Jugador> terceristas = this.getTerceristas();
            this.mini_torneo_tercerista = new Torneo(terceristas, this.cinturon, this.sexo, this.edad, this.deporte, this.peso);
        }
    }

    private int numero_byes(int n_equipos) {
        if ((Math.log(n_equipos) / Math.log(2)) == (int) (Math.log(n_equipos) / Math.log(2))) {
            return 0;
        } else {
            int i = 1;
            while (Math.pow(2, i) <= n_equipos) {
                i++;
            }
            return (int) Math.pow(2, i) - n_equipos;
        }
    }

    public Jugador getGanador() {
        if (this.getPartidosActuales().size() == 1) {
            return this.getPartidosActuales().get(0).getGanador();
        } else {
            return null;
        }
    }

    public ArrayList<Jugador> getGanadores() {
        if (this.getGanador() == null) {
            return null;
        }
        ArrayList<Jugador> finales = new ArrayList<>();
        finales.add(0, this.getGanador());
        finales.add(1, this.getPartidosActuales().get(0).getPerdedor());
        finales.add(2, this.getTercero_1());
        return finales;
    }

    public ArrayList<Jugador> getTerceristas() {
        ArrayList<Jugador> lista = new ArrayList<>();
//        this.getPartidos().stream().filter((partido) -> (partido.getGanador().equals(this.getGanador()))).forEachOrdered((partido) -> {
//            lista.add(partido.getPerdedor());
//        });
        for (Partido partido : this.getPartidos()) {
            if (partido.getGanador().equals(this.getGanador())) {
                lista.add(partido.getPerdedor());
            }
        }
        // No puede volver a jugar el que quedo de segundo
        lista.remove(this.getPartidosActuales().get(0).getPerdedor());
        return lista;
    }

    public Jugador getTercero_1() {
        return this.getMini_torneo_tercerista().getGanador();
    }
    
    public Jugador getTercero_2() {
        return this.getMini_torneo_tercerista().getGanador();
    }

}
