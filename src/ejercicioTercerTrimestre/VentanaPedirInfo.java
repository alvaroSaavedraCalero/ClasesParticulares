/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioTercerTrimestre;

import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Álvaro Saavedra Calero
 */
public class VentanaPedirInfo extends javax.swing.JFrame {

    private Persona persona;

    /**
     * Creates new form VentanaPedirInfo
     */
    public VentanaPedirInfo() {
        initComponents();
        this.persona = new Persona();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labeInicio = new javax.swing.JLabel();
        botonSolicitarId = new javax.swing.JButton();
        botonSolicitarNombre = new javax.swing.JButton();
        botonSolicitarEdad = new javax.swing.JButton();
        botonMostrarInfo = new javax.swing.JButton();
        labelMuestratexto = new javax.swing.JLabel();
        botonMostarPersonasGuardas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labeInicio.setText("Solicitacion de informacion Persona");

        botonSolicitarId.setText("Solicitar id");
        botonSolicitarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSolicitarIdActionPerformed(evt);
            }
        });

        botonSolicitarNombre.setText("Solicitar nombre");
        botonSolicitarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSolicitarNombreActionPerformed(evt);
            }
        });

        botonSolicitarEdad.setText("Solicitar edad");
        botonSolicitarEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSolicitarEdadActionPerformed(evt);
            }
        });

        botonMostrarInfo.setText("Mostrar Info");
        botonMostrarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarInfoActionPerformed(evt);
            }
        });

        botonMostarPersonasGuardas.setText("Mostrar Personas Guardadas");
        botonMostarPersonasGuardas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostarPersonasGuardasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSolicitarId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(botonSolicitarNombre)
                .addGap(46, 46, 46)
                .addComponent(botonSolicitarEdad)
                .addGap(149, 149, 149))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(labeInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(botonMostrarInfo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(botonMostarPersonasGuardas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(labelMuestratexto, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labeInicio)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSolicitarEdad)
                    .addComponent(botonSolicitarNombre)
                    .addComponent(botonSolicitarId))
                .addGap(18, 18, 18)
                .addComponent(labelMuestratexto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(botonMostarPersonasGuardas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonMostrarInfo)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSolicitarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSolicitarIdActionPerformed
        Integer id = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el id de la persona."));
        this.persona.setId(id);
    }//GEN-LAST:event_botonSolicitarIdActionPerformed

    private void botonSolicitarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSolicitarNombreActionPerformed
        String nombre = JOptionPane.showInputDialog("Introduzca el nombre de la persona.");
        this.persona.setNombre(nombre);
    }//GEN-LAST:event_botonSolicitarNombreActionPerformed

    private void botonSolicitarEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSolicitarEdadActionPerformed
        Integer edad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad de la persona."));
        this.persona.setEdad(edad);
    }//GEN-LAST:event_botonSolicitarEdadActionPerformed

    private void botonMostrarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarInfoActionPerformed
        VentanaMostrarInfo mostrarInfo = new VentanaMostrarInfo(persona);
        mostrarInfo.setVisible(true);
        Almacen almacen = null;
        try {
            almacen = Controlador.crearAlmacenFichero("ficheroEjercicio3Trim.txt");
        } catch (IOException ex) {
            Logger.getLogger(VentanaPedirInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        almacen.getPersonas().add(persona);
        Controlador.escribirObjetoFichero("ficheroEjercicio3Trim.txt", almacen);
        dispose();
    }//GEN-LAST:event_botonMostrarInfoActionPerformed

    private void botonMostarPersonasGuardasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostarPersonasGuardasActionPerformed
        StringBuilder texto = new StringBuilder();
        try {
            Almacen almacen = Controlador.extraerObjetoFichero("ficheroEjercicio3Trim.txt");
            Iterator<Persona> it = almacen.getPersonas().iterator();
            while (it.hasNext()) {
                Persona next = it.next();
                texto.append(next.toString());
            }
            this.labelMuestratexto.setText(texto.toString());
        } catch (IOException ex) {
            Logger.getLogger(VentanaPedirInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_botonMostarPersonasGuardasActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPedirInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPedirInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPedirInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPedirInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPedirInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMostarPersonasGuardas;
    private javax.swing.JButton botonMostrarInfo;
    private javax.swing.JButton botonSolicitarEdad;
    private javax.swing.JButton botonSolicitarId;
    private javax.swing.JButton botonSolicitarNombre;
    private javax.swing.JLabel labeInicio;
    private javax.swing.JLabel labelMuestratexto;
    // End of variables declaration//GEN-END:variables
}
