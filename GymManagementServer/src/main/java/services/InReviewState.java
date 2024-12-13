
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
public class InReviewState implements ComplaintState{
    private Complaint complaint;
    private DBConnector DB = DBConnector.connectDB();

    
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
        DB.readFromDB(0, "Complaint",Complaint.class);
    }
    
    @Override
    public void addFeedback(){
        DB.inserIntoDB(this, "Complaint");
    }
    
    @Override
    public void resolved(){
        System.out.println("This Complaint is in review and will be solved in a couple of days. Thank you");
        DB.updateInDB(0, this, "Complaint");
    }
}