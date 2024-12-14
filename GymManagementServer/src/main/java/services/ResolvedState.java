
package services;

import mms.gymmanagementserver.DBConnector;

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
    private DBConnector DB = DBConnector.connectDB();
    
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
        DB.readFromDB(0, "Complaint",Complaint.class);
    }
    
    @Override
    public void addFeedback(){
        System.out.println("This complaint is already resolved.");
    }
    
    @Override
    public void resolved(){
        DB.updateInDB(0, this, "Complaint");
    }
}
