
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;
import finance.Payment;
import java.time.LocalDate;
import mms.gymmanagementserver.DBConnector;

/**
 *
 * @author Karim 219226
 */
public class Subscription {
    private int id;
    private String type;
    private double price;
    private Payment payment;
    private String startDate;
    private String endDate;
    
    private DBConnector DB = DBConnector.connectDB();

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
        DB.updateInDB(id, this, "Subscription");
    }

    public void cancelSubscription() {
        DB.updateInDB(id, this, "Subscription");
    }
    
    public void renewSubscription() {
        DB.updateInDB(id, this, "Subscription");
    }

    public boolean isActive() {
        LocalDate currentDate = LocalDate.now();
        LocalDate lastDate = LocalDate.parse(this.endDate);
        return lastDate.isAfter(currentDate) || lastDate.isEqual(currentDate);
    }
}
