package com.crear;

import com.buscar.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import com.crear.Registro;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Davewaves
 */
public class Buscar extends javax.swing.JFrame {

    DefaultTableModel mt = new DefaultTableModel();

    private String Titulo;
    private Date FechaSeleccionada;
    private LocalTime horaSeleccionada;
    private String Prioridad;
    private String Estado;
    private String Descripcion;
    
    private String formatDate(Date date) {
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
    return formatter.format(date);
}
    private String formatTime(LocalTime time) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    return time.format(formatter);
}

    private void cargarDatos() {
        ArrayList<Registro> registros = DatosCompartidos.getRegistros();
        for (Registro registro : registros) {
            String fechaFormateada = formatDate(registro.getFechaSeleccionada());
            String horaFormateada = formatTime(registro.getHoraSeleccionada());
            mt.addRow(new Object[]{
                registro.getTitulo(),
                fechaFormateada,
                horaFormateada,
                registro.getEstado(),
                registro.getPrioridad(),
                registro.getDescripcion()
            });
        }
    }

    public Buscar() {
        initComponents();
        String titulosTabla[] = {"Titulo", "Fecha", "Hora", "Estado", "Prioridad", "Descripción"};
        mt.setColumnIdentifiers(titulosTabla);
        JTablaInfo.setModel(mt);
        cargarDatos();
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
        BtnEliminar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTablaInfo = new javax.swing.JTable();
        BtnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 95, 121));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnEliminar.setBackground(new java.awt.Color(255, 153, 51));
        BtnEliminar.setFont(new java.awt.Font("Roboto Black", 1, 9)); // NOI18N
        BtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/Borrar24px.png"))); // NOI18N
        BtnEliminar.setText("ELIMINAR");
        BtnEliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        BtnEliminar.setFocusPainted(false);
        BtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/BorrarSelected24px.png"))); // NOI18N
        BtnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/BorrarSelected24px.png"))); // NOI18N
        BtnEliminar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/BuscarSelected30px.png"))); // NOI18N
        BtnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        BtnSalir.setBackground(new java.awt.Color(255, 51, 51));
        BtnSalir.setFont(new java.awt.Font("Roboto Black", 1, 9)); // NOI18N
        BtnSalir.setForeground(new java.awt.Color(255, 255, 255));
        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/Salir24px.png"))); // NOI18N
        BtnSalir.setText("SALIR");
        BtnSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        BtnSalir.setFocusPainted(false);
        BtnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/SalirSelected24px.png"))); // NOI18N
        BtnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/SalirSelected24px.png"))); // NOI18N
        BtnSalir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/SalirSelected24px.png"))); // NOI18N
        BtnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 50, -1));

        BtnEditar.setBackground(new java.awt.Color(0, 40, 121));
        BtnEditar.setFont(new java.awt.Font("Roboto Black", 1, 9)); // NOI18N
        BtnEditar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/Editar24Px.png"))); // NOI18N
        BtnEditar.setText("EDITAR");
        BtnEditar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        BtnEditar.setFocusPainted(false);
        BtnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEditar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/EditarSelected24Px.png"))); // NOI18N
        BtnEditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/EditarSelected24Px.png"))); // NOI18N
        BtnEditar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/botones/EditarSelected24Px.png"))); // NOI18N
        BtnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 60, -1));

        JTablaInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTablaInfo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 450, 130));

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
        jPanel1.add(BtnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 50, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasActionPerformed
        com.crear.Crear abrir = new com.crear.Crear();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnAtrasActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        
        ArrayList<Registro> registros = DatosCompartidos.getRegistros();
        int filaSel = JTablaInfo.getSelectedRow(); //obtiene indice de fila seleccionada
        
        Registro sel = registros.get(filaSel);//carga el registro segun indice de la fila seleccionada
        
        com.crear.Editar indice = new com.crear.Editar(filaSel); //envia indice para saber que registro editar
        
        System.out.println("buscar" + filaSel);
        com.crear.Editar abrir = new com.crear.Editar(); //abre la pantalla de editar
        
        abrir.llenarCampos(sel); //usa el metodo llenarCampos() de la clase crear llevando el indice
        
        abrir.setVisible(true);
        this.setVisible(false);
       
        
    }//GEN-LAST:event_BtnEditarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // elimina el registro 
        int filaSel = JTablaInfo.getSelectedRow(); //obtiene indice de fila seleccionada
        
        DatosCompartidos.eliminarRegistro(filaSel);//llama funcion para eliminar
        mt.removeRow(filaSel);//elimina la fila de la tabla
    }//GEN-LAST:event_BtnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscar().setVisible(true);
            }
        });
    }

    public void setDatos(String Titulo, Date FechaSeleccionada, LocalTime horaSeleccionada, String Prioridad, String Estado, String Descripcion) {
        this.Titulo = Titulo;
        this.FechaSeleccionada = FechaSeleccionada;
        this.Prioridad = Prioridad;
        this.Estado = Estado;
        this.Descripcion = Descripcion;
        mt.addRow(new Object[]{Titulo, FechaSeleccionada, horaSeleccionada, Estado, Prioridad, Descripcion});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtras;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JTable JTablaInfo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
