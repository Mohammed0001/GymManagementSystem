
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.io.Serializable;

/**
 *
 * @author sarahhali
 */
public class SubscriptionDTO implements Serializable{
    // Attributes
    private int id;
    private String name;
    private String type;
    private double price;
    private boolean isRenewable;
    private Payment payment; // Assuming Payment is another class
    private double discount;
    private String startDate;
    private String endDate;

    // Constructor
    public SubscriptionDTO(int id, String name, String type, double price, boolean isRenewable,
                           Payment payment, double discount, String startDate, String endDate) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    // toString Method for debugging or display
    @Override
    public String toString() {
        return "SubscriptionDTO{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", isRenewable=" + isRenewable +
                ", payment=" + payment +
                ", discount=" + discount +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
