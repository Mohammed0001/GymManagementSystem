
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kanzihaitham
 */
public class Subscription {
    private int id;
    private String type;
    private double price;
    private String description;
    private boolean isRenewable;
    private double discount;
    private String startDate;
    private String endDate;
    private Payment payment; // Association with Payment
    
    
    public Subscription(int id, String type, double price, String description, boolean isRenewable, double discount,
                        String startDate, String endDate, Payment payment) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.description = description;
        this.isRenewable = isRenewable;
        this.discount = discount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.payment = payment;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isRenewable() {
        return isRenewable;
    }

    public void setRenewable(boolean renewable) {
        isRenewable = renewable;
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

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    
    
    public void activateSubscription() {
        System.out.println("Subscription activated for type: " + type);
    }
    
     public void cancelSubscription() {
        System.out.println("Subscription cancelled for type: " + type);
    }
     
     public void renew() {
        if (isRenewable) {
            System.out.println("Subscription renewed.");
        } else {
            System.out.println("Subscription cannot be renewed.");
        }
    }
     
     public double calculateFinalPrice() {
        return price - (price * discount / 100);
    }
     
     public boolean isActive() {
        // Define the date format used for startDate and endDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            // Parse the startDate and endDate
            LocalDate start = LocalDate.parse(startDate, formatter);
            LocalDate end = LocalDate.parse(endDate, formatter);

            // Get the current date
            LocalDate today = LocalDate.now();

            // Check if the subscription is active
            return (today.isEqual(start) || today.isAfter(start)) && today.isBefore(end);
        } catch (DateTimeParseException e) {
            System.out.println("Error parsing date. Please ensure the date format is yyyy-MM-dd.");
            return false;
        }
    }

     // Testing the isActive() method
    public static void main(String[] args) {
        // Example Subscription
        Subscription subscription = new Subscription(1, "Premium", 100.0, "Access to all gym facilities", true, 10.0,
                "2024-01-01", "2024-12-31", null);

        // Test isActive method
        System.out.println("Is Subscription Active? " + subscription.isActive());
    }
    
      public void manageSubscription(Member member) {
        System.out.println("Managing subscription for member: " + member.getName());
    }
}
