/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rmipack;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author hp
 */
public interface PaymentStrategy extends Remote{
    String processPayment(double amount, String currency)throws RemoteException;
    String validateTransaction()throws RemoteException;
    String retryPayment(double amount, int retries)throws RemoteException;
    
    
}