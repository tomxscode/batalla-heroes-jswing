/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package batallaheroes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tomas
 */
public class Seleccion2 extends javax.swing.JFrame {

    /**
     * Creates new form Seleccion2
     */
    int longitudHeroes = Heroes.heroes.length;
    int longitudArmas = Armas.armas.length;

    public Seleccion2() {
        initComponents();
        
        JPanelImage imagenFondo = new JPanelImage(seleccionBg, "imagenes/bg.jpg");
        seleccionBg.add(imagenFondo);
        
        // cb
        for (int i = 0; i < longitudHeroes; i++) {
            String nombreHeroe = Heroes.heroes[i].getNombre();
            cbSeleccionPersonaje.addItem(nombreHeroe);
        }
        // cb armas
        for (int i = 0; i < longitudArmas; i++) {
            String nombreArma = Armas.armas[i].getNombre();
            cbSeleccionArma.addItem(nombreArma);
        }
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seleccionBg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbSeleccionPersonaje = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHeroe = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textInfo = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbSeleccionArma = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaArmas = new javax.swing.JTable();
        btnCombatir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SELECCIÓN DE PERSONAJES");
        setResizable(false);

        seleccionBg.setBackground(new java.awt.Color(204, 0, 204));

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Haz click en la arma");

        cbSeleccionPersonaje.setBackground(new java.awt.Color(255, 255, 255));
        cbSeleccionPersonaje.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        cbSeleccionPersonaje.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbSeleccionPersonaje.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSeleccionPersonajeItemStateChanged(evt);
            }
        });
        cbSeleccionPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSeleccionPersonajeActionPerformed(evt);
            }
        });

        tablaHeroe.setBackground(new java.awt.Color(204, 204, 204));
        tablaHeroe.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        tablaHeroe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Atributo", "Valor"
            }
        ));
        jScrollPane1.setViewportView(tablaHeroe);

        jLabel2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Selección de personajes");

        textInfo.setEditable(false);
        textInfo.setBackground(new java.awt.Color(102, 102, 102));
        textInfo.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        textInfo.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(textInfo);

        jLabel3.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Selección de armas");

        jLabel4.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Haz click en el personaje");

        cbSeleccionArma.setBackground(new java.awt.Color(255, 255, 255));
        cbSeleccionArma.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        cbSeleccionArma.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbSeleccionArma.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSeleccionArmaItemStateChanged(evt);
            }
        });
        cbSeleccionArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSeleccionArmaActionPerformed(evt);
            }
        });

        tablaArmas.setBackground(new java.awt.Color(204, 204, 204));
        tablaArmas.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        tablaArmas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Atributo", "Valor"
            }
        ));
        jScrollPane3.setViewportView(tablaArmas);

        btnCombatir.setBackground(new java.awt.Color(51, 153, 0));
        btnCombatir.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        btnCombatir.setForeground(new java.awt.Color(255, 255, 255));
        btnCombatir.setText("COMBATIR");
        btnCombatir.setToolTipText("");
        btnCombatir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombatirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout seleccionBgLayout = new javax.swing.GroupLayout(seleccionBg);
        seleccionBg.setLayout(seleccionBgLayout);
        seleccionBgLayout.setHorizontalGroup(
            seleccionBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seleccionBgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(seleccionBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seleccionBgLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(seleccionBgLayout.createSequentialGroup()
                        .addGroup(seleccionBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(seleccionBgLayout.createSequentialGroup()
                                .addGroup(seleccionBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbSeleccionPersonaje, 0, 272, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(seleccionBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbSeleccionArma, 0, 272, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(seleccionBgLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCombatir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(23, Short.MAX_VALUE))))
        );
        seleccionBgLayout.setVerticalGroup(
            seleccionBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seleccionBgLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(seleccionBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(seleccionBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(seleccionBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSeleccionPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSeleccionArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(seleccionBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnCombatir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(seleccionBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(seleccionBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbSeleccionPersonajeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSeleccionPersonajeItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSeleccionPersonajeItemStateChanged

    private void cbSeleccionPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSeleccionPersonajeActionPerformed
        // TODO add your handling code here:
        System.out.println(cbSeleccionPersonaje.getSelectedItem());
        for (int i = 0; i < longitudHeroes; i++) {
            if (Heroes.heroes[i].getNombre().equals(cbSeleccionPersonaje.getSelectedItem())) {
                BatallaHeroes.heroeSeleccionado = Heroes.heroes[i];
                Heroe heroeActual = BatallaHeroes.heroeSeleccionado;
                System.out.println("El héroe " + BatallaHeroes.heroeSeleccionado.getNombre() + " fue seleccionado");
                
                // Tabla de información
                DefaultTableModel model = (DefaultTableModel) tablaHeroe.getModel();
                model.setRowCount(0);
                Object[] filaNombre = {"Nombre", heroeActual.getNombre()};
                model.addRow(filaNombre);
                Object[] filaSalud = {"Salud", heroeActual.getSalud()};
                model.addRow(filaSalud);
                Object[] filaFuerza = {"Fuerza", heroeActual.getFuerza()};
                model.addRow(filaFuerza);
                Object[] filaDefensa = {"Defensa", heroeActual.getDefensa()};
                model.addRow(filaDefensa);
                Object[] filaDebilidad = {"Debilidad", heroeActual.getDebilidad()};
                model.addRow(filaDebilidad);
                Object[] filaNivel = {"Nivel", heroeActual.getNivel()};
                model.addRow(filaNivel);
                
                // Establecer en el textInfo
                textInfo.setText( textInfo.getText() + "\nINFO: El héroe " + heroeActual.getNombre() + " fue seleccionado" );
            }
            // Pintado de la información
        }
        tablaHeroe.repaint();

    }//GEN-LAST:event_cbSeleccionPersonajeActionPerformed

    private void cbSeleccionArmaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSeleccionArmaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSeleccionArmaItemStateChanged

    private void cbSeleccionArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSeleccionArmaActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < longitudArmas; i++) {
            if (Armas.armas[i].getNombre().equals(cbSeleccionArma.getSelectedItem())) {
                BatallaHeroes.heroeSeleccionado.setArma(Armas.armas[i]);
                Arma armaActual = BatallaHeroes.heroeSeleccionado.getArma();
                System.out.println("La arma " + armaActual.getNombre() + " fue seleccionada");
                
                // Tabla de información
                DefaultTableModel model = (DefaultTableModel) tablaArmas.getModel();
                model.setRowCount(0);
                Object[] filaNombre = {"Nombre", armaActual.getNombre()};
                model.addRow(filaNombre);
                Object[] filaMaterial = {"Material", armaActual.getMaterial()};
                model.addRow(filaMaterial);
                Object[] filaDanio = {"Daño", armaActual.getDanioBase()};
                model.addRow(filaDanio);
                Object[] filaDescripcion = {"Descripción", armaActual.getDescripcion()};
                model.addRow(filaDescripcion);
                
                // Establecer en el textInfo
                textInfo.setText( textInfo.getText() + "\nINFO: La arma " + armaActual.getNombre() + " fue seleccionada" );
            }
            // Pintado de la información
        }
        tablaArmas.repaint();
    }//GEN-LAST:event_cbSeleccionArmaActionPerformed

    private void btnCombatirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombatirActionPerformed
        // TODO add your handling code here:
        Combate ventanaCombate = new Combate();
        ventanaCombate.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnCombatirActionPerformed

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
            java.util.logging.Logger.getLogger(Seleccion2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seleccion2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seleccion2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seleccion2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seleccion2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCombatir;
    private javax.swing.JComboBox<String> cbSeleccionArma;
    private javax.swing.JComboBox<String> cbSeleccionPersonaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel seleccionBg;
    private javax.swing.JTable tablaArmas;
    private javax.swing.JTable tablaHeroe;
    private javax.swing.JTextPane textInfo;
    // End of variables declaration//GEN-END:variables

}
