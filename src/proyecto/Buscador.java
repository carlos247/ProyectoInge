/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Carlos
 */
public class Buscador extends javax.swing.JFrame {

    /**
     * Creates new form Buscador
     */
    public Buscador() {
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

        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        buscador_de_egresados_de_la_ECCI = new javax.swing.JLabel();
        buscar_graduados_años = new javax.swing.JLabel();
        buscar_con_la_info_de_la_base = new javax.swing.JLabel();
        buscar_con_nombre_completo = new javax.swing.JLabel();
        Buscar_info_base = new javax.swing.JButton();
        javax.swing.JButton Salir = new javax.swing.JButton();
        bucar_nombre = new javax.swing.JButton();
        buscar_por_año = new javax.swing.JButton();
        años = new javax.swing.JComboBox();
        nombre_estu = new javax.swing.JTextField();
        busqueda_manual = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jTextField3.setText("jTextField3");

        jRadioButton1.setText("jRadioButton1");

        jRadioButton2.setText("jRadioButton2");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buscador_de_egresados_de_la_ECCI.setText("Buscador de egresados de la ECCI");

        buscar_graduados_años.setText("Buscar graduados por año");

        buscar_con_la_info_de_la_base.setText("Buscar con los datos de la base ");

        buscar_con_nombre_completo.setText("Buscar por nombre completo");

        Buscar_info_base.setText("Buscar");
        Buscar_info_base.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar_info_baseActionPerformed(evt);
            }
        });

        Salir.setForeground(new java.awt.Color(255, 0, 0));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        bucar_nombre.setText("Buscar por nombre ");
        bucar_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bucar_nombreActionPerformed(evt);
            }
        });

        buscar_por_año.setText("Buscar por año ");
        buscar_por_año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_por_añoActionPerformed(evt);
            }
        });

        años.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione año", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));

        busqueda_manual.setText("Busqueda manual");
        busqueda_manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busqueda_manualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(busqueda_manual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscar_por_año)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscar_graduados_años)
                            .addComponent(buscar_con_nombre_completo)
                            .addComponent(buscar_con_la_info_de_la_base))
                        .addGap(0, 94, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bucar_nombre)
                        .addGap(30, 30, 30)
                        .addComponent(Salir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nombre_estu, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(años, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Buscar_info_base, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(buscador_de_egresados_de_la_ECCI)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buscador_de_egresados_de_la_ECCI)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buscar_graduados_años)
                            .addComponent(años, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(buscar_con_la_info_de_la_base))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(Buscar_info_base)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar_con_nombre_completo)
                    .addComponent(nombre_estu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salir)
                    .addComponent(bucar_nombre)
                    .addComponent(buscar_por_año)
                    .addComponent(busqueda_manual))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // variables globales para el anyo devuelto por el usuario y variable global para garantizar que la seleccion sera por anyo
    public static class Global {
        public static String dato;
        public static String eleccion2 = null;
    }
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void buscar_por_añoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_por_añoActionPerformed
        Resultados resul = new Resultados();
        resul.setVisible(true);
        setVisible(false);
        dispose();
        Global.eleccion2 = "por_anyo";
        Global.dato = this.años.getSelectedItem().toString();
    }//GEN-LAST:event_buscar_por_añoActionPerformed

    private void bucar_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bucar_nombreActionPerformed
        Resultados resul = new Resultados();
        resul.setVisible(true);
        setVisible(false);
        dispose();
        Global.eleccion2 = "por_nombre";
        Global.dato = nombre_estu.getText();
    }//GEN-LAST:event_bucar_nombreActionPerformed

    private void Buscar_info_baseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar_info_baseActionPerformed
        Resultados resul = new Resultados();
        resul.setVisible(true);
        setVisible(false);
        dispose();
        Global.eleccion2 = "por_info_base";
    }//GEN-LAST:event_Buscar_info_baseActionPerformed

    private void busqueda_manualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busqueda_manualActionPerformed
        Busqueda_manual B_M = new Busqueda_manual();
        B_M.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_busqueda_manualActionPerformed

    //guarda la seleccion de parametro que hizo el usuario para la busqueda
    public String eleccion() {
        return Global.eleccion2;
    }

    // guarda el parametro que hizo el usuario para la busqueda
    public String dato() {
        return Global.dato;
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
            java.util.logging.Logger.getLogger(Buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar_info_base;
    private javax.swing.JComboBox años;
    private javax.swing.JButton bucar_nombre;
    private javax.swing.JLabel buscador_de_egresados_de_la_ECCI;
    private javax.swing.JLabel buscar_con_la_info_de_la_base;
    private javax.swing.JLabel buscar_con_nombre_completo;
    private javax.swing.JLabel buscar_graduados_años;
    public javax.swing.JButton buscar_por_año;
    private javax.swing.JButton busqueda_manual;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField nombre_estu;
    // End of variables declaration//GEN-END:variables
}
