/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class ResolvedState implements ComplaintState{
    private Complaint complaint;
    
    public ResolvedState(Complaint complaint) {
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
        System.out.println("Complaint ID " + complaint.getId() + " has been resolved. Resolution Date: " + complaint.getResolutionDate());
    }
    
    @Override
    public String addFeedback(){
        return "Thank you for your feedback on the resolved complaint.";     
    }
    
    @Override
    public void resolve(){
        System.out.println("This complaint has already been resolved on " + complaint.getResolutionDate() + ".");
    }
}
