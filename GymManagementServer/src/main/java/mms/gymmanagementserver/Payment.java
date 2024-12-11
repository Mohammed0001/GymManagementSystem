/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mms.gymmanagementserver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import rmi.PaymentStrategy;
import java.util.Date;

public class Payment extends UnicastRemoteObject implements PaymentStrategy{
    private int id;
    private int memberID;
    private double amount;
    private int transactionID;
    private String paymentMethod;
    private String date;
    private String currency;
    private String status;
    private PaymentStrategy paymentStrategy;

    public Payment(int id, int memberID, double amount, String paymentMethod, String currency, PaymentStrategy paymentStrategy) {
        this.id = id;
        this.memberID = memberID;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.currency = currency;
        this.status = "Pending";
        this.date = new Date().toString();
        this.paymentStrategy = paymentStrategy;
    }

    public Payment() throws RemoteException {
    }
    
    

    public boolean makePayment() {
        if (paymentStrategy.processPayment(amount, currency)) {
            status = "Completed";
            System.out.println("Payment successful for transaction ID: " + transactionID);
            return true;
        } else {
            status = "Failed";
            System.out.println("Payment failed for transaction ID: " + transactionID);
            return false;
        }
    }

    public void refundPayment() {
        System.out.println("Refunding payment for transaction ID: " + transactionID);
        status = "Refunded";
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public String getPaymentStatus() {
        return status;
    }

    @Override
    public boolean processPayment(double amount, String currency) throws RemoteException{
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean validateTransaction() throws RemoteException{
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean retryPayment(double amount, int retries) throws RemoteException{
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}