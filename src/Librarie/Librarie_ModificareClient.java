/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librarie;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Librarie_ModificareClient extends javax.swing.JFrame {

    /**
     * Creates new form Librarie_ModificareClient
     */
    public Librarie_ModificareClient() {
        initComponents();
        this.getContentPane().setBackground(new Color(255, 229, 204));
        this.setTitle("Modificare client");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        Statement stmt;
        try {
            Connection con = Conectare.DBConector();
            stmt = (Statement) con.createStatement();
            String query = "Select id_client,nume,prenume from clienti";

            PreparedStatement st = con.prepareStatement(query);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                comboSelectie.addItem(rs.getString("id_client") + " " + rs.getString("nume") + " " + rs.getString("prenume"));

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 1);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboSelectie = new javax.swing.JComboBox<>();
        comboModifica = new javax.swing.JComboBox<>();
        textNou = new javax.swing.JTextField();
        butonOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 30)); // NOI18N
        jLabel1.setText("Actualizare informatii client");

        jLabel2.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        jLabel2.setText("Selectare client:");

        jLabel3.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        jLabel3.setText("Modificare:");

        jLabel4.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        jLabel4.setText("Valoare noua:");

        comboSelectie.setBackground(new java.awt.Color(204, 204, 204));

        comboModifica.setBackground(new java.awt.Color(204, 204, 204));
        comboModifica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID CLIENT", "NUME", "TELEFON" }));

        textNou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNouActionPerformed(evt);
            }
        });

        butonOk.setBackground(new java.awt.Color(204, 204, 204));
        butonOk.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        butonOk.setText("OK");
        butonOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel1)
                .addContainerGap(143, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboModifica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSelectie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNou, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butonOk)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(comboSelectie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboModifica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textNou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(butonOk)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonOkActionPerformed
        String selectie = comboModifica.getSelectedItem().toString();
        String valoare = textNou.getText();
        String nume = comboSelectie.getSelectedItem().toString();
        String[] numebun = nume.split(" ");
        Statement stmt;
        String query = null;

        try {
            Connection con = Conectare.DBConector();
            stmt = (Statement) con.createStatement();
            switch (selectie) {
                case "NUME":
                    query = "UPDATE client SET nume=? where id_client=?";
                    break;
                case "ID CLIENT":
                    query = "UPDATE clienti SET id_client=? where id_client=?";
                    break;
                case "TELEFON":
                    query = "UPDATE clienti SET telefon=? where id_client=?";
                    break;

            }
           

            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, textNou.getText());
            st.setString(2, numebun[0]);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Date actualizate!", "Succes", 1);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 1);
        }
    }//GEN-LAST:event_butonOkActionPerformed

    private void textNouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNouActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_textNouActionPerformed

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
            java.util.logging.Logger.getLogger(Librarie_ModificareClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Librarie_ModificareClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Librarie_ModificareClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Librarie_ModificareClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Librarie_ModificareClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butonOk;
    private javax.swing.JComboBox<String> comboModifica;
    private javax.swing.JComboBox<String> comboSelectie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField textNou;
    // End of variables declaration//GEN-END:variables
}
