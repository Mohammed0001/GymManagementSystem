
package services;

import users.Gymmanager;
import users.Member;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Karim 219226
 */
public class Complaint {
    
    private int id;
    private String name;
    private Member complainer;
    private String email;
    private String dateSubmitted;
    private String resolutionDate;
    private String status;
    private String specialty;
    private Gymmanager managedBy;
    private ComplaintState compliantState;

    public Complaint(int id, String name, Member complainer, String email, String dateSubmitted, String resolutionDate, String status, String specialty, GymManager managedBy, ComplaintState compliantState) {
        this.id = id;
        this.name = name;
        this.complainer = complainer;
        this.email = email;
        this.dateSubmitted = dateSubmitted;
        this.resolutionDate = resolutionDate;
        this.status = status;
        this.specialty = specialty;
        this.managedBy = managedBy;
        this.compliantState = compliantState;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Member getComplainer() {
        return complainer;
    }

    public void setComplainer(Member complainer) {
        this.complainer = complainer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(String dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    public String getResolutionDate() {
        return resolutionDate;
    }

    public void setResolutionDate(String resolutionDate) {
        this.resolutionDate = resolutionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public GymManager getManagedBy() {
        return managedBy;
    }

    public void setManagedBy(GymManager managedBy) {
        this.managedBy = managedBy;
    }

    public ComplaintState getCompliantState() {
        return compliantState;
    }

    public void setCompliantState(ComplaintState compliantState) {
        this.compliantState = compliantState;
    }
    
    public void submitComplaint(){
        this.status = "Submitted";
        this.dateSubmitted = java.time.LocalDate.now().toString();
        this.compliantState.viewComplaint();
    }
    
    public void addressComplaint(){
        this.status = "In Review";
        this.compliantState = new InReviewState(this);
    }
    
    public String getComplaint(){
        return "Complaint ID: " + id + ",Name: " + name + ", Status" + status;  
    }
    
    public void markResolved(String s){
        this.status = "Resolved";
        this.compliantState.resolve();
    }
    
    public String addFeedback(){

    }
    
    public void viewComplaint(){
        
    }
    
    public void resolve(){
        
    }

    @Override
    public String toString() {
        return "Complaint{" + "id=" + id + ", name=" + name + ", complainer=" + complainer + ", email=" + email + ", dateSubmitted=" + dateSubmitted + ", resolutionDate=" + resolutionDate + ", status=" + status + ", specialty=" + specialty + ", managedBy=" + managedBy + ", compliantState=" + compliantState + '}';
    }   
}