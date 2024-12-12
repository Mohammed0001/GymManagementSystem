
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
        DB.readFromDB(0, coll, cls)
    }
    
    @Override
    public String addFeedback(){
        DB.inserIntoDB(this, "Complaint");
    }
    
    @Override
    public void resolve(){
        DB.inserIntoDB(this, "Complaint");
    }
}
