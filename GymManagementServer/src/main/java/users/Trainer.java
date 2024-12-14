
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users;

import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author ahmed
 */
public class Trainer extends Person {
    private int branchID;
    private String specialty;
    private String availability;
    private double rating;

    public Trainer(int id, String name, int phoneNumber, String DOB, String email, String password, int branchID, String specialty, String availability, double rating) {
        super(id, name, phoneNumber, DOB, email, password ,"Trainer");
        this.branchID = branchID;
        this.specialty = specialty;
        this.availability = availability;
        this.rating = rating;
    }

    public int getBranchID() {
        return branchID;
    }

    public void setBranchID(int branchID) {
        this.branchID = branchID;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    
    

    public void assignToSession(String session) {
        System.out.println("Trainer assigned to session: " + session);
    }

    public void updateAvailability(String newAvailability) {
        this.availability = newAvailability;
        System.out.println("Availability updated to: " + availability);
    }

    public void viewMemberProgress(int memberId) {
        System.out.println("Viewing progress for member ID: " + memberId);
    }

    public void createWorkoutPlan(int memberId) {
        System.out.println("Creating workout plan for member ID: " + memberId);
    }
    
     public static boolean createTrainer(Trainer t) throws RemoteException {
        return DB.inserIntoDB(t, "Trainer");
    }

    public static ArrayList<Trainer> getAllTrainers() {
        return DB.readAllFromDB("Trainer", Trainer.class);
    }

    public static Trainer getTrainer(int id) {
        return DB.readFromDB(id, "Trainer", Trainer.class);
    }

    public static boolean updateTrainer(Trainer t) throws RemoteException {
        return DB.updateInDB(t.getId(), t, "Trainer");
    }

    public static boolean deleteTrainer(Trainer t) throws RemoteException {
        return DB.deleteFromDB(t.getId(), "Trainer");
    }
}