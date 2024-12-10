/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class PendingState implements ComplaintState{
    
    private Complaint complaint;

    public PendingState(Complaint complaint) {
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
        System.out.println("Complaint ID" + complaint.getId() + "is pending for review");
    }
    
    @Override
    public String addFeedback(){
        return "Feedback cannot be added while complaint is pending";
    }
    
    @Override
    public void resolve(){
        System.out.println("Cannot resolve complaint while it is pending. Needs review first");
    }
}
