/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.NProKata;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.Partido;

/**
 *
 * @author Cristian Arrieta P
 */
public class Kata extends javax.swing.JDialog {

    /**
     * Creates new form Kata
     */
    private Partido partido;
    private int puntosAzul;
    private int puntosRojo;
    private int centisegundo;
    private int minuto;
    private int segundo;
    private Timer timer;
    private DecimalFormat timeFormatter;

    public Kata(java.awt.Frame parent, boolean modal, Partido partido) {
        super(parent, modal);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        initComponents();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

//        JL_Referees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/NProKata/Referees.png"))); // NOI18N
//        JL_BanderaAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/NProKata/bandera_azul.png"))); // NOI18N
//        JL_BanderaRoja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/NProKata/bandera_roja.png"))); // NOI18N
//        JL_MuestraTiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/NProKata/Contador.png"))); // NOI18N
//        JL_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/NProKata/Fondo.jpg"))); // NOI18N

        this.partido = partido;
        this.puntosAzul = 0;
        this.puntosRojo = 0;
        this.minuto = 6;
        this.segundo = 0;
        try {
            JL_NombreAzul.setText(partido.getJugadorA().getNombre_completo());
            JL_NombreRojo.setText(partido.getJugadorB().getNombre_completo());
        } catch (Exception e) {
        }

        timeFormatter = new DecimalFormat("0");

        timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (centisegundo > 0) {
                    centisegundo--;
                } else {
                    if (segundo == 0 && minuto == 0) {
                        timer.stop();
                    } else if (segundo > 0) {
                        segundo--;
                        centisegundo = 99;
                    } else if (minuto > 0) {
                        minuto--;
                        segundo = 59;
                        centisegundo = 99;
                    }
                }
                setTiempo(minuto, segundo);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG_Azul = new javax.swing.ButtonGroup();
        GB_Rojo = new javax.swing.ButtonGroup();
        BG_Referees = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        JL_NumerosPuntosRojo = new javax.swing.JLabel();
        JL_NumerosPuntosAzul = new javax.swing.JLabel();
        JB_Start = new javax.swing.JButton();
        JL_NombreRojo = new javax.swing.JLabel();
        JL_NombreAzul = new javax.swing.JLabel();
        JRB_1Rojo = new javax.swing.JRadioButton();
        JRB_1Azul = new javax.swing.JRadioButton();
        JRB_2Azul = new javax.swing.JRadioButton();
        JRB_3Azul = new javax.swing.JRadioButton();
        JRB_4Azul = new javax.swing.JRadioButton();
        JRB_5Azul = new javax.swing.JRadioButton();
        JRB_2Rojo = new javax.swing.JRadioButton();
        JRB_3Rojo = new javax.swing.JRadioButton();
        JRB_4Rojo = new javax.swing.JRadioButton();
        JRB_5Rojo = new javax.swing.JRadioButton();
        JRB_5Referees = new javax.swing.JRadioButton();
        JRB_3Referees = new javax.swing.JRadioButton();
        JL_BanderaRoja = new javax.swing.JLabel();
        JL_BanderaAzul = new javax.swing.JLabel();
        JL_Referees = new javax.swing.JLabel();
        JL_Tiempo = new javax.swing.JLabel();
        JL_MuestraTiempo = new javax.swing.JLabel();
        JL_Fondo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JB_ResetTime = new javax.swing.JButton();
        JB_ExtraTime = new javax.swing.JButton();
        JTF_MatchTimeMinute = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTF_MatchTimeSeconds = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        JB_ResetMatch = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        JB_Close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(620, 360));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        JL_NumerosPuntosRojo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JL_NumerosPuntosRojo.setText(" 1   2   3   4   5");
        jPanel1.add(JL_NumerosPuntosRojo);
        JL_NumerosPuntosRojo.setBounds(40, 160, 110, 17);

        JL_NumerosPuntosAzul.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JL_NumerosPuntosAzul.setText(" 1   2   3   4   5");
        jPanel1.add(JL_NumerosPuntosAzul);
        JL_NumerosPuntosAzul.setBounds(290, 160, 100, 17);

