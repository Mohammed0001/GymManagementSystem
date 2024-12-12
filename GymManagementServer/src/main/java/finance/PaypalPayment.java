/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finance;

/**
 *
 * @author hp
 */
public class PaypalPayment implements PaymentStrategy {
    @Override
    public boolean processPayment(double amount, String currency) {
        System.out.println("Processing PayPal payment of " + amount + " " + currency);
        return true;
    }

    @Override
    public boolean validateTransaction() {
        System.out.println("Validating PayPal transaction...");
        return true;
    }

    @Override
    public boolean retryPayment(double amount, int retries) {
        System.out.println("Retrying PayPal payment (" + retries + " attempts remaining).");
        return retries > 0;
    }
}