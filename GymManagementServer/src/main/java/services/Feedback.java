package services;




import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import mms.gymmanagementserver.DBConnector;
import rmipack.FeedbackNotifier;
import rmipack.MemberObserver;
import users.Person;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kanzihaitham
 */
public class Feedback extends UnicastRemoteObject implements FeedbackNotifier, Serializable {
    private int id;
    private String details;
    private String dateProvided;
    private double rating;
    private ArrayList<MemberObserver> observers;

    
    private static DBConnector DB = DBConnector.connectDB();
    private static final long serialVersionUID = 8L;
    
    
   
    
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
    public void registerObserver(MemberObserver observer)  throws RemoteException {
        observers.add(observer);
        System.out.println("Observer registered.");
    }
    
  @Override
    public void removeObserver(MemberObserver observer)   throws RemoteException{
        observers.remove(observer);
        System.out.println("Observer removed.");
    }

    @Override
    public void notifyObservers(String feedbackDetails) throws RemoteException {
        System.out.println("Notifying observers...");
        for (MemberObserver observer : observers) {
            observer.update(feedbackDetails);
        }
    }
    
    
        public static boolean createFeedback(Feedback f) throws RemoteException {
        return DB.inserIntoDB(f, "Feedback");
    }

    public static ArrayList<Feedback> getAllAccounts() {
        return DB.readAllFromDB("Feedback", Feedback.class);
    }

    public static Feedback getFeedback(int id) {
        return DB.readFromDB(id, "Feedback", Feedback.class);
    }

    public static boolean updateFeedback(Feedback f) throws RemoteException {
        return DB.updateInDB(f.getId(), f, "Feedback");
    }

    public static boolean deleteFeedback(Feedback f) throws RemoteException {
        return DB.deleteFromDB(f.getId(), "Feedback");
    }
}
