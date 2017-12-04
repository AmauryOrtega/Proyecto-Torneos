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

    public Torneo torneo_terceristas_1;
    public Torneo torneo_terceristas_2;

    public Torneo(ArrayList<Jugador> jugadores, String cinturon, String sexo, String edad, String deporte, String peso) {
        this.jugadores = jugadores;
        this.jugadores_bak = (ArrayList<Jugador>) jugadores.clone();
        this.partidos = new ArrayList<>();
        this.extras = new ArrayList<>();
        // Escogiendo extras de Extras
        Random r = new Random();
        int n_equipos = this.jugadores.size();
        for (int i = 0; i < this.numero_byes(n_equipos); i++) {
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

    public String getCinturon() {
        return cinturon;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEdad() {
        return edad;
    }

    public String getDeporte() {
        return deporte;
    }

    public String getPeso() {
        return peso;
    }

    public ArrayList<Jugador> getJugadores_bak() {
        return jugadores_bak;
    }

    public ArrayList<Jugador> getExtras_bak() {
        return extras_bak;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public ArrayList<Partido> getPartido(int ronda) {
        ArrayList<Partido> lista = new ArrayList<>();
        for (Partido partido : this.partidos) {
            if (partido.getRonda() == ronda) {
                lista.add(partido);
            }
        }
        return lista;
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

    public Torneo getTorneo_terceristas_1() {
        return torneo_terceristas_1;
    }

    public Jugador getGanador() {
        if (this.getPartidosActuales().size() == 1) {
            return this.getPartidosActuales().get(0).getGanador();
        } else {
            return null;
        }
    }

    public ArrayList<Jugador> getTerceristas2() {
//        ArrayList<Jugador> lista = new ArrayList<>();
//        Jugador segundo = this.getPartidosActuales().get(0).getPerdedor();
//        for (Partido partido : this.getPartidos()) {
//            if (partido.getGanador().igual(segundo)) {
//                lista.add(partido.getPerdedor());
//            }
//        }
//        return lista;
        Jugador jugador = this.getPartidosActuales().get(0).getJugadorB();
        System.out.println("QUIENES PERDIERON CONTRA " + jugador);
        ArrayList<Jugador> lista = new ArrayList<>();
        for (Partido partido : this.getPartidos()) {
            if (partido.getId() != Partido.ID - 1) {
                if (partido.getGanador().igual(jugador)) {
                    lista.add(partido.getPerdedor());
                }
            }
        }
        // No puede volver a jugar el que quedo de segundo
        lista.remove(this.getPartidosActuales().get(0).getJugadorA());
        return lista;
    }

    public void siguienteRonda() {
        ArrayList<Jugador> ganadores = new ArrayList<>();
        // Llenando ganadores
        this.getPartidosActuales().forEach((partido) -> {
            ganadores.add(partido.getGanador());
        });
        if (this.ronda == 0) {
            // Solo si hay numero_byes, los agrega
            this.extras.forEach((bye) -> {
                ganadores.add(bye);
            });
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

    public int numero_byes(int n_equipos) {
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

    public Torneo getTorneo_terceristas_2() {
        return torneo_terceristas_2;
    }

}
