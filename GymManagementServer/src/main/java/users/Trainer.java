
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users;

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
        super(id, name, phoneNumber, DOB, email, password);
        this.branchID = branchID;
        this.specialty = specialty;
        this.availability = availability;
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
}