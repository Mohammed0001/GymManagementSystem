package mms.GUI;

import users.Person;

/**
 *
 * @author SARAH
 */
public class MemberGUI extends javax.swing.JFrame {

    Person p;

    public MemberGUI(Person p) {
        this.p = p;
        initComponents();
        this.greatingLabel.setText("Welcome! " + p.getName());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageClassesBTN4 = new javax.swing.JButton();
        greatingLabel = new javax.swing.JLabel();
        viewClassesBTN = new javax.swing.JButton();
        manageClassesBTN = new javax.swing.JButton();
        manageEquipmentBTN = new javax.swing.JButton();
        addressComplaintsBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        manageClassesBTN4.setText("Address Complaints");
        manageClassesBTN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageClassesBTN4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        viewClassesBTN.setText("View Classes");
        viewClassesBTN.setPreferredSize(new java.awt.Dimension(170, 23));
        viewClassesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewClassesBTNActionPerformed(evt);
            }
        });

        manageClassesBTN.setText("Manage Enrolled Session");
        manageClassesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageClassesBTNActionPerformed(evt);
            }
        });

        manageEquipmentBTN.setText("Track Progress");
        manageEquipmentBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEquipmentBTNActionPerformed(evt);
            }
        });

        addressComplaintsBTN.setText("Submit Complaint");
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
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageClassesBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewClassesBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageEquipmentBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressComplaintsBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(greatingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(182, 182, 182)))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(greatingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageEquipmentBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewClassesBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageClassesBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressComplaintsBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void viewClassesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewClassesBTNActionPerformed
        new manageAccountsGUI(p).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewClassesBTNActionPerformed

    private void manageClassesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageClassesBTNActionPerformed
        // TODO add your handling code here:
        new manageClassesGUI(p).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_manageClassesBTNActionPerformed

    private void manageEquipmentBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEquipmentBTNActionPerformed
        new manageEquipmentsGUI(p).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_manageEquipmentBTNActionPerformed

    private void addressComplaintsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressComplaintsBTNActionPerformed
        // TODO add your handling code here:
        new addressComplaintsGUI(p).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addressComplaintsBTNActionPerformed

    private void manageClassesBTN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageClassesBTN4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageClassesBTN4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addressComplaintsBTN;
    private javax.swing.JLabel greatingLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageClassesBTN;
    private javax.swing.JButton manageClassesBTN4;
    private javax.swing.JButton manageEquipmentBTN;
    private javax.swing.JButton viewClassesBTN;
    // End of variables declaration//GEN-END:variables
}
