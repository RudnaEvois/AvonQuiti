/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avonquiti.menus;

import avonquiti.menus.Menu0;
import javax.swing.JOptionPane;
import avonquiti.model.Cliente;
import avonquiti.ClienteDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import avonquiti.controller.ClienteController;

/**
 *
 * @author USER
 */
public class Menu2_1 extends javax.swing.JFrame {

    /**
     * Creates new form Menu1_1
     */
    public Menu2_1() {
        initComponents();
    }
String key;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CadCAvon = new javax.swing.JButton();
        CadCJequiti = new javax.swing.JButton();
        MenuAnterior1 = new javax.swing.JButton();
        MenuPrincipal1 = new javax.swing.JButton();
        Sair1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CONSULTAR CLIENTE");

        CadCAvon.setText("AVON");
        CadCAvon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadCAvonActionPerformed(evt);
            }
        });

        CadCJequiti.setText("JEQUITI");
        CadCJequiti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadCJequitiActionPerformed(evt);
            }
        });

        MenuAnterior1.setText("MENU ANTERIOR");
        MenuAnterior1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAnterior1ActionPerformed(evt);
            }
        });

        MenuPrincipal1.setText("MENU PRINCIPAL");
        MenuPrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPrincipal1ActionPerformed(evt);
            }
        });

        Sair1.setText("SAIR");
        Sair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sair1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CadCJequiti, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MenuAnterior1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MenuPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sair1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(CadCAvon, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(CadCAvon, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CadCJequiti, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MenuAnterior1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MenuPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sair1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuAnterior1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAnterior1ActionPerformed
new Menu2().setVisible(true);
setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_MenuAnterior1ActionPerformed

    private void Sair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sair1ActionPerformed
System.exit(0);             // TODO add your handling code here:
    }//GEN-LAST:event_Sair1ActionPerformed

    private void MenuPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPrincipal1ActionPerformed
new Menu0().setVisible(true);
setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_MenuPrincipal1ActionPerformed

    private void CadCAvonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadCAvonActionPerformed
  String n=JOptionPane.showInputDialog("Digite o nome do(a) cliente: ");
  String nome,telefone;
        ClienteController cc = new ClienteController();
        try {
            Cliente c = cc.buscaContatoPorNome(n);
            nome=c.getNome();
            telefone=c.getTel();
          			key = c.getId();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, 
				"Ocorreu um erro, tente novamente!n" + 
				e.getLocalizedMessage()
			);
        } catch (NullPointerException e){
            JOptionPane.showMessageDialog(this, 
				"Contato n&atilde;o localizdo ou n&atilde;o existe!n" + 
				e.getLocalizedMessage()
			);
        }
    }//GEN-LAST:event_CadCAvonActionPerformed

    private void CadCJequitiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadCJequitiActionPerformed
String n=JOptionPane.showInputDialog("Digite o nome do(a) cliente: ");
  String nome,telefone;
        ClienteController cc = new ClienteController();
        try {
            Cliente c = cc.buscaContatoPorNome(n);
            nome=c.getNome();
            telefone=c.getTel();
          			key = c.getId();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, 
				"Ocorreu um erro, tente novamente!n" + 
				e.getLocalizedMessage()
			);
        } catch (NullPointerException e){
            JOptionPane.showMessageDialog(this, 
				"Contato n&atilde;o localizdo ou n&atilde;o existe!n" + 
				e.getLocalizedMessage()
			);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_CadCJequitiActionPerformed

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
            java.util.logging.Logger.getLogger(Menu2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu2_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadCAvon;
    private javax.swing.JButton CadCJequiti;
    private javax.swing.JButton MenuAnterior1;
    private javax.swing.JButton MenuPrincipal1;
    private javax.swing.JButton Sair1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