        JB_Start.setBackground(new java.awt.Color(153, 255, 153));
        JB_Start.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        JB_Start.setText("Start");
        JB_Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_StartActionPerformed(evt);
            }
        });
        jPanel1.add(JB_Start);
        JB_Start.setBounds(170, 170, 80, 40);

        JL_NombreRojo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JL_NombreRojo.setForeground(new java.awt.Color(255, 255, 255));
        JL_NombreRojo.setText("Nombre Aka");
        jPanel1.add(JL_NombreRojo);
        JL_NombreRojo.setBounds(20, 30, 110, 17);

        JL_NombreAzul.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JL_NombreAzul.setForeground(new java.awt.Color(255, 255, 255));
        JL_NombreAzul.setText("Nombre Ao");
        jPanel1.add(JL_NombreAzul);
        JL_NombreAzul.setBounds(300, 30, 100, 17);

        JRB_1Rojo.setBackground(new java.awt.Color(255, 255, 255));
        GB_Rojo.add(JRB_1Rojo);
        JRB_1Rojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRB_1RojoActionPerformed(evt);
            }
        });
        jPanel1.add(JRB_1Rojo);
        JRB_1Rojo.setBounds(40, 180, 20, 21);

        JRB_1Azul.setBackground(new java.awt.Color(255, 255, 255));
        BG_Azul.add(JRB_1Azul);
        JRB_1Azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRB_1AzulActionPerformed(evt);
            }
        });
        jPanel1.add(JRB_1Azul);
        JRB_1Azul.setBounds(290, 180, 20, 21);

        JRB_2Azul.setBackground(new java.awt.Color(255, 255, 255));
        BG_Azul.add(JRB_2Azul);
        JRB_2Azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRB_2AzulActionPerformed(evt);
            }
        });
        jPanel1.add(JRB_2Azul);
        JRB_2Azul.setBounds(310, 180, 20, 21);

        JRB_3Azul.setBackground(new java.awt.Color(255, 255, 255));
        BG_Azul.add(JRB_3Azul);
        JRB_3Azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRB_3AzulActionPerformed(evt);
            }
        });
        jPanel1.add(JRB_3Azul);
        JRB_3Azul.setBounds(330, 180, 20, 21);

        JRB_4Azul.setBackground(new java.awt.Color(255, 255, 255));
        BG_Azul.add(JRB_4Azul);
        JRB_4Azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRB_4AzulActionPerformed(evt);
            }
        });
        jPanel1.add(JRB_4Azul);
        JRB_4Azul.setBounds(350, 180, 20, 21);

        JRB_5Azul.setBackground(new java.awt.Color(255, 255, 255));
        BG_Azul.add(JRB_5Azul);
        JRB_5Azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRB_5AzulActionPerformed(evt);
            }
        });
        jPanel1.add(JRB_5Azul);
        JRB_5Azul.setBounds(370, 180, 20, 21);

        JRB_2Rojo.setBackground(new java.awt.Color(255, 255, 255));
        GB_Rojo.add(JRB_2Rojo);
        JRB_2Rojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRB_2RojoActionPerformed(evt);
            }
        });
        jPanel1.add(JRB_2Rojo);
        JRB_2Rojo.setBounds(60, 180, 20, 21);

        JRB_3Rojo.setBackground(new java.awt.Color(255, 255, 255));
        GB_Rojo.add(JRB_3Rojo);
        JRB_3Rojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRB_3RojoActionPerformed(evt);
            }
        });
        jPanel1.add(JRB_3Rojo);
        JRB_3Rojo.setBounds(80, 180, 20, 21);

        JRB_4Rojo.setBackground(new java.awt.Color(255, 255, 255));
        GB_Rojo.add(JRB_4Rojo);
        JRB_4Rojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRB_4RojoActionPerformed(evt);
            }
        });
        jPanel1.add(JRB_4Rojo);
        JRB_4Rojo.setBounds(100, 180, 21, 21);

        JRB_5Rojo.setBackground(new java.awt.Color(255, 255, 255));
        GB_Rojo.add(JRB_5Rojo);
        JRB_5Rojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRB_5RojoActionPerformed(evt);
            }
        });
        jPanel1.add(JRB_5Rojo);
        JRB_5Rojo.setBounds(120, 180, 20, 21);

        JRB_5Referees.setBackground(new java.awt.Color(255, 255, 255));
        BG_Referees.add(JRB_5Referees);
        JRB_5Referees.setSelected(true);
        JRB_5Referees.setText("5");
        JRB_5Referees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRB_5RefereesActionPerformed(evt);
            }
        });
        jPanel1.add(JRB_5Referees);
        JRB_5Referees.setBounds(240, 30, 40, 23);

        JRB_3Referees.setBackground(new java.awt.Color(255, 255, 255));
        BG_Referees.add(JRB_3Referees);
        JRB_3Referees.setText("3");
        JRB_3Referees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRB_3RefereesActionPerformed(evt);
            }
        });
        jPanel1.add(JRB_3Referees);
        JRB_3Referees.setBounds(209, 30, 40, 23);
        jPanel1.add(JL_BanderaRoja);
        JL_BanderaRoja.setBounds(20, 60, 0, 153);
        jPanel1.add(JL_BanderaAzul);
        JL_BanderaAzul.setBounds(270, 60, 140, 150);
        jPanel1.add(JL_Referees);
        JL_Referees.setBounds(140, 20, 150, 40);

        JL_Tiempo.setFont(new java.awt.Font("Unispace", 0, 48)); // NOI18N
        JL_Tiempo.setText("6:00");
        jPanel1.add(JL_Tiempo);
        JL_Tiempo.setBounds(160, 220, 120, 60);
        jPanel1.add(JL_MuestraTiempo);
        JL_MuestraTiempo.setBounds(150, 210, 130, 80);
        jPanel1.add(JL_Fondo);
        JL_Fondo.setBounds(10, 11, 400, 0);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 420, 300);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Time"));

        jLabel1.setText("Match Time");

        JB_ResetTime.setText("Reset Time");
        JB_ResetTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ResetTimeActionPerformed(evt);
            }
        });

        JB_ExtraTime.setText("Extra Time");
        JB_ExtraTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ExtraTimeActionPerformed(evt);
            }
        });

        jLabel2.setText(":");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTF_MatchTimeMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTF_MatchTimeSeconds, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addComponent(JB_ResetTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JB_ExtraTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(JB_ResetTime, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTF_MatchTimeMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(JTF_MatchTimeSeconds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JB_ExtraTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(440, 10, 150, 140);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JB_ResetMatch.setText("Reset Match");
        JB_ResetMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ResetMatchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JB_ResetMatch, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JB_ResetMatch, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(440, 180, 150, 60);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JB_Close.setText("Close");
        JB_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_CloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JB_Close, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JB_Close, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(440, 250, 150, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_ResetTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ResetTimeActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        minuto = Integer.parseInt(JTF_MatchTimeMinute.getText());
        segundo = Integer.parseInt(JTF_MatchTimeSeconds.getText());
        setTiempo(minuto, segundo);
        this.timer.stop();

    }//GEN-LAST:event_JB_ResetTimeActionPerformed

    private void JB_ExtraTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ExtraTimeActionPerformed
        // TODO add your handling code here:
        setTiempo(1, 0);
        this.timer.stop();
    }//GEN-LAST:event_JB_ExtraTimeActionPerformed

    private void JB_ResetMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ResetMatchActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Kata kata = new Kata((Frame) this.getParent(), true, this.partido);
        kata.setVisible(true);
    }//GEN-LAST:event_JB_ResetMatchActionPerformed

    private void JB_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_CloseActionPerformed
        // TODO add your handling code here:
        
        
        this.dispose();
    }//GEN-LAST:event_JB_CloseActionPerformed

    private void JB_StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_StartActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (JB_Start.getText().equalsIgnoreCase("start")) {

            this.timer.start();
            JB_Start.setText("Stop");
        } else {
            this.timer.stop();
            JB_Start.setText("Start");
        }
    }//GEN-LAST:event_JB_StartActionPerformed

    private void JRB_3RefereesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRB_3RefereesActionPerformed
        // TODO add your handling code here:
        JRB_4Azul.setEnabled(false);
        JRB_5Azul.setEnabled(false);
        JRB_4Rojo.setEnabled(false);
        JRB_5Rojo.setEnabled(false);

    }//GEN-LAST:event_JRB_3RefereesActionPerformed

    private void JRB_5RefereesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRB_5RefereesActionPerformed
        // TODO add your handling code here:
        JRB_4Azul.setEnabled(true);
        JRB_5Azul.setEnabled(true);
        JRB_4Rojo.setEnabled(true);
        JRB_5Rojo.setEnabled(true);
    }//GEN-LAST:event_JRB_5RefereesActionPerformed

    private void JRB_1RojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRB_1RojoActionPerformed
        // TODO add your handling code here:
        setDisabledAll();
        JRB_4Azul.setSelected(true);
    }//GEN-LAST:event_JRB_1RojoActionPerformed

    private void JRB_2RojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRB_2RojoActionPerformed
        // TODO add your handling code here:
        setDisabledAll();
        JRB_3Azul.setSelected(true);
    }//GEN-LAST:event_JRB_2RojoActionPerformed

    private void JRB_3RojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRB_3RojoActionPerformed
        // TODO add your handling code here:
        setDisabledAll();
        JRB_2Azul.setSelected(true);
    }//GEN-LAST:event_JRB_3RojoActionPerformed

    private void JRB_4RojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRB_4RojoActionPerformed
        // TODO add your handling code here:
        setDisabledAll();
        JRB_1Azul.setSelected(true);
    }//GEN-LAST:event_JRB_4RojoActionPerformed

    private void JRB_5RojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRB_5RojoActionPerformed
        // TODO add your handling code here:
        setDisabledAll();
    }//GEN-LAST:event_JRB_5RojoActionPerformed

    private void JRB_1AzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRB_1AzulActionPerformed
        // TODO add your handling code here:
        setDisabledAll();
        JRB_4Rojo.setSelected(true);
    }//GEN-LAST:event_JRB_1AzulActionPerformed

    private void JRB_2AzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRB_2AzulActionPerformed
        // TODO add your handling code here:
        setDisabledAll();
        JRB_3Rojo.setSelected(true);
    }//GEN-LAST:event_JRB_2AzulActionPerformed

    private void JRB_3AzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRB_3AzulActionPerformed
        // TODO add your handling code here:
        setDisabledAll();
        JRB_2Rojo.setSelected(true);
    }//GEN-LAST:event_JRB_3AzulActionPerformed

    private void JRB_4AzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRB_4AzulActionPerformed
        // TODO add your handling code here:
        setDisabledAll();
        JRB_1Rojo.setSelected(true);
    }//GEN-LAST:event_JRB_4AzulActionPerformed

    private void JRB_5AzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRB_5AzulActionPerformed
        // TODO add your handling code here:
        setDisabledAll();
        JRB_4Rojo.setSelected(true);
    }//GEN-LAST:event_JRB_5AzulActionPerformed

    public void setDisabledAll(){
        JRB_1Azul.setSelected(false);
        JRB_2Azul.setSelected(false);
        JRB_3Azul.setSelected(false);
        JRB_4Azul.setSelected(false);
        JRB_5Azul.setSelected(false);
        
        JRB_1Rojo.setSelected(false);
        JRB_2Rojo.setSelected(false);
        JRB_3Rojo.setSelected(false);
        JRB_4Rojo.setSelected(false);
        JRB_5Rojo.setSelected(false);
        
    }
    public void setTiempo(int minuto, int segundo) {
        JL_Tiempo.setText(timeFormatter.format(minuto) + ":"
                + timeFormatter.format(segundo));
        this.minuto = minuto;
        this.segundo = segundo;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
                new Kata(null, true, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BG_Azul;
    private javax.swing.ButtonGroup BG_Referees;
    private javax.swing.ButtonGroup GB_Rojo;
    private javax.swing.JButton JB_Close;
    private javax.swing.JButton JB_ExtraTime;
    private javax.swing.JButton JB_ResetMatch;
    private javax.swing.JButton JB_ResetTime;
    private javax.swing.JButton JB_Start;
    private javax.swing.JLabel JL_BanderaAzul;
    private javax.swing.JLabel JL_BanderaRoja;
    private javax.swing.JLabel JL_Fondo;
    private javax.swing.JLabel JL_MuestraTiempo;
    private javax.swing.JLabel JL_NombreAzul;
    private javax.swing.JLabel JL_NombreRojo;
    private javax.swing.JLabel JL_NumerosPuntosAzul;
    private javax.swing.JLabel JL_NumerosPuntosRojo;
    private javax.swing.JLabel JL_Referees;
    private javax.swing.JLabel JL_Tiempo;
    private javax.swing.JRadioButton JRB_1Azul;
    private javax.swing.JRadioButton JRB_1Rojo;
    private javax.swing.JRadioButton JRB_2Azul;
    private javax.swing.JRadioButton JRB_2Rojo;
    private javax.swing.JRadioButton JRB_3Azul;
    private javax.swing.JRadioButton JRB_3Referees;
    private javax.swing.JRadioButton JRB_3Rojo;
    private javax.swing.JRadioButton JRB_4Azul;
    private javax.swing.JRadioButton JRB_4Rojo;
    private javax.swing.JRadioButton JRB_5Azul;
    private javax.swing.JRadioButton JRB_5Referees;
    private javax.swing.JRadioButton JRB_5Rojo;
    private javax.swing.JTextField JTF_MatchTimeMinute;
    private javax.swing.JTextField JTF_MatchTimeSeconds;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
