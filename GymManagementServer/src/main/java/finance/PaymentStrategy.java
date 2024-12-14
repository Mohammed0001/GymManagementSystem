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
    public String processPayment(double amount, String currency);
    public String validateTransaction();
    public String retryPayment(double amount, int retries);
}