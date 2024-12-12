/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;
import finance.Payment;
import java.time.LocalDate;

/**
 *
 * @author Karim 219226 and kanzi
 */
public class Subscription {
    private int id;
    private String type;
    private double price;
    private Payment payment;
    private String startDate;
    private String endDate;

    public Subscription(int id, String type, double price, Payment payment, String startDate, String endDate) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.payment = payment;
        this.startDate = startDate;
        this.endDate = endDate;
    }

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

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
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

    public void activateSubscription() {
        try {
            UpdateResult result = collection.updateOne(eq("id", this.id), Updates.set("status", "active"));
            if (result.getModifiedCount() > 0) {
                System.out.println("Subscription activated successfully.");
            } else {
                System.out.println("No changes made, subscription might already be active.");
            }
        } catch (Exception e) {
            System.out.println("Error activating subscription: " + e);
        }
    }

    public void cancelSubscription() {
        try {
            UpdateResult subscriptionResult = collection.updateOne(eq("id", this.id), Updates.set("status", "canceled"));
            UpdateResult memberResult = database.getCollection("Member").updateOne(eq("subscriptionId", this.id), Updates.set("status", "canceled"));

            if (subscriptionResult.getModifiedCount() > 0 && memberResult.getModifiedCount() > 0) {
                System.out.println("Subscription canceled successfully.");
            } else {
                System.out.println("Error canceling subscription: Not found or already canceled.");
            }
        } catch (Exception e) {
            System.out.println("Error canceling subscription: " + e);
        }
    }
    
    public void renewSubscription() {
        String newEndDate = "2024-12-31";
        try {
            UpdateResult result = collection.updateOne(eq("id", this.id),
                    Updates.combine(
                        Updates.set("endDate", newEndDate),
                        Updates.set("status", "active")
                    ));
            if (result.getModifiedCount() > 0) {
                System.out.println("Subscription renewed successfully to " + newEndDate);
            } else {
                System.out.println("No changes made, check subscription validity.");
            }
        } catch (Exception e) {
            System.out.println("Error renewing subscription: " + e);
        }
    }

    public boolean isActive() {
        LocalDate currentDate = LocalDate.now();
        LocalDate endDate = LocalDate.parse(this.endDate);
        return endDate.isAfter(currentDate) || endDate.isEqual(currentDate);
    }
}