package mms.GUI;

import users.Person;

/**
 *
 * @author Mohammed ABou Bakr
 */
public class GymManagerGUI extends javax.swing.JFrame {

    Manager m;

    public GymManagerGUI(Manager m) {
        this.m = m;
        initComponents();
        this.greatingLabel.setText("Welcome! " + m.getName());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageClassesBTN4 = new javax.swing.JButton();
        greatingLabel = new javax.swing.JLabel();
        managAccBTN = new javax.swing.JButton();
        manageClassesBTN = new javax.swing.JButton();
        viewBranchesReportBTN = new javax.swing.JButton();
        manageEquipmentBTN = new javax.swing.JButton();
        addressComplaintsBTN = new javax.swing.JButton();

        manageClassesBTN4.setText("Address Complaints");
        manageClassesBTN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageClassesBTN4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        managAccBTN.setText("Manage Br Sytem Accounts");
        managAccBTN.setPreferredSize(new java.awt.Dimension(170, 23));
        managAccBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managAccBTNActionPerformed(evt);
            }
        });

        manageClassesBTN.setText("Manage Classes");
        manageClassesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageClassesBTNActionPerformed(evt);
            }
        });

        viewBranchesReportBTN.setText("View Report");
        viewBranchesReportBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBranchesReportBTNActionPerformed(evt);
            }
        });

        manageEquipmentBTN.setText("Manage Equipments");
        manageEquipmentBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEquipmentBTNActionPerformed(evt);
            }
        });

        addressComplaintsBTN.setText("Address Complaints");
        addressComplaintsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressComplaintsBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(greatingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(manageClassesBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageEquipmentBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressComplaintsBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(viewBranchesReportBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(managAccBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(207, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(greatingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manageEquipmentBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageClassesBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressComplaintsBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewBranchesReportBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(managAccBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(173, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void managAccBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managAccBTNActionPerformed
        new manageAccountsGUI(m).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_managAccBTNActionPerformed

    private void manageClassesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageClassesBTNActionPerformed
        // TODO add your handling code here:
        new manageClassesGUI(m).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_manageClassesBTNActionPerformed

    private void manageEquipmentBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEquipmentBTNActionPerformed
        new manageEquipmentsGUI(m).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_manageEquipmentBTNActionPerformed

    private void addressComplaintsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressComplaintsBTNActionPerformed
        // TODO add your handling code here:
        new addressComplaintsGUI(m).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addressComplaintsBTNActionPerformed

    private void manageClassesBTN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageClassesBTN4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageClassesBTN4ActionPerformed

    private void viewBranchesReportBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBranchesReportBTNActionPerformed
        new viewBranchReport(m).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewBranchesReportBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addressComplaintsBTN;
    private javax.swing.JLabel greatingLabel;
    private javax.swing.JButton managAccBTN;
    private javax.swing.JButton manageClassesBTN;
    private javax.swing.JButton manageClassesBTN4;
    private javax.swing.JButton manageEquipmentBTN;
    private javax.swing.JButton viewBranchesReportBTN;
    // End of variables declaration//GEN-END:variables
}
