package services;



import services.MemberObserver;
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
public class Feedback extends UnicastRemoteObject implements FeedbackNotifier {
    private int id;
    private String details;
    private String dateProvided;
    private double rating;
    private List<MemberObserver> observers= new ArrayList<>();
    
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
    
    public String getDateProvided() {
        return dateProvided;
    }

    public void setDateProvided(String dateProvided) {
        this.dateProvided = dateProvided;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getId() {
        return id;
    }
 public void submitFeedback(String feedbackDetails) throws RemoteException {
        this.details = feedbackDetails;
        notifyObservers(feedbackDetails);
    }
    // FeedbackNotifier Methods
@Override
    public void registerObserver(MemberObserver observer) {
        observers.add(observer);
        System.out.println("Observer registered.");
    }
    
  @Override
    public void removeObserver(MemberObserver observer) {
        observers.remove(observer);
        System.out.println("Observer removed.");
    }

    @Override
    public void notifyObservers(String feedbackDetails) {
        System.out.println("Notifying observers...");
        for (MemberObserver observer : observers) {
            observer.update(feedbackDetails);
        }
    }
}