/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmi;
import finance.Payment;
/**
 *
 * @author sarahhali
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SubscriptionFacade extends UnicastRemoteObject implements FacadeInterface {

    Subscription subscription;

    // Constructor
    public SubscriptionFacade() throws RemoteException {
        subscription = new Subscription(0, "", 0.0, "", false, null, 0.0, "", "");
    }

    // Method to set subscription data
    @Override
    public void setSubscriptionData(int id, String type, double price, String description, boolean isRenewable,
                                    Payment payment, double discount, String startDate, String endDate) throws RemoteException {
        subscription.setId(id);
        subscription.setType(type);
        subscription.setPrice(price);
        subscription.setDescription(description);
        subscription.setRenewable(isRenewable);
        subscription.setPayment(payment);
        subscription.setDiscount(discount);
        subscription.setStartDate(startDate);
        subscription.setEndDate(endDate);
    }

    // Method to retrieve subscription data as a formatted string
    @Override
    public String getSubscriptionData() throws RemoteException {
        return "ID: " + subscription.getId() +
               ", Type: " + subscription.getType() +
               ", Price: " + subscription.getPrice() +
               ", Description: " + subscription.getDescription() +
               ", Renewable: " + subscription.isRenewable() +
               ", Discount: " + subscription.getDiscount() +
               ", Start Date: " + subscription.getStartDate() +
               ", End Date: " + subscription.getEndDate();
    }

    // Method to get a SubscriptionDTO
    @Override
    public SubscriptionDTO getSubscription() throws RemoteException {
        return new SubscriptionDTO(
            subscription.getId(),
            subscription.getType(),
            subscription.getPrice(),
            subscription.isRenewable(),
            subscription.getPayment(),
            subscription.getDiscount(),
            subscription.getStartDate(),
            subscription.getEndDate()
        );
    }
}
