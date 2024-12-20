package services;


import com.google.gson.annotations.Expose;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.io.Serializable;
import mms.gymmanagementserver.DBConnector;
import users.Gymmanager;
import users.Member;


/**
 *
 * @author Karim 219226
 */
public class Complaint implements Serializable{

    @Expose
    private int id; 
    @Expose
    private String name;
    @Expose
    private Member complainer;
    @Expose
    private String email;
    @Expose
    private String dateSubmitted;
    @Expose
    private String resolutionDate;
    @Expose
    private String status;
    @Expose
    private String feedback;
    @Expose
    private Gymmanager managedBy;
    @Expose
    private ComplaintState compliantState;
    @Expose
    private String comp;


    private static DBConnector DB = DBConnector.connectDB();
    private static final long serialVersionUID = 7L;

    public Complaint(int id, String name, Member complainer, String email, String dateSubmitted, String resolutionDate, String status, String feedback, Gymmanager managedBy, ComplaintState compliantState, String comp) {
        this.id = id;
        this.name = name;
        this.complainer = complainer;
        this.email = email;
        this.dateSubmitted = dateSubmitted;
        this.resolutionDate = resolutionDate;
        this.status = status;
        this.feedback = feedback;
        this.managedBy = managedBy;
        this.compliantState = compliantState;
        this.comp = comp;
    }
    
      // Constructor for minimal complaint details
    public Complaint(int id, String name, String comp, String dateSubmitted) {
        this.id = id;
        this.name = name;
        this.comp = comp;
        this.dateSubmitted = dateSubmitted;
    }

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
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

    public String getfeedback() {
        return feedback;
    }

    public void setfeedback(String feedback) {
        this.feedback = feedback;
    }

    public Gymmanager getManagedBy() {
        return managedBy;
    }

    public void setManagedBy(Gymmanager managedBy) {
        this.managedBy = managedBy;
    }

    public ComplaintState getCompliantState() {
        return compliantState;
    }

    public void setCompliantState(ComplaintState compliantState) {
        this.compliantState = compliantState;
    }

    public void submitComplaint() {
        this.status = "Submitted";
        this.dateSubmitted = java.time.LocalDate.now().toString();
        this.compliantState.viewComplaint();
    }

    public void addressComplaint() {
        this.status = "In Review";
        this.compliantState = new InReviewState(this);
    }

    public String getComplaint() {
        return "Complaint ID: " + id + ",Name: " + name + ", Status" + status;
    }

    public void markResolved(String s) {
        this.status = "Resolved";
        this.compliantState.resolved();
    }

    public String addFeedback() {
        return "";
    }

    public void viewComplaint() {

    }

    public void resolve() {

    }

    @Override
    public String toString() {
        return "Complaint{" + "id=" + id + ", name=" + name + ", complainer=" + complainer + ", email=" + email + ", dateSubmitted=" + dateSubmitted + ", resolutionDate=" + resolutionDate + ", status=" + status + ", feedback=" + feedback + ", managedBy=" + managedBy + ", compliantState=" + compliantState + "Complain"+ comp+ '}';
    }

//public static boolean createComplaint(Complaint c) throws RemoteException {
//        return DB.inserIntoDB(c, "Complaint");
//    }

    
    public static boolean insertComplaintToDB(Complaint complaint) {
    Complaint minimalComplaint = new Complaint(
        complaint.getId(),
        complaint.getName(),
        complaint.getComp(),
        complaint.getDateSubmitted()
    );
    return DB.inserIntoDB(minimalComplaint, "Complaint");
}

    public static ArrayList<Subscription> getAllComplaint() {
        return DB.readAllFromDB("Complaint", Subscription.class);
    }

    public static boolean getComplaint(int id) {
        return DB.readFromDB(id, "Complaint", Complaint.class);
    }

    public static boolean updateComplaint(Complaint c) throws RemoteException {
        return DB.updateInDB(c.getId(), c, "Complaint");
    }

    public static boolean deleteComplaint(Complaint c) throws RemoteException {
        return DB.deleteFromDB(c.getId(), "Complaint");
    }
}
