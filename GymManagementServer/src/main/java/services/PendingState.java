
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
public class PendingState implements ComplaintState{
    
    private Complaint complaint;
    private DBConnector DB = DBConnector.connectDB();


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
        
    }
    
    @Override
    public String addFeedback(){
        System.out.println("");
    }
    
    @Override
    public void resolve(){
        DB.inserIntoDB(this, "Complaint");
    }
}
