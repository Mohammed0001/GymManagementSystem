import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kanzihaitham
 */
public class Feedback extends UnicastRemoteObject implements FeedbackNotifier{
    private int id;
    private String details;
    private String dateProvided;
    private double rating;
    private List<Observer> observers;
    
    public Feedback(int id, String details, String dateProvided, double rating) throws RemoteException {
        this.id = id;
        this.details = details;
        this.dateProvided = dateProvided;
        this.rating = rating;
        this.observers = new ArrayList<>();
    }
    // Getters and Setters
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) throws RemoteException {
        this.details = details;
        notifyObservers(details); // Notify observers when feedback details are updated
    }

    // FeedbackNotifier Methods
    @Override
    public void registerObserver(Observer observer) throws RemoteException {
        observers.add(observer);
        System.out.println("Observer registered.");
    }

    @Override
    public void removeObserver(Observer observer) throws RemoteException {
        observers.remove(observer);
        System.out.println("Observer removed.");
    }

    @Override
    public void notifyObservers(String feedbackDetails) throws RemoteException {
        System.out.println("Notifying observers...");
        for (Observer observer : observers) {
            observer.update(feedbackDetails); // Notify each observer
        }
    }
}
