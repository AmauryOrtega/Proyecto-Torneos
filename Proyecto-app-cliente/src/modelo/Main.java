package modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import vista.Principal;

public class Main {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        Principal ventana = new Principal();
        ventana.setVisible(true);

//        // Torneo principal
//        Torneo torneo = new Torneo(persistencia(), "", "", "", "");
//        System.out.println("\nJugadores [" + torneo.getJugadores_bak().size() + "]");
//        System.out.println(torneo.getJugadores_bak());
//
//        System.out.println("\nExtras [" + torneo.getExtras().size() + "]");
//        System.out.println(torneo.getExtras());
//
//        System.out.println("\nSimulando partidos");
//        for (Partido partido : torneo.getPartidosActuales()) {
//            Random r = new Random();
//            if (r.nextBoolean()) {
//                partido.setGanador(partido.getJugadorA());
//            } else {
//                partido.setGanador(partido.getJugadorB());
//            }
//        }
//
//        System.out.println("\nJugaron");
//        torneo.getPartidosActuales().forEach(System.out::println);
//
//        do {
//            System.out.println("\nGenerando y simulando siguientes rondas");
//            torneo.siguienteRonda();
//            for (Partido partido : torneo.getPartidosActuales()) {
//                Random r = new Random();
//                if (r.nextBoolean()) {
//                    partido.setGanador(partido.getJugadorA());
//                } else {
//                    partido.setGanador(partido.getJugadorB());
//                }
//            }
//            torneo.getPartidosActuales().forEach(System.out::println);
//        } while (torneo.getGanador() == null);
//
//        System.out.println("\nGanador");
//        System.out.println(torneo.getGanador());
//        // Fin torneo principal
//
//        // Torneo terceristas
//        System.out.println("\nTerceristas [" + torneo.getTerceristas().size() + "]");
//        System.out.println(torneo.getTerceristas());
//        torneo.iniciarMiniTorneo();
//
//        System.out.println("\nTerceristas Extras [" + torneo.getMini_torneo_tercerista().getExtras_bak().size() + "]");
//        System.out.println(torneo.getMini_torneo_tercerista().getExtras_bak());
//
//        System.out.println("\nSimulando partidos de terceristas");
//        for (Partido partido : torneo.getMini_torneo_tercerista().getPartidosActuales()) {
//            Random r = new Random();
//            if (r.nextBoolean()) {
//                partido.setGanador(partido.getJugadorA());
//            } else {
//                partido.setGanador(partido.getJugadorB());
//            }
//        }
//
//        System.out.println("\nJugaron");
//        torneo.getMini_torneo_tercerista().getPartidosActuales().forEach(System.out::println);
//
//        do {
//            System.out.println("\nGenerando y simulando siguientes rondas");
//            torneo.getMini_torneo_tercerista().siguienteRonda();
//            for (Partido partido : torneo.getMini_torneo_tercerista().getPartidosActuales()) {
//                Random r = new Random();
//                if (r.nextBoolean()) {
//                    partido.setGanador(partido.getJugadorA());
//                } else {
//                    partido.setGanador(partido.getJugadorB());
//                }
//            }
//            torneo.getMini_torneo_tercerista().getPartidosActuales().forEach(System.out::println);
//        } while (torneo.getMini_torneo_tercerista().getGanador() == null);
//
//        System.out.println("\nGanador Terceristas");
//        System.out.println(torneo.getMini_torneo_tercerista().getGanador());
//        // Fin Torneo terceristas
//
//        // Final
//        System.out.println("\nGANADORES");
//        ArrayList<Jugador> ganadores = torneo.getGanadores();
//        for (int i = 0; i < 3; i++) {
//            System.out.println((i + 1) + ". " + ganadores.get(i));
//        }
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
