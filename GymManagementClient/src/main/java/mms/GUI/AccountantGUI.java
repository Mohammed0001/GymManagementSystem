/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mms.GUI;

import users.Person;

/**
 *
 * @author Karim 219226
 */
public class AccountantGUI extends javax.swing.JFrame {

    Person P;
    public AccountantGUI(Person P) {
        this.P = P;
        initComponents();
        this.Welcome.setText("Welcome!" + P.getName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Welcome = new javax.swing.JLabel();
        ManageSubscriptionBTN = new javax.swing.JButton();
        GenerateReportBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ManageSubscriptionBTN.setText("Manage Subscription");
        ManageSubscriptionBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageSubscriptionBTNActionPerformed(evt);
            }
        });

        GenerateReportBTN.setText("Generate financial report");
        GenerateReportBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateReportBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GenerateReportBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ManageSubscriptionBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                        .addComponent(Welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(ManageSubscriptionBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GenerateReportBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ManageSubscriptionBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageSubscriptionBTNActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new manageSubscriptionGUI(P).setVisible(true);
    }//GEN-LAST:event_ManageSubscriptionBTNActionPerformed

    private void GenerateReportBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateReportBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenerateReportBTNActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GenerateReportBTN;
    private javax.swing.JButton ManageSubscriptionBTN;
    private javax.swing.JLabel Welcome;
    // End of variables declaration//GEN-END:variables
}
