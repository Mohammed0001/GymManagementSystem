/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finance;

import finance.PaymentStrategy;

/**
 *
 * @author hp
 */
public class BankTransferPayment implements PaymentStrategy {
    @Override
    public boolean processPayment(double amount, String currency) {
        System.out.println("Processing Bank Transfer payment of " + amount + " " + currency);
        return true;
    }

    @Override
    public boolean validateTransaction() {
        System.out.println("Validating Bank Transfer transaction...");
        return true;
    }

    @Override
    public boolean retryPayment(double amount, int retries) {
        System.out.println("Retrying Bank Transfer payment (" + retries + " attempts remaining).");
        return retries > 0;
    }
}