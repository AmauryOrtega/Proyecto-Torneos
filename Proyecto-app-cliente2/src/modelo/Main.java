package modelo;

import Vista.Principal;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        Principal ventana = new Principal();
        ventana.setVisible(true);
        
//        int N_JUGADORES;
//        // Lista de jugadores constantes
//        ArrayList<Jugador> jugadores = new ArrayList<>();
//        for (int i = 0; i < N_JUGADORES; i++) {
//            jugadores.add(
//                    new Jugador(
//                            generador.generateName(Gender.MALE).toString(),
//                            Double.toString(r.nextDouble()).substring(2, 12),
//                            "VERDE",
//                            "M",
//                            r.nextInt(90 - 60) + 60,
//                            r.nextInt(20 - 15) + 15,
//                            r.nextInt(190 - 160) + 160
//                    )
//            );
//        }
//        // Creando torneo principal
//        Torneo torneo = new Torneo((ArrayList<Jugador>) jugadores.clone(), "VERDE", "M", "15-20", "KUMITE", "60-90");
//        System.out.println("\nJugadores [" + torneo.getJugadores_bak().size() + "]");
//        torneo.getJugadores_bak().forEach(System.out::println);
//        System.out.println("\nExtras [" + torneo.getExtras_bak().size() + "]");
//        torneo.getExtras_bak().forEach(System.out::println);
//
//        // Jugando partidos del torneo principal
//        do {
//            System.out.println("\nRONDA " + torneo.getRonda());
//            torneo.getPartidosActuales().forEach((partido) -> {
//                if (r.nextBoolean()) {
//                    partido.setGanador(partido.getJugadorA());
//                } else {
//                    partido.setGanador(partido.getJugadorB());
//                }
//            });
//            torneo.getPartidosActuales().forEach(System.out::println);
//            torneo.siguienteRonda();
//        } while (torneo.getGanador() == null);
//
//        // Torneos terceristas
//        System.out.println("\n" + torneo.getTerceristas1().size() + " jugadores perdieron contra " + torneo.getGanador().toStringCorto());
//        torneo.getTerceristas1().forEach(System.out::println);
//        System.out.println("\n" + torneo.getTerceristas1().size() + " jugadores perdieron contra " + torneo.getPartidosActuales().get(0).getPerdedor().toStringCorto());
//        torneo.getTerceristas2().forEach(System.out::println);
//
//        // 1° Torneo tercerista
//        System.out.println("\n1° Torneo terceristas [" + torneo.getTerceristas1().size() + "]");
//        torneo.iniciarMiniTorneo1();
//        System.out.println("\nJugadores [" + torneo.getTorneo_terceristas_1().getJugadores_bak().size() + "]");
//        torneo.getTorneo_terceristas_1().getJugadores_bak().forEach(System.out::println);
//        System.out.println("\nTerceristas Extras [" + torneo.getTorneo_terceristas_1().getExtras_bak().size() + "]");
//        torneo.getTorneo_terceristas_1().getExtras_bak().forEach(System.out::println);
//
//        // Jugando partidos del 1° torneo terceristas
//        do {
//            System.out.println("\nRONDA " + torneo.getTorneo_terceristas_1().getRonda());
//            torneo.getTorneo_terceristas_1().getPartidosActuales().forEach((partido) -> {
//                if (r.nextBoolean()) {
//                    partido.setGanador(partido.getJugadorA());
//                } else {
//                    partido.setGanador(partido.getJugadorB());
//                }
//            });
//            torneo.getTorneo_terceristas_1().getPartidosActuales().forEach(System.out::println);
//            torneo.getTorneo_terceristas_1().siguienteRonda();
//        } while (torneo.getTorneo_terceristas_1().getGanador() == null);
//
//        // 2° Torneo tercerista
//        System.out.println("\n2° Torneo terceristas [" + torneo.getTerceristas2().size() + "]");
//        torneo.iniciarMiniTorneo2();
//        System.out.println("\nJugadores [" + torneo.getTorneo_terceristas_2().getJugadores_bak().size() + "]");
//        torneo.getTorneo_terceristas_2().getJugadores_bak().forEach(System.out::println);
//        System.out.println("\nTerceristas Extras [" + torneo.getTorneo_terceristas_2().getExtras_bak().size() + "]");
//        torneo.getTorneo_terceristas_2().getExtras_bak().forEach(System.out::println);
//
//        // Jugando partidos del 2° torneo terceristas
//        do {
//            System.out.println("\nRONDA " + torneo.getTorneo_terceristas_2().getRonda());
//            torneo.getTorneo_terceristas_2().getPartidosActuales().forEach((partido) -> {
//                if (r.nextBoolean()) {
//                    partido.setGanador(partido.getJugadorA());
//                } else {
//                    partido.setGanador(partido.getJugadorB());
//                }
//            });
//            torneo.getTorneo_terceristas_2().getPartidosActuales().forEach(System.out::println);
//            torneo.getTorneo_terceristas_2().siguienteRonda();
//        } while (torneo.getTorneo_terceristas_2().getGanador() == null);
//
//        // Definiendo el mejor tercerista
//        Partido partido_terceristas = new Partido(torneo.getTorneo_terceristas_1().getGanador(), torneo.getTorneo_terceristas_2().getGanador(), 0);
//        if (r.nextBoolean()) {
//            partido_terceristas.setGanador(partido_terceristas.getJugadorA());
//        } else {
//            partido_terceristas.setGanador(partido_terceristas.getJugadorB());
//        }
//        System.out.println("\nEnfrentamiento entre los ganadores de mini torneos");
//        System.out.println(partido_terceristas);
//
//        // Ganadores
//        System.out.println("\nGANADORES");
//        System.out.println("1. " + torneo.getGanador());
//        System.out.println("2. " + torneo.getPartidosActuales().get(0).getPerdedor());
//        System.out.println("3.1. " + partido_terceristas.getGanador());
//        System.out.println("3.2. " + partido_terceristas.getPerdedor());

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
            jugadores.add(new Jugador(nombre, "0"));
        }
        return jugadores;
    }
}
