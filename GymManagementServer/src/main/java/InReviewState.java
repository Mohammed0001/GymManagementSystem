/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class InReviewState implements ComplaintState{
    private Complaint complaint;

    public InReviewState(Complaint complaint) {
        this.complaint = complaint;
    }

    public Complaint getComplaint() {
        return complaint;
    }

    public void setComplaint(Complaint complaint) {
        this.complaint = complaint;
    }
    
    @Override
    public void viewComplaint(){
        System.out.println("Complaint ID: " + complaint.getId() + "is currently being reviewed. Details: "+ complaint.getName());
    }
        
    @Override
    public String addFeedback(){
        complaint.setStatus("Feedback added");
        return "Feedback has been added and is under consideration.";
    }
    
    @Override
    public void resolve(){
        System.out.println("Cannot resolve complaint while it is in review");

    }
}
