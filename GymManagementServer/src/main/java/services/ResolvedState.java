
package services;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Karim 219226
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

    }
    
    @Override
    public String addFeedback(){

    }
    
    @Override
    public void resolve(){

    }
}
