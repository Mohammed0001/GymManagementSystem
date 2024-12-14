/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package finance;

/**
 *
 * @author hp
 */
public interface PaymentStrategy {
    String processPayment(double amount, String currency);
    String validateTransaction();
    String retryPayment(double amount, int retries);
}