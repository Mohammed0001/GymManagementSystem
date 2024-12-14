/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finance;

/**
 *
 * @author hp
 */
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import mms.gymmanagementserver.DBConnector;

public class Payment {
    private int id;
    private int memberID;
    private double amount;
    private int transactionID;
    private String paymentMethod;
    private String date;
    private String currency;
    private String status;
    private PaymentStrategy paymentStrategy;
 private static DBConnector DB = DBConnector.connectDB();
    private static final long serialVersionUID = 9L;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static DBConnector getDB() {
        return DB;
    }

    public static void setDB(DBConnector DB) {
        Payment.DB = DB;
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
    
    public static boolean createPayment(Payment pt) throws RemoteException {
        return DB.inserIntoDB(pt, "Payment");
    }

    public static ArrayList<Payment> getAllPayment() {
        return DB.readAllFromDB("Payment", Payment.class);
    }

    public static boolean getPayment(int id) {
        return DB.readFromDB(id, "Payment", Payment.class);
    }

    public static boolean updatePayment(Payment pt) throws RemoteException {
        return DB.updateInDB(pt.getId(), pt, "Payment");
    }

    public static boolean deletePayment(Payment pt) throws RemoteException {
        return DB.deleteFromDB(pt.getId(), "Payment");
    }
}