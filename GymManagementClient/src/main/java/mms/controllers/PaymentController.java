/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mms.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import mms.GUI.StrategyPaymentsGUI;
import rmi.PaymentStrategy;

/**
 *
 * @author hp
 */
public class PaymentController {
    StrategyPaymentsGUI gui;
    Registry r;

    public PaymentController(StrategyPaymentsGUI gui, Registry r) {
        this.gui = gui;
        this.r = r;
        gui.getjButton1().addActionListener(new GetPayment());
    }

    class GetPayment implements ActionListener {

        // This function executes when the button is clicked
        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                // Obtain a remote reference to the PaymentStrategy remote object
                PaymentStrategy g = (PaymentStrategy) r.lookup("payment");

                // Get the payment method selected in the combo box
                String paymentMethod = (String) gui.getjComboBox1().getSelectedItem();

                // Get the payment details from the remote object
                String paymentDetails = g.getPayment(paymentMethod);

                // Display the payment details in the label
                gui.getjLabel1().setText(paymentDetails);

            } catch (RemoteException | NotBoundException ex) {
                Logger.getLogger(PaymentController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
