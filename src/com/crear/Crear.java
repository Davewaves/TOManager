package com.crear;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Davewaves
 */
public class Crear extends javax.swing.JFrame {
    
    private Registro registro;

    /**
     * Creates new form Crear
     */
    public Crear() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtTitulo = new javax.swing.JTextField();
        TxtDescripcion = new javax.swing.JTextField();
        jComboBoxPrioridad = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BtnGuardar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        BtnNuevo = new javax.swing.JButton();
        BtnAtras = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        BtnVerRegistros = new javax.swing.JButton();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxMinutos = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxHora = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 117, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CREAR  TAREAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 140, 33));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel4.setText("TITULO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        TxtTitulo.setText("Ingrese el titulo");
        TxtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTituloActionPerformed(evt);
            }
        });
        jPanel1.add(TxtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 200, 30));

        TxtDescripcion.setText("Ingrese la descripción");
        TxtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(TxtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 330, 90));

        jComboBoxPrioridad.setEditable(true);
        jComboBoxPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baja", "Media", "Alta" }));
        jPanel1.add(jComboBoxPrioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 152, 80, 30));

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel8.setText("DESCRIPCIÓN:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 3));

        BtnGuardar.setBackground(new java.awt.Color(0, 156, 39));
        BtnGuardar.setFont(new java.awt.Font("Roboto Black", 1, 9)); // NOI18N
        BtnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/Guardar24px.png"))); // NOI18N
        BtnGuardar.setText("GUARDAR");
        BtnGuardar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        BtnGuardar.setFocusPainted(false);
        BtnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/GuardarSelected24px.png"))); // NOI18N
        BtnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/GuardarSelected24px.png"))); // NOI18N
        BtnGuardar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/GuardarSelected24px.png"))); // NOI18N
        BtnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnNuevo.setBackground(new java.awt.Color(0, 40, 121));
        BtnNuevo.setFont(new java.awt.Font("Roboto Black", 1, 9)); // NOI18N
        BtnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        BtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/Editar24Px.png"))); // NOI18N
        BtnNuevo.setText("NUEVO");
        BtnNuevo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        BtnNuevo.setFocusPainted(false);
        BtnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnNuevo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/EditarSelected24Px.png"))); // NOI18N
        BtnNuevo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/EditarSelected24Px.png"))); // NOI18N
        BtnNuevo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/EditarSelected24Px.png"))); // NOI18N
        BtnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });

        BtnAtras.setBackground(new java.awt.Color(255, 51, 51));
        BtnAtras.setFont(new java.awt.Font("Roboto Black", 1, 9)); // NOI18N
        BtnAtras.setForeground(new java.awt.Color(255, 255, 255));
        BtnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/Atras24px.png"))); // NOI18N
        BtnAtras.setText("ATRAS");
        BtnAtras.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        BtnAtras.setFocusPainted(false);
        BtnAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnAtras.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/AtrasSelected24px (1).png"))); // NOI18N
        BtnAtras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/AtrasSelected24px (1).png"))); // NOI18N
        BtnAtras.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/AtrasSelected24px (1).png"))); // NOI18N
        BtnAtras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasActionPerformed(evt);
            }
        });

        BtnVerRegistros.setBackground(new java.awt.Color(255, 167, 79));
        BtnVerRegistros.setFont(new java.awt.Font("Roboto Black", 1, 9)); // NOI18N
        BtnVerRegistros.setForeground(new java.awt.Color(255, 255, 255));
        BtnVerRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/Buscar30px.png"))); // NOI18N
        BtnVerRegistros.setText("BUSCAR");
        BtnVerRegistros.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        BtnVerRegistros.setFocusPainted(false);
        BtnVerRegistros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnVerRegistros.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/BuscarSelected30px.png"))); // NOI18N
        BtnVerRegistros.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/BuscarSelected30px.png"))); // NOI18N
        BtnVerRegistros.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/BuscarSelected30px.png"))); // NOI18N
        BtnVerRegistros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnVerRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerRegistrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BtnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BtnVerRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(BtnAtras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnVerRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 70, 320));
        jPanel1.add(jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 120, 30));

        jLabel9.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("MINUTO:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 50, 20));

        jLabel10.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel10.setText("PRIORIDAD:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 80, 20));

        jComboBoxMinutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jPanel1.add(jComboBoxMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 50, -1));

        jLabel12.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel12.setText("EL HORARIO:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 20));

        jComboBoxHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));
        jPanel1.add(jComboBoxHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 50, -1));

        jLabel14.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("HORA:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 20));

        jLabel15.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel15.setText("FECHA:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, 20));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" :");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 10, 20));

        jLabel11.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel11.setText("ESTADO:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 60, 20));

        jComboBoxEstado.setEditable(true);
        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "Realizado" }));
        jPanel1.add(jComboBoxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTituloActionPerformed

    private void TxtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDescripcionActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed

        
        LocalTime horaSeleccionada;
        String Titulo = TxtTitulo.getText();
        Date FechaSeleccionada = jDateChooser.getDate();

        // Obtener la hora y los minutos seleccionados
        int hora = Integer.parseInt((String) jComboBoxHora.getSelectedItem());
        int minuto = Integer.parseInt((String) jComboBoxMinutos.getSelectedItem());

        // Validar que la fecha no sea nula
        if (FechaSeleccionada == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una fecha válida.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Convertir FechaSeleccionada y horaSeleccionada a LocalDateTime para la validación
        LocalDateTime fechaHoraSeleccionada = LocalDateTime.ofInstant(FechaSeleccionada.toInstant(), ZoneId.systemDefault()).withHour(hora).withMinute(minuto);
        LocalDateTime fechaHoraActual = LocalDateTime.now();

        // Validar que la fecha y hora seleccionadas sean posteriores a la fecha y hora actuales
        if (fechaHoraSeleccionada.isBefore(fechaHoraActual)) {
            JOptionPane.showMessageDialog(this, "La fecha y hora seleccionadas deben ser posteriores a la fecha y hora actuales.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Combinar hora y minutos en una variable LocalTime
        horaSeleccionada = LocalTime.of(hora, minuto);

        // Obtener datos de los otros campos
        String Prioridad = (String) jComboBoxPrioridad.getSelectedItem();
        String Estado = (String) jComboBoxEstado.getSelectedItem();
        String Descripcion = TxtDescripcion.getText();

        //Instancia del JFRAME a buscar
        Buscar mBuscar = new Buscar();

        //Pasar datos obtenidos al método setDatos
        mBuscar.setDatos(Titulo, FechaSeleccionada, horaSeleccionada, Prioridad, Estado, Descripcion);

        // Hcaer visible el JFRAME
        mBuscar.setVisible(true);

        ArrayList<Registro> registros = DatosCompartidos.getRegistros();
        Registro registro = new Registro(Titulo, FechaSeleccionada, horaSeleccionada, Prioridad, Estado, Descripcion);
        DatosCompartidos.agregarRegistro(registro);

        
        
    }//GEN-LAST:event_BtnGuardarActionPerformed

    
    
    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed

        //Limpiar los modulos
        TxtTitulo.setText("");
        jDateChooser.setDate(null);
        jComboBoxHora.removeAllItems();
        jComboBoxMinutos.removeAllItems();
        jComboBoxPrioridad.removeAllItems();
        jComboBoxEstado.removeAllItems();
        TxtDescripcion.setText("");

        // Volver a agregar las opciones necesarias en los JComboBox
        agregarOpcionesComboBoxHora(); // Método para agregar opciones al JComboBox de horas
        agregarOpcionesComboBoxMinutos(); // Método para agregar opciones al JComboBox de minutos
        agregarOpcionesComboBoxPrioridad(); // Método para agregar opciones al JComboBox de prioridad
        agregarOpcionesComboBoxEstado(); // Método para agregar opciones al JComboBox de estado

    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void BtnVerRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerRegistrosActionPerformed
        com.crear.Buscar abrir = new com.crear.Buscar();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnVerRegistrosActionPerformed

    private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasActionPerformed
        com.modulo.Principal abrir = new com.modulo.Principal();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnAtrasActionPerformed

    private void agregarOpcionesComboBoxHora() {
        // Agregar las opciones de horas al JComboBox
        for (int i = 1; i <= 24; i++) {
            jComboBoxHora.addItem(String.format("%02d", i)); // Asegura que los números tengan dos dígitos
        }
    }

    // Método para agregar opciones al JComboBox de minutos
    private void agregarOpcionesComboBoxMinutos() {
        // Agregar las opciones de minutos al JComboBox
        for (int i = 0; i < 60; i++) {
            jComboBoxMinutos.addItem(String.format("%02d", i)); // Asegura que los números tengan dos dígitos
        }
    }

// Método para agregar opciones al JComboBox de prioridad
    private void agregarOpcionesComboBoxPrioridad() {
        // Agregar las opciones de prioridad al JComboBox
        jComboBoxPrioridad.addItem("Baja");
        jComboBoxPrioridad.addItem("Media");
        jComboBoxPrioridad.addItem("Alta");
    }

// Método para agregar opciones al JComboBox de estado
    private void agregarOpcionesComboBoxEstado() {
        // Agregar las opciones de estado al JComboBox
        jComboBoxEstado.addItem("Pendiente");
        jComboBoxEstado.addItem("Realizado");
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Crear().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtras;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JButton BtnVerRegistros;
    private javax.swing.JTextField TxtDescripcion;
    private javax.swing.JTextField TxtTitulo;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JComboBox<String> jComboBoxHora;
    private javax.swing.JComboBox<String> jComboBoxMinutos;
    private javax.swing.JComboBox<String> jComboBoxPrioridad;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables

    private String formatDate(Date fechaSeleccionada) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String formatTime(LocalTime horaSeleccionada) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
