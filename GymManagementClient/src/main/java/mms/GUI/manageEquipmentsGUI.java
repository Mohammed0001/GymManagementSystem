/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mms.GUI;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mms.controllers.EquipmentController;

import services.Inventory;
import users.Person;

/**
 *
 * @author mabou
 */
public class manageEquipmentsGUI extends javax.swing.JFrame {

    Person p;
    EquipmentController invcs = new EquipmentController();
    DefaultTableModel model;

    public manageEquipmentsGUI(Person p) {
        this.p = p;
        initComponents();
        this.greatingLabel.setText("Welcome! " + p.getName());
        model = invcs.getEquipments();
        accountsTable.setModel(model);
        accountsTable.revalidate();
        accountsTable.repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageClassesBTN4 = new javax.swing.JButton();
        greatingLabel = new javax.swing.JLabel();
        greatingLabel1 = new javax.swing.JLabel();
        homeBTN3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        accountsTable = new javax.swing.JTable();
        homeBTN4 = new javax.swing.JButton();
        homeBTN5 = new javax.swing.JButton();
        homeBTN6 = new javax.swing.JButton();

        manageClassesBTN4.setText("Address Complaints");
        manageClassesBTN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageClassesBTN4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        greatingLabel1.setText("Manage Inventory");

        homeBTN3.setText("Home");
        homeBTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBTN3ActionPerformed(evt);
            }
        });

        accountsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Email", "Role"
            }
        ));
        jScrollPane1.setViewportView(accountsTable);

        homeBTN4.setText("Create Inventory");
        homeBTN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBTN4ActionPerformed(evt);
            }
        });

        homeBTN5.setText("Delete Inventory");
        homeBTN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBTN5ActionPerformed(evt);
            }
        });

        homeBTN6.setText("Update Inventory");
        homeBTN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBTN6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(homeBTN3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(homeBTN4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(homeBTN5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(homeBTN6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(greatingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(greatingLabel1)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(greatingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greatingLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeBTN3)
                    .addComponent(homeBTN4)
                    .addComponent(homeBTN5)
                    .addComponent(homeBTN6))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void manageClassesBTN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageClassesBTN4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageClassesBTN4ActionPerformed

    private void homeBTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBTN3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new GeneralManagerGUI(p).setVisible(true);

    }//GEN-LAST:event_homeBTN3ActionPerformed

    private void homeBTN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBTN4ActionPerformed
        new createInventoryGUI().setVisible(true);
    }//GEN-LAST:event_homeBTN4ActionPerformed

    private void homeBTN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBTN5ActionPerformed
        int selectedRow = accountsTable.getSelectedRow();
        if (selectedRow != -1) { // Check if a row is actually selected
            int id = (int) model.getValueAt(selectedRow, 0); // Assuming ID is in the first column
            boolean deleted = invcs.deleteInventory(id);
            if (deleted) {
                JOptionPane.showMessageDialog(null, "Deleted Successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Error Deleteing Inventory!");
            }

        } else {
            JOptionPane.showMessageDialog(null, "No row selected!");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_homeBTN5ActionPerformed

    private void homeBTN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBTN6ActionPerformed
        int selectedRow = accountsTable.getSelectedRow();
        if (selectedRow != -1) { // Check if a row is actually selected
            int id = (int) model.getValueAt(selectedRow, 0); 
            String name = (String) model.getValueAt(selectedRow, 1); 
            String provider = (String) model.getValueAt(selectedRow, 2); 
            String description = (String) model.getValueAt(selectedRow, 3);
            String lastManDate = (String) model.getValueAt(selectedRow, 4); 
            String nextManDate = (String) model.getValueAt(selectedRow, 5); 
            String warrEndDate = (String) model.getValueAt(selectedRow, 6); 
            boolean updated = invcs.updateInventory(id, name, provider, description, lastManDate, nextManDate, warrEndDate);
            if (updated) {
                JOptionPane.showMessageDialog(null, "Updated Successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Error Updated Inventory!");
            }

        } else {
            JOptionPane.showMessageDialog(null, "No row selected!");
        }
    }//GEN-LAST:event_homeBTN6ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable accountsTable;
    private javax.swing.JLabel greatingLabel;
    private javax.swing.JLabel greatingLabel1;
    private javax.swing.JButton homeBTN3;
    private javax.swing.JButton homeBTN4;
    private javax.swing.JButton homeBTN5;
    private javax.swing.JButton homeBTN6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton manageClassesBTN4;
    // End of variables declaration//GEN-END:variables
}
