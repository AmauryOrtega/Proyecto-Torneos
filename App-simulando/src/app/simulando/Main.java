package app.simulando;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import modelo.Jugador;
import modelo.Partido;
import modelo.Torneo;
import org.ajbrown.namemachine.Gender;
import org.ajbrown.namemachine.NameGenerator;
import ventanas.Ventana;

public class Main {

    static Random r = new Random();
    static NameGenerator generador = new NameGenerator();

    public static void main(String[] args) {
        int N_JUGADORES_MAX = 20;
        int N_CORRIDAS = 10;
        if (JOptionPane.showConfirmDialog(null, "Valores predeterminados\nNumero de jugadores max: "
                + N_JUGADORES_MAX + "\nNumero de torneos: " + N_CORRIDAS
                + "\nDesea cambiar estos valores?", "Mensaje", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                N_JUGADORES_MAX = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de jugadores max"));
                N_CORRIDAS = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de torneos"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "No se pudo entender los valores ingresado. Se usarán los predeterminados", "ERROR", JOptionPane.ERROR_MESSAGE);
                N_JUGADORES_MAX = 20;
                N_CORRIDAS = 10;
                JOptionPane.showMessageDialog(null, "Valores predeterminados\nNumero de jugadores max: "
                        + N_JUGADORES_MAX + "\nNumero de torneos: " + N_CORRIDAS
                        + "\nDesea cambiar estos valores?", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        // Simulacion
        Map<Integer, Double> resultado = new HashMap<>();
        for (int N_JUGADORES = 8; N_JUGADORES <= N_JUGADORES_MAX; N_JUGADORES++) {
            resultado.put(N_JUGADORES, simular(N_JUGADORES, N_CORRIDAS));
        }
        
        // Resultados en consola
        resultado.entrySet().forEach((Map.Entry<Integer, Double> entrada) -> {
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        });
        
        // Resultados en ventana
        Ventana ventana = new Ventana(resultado, N_CORRIDAS);
        ventana.setSize(800, 400);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);

    }

    public static double simular(int N_JUGADORES, int N_CORRIDAS) {
        // Lista de jugadores constantes
        ArrayList<Jugador> jugadores = new ArrayList<>();
        for (int i = 0; i < N_JUGADORES; i++) {
            jugadores.add(
                    new Jugador(
                            generador.generateName(Gender.MALE).toString(),
                            Double.toString(r.nextDouble()).substring(2, 12),
                            "VERDE",
                            "M",
                            r.nextInt(90 - 60) + 60,
                            r.nextInt(20 - 15) + 15,
                            r.nextInt(190 - 160) + 160
                    )
            );
        }

        // Cuantas veces un jugador ha llegado al top 3
        Map<Jugador, Float> conteo = new HashMap<>();

        for (int corrida = 0; corrida < N_CORRIDAS; corrida++) {
            // Creando torneo principal
            Torneo torneo = new Torneo((ArrayList<Jugador>) jugadores.clone(), "VERDE", "M", "15-20", "KUMITE", "60-90");
            System.out.println("\nJugadores [" + torneo.getJugadores_bak().size() + "]");
            torneo.getJugadores_bak().forEach(System.out::println);
            System.out.println("\nExtras [" + torneo.getExtras_bak().size() + "]");
            torneo.getExtras_bak().forEach(System.out::println);

            // Jugando partidos del torneo principal
            do {
                System.out.println("\nRONDA " + torneo.getRonda());
                torneo.getPartidosActuales().forEach((partido) -> {
                    if (r.nextBoolean()) {
                        partido.setGanador(partido.getJugadorA());
                    } else {
                        partido.setGanador(partido.getJugadorB());
                    }
                });
                torneo.getPartidosActuales().forEach(System.out::println);
                torneo.siguienteRonda();
            } while (torneo.getGanador() == null);

            // Torneos terceristas
            System.out.println("\n" + torneo.getTerceristas1().size() + " jugadores perdieron contra " + torneo.getGanador().toStringCorto());
            torneo.getTerceristas1().forEach(System.out::println);
            System.out.println("\n" + torneo.getTerceristas1().size() + " jugadores perdieron contra " + torneo.getPartidosActuales().get(0).getPerdedor().toStringCorto());
            torneo.getTerceristas2().forEach(System.out::println);

            // 1° Torneo tercerista
            System.out.println("\n1° Torneo terceristas [" + torneo.getTerceristas1().size() + "]");
            torneo.iniciarMiniTorneo1();
            System.out.println("\nJugadores [" + torneo.getTorneo_terceristas_1().getJugadores_bak().size() + "]");
            torneo.getTorneo_terceristas_1().getJugadores_bak().forEach(System.out::println);
            System.out.println("\nTerceristas Extras [" + torneo.getTorneo_terceristas_1().getExtras_bak().size() + "]");
            torneo.getTorneo_terceristas_1().getExtras_bak().forEach(System.out::println);

            // Jugando partidos del 1° torneo terceristas
            do {
                System.out.println("\nRONDA " + torneo.getTorneo_terceristas_1().getRonda());
                torneo.getTorneo_terceristas_1().getPartidosActuales().forEach((partido) -> {
                    if (r.nextBoolean()) {
                        partido.setGanador(partido.getJugadorA());
                    } else {
                        partido.setGanador(partido.getJugadorB());
                    }
                });
                torneo.getTorneo_terceristas_1().getPartidosActuales().forEach(System.out::println);
                torneo.getTorneo_terceristas_1().siguienteRonda();
            } while (torneo.getTorneo_terceristas_1().getGanador() == null);

            // 2° Torneo tercerista
            System.out.println("\n2° Torneo terceristas [" + torneo.getTerceristas2().size() + "]");
            torneo.iniciarMiniTorneo2();
            System.out.println("\nJugadores [" + torneo.getTorneo_terceristas_2().getJugadores_bak().size() + "]");
            torneo.getTorneo_terceristas_2().getJugadores_bak().forEach(System.out::println);
            System.out.println("\nTerceristas Extras [" + torneo.getTorneo_terceristas_2().getExtras_bak().size() + "]");
            torneo.getTorneo_terceristas_2().getExtras_bak().forEach(System.out::println);

            // Jugando partidos del 2° torneo terceristas
            do {
                System.out.println("\nRONDA " + torneo.getTorneo_terceristas_2().getRonda());
                torneo.getTorneo_terceristas_2().getPartidosActuales().forEach((partido) -> {
                    if (r.nextBoolean()) {
                        partido.setGanador(partido.getJugadorA());
                    } else {
                        partido.setGanador(partido.getJugadorB());
                    }
                });
                torneo.getTorneo_terceristas_2().getPartidosActuales().forEach(System.out::println);
                torneo.getTorneo_terceristas_2().siguienteRonda();
            } while (torneo.getTorneo_terceristas_2().getGanador() == null);

            // Definiendo el mejor tercerista
            Partido partido_terceristas = new Partido(torneo.getTorneo_terceristas_1().getGanador(), torneo.getTorneo_terceristas_2().getGanador(), 0);
            if (r.nextBoolean()) {
                partido_terceristas.setGanador(partido_terceristas.getJugadorA());
            } else {
                partido_terceristas.setGanador(partido_terceristas.getJugadorB());
            }
            System.out.println("\nEnfrentamiento entre los ganadores de mini torneos");
            System.out.println(partido_terceristas);

            // Ganadores
            System.out.println("\nGANADORES");
            System.out.println("1. " + torneo.getGanador());
            System.out.println("2. " + torneo.getPartidosActuales().get(0).getPerdedor());
            System.out.println("3.1. " + partido_terceristas.getGanador());
            System.out.println("3.2. " + partido_terceristas.getPerdedor());

            // Conteo
            ArrayList<Jugador> ganadores = new ArrayList<>();
            ganadores.add(torneo.getGanador());
            ganadores.add(torneo.getPartidosActuales().get(0).getPerdedor());
            ganadores.add(partido_terceristas.getGanador());
            ganadores.add(partido_terceristas.getPerdedor());
            ganadores.forEach((jugador) -> {
                if (conteo.containsKey(jugador)) {
                    conteo.put(jugador, conteo.get(jugador) + 1);
                } else {
                    conteo.put(jugador, Float.parseFloat("1"));
                }
            });
        }
        // Resultados
        System.out.println("\n" + String.format("%-40s= %s", "Jugador", "Cuantas veces quedó en el top 3"));
        double probabilidad_promedio = 0.0;
        for (Map.Entry entrada : conteo.entrySet()) {
            probabilidad_promedio += (Float) entrada.getValue() / (N_CORRIDAS * conteo.size());
            System.out.println(String.format("%-40s= %s", ((Jugador) entrada.getKey()).toStringCorto(), (Float) entrada.getValue()));
        }
        System.out.println("\nLuego de " + N_CORRIDAS + " torneos usando los mismos "
                + N_JUGADORES + " jugadores, la probabilidad promedio de que un jugador en particular llege al top 3 es de "
                + probabilidad_promedio * 100 + "%\nPD: Suponiendo que la probabilidad de ganar un partido en particular es de 50%");
        return probabilidad_promedio;
    }

}
