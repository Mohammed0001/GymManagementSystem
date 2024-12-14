/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mms.gymmanagementserver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import rmi.PaymentStrategy;
import java.util.Date;

public class Payment extends UnicastRemoteObject implements PaymentStrategy {
    private int id;
    private int memberID;
    private double amount;
    private int transactionID;
    private String paymentMethod;
    private String date;
    private String currency;
    private String status;
    private PaymentStrategy paymentStrategy;

    // Constructor with parameters
    public Payment(int id, int memberID, double amount, String paymentMethod, String currency, PaymentStrategy paymentStrategy) throws RemoteException {
        super(); // Required for UnicastRemoteObject
        this.id = id;
        this.memberID = memberID;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.currency = currency;
        this.status = "Pending";
        this.date = new Date().toString();
        this.paymentStrategy = paymentStrategy;
    }

    // Default constructor
    public Payment() throws RemoteException {
        
    }

    // Method to make a payment
    public boolean makePayment() throws RemoteException {
        String result = paymentStrategy.processPayment(amount, currency);
        if (result.contains("failed")) { // Check if payment failed
            status = "Failed";
            System.out.println("Payment failed for transaction ID: " + transactionID);
            return false;
        } else {
            status = "Completed";
            System.out.println("Payment successful for transaction ID: " + transactionID);
            return true;
        }
    }

    // Method to refund a payment
    public void refundPayment() {
        System.out.println("Refunding payment for transaction ID: " + transactionID);
        status = "Refunded";
    }

    // Setter for payment strategy
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Getter for payment status
    public String getPaymentStatus() {
        return status;
    }

    // Implementation of processPayment from PaymentStrategy
    @Override
    public String processPayment(double amount, String currency) throws RemoteException {
        // Default implementation (can be overridden by specific strategies)
        return "Payment processed successfully for " + amount + " " + currency;
    }

    // Implementation of validateTransaction from PaymentStrategy
    @Override
    public String validateTransaction() throws RemoteException {
        // Default implementation (can be overridden by specific strategies)
        return "Transaction validated successfully.";
    }

    // Implementation of retryPayment from PaymentStrategy
    @Override
    public String retryPayment(double amount, int retries) throws RemoteException {
        if (retries > 0) {
            return "Payment retry successful with " + retries + " attempts remaining.";
        } else {
            return "Payment retry failed: No retries remaining.";
        }
    }
}
