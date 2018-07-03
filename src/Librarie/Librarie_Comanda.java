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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;


public class Librarie_Comanda extends javax.swing.JFrame {

    int pret = 0, total = 0;
    public java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }
    /**
     * Creates new form Librarie_EmitereBon
     */
    public Librarie_Comanda() {
        initComponents();

        this.getContentPane().setBackground(new Color(255, 229, 204));
        this.setTitle("Plasare comanda");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        Statement stmt;
        try {
            Connection con = Conectare.DBConector();
            stmt = (Statement) con.createStatement();
            String query = "Select id_carte,titlu from carti";
            String query2 = "Select id_client,nume,prenume from clienti";
            PreparedStatement st = con.prepareStatement(query);
            PreparedStatement st2 = con.prepareStatement(query2);

            ResultSet rs = st.executeQuery();
            ResultSet rs2 = st2.executeQuery();

            while (rs.next()) {
                comboCarti.addItem(rs.getString("id_carte") + " " + rs.getString("titlu"));

            }
            while (rs2.next()) {
                comboClienti.addItem(rs2.getString("id_client") + " " + rs2.getString("nume") + " " + rs2.getString("prenume"));

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
        jButton1 = new javax.swing.JButton();
        comboClienti = new javax.swing.JComboBox<>();
        comboCarti = new javax.swing.JComboBox<>();
        label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 30)); // NOI18N
        jLabel1.setText("Plasare Comanda");

        jLabel2.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        jLabel2.setText("Client:");

        jLabel3.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        jLabel3.setText("Carte:");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jButton1.setText("COMANDA");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        comboClienti.setBackground(new java.awt.Color(204, 204, 204));

        comboCarti.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboClienti, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCarti, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboClienti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboCarti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String nume = comboClienti.getSelectedItem().toString();
        String[] numebun = nume.split(" ");
        String numecarte = comboCarti.getSelectedItem().toString();
        String nume_carte[]=numecarte.split(" ");
        String data = null;
        int pret_carte=0;
        Statement stmt;
        PreparedStatement ps = null,ps2=null;
        int randomNum = ThreadLocalRandom.current().nextInt(1, 9998 + 1);
      
        try {
           
            Connection con = Conectare.DBConector();
            stmt = (Statement) con.createStatement();
            int id_bon=randomNum;
           
            //-------------[-------------------//
            
            String query5 = "select to_char(SYSDATE, 'DD-MON-YY') from dual";
            PreparedStatement st5 = con.prepareStatement(query5);
            ResultSet rs5 = st5.executeQuery();
            while (rs5.next()) {
                 data=rs5.getString(1);

            }
            String query6 = "SELECT pret from carti where id_carte=?";
            PreparedStatement st6 = con.prepareStatement(query6);
            st6.setString(1,nume_carte[0]);
            ResultSet rs6 = st6.executeQuery();
            while (rs6.next()) {
                 pret_carte=Integer.parseInt(rs6.getString("pret"));
                 
            }
           
            ps = con.prepareStatement ("INSERT INTO comanda(id_bon,id_client,id_carte,total, data) VALUES (?,?,?,?,?)");
            ps.setInt(1, id_bon);
            ps.setString(2, numebun[0]);
            ps.setString(3,nume_carte[0]);
            ps.setInt(4, pret_carte);
            ps.setString(5, data);
            
             ps2 = con.prepareStatement ("UPDATE carti SET stoc=stoc-1 where id_carte=?");
             ps2.setString(1,nume_carte[0]);
             ps2.executeUpdate();
            int i = ps.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Comanda plasata!");
            }
          
          
             
            
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 1);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Librarie_Comanda.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Librarie_Comanda.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Librarie_Comanda.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Librarie_Comanda.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Librarie_Comanda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboCarti;
    private javax.swing.JComboBox<String> comboClienti;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
}
