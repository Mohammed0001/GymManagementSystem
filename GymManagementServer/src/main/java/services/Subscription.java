/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import com.mongodb.DB;
import finance.Payment;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;
import mms.gymmanagementserver.DBConnector;

/**
 *
 * @author sarahhali
 */
public class Subscription implements Serializable{
    // Attributes
    @Expose
    private int id;
    @Expose
    private String name;
    @Expose
    private String type;
    @Expose
    private double price;
    @Expose
    private String description;
    @Expose
    private boolean isRenewable;
    @Expose
    private Payment payment; // Assuming Payment is another class
    @Expose
    private double discount;
    @Expose
    private String startDate;
    @Expose
    private String endDate;
        private static DBConnector DB = DBConnector.connectDB();
    private static final long serialVersionUID = 9L;


    // Constructor
    public Subscription(int id,String name, String type, double price, String description, boolean isRenewable,
                        Payment payment, double discount, String startDate, String endDate) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.description = description;
        this.isRenewable = isRenewable;
        this.payment = payment;
        this.discount = discount;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isRenewable() {
        return isRenewable;
    }

    public void setRenewable(boolean isRenewable) {
        this.isRenewable = isRenewable;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

    // Methods
    public void activateSubscription() {
        System.out.println("Subscription activated!");
        // Add activation logic
    }

    public void cancelSubscription() {
        System.out.println("Subscription canceled!");
        // Add cancellation logic
    }

    public void renew() {
        if (isRenewable) {
            System.out.println("Subscription renewed!");
            // Add renewal logic
        } else {
            System.out.println("This subscription is not renewable.");
        }
    }

    public double calculateFinalPrice() {
        return price - (price * (discount / 100));
    }

    public boolean isActive() {
        // Logic to check if the subscription is currently active
        // Example: Compare current date with startDate and endDate
        return true; // Placeholder
    }

    // toString Method for debugging or printing
    @Override
    public String toString() {
        return "Subscription{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", isRenewable=" + isRenewable +
                ", payment=" + payment +
                ", discount=" + discount +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
    
     public static boolean createSubscription(Subscription s) throws RemoteException {
        return DB.inserIntoDB(s, "Subscription");
    }

    public static ArrayList<Subscription> getAllSubscription() {
        return DB.readAllFromDB("Subscription", Subscription.class);
    }

    public static boolean getSubscription(int id) {
        return DB.readFromDB(id, "Subscription", Subscription.class);
    }

    public static boolean updateSubscription(Subscription s) throws RemoteException {
        return DB.updateInDB(s.getId(), s, "Subscription");
    }

    public static boolean deleteSubscription(Subscription s) throws RemoteException {
        return DB.deleteFromDB(s.getId(), "Subscription");
    }
}

