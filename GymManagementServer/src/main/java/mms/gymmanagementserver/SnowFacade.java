/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mms.gymmanagementserver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import rmipack.PaymentStrategy;

/**
 *
 * @author hp
 */
public class SnowFacade extends UnicastRemoteObject implements PaymentStrategy {
    public SnowFacade() throws RemoteException {

    }

    @Override
    public String processPayment(double amount, String currency) throws RemoteException {
        if (amount <= 0) {
            return "Invalid payment amount. Please enter a valid amount.";
        }
        return "Payment of " + amount + " " + currency + " processed successfully.";
       
    }

    @Override
    public String validateTransaction() throws RemoteException {
       return "Transaction validated successfully."; }

    @Override
    public String retryPayment(double amount, int retries) throws RemoteException {
      if (retries <= 0) {
            return "No retries left. Please try again later.";
        }
        return "Retrying payment of " + amount + ". Remaining retries: " + (retries - 1);
    }}

