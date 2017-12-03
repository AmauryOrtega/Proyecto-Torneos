package Vista.Registro;

import com.google.gson.Gson;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFileChooser;
import static modelo.CSV.parseLine;
import modelo.Jugador;
import modelo.Torneo;

public class Crear_Torneo_Categoria extends javax.swing.JFrame {

    public Crear_Torneo_Categoria() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JL_Titutlo = new javax.swing.JLabel();
        JL_Cinturon = new javax.swing.JLabel();
        JL_Sexo = new javax.swing.JLabel();
        JL_Peso = new javax.swing.JLabel();
        JL_Deporte = new javax.swing.JLabel();
        JTF_Cinturon = new javax.swing.JTextField();
        JTF_Sexo = new javax.swing.JTextField();
        JTF_Peso = new javax.swing.JTextField();
        JTF_Deporte = new javax.swing.JTextField();
        JB_Guardar = new javax.swing.JButton();
        JL_Edad = new javax.swing.JLabel();
        JTF_Edad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nuevo torneo");
        setResizable(false);

        JL_Titutlo.setFont(new java.awt.Font("Unispace", 0, 36)); // NOI18N
        JL_Titutlo.setText("Nuevo torneo");

        JL_Cinturon.setText("Cinturon");

        JL_Sexo.setText("Sexo");

        JL_Peso.setText("Peso");

        JL_Deporte.setText("Deporte");

        JTF_Cinturon.setText("BLANCO");
        JTF_Cinturon.setToolTipText("");

        JTF_Sexo.setText("M");

        JTF_Peso.setText("80 a 100");

        JTF_Deporte.setText("KATIA");

        JB_Guardar.setText("Guardar y seleccionar archivo excel");
        JB_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_GuardarActionPerformed(evt);
            }
        });

        JL_Edad.setText("Edad");

        JTF_Edad.setText("15 a 20");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JB_Guardar)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JL_Cinturon)
                            .addComponent(JL_Sexo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTF_Sexo)
                            .addComponent(JTF_Cinturon, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JL_Titutlo)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JL_Deporte)
                            .addComponent(JL_Peso)
                            .addComponent(JL_Edad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTF_Edad)
                            .addComponent(JTF_Peso, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(JTF_Deporte))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JL_Titutlo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_Cinturon)
                    .addComponent(JTF_Cinturon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_Sexo)
                    .addComponent(JTF_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_Peso)
                    .addComponent(JTF_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_Deporte)
                    .addComponent(JTF_Deporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_Edad)
                    .addComponent(JTF_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JB_Guardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_GuardarActionPerformed
        JFileChooser fileChooser = new JFileChooser("./Torneos_csv");
        int seleccion = fileChooser.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {
                ArrayList<Jugador> jugadores = new ArrayList<>();
                File archivo = fileChooser.getSelectedFile();
                Scanner scanner = new Scanner(archivo);
                while (scanner.hasNext()) {
                    List<String> line = parseLine(scanner.nextLine());
                    if (!line.get(0).equals("Nombre")) {
                        jugadores.add(new Jugador(
                                line.get(0).toUpperCase(),
                                line.get(1), line.get(2),
                                line.get(3),
                                Float.parseFloat(line.get(4)),
                                Integer.parseInt(line.get(5)),
                                Float.parseFloat(line.get(6)))
                        );
                    }
                }
                scanner.close();
                Torneo torneo = new Torneo(jugadores, this.JTF_Cinturon.getText().toUpperCase(),
                        this.JTF_Sexo.getText().toUpperCase(), this.JTF_Edad.getText().toUpperCase(),
                        this.JTF_Deporte.getText().toUpperCase(), this.JTF_Peso.getText().toUpperCase()
                );
                Gson gson = new Gson();
                String json = gson.toJson(torneo);
                fileChooser = new JFileChooser("./Torneos_json");
                seleccion = fileChooser.showSaveDialog(this);
                if (seleccion == JFileChooser.APPROVE_OPTION) {
                    try (PrintWriter out = new PrintWriter(fileChooser.getCurrentDirectory() + "/" + fileChooser.getSelectedFile().getName() + ".json")) {
                        out.println(json);
                    }
                }
                this.dispose();
            } catch (FileNotFoundException ex) {
                System.out.println("[ERROR] Obteniendo el archivo");
            }
        }
    }//GEN-LAST:event_JB_GuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Guardar;
    private javax.swing.JLabel JL_Cinturon;
    private javax.swing.JLabel JL_Deporte;
    private javax.swing.JLabel JL_Edad;
    private javax.swing.JLabel JL_Peso;
    private javax.swing.JLabel JL_Sexo;
    private javax.swing.JLabel JL_Titutlo;
    private javax.swing.JTextField JTF_Cinturon;
    private javax.swing.JTextField JTF_Deporte;
    private javax.swing.JTextField JTF_Edad;
    private javax.swing.JTextField JTF_Peso;
    private javax.swing.JTextField JTF_Sexo;
    // End of variables declaration//GEN-END:variables
}
