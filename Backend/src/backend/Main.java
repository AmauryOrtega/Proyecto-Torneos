package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Torneo torneo = new Torneo(persistencia());
        System.out.println("");
        System.out.println("Jugadores [" + torneo.getJugadores_bak().size() + "]");
        System.out.println(torneo.getJugadores_bak());
        
        System.out.println("");
        System.out.println("Extras [" + torneo.getExtras().size() + "]");
        System.out.println(torneo.getExtras());
        
//        System.out.println("");
//        System.out.println("Antes de jugar Ronda 0");
//        torneo.getPartidosActuales().forEach(System.out::println);
        
        System.out.println("");
        System.out.println("Simulando partidos");
        for (Partido partido : torneo.getPartidosActuales()) {
            Random r = new Random();
            if (r.nextBoolean()) {
                partido.setGanador(partido.getJugadorA());
            } else {
                partido.setGanador(partido.getJugadorB());
            }
        }
        
        System.out.println("");
        System.out.println("Jugaron");
        torneo.getPartidosActuales().forEach(System.out::println);
        
        System.out.println("");
        System.out.println("Generando partidos de siguiente ronda");
        torneo.siguienteRonda();
        torneo.getPartidosActuales().forEach(System.out::println);
    }

    public static ArrayList<Jugador> persistencia() {
        // Persistencia
        ArrayList<Jugador> jugadores = new ArrayList<>();
        ArrayList<String> lista = null;
        try {
            Scanner lector = new Scanner(new File("jugadores.csv"));
            // No puede tener una linea en blanco al final
            lista = new ArrayList<>();
            while (lector.hasNextLine()) {
                lista.add(lector.next());
            }
            lector.close();
        } catch (FileNotFoundException ex) {
            System.err.println("[ERROR] No se encuentra el archivo jugadores.csv");;
        }
        for (String nombre : lista) {
            jugadores.add(new Jugador(nombre));
        }
        return jugadores;
    }

}
