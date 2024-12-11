/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mms.gymmanagementserver;

/**
 *
 * @author hp
 */
public interface PaymentStrategy {
    boolean processPayment(double amount, String currency);
    boolean validateTransaction();
    boolean retryPayment(double amount, int retries);
}