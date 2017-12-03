package ventanas;

import java.awt.Color;
import java.util.Map;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Ventana extends javax.swing.JFrame {

    public Ventana(Map<Integer, Double> resultado, int N_CORRIDAS) {
        super("Resultados");
        XYSeriesCollection datos = new XYSeriesCollection();
        XYSeries probabilidades = new XYSeries("Probabilidades");
        resultado.entrySet().forEach((Map.Entry<Integer, Double> entrada) -> {
            probabilidades.add(entrada.getKey(), entrada.getValue());
        });
        datos.addSeries(probabilidades);
        JFreeChart grafica = ChartFactory.createScatterPlot("Probabilidad de quedar en top 3",
                "Numero de jugadores", "Probabilidad", datos);
        XYPlot plot = (XYPlot) grafica.getPlot();
        plot.setBackgroundPaint(new Color(255, 228, 196));
        ChartPanel panel = new ChartPanel(grafica);
        setContentPane(panel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
