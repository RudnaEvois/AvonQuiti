/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avonquiti.menus;

import avonquiti.NFAvon;
import avonquiti.NFJequiti;
import avonquiti.menus.Menu0;

/**
 *
 * @author USER
 */
public class Menu1_2 extends javax.swing.JFrame {

    /**
     * Creates new form Menu1_2
     */
    public Menu1_2() {
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

        jLabel1 = new javax.swing.JLabel();
        CadNFAvon = new javax.swing.JButton();
        CadNFJequiti = new javax.swing.JButton();
        Anterior2 = new javax.swing.JButton();
        Principal2 = new javax.swing.JButton();
        Sair2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 100));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CADASTRAR NOTA FISCAL:");

        CadNFAvon.setText("AVON");
        CadNFAvon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadNFAvonActionPerformed(evt);
            }
        });

        CadNFJequiti.setText("JEQUITI");
        CadNFJequiti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadNFJequitiActionPerformed(evt);
            }
        });

        Anterior2.setText("MENU ANTERIOR");
        Anterior2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Anterior2ActionPerformed(evt);
            }
        });

        Principal2.setText("MENU PRINCIPAL");
        Principal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Principal2ActionPerformed(evt);
            }
        });

        Sair2.setText("SAIR");
        Sair2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sair2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CadNFAvon, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CadNFJequiti, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Anterior2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Principal2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sair2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(CadNFAvon, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CadNFJequiti, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Anterior2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Principal2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sair2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Sair2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sair2ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_Sair2ActionPerformed

    private void Anterior2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Anterior2ActionPerformed
new Menu1().setVisible(true);
setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_Anterior2ActionPerformed

    private void Principal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Principal2ActionPerformed
new Menu0().setVisible(true);
setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_Principal2ActionPerformed

    private void CadNFAvonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadNFAvonActionPerformed
new NFAvon().setVisible(true);
setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_CadNFAvonActionPerformed

    private void CadNFJequitiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadNFJequitiActionPerformed
new NFJequiti().setVisible(true);
setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_CadNFJequitiActionPerformed

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
            java.util.logging.Logger.getLogger(Menu1_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu1_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu1_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu1_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu1_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anterior2;
    private javax.swing.JButton CadNFAvon;
    private javax.swing.JButton CadNFJequiti;
    private javax.swing.JButton Principal2;
    private javax.swing.JButton Sair2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
