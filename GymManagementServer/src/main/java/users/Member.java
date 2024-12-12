package users;

import services.Subscription;
import mms.gymmanagementserver.Person;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sarahhali
 */
public class Member extends Person, Progress, Subscription {

    // Attributes
    private MemberProgressROI progress;
    private Subscription subscription;
    private boolean status;

    // Constructor
    public Member(MemberProgressROI progress, Subscription subscription, boolean status) {
        this.progress = progress;
        this.subscription = subscription;
        this.status = status;
    }

    // Methods
    public void trackProgress() {
        // Logic for tracking member's progress
        System.out.println("Tracking progress...");
    }

    public void submitComplaint() {
        // Logic for submitting a complaint
        System.out.println("Submitting complaint...");
    }

    public void makePayment() {
        // Logic for making a payment
        System.out.println("Making payment...");
    }

    public String viewAvailableClasses() {
        // Logic for viewing available classes
        return "Available classes displayed.";
    }

    public void updateProfile() {
        // Logic for updating profile information
        System.out.println("Updating profile...");
    }

    public void renewSubscription() {
        // Logic for renewing subscription
        System.out.println("Renewing subscription...");
    }

    // Getters
    public MemberProgressROI getProgress() {
        return progress;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public boolean isStatus() {
        return status;
    }

    // Setters
    public void setProgress(MemberProgressROI progress) {
        this.progress = progress;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Update method
    public void update(String feedbackDetails) {
        // Logic for updating based on feedback details
        System.out.println("Updating with feedback: " + feedbackDetails);
    }
}

