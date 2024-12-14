package mms.GUI;

import users.Person;

/**
 *
 * @author sarahhali
 */
public class memberGUI extends javax.swing.JFrame {

    Person p;

    public memberGUI(Person p) {
        this.p = p;
        initComponents();
        this.Welcome.setText("Welcome! " + p.getName());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageClassesBTN4 = new javax.swing.JButton();
        viewClassesBTN = new javax.swing.JButton();
        trackProgressBTN = new javax.swing.JButton();
        submitComplaintsBTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Welcome = new javax.swing.JLabel();

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

        trackProgressBTN.setText("Track Progress");
        trackProgressBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trackProgressBTNActionPerformed(evt);
            }
        });

        submitComplaintsBTN.setText("Submit Complaint");
        submitComplaintsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitComplaintsBTNActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("HOME");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(177, 177, 177)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(viewClassesBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(submitComplaintsBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(116, 116, 116)
                            .addComponent(trackProgressBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Welcome, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewClassesBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitComplaintsBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(trackProgressBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void viewClassesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewClassesBTNActionPerformed
        new availableClassesGUI(p).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewClassesBTNActionPerformed

    private void trackProgressBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trackProgressBTNActionPerformed
         new TrackProgressGUI(p.getId()).setVisible(true); // Pass memberId
         this.setVisible(false);
    }//GEN-LAST:event_trackProgressBTNActionPerformed

    private void submitComplaintsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitComplaintsBTNActionPerformed
        // TODO add your handling code here:
         new SubmitComplaintGUI(p).setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_submitComplaintsBTNActionPerformed

    private void manageClassesBTN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageClassesBTN4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageClassesBTN4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Welcome;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageClassesBTN4;
    private javax.swing.JButton submitComplaintsBTN;
    private javax.swing.JButton trackProgressBTN;
    private javax.swing.JButton viewClassesBTN;
    // End of variables declaration//GEN-END:variables
}
