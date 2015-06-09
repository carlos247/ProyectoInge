/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Carlos
 */
public class Busqueda_auto extends javax.swing.JFrame {

    BuscadorF buscadorf = new BuscadorF();

    /**
     * Creates new form Busqueda_auto
     */
    public Busqueda_auto() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Busqueda Automatica");
    }

    public static class Global {

        public static String dato;
        public static String eleccion_para_switch = null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        agregarPosibles = new javax.swing.JButton();
        nombresPosibles = new javax.swing.JTextField();
        busquedaM = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultadosAuto = new javax.swing.JTextArea();
        años = new javax.swing.JComboBox();
        buscar_por_año = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        jLabel1.setText("Dijite un nombre");

        agregarPosibles.setText("Agregar como posibles");

        nombresPosibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombresPosiblesActionPerformed(evt);
            }
        });

        busquedaM.setText("Busqueda Manual");
        busquedaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaMActionPerformed(evt);
            }
        });

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        resultadosAuto.setColumns(20);
        resultadosAuto.setRows(5);
        jScrollPane1.setViewportView(resultadosAuto);

        años.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione año", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));

        buscar_por_año.setText("Buscar por año ");
        buscar_por_año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_por_añoActionPerformed(evt);
            }
        });

        jLabel3.setText("Buscar por año");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(busquedaM, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(agregarPosibles))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(botonBuscar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombresPosibles, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(años, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(buscar_por_año)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombresPosibles, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(años, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonBuscar)
                            .addComponent(buscar_por_año)
                            .addComponent(atras))
                        .addGap(30, 30, 30)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busquedaM)
                    .addComponent(agregarPosibles))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        Buscador busc = new Buscador();
        busc.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_atrasActionPerformed

    private void nombresPosiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombresPosiblesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombresPosiblesActionPerformed

    private void busquedaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaMActionPerformed
        Busqueda_manual BM = new Busqueda_manual();
        BM.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_busquedaMActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        this.resultadosAuto.setText("");
        String nombre = this.nombresPosibles.getText();
        if (!(nombre.isEmpty())) {
            buscadorf.buscar(nombre);
            ArrayList<String> usuario = buscadorf.getResultado();
            for (int i = 0; i < usuario.size(); i++) {
                this.resultadosAuto.append(usuario.get(i) + "\n");
            }
        } else {
            Global.eleccion_para_switch = "por_info_base";
            ArrayList<String> usuario = resultado();
            String usuarioS = "";
            for (String s : usuario) {
                usuarioS += s + " ";
                buscadorf.buscar(usuarioS);
                usuarioS = " ";
                usuario = buscadorf.getResultado();
                for (int i = 0; i < usuario.size(); i++) {
                    this.resultadosAuto.append(usuario.get(i) + "\n");
                }
            }
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void buscar_por_añoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_por_añoActionPerformed
        this.resultadosAuto.setText("");
        Global.eleccion_para_switch = "por_anyo";
        Global.dato = this.años.getSelectedItem().toString();
        ArrayList<String> usuario = resultado();
        String usuarioS = "";
        for (String s : usuario) {
            usuarioS += s + " ";
            buscadorf.buscar(usuarioS);
            usuarioS = " ";
            usuario = buscadorf.getResultado();
            for (int i = 0; i < usuario.size(); i++) {
                this.resultadosAuto.append(usuario.get(i) + "\n");
            }
        }
    }//GEN-LAST:event_buscar_por_añoActionPerformed

    //guarda la seleccion de parametro que hizo el usuario para la busqueda
    public String eleccion_para_switch() {
        return Global.eleccion_para_switch;
    }

    // guarda el parametro que hizo el usuario para la busqueda
    public String dato() {
        return Global.dato;
    }

    public ArrayList<String> resultado() {
        Base_de_datos BD = new Base_de_datos();
        return BD.dat();
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
            java.util.logging.Logger.getLogger(Busqueda_auto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Busqueda_auto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Busqueda_auto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Busqueda_auto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Busqueda_auto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarPosibles;
    private javax.swing.JButton atras;
    private javax.swing.JComboBox años;
    private javax.swing.JButton botonBuscar;
    public javax.swing.JButton buscar_por_año;
    private javax.swing.JButton busquedaM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombresPosibles;
    private javax.swing.JTextArea resultadosAuto;
    // End of variables declaration//GEN-END:variables
}