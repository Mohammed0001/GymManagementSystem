/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mms.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import mms.GUI.StrategyPaymentsGUI;
import rmi.PaymentStrategy;
import rmipack.IUserAuth;

/**
 *
 * @author hp
 */
public class PaymentController {

    Registry registry;
    PaymentStrategy payment;

    public PaymentController() {
        try {
            this.registry = LocateRegistry.getRegistry(1099);
            this.payment = (PaymentStrategy) registry.lookup("AhmedFacade");

        } catch (RemoteException ex) {
            Logger.getLogger(PaymentController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(PaymentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Method to fetch payment details
    public String fetchPaymentDetails(String paymentMethod) {
        try {
            // Look up the PaymentStrategy object in the registry
            // Fetch the payment details for the selected payment method
            String paymentDetails = payment.getPayment(paymentMethod);

            // Return the fetched payment details
            return "Selected Payment Strategy: " + paymentDetails;

        } catch (Exception ex) {
            return "An unexpected error occurred: " + ex.getMessage();
        }
    }

}
