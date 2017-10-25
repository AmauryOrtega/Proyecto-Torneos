/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Registro;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Cristian Arrieta P
 */
public class Registro_Normal extends javax.swing.JFrame {

    /**
     * Creates new form Registro_Normal
     */
    public Registro_Normal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_DatosJugador = new javax.swing.JPanel();
        JP_DatosPersonasles = new javax.swing.JPanel();
        JL_Apellidos = new javax.swing.JLabel();
        JL_Nombres = new javax.swing.JLabel();
        JL_Edad = new javax.swing.JLabel();
        JTF_Nombres = new javax.swing.JTextField();
        JTF_Apellidos = new javax.swing.JTextField();
        JTF_Edad = new javax.swing.JTextField();
        JTF_NumeroIdentificacion = new javax.swing.JTextField();
        JL_Identificacion = new javax.swing.JLabel();
        JL_Cinturon = new javax.swing.JLabel();
        JCB_Identificacion = new javax.swing.JComboBox<>();
        JL_N_Identificacion = new javax.swing.JLabel();
        JCB_Cinturon = new javax.swing.JComboBox<>();
        JL_Sexo = new javax.swing.JLabel();
        JCB_Sexo = new javax.swing.JComboBox<>();
        JL_Peso = new javax.swing.JLabel();
        JTF_Peso = new javax.swing.JTextField();
        JL_Estatura = new javax.swing.JLabel();
        JTF_Estatura = new javax.swing.JTextField();
        JB_LimpiarCampos = new javax.swing.JButton();
        JB_Registrar = new javax.swing.JButton();
        JB_Cancelar = new javax.swing.JButton();
        JP_Foto = new javax.swing.JPanel();
        JL_Foto = new javax.swing.JLabel();
        JB_Cargar_Foto = new javax.swing.JButton();
        JL_Titutlo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 400));
        setResizable(false);

        JP_DatosJugador.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        JP_DatosPersonasles.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Personales"));

        JL_Apellidos.setText("Apellidos");

        JL_Nombres.setText("Nombres");

        JL_Edad.setText("Edad");

        JL_Identificacion.setText("Identificacion");

        JL_Cinturon.setText("Cinturon");

        JCB_Identificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula", "Cedula de Extranjeria", "Tarjeta de Identidad", "Pasaporte" }));

        JL_N_Identificacion.setText("N°");

        JCB_Cinturon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Sin Seleccion --", "Blanco", "Amarillo", "Naranja", "Azul", "Verde", "Violeta", "Marron", "Negro" }));

        JL_Sexo.setText("Sexo");

        JCB_Sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Sin Seleccionar --", "Femenino", "Masculino" }));

        JL_Peso.setText("Peso");

        JL_Estatura.setText("Estatura");

        JB_LimpiarCampos.setText("Limpiar Campos");

        javax.swing.GroupLayout JP_DatosPersonaslesLayout = new javax.swing.GroupLayout(JP_DatosPersonasles);
        JP_DatosPersonasles.setLayout(JP_DatosPersonaslesLayout);
        JP_DatosPersonaslesLayout.setHorizontalGroup(
            JP_DatosPersonaslesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_DatosPersonaslesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(JP_DatosPersonaslesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JL_Estatura)
                    .addComponent(JL_Peso)
                    .addComponent(JL_Sexo)
                    .addComponent(JL_Cinturon)
                    .addComponent(JL_Identificacion)
                    .addComponent(JL_Edad)
                    .addComponent(JL_Nombres)
                    .addComponent(JL_Apellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JP_DatosPersonaslesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTF_Nombres)
                    .addComponent(JTF_Apellidos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JTF_Edad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JTF_Peso)
                    .addGroup(JP_DatosPersonaslesLayout.createSequentialGroup()
                        .addGroup(JP_DatosPersonaslesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JCB_Sexo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JCB_Cinturon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JCB_Identificacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JL_N_Identificacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTF_NumeroIdentificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                    .addComponent(JTF_Estatura))
                .addContainerGap())
            .addGroup(JP_DatosPersonaslesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JB_LimpiarCampos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JP_DatosPersonaslesLayout.setVerticalGroup(
            JP_DatosPersonaslesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_DatosPersonaslesLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(JP_DatosPersonaslesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_Nombres)
                    .addComponent(JTF_Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JP_DatosPersonaslesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_Apellidos)
                    .addComponent(JTF_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JP_DatosPersonaslesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_Edad)
                    .addComponent(JTF_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JP_DatosPersonaslesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JL_Identificacion)
                    .addGroup(JP_DatosPersonaslesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTF_NumeroIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JCB_Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JL_N_Identificacion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JP_DatosPersonaslesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_Cinturon)
                    .addComponent(JCB_Cinturon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JP_DatosPersonaslesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_Sexo)
                    .addComponent(JCB_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JP_DatosPersonaslesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_Peso)
                    .addComponent(JTF_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JP_DatosPersonaslesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_Estatura)
                    .addComponent(JTF_Estatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JB_LimpiarCampos)
                .addContainerGap())
        );

        JB_Registrar.setText("Registrar");

        JB_Cancelar.setText("Cancelar");

        JP_Foto.setBorder(javax.swing.BorderFactory.createTitledBorder("Foto"));

        JL_Foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Registro_Normal/Users-User-icon.png"))); // NOI18N

        JB_Cargar_Foto.setText("Cargar Foto");
        JB_Cargar_Foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_Cargar_FotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JP_FotoLayout = new javax.swing.GroupLayout(JP_Foto);
        JP_Foto.setLayout(JP_FotoLayout);
        JP_FotoLayout.setHorizontalGroup(
            JP_FotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_FotoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JL_Foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_FotoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JB_Cargar_Foto)
                .addGap(85, 85, 85))
        );
        JP_FotoLayout.setVerticalGroup(
            JP_FotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_FotoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JL_Foto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(JB_Cargar_Foto)
                .addContainerGap())
        );

        javax.swing.GroupLayout JP_DatosJugadorLayout = new javax.swing.GroupLayout(JP_DatosJugador);
        JP_DatosJugador.setLayout(JP_DatosJugadorLayout);
        JP_DatosJugadorLayout.setHorizontalGroup(
            JP_DatosJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_DatosJugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_DatosJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP_DatosJugadorLayout.createSequentialGroup()
                        .addComponent(JP_DatosPersonasles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JP_Foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JP_DatosJugadorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JB_Cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JB_Registrar)))
                .addContainerGap())
        );
        JP_DatosJugadorLayout.setVerticalGroup(
            JP_DatosJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_DatosJugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_DatosJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JP_Foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JP_DatosPersonasles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(JP_DatosJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_Registrar)
                    .addComponent(JB_Cancelar))
                .addContainerGap())
        );

        JL_Titutlo.setFont(new java.awt.Font("Unispace", 0, 36)); // NOI18N
        JL_Titutlo.setText("Registro de Jugador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JP_DatosJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JL_Titutlo)
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JL_Titutlo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JP_DatosJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_Cargar_FotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_Cargar_FotoActionPerformed
        // TODO add your handling code here:

//        JFileChooser explorador = new JFileChooser();
//        int estado = explorador.showOpenDialog(null);
//        File archivoelegido = explorador.getSelectedFile();
//        String ruta = archivoelegido.getPath();
//        if (archivoelegido.exists()) {
//            JOptionPane.showMessageDialog(null, "Imagen cargada correctamente.");
//        } else {
//            JOptionPane.showMessageDialog(null, "Imagen no encontrada.");
//        }
//        if (estado == JFileChooser.APPROVE_OPTION) {
//            ImageIcon imagen = new ImageIcon(ruta);
//            JL_Foto.setIcon(imagen);
//        }
    }//GEN-LAST:event_JB_Cargar_FotoActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro_Normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_Normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_Normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_Normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_Normal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Cancelar;
    private javax.swing.JButton JB_Cargar_Foto;
    private javax.swing.JButton JB_LimpiarCampos;
    private javax.swing.JButton JB_Registrar;
    private javax.swing.JComboBox<String> JCB_Cinturon;
    private javax.swing.JComboBox<String> JCB_Identificacion;
    private javax.swing.JComboBox<String> JCB_Sexo;
    private javax.swing.JLabel JL_Apellidos;
    private javax.swing.JLabel JL_Cinturon;
    private javax.swing.JLabel JL_Edad;
    private javax.swing.JLabel JL_Estatura;
    private javax.swing.JLabel JL_Foto;
    private javax.swing.JLabel JL_Identificacion;
    private javax.swing.JLabel JL_N_Identificacion;
    private javax.swing.JLabel JL_Nombres;
    private javax.swing.JLabel JL_Peso;
    private javax.swing.JLabel JL_Sexo;
    private javax.swing.JLabel JL_Titutlo;
    private javax.swing.JPanel JP_DatosJugador;
    private javax.swing.JPanel JP_DatosPersonasles;
    private javax.swing.JPanel JP_Foto;
    private javax.swing.JTextField JTF_Apellidos;
    private javax.swing.JTextField JTF_Edad;
    private javax.swing.JTextField JTF_Estatura;
    private javax.swing.JTextField JTF_Nombres;
    private javax.swing.JTextField JTF_NumeroIdentificacion;
    private javax.swing.JTextField JTF_Peso;
    // End of variables declaration//GEN-END:variables
}
