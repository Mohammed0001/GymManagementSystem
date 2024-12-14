/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finance;

/**
 *
 * @author hp
 */
public class BankTransferPayment implements PaymentStrategy {

    @Override
    public String processPayment(double amount, String currency) {
        System.out.println("Processing Bank Transfer payment of " + amount + " " + currency);
        return "Bank Transfer payment of " + amount + " " + currency + " processed successfully.";
    }

    @Override
    public String validateTransaction() {
        System.out.println("Validating Bank Transfer transaction...");
        return "Bank Transfer transaction validated successfully.";
    }

    @Override
    public String retryPayment(double amount, int retries) {
        if (retries > 0) {
            System.out.println("Retrying Bank Transfer payment (" + retries + " attempts remaining).");
            return "Bank Transfer payment retry successful. " + retries + " attempts remaining.";
        } else {
            System.out.println("No retries remaining for Bank Transfer payment.");
            return "Bank Transfer payment retry failed: No retries remaining.";
        }
    }
}
