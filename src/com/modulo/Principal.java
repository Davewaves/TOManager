/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.modulo;

/**
 *
 * @author Davewaves
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Modulo
     */
    public Principal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnCerrarSesion = new javax.swing.JButton();
        BtnCrear = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 85, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bienvenido al Menú Incial, por favor seleccione una opción:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 350, 20));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MENU DE INICIO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 140, 40));

        BtnCerrarSesion.setBackground(new java.awt.Color(255, 51, 51));
        BtnCerrarSesion.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        BtnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        BtnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/Cerrar30px.png"))); // NOI18N
        BtnCerrarSesion.setText("CERRAR SESION");
        BtnCerrarSesion.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        BtnCerrarSesion.setFocusPainted(false);
        BtnCerrarSesion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/CerrarSelectex30px.png"))); // NOI18N
        BtnCerrarSesion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/CerrarSelectex30px.png"))); // NOI18N
        BtnCerrarSesion.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/CerrarSelectex30px.png"))); // NOI18N
        BtnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 340, 50));

        BtnCrear.setBackground(new java.awt.Color(0, 204, 51));
        BtnCrear.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        BtnCrear.setForeground(new java.awt.Color(255, 255, 255));
        BtnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/Nuevo30px.png"))); // NOI18N
        BtnCrear.setText("CREAR O EDITAR TAREA");
        BtnCrear.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        BtnCrear.setFocusPainted(false);
        BtnCrear.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/Nuevo_Selected30px.png"))); // NOI18N
        BtnCrear.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/Nuevo_Selected30px.png"))); // NOI18N
        BtnCrear.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/Nuevo_Selected30px.png"))); // NOI18N
        BtnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 340, 50));

        BtnBuscar.setBackground(new java.awt.Color(0, 51, 153));
        BtnBuscar.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        BtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/Buscar30px.png"))); // NOI18N
        BtnBuscar.setText("BUSCAR UNA TAREA");
        BtnBuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        BtnBuscar.setFocusPainted(false);
        BtnBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/BuscarSelected30px.png"))); // NOI18N
        BtnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/BuscarSelected30px.png"))); // NOI18N
        BtnBuscar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/BuscarSelected30px.png"))); // NOI18N
        jPanel1.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 340, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearActionPerformed
        com.crear.Crear abrir = new com.crear.Crear();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnCrearActionPerformed

    private void BtnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarSesionActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_BtnCerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCerrarSesion;
    private javax.swing.JButton BtnCrear;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
