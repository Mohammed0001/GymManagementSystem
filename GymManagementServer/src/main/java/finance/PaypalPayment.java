/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finance;

import rmi.PaymentStrategy;

/**
 *
 * @author hp
 */
public class PaypalPayment implements PaymentStrategy {
    
    @Override
    public String processPayment(double amount, String currency) {
        System.out.println("Processing PayPal payment of " + amount + " " + currency);
        return "Payment processed successfully: " + amount + " " + currency;
    }

    @Override
    public String validateTransaction() {
        System.out.println("Validating PayPal transaction...");
        return "Transaction validated successfully.";
    }

    @Override
    public String retryPayment(double amount, int retries) {
        if (retries > 0) {
            System.out.println("Retrying PayPal payment (" + retries + " attempts remaining).");
            return "Payment retry successful with " + retries + " attempts remaining.";
        } else {
            System.out.println("No retries remaining for PayPal payment.");
            return "Payment retry failed: No retries remaining.";
        }
    }
}
