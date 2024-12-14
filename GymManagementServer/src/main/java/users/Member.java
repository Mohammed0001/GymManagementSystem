package users;

import com.google.gson.annotations.Expose;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;
import mms.gymmanagementserver.DBConnector;
import services.Subscription;
import services.IMemberProgressROI;
import rmipack.MemberObserver;

/**
 *
 * @author sarahhali
 */
public class Member extends Person implements Serializable,MemberObserver  {

    // Attributes
    @Expose
    private IMemberProgressROI progress;
    @Expose
    private Subscription subscription;
    @Expose
    private boolean status;
    private static DBConnector DB = DBConnector.connectDB(); // Mohammed Abou Bakr
    private static final long serialVersionUID = 2L;// Mohammed Abou Bakr

    // Constructor
    public Member(int id, String name, int phoneNumber, String DOB, String email, String password, IMemberProgressROI progress, Subscription subscription, boolean status) {
        super(id, name, phoneNumber, DOB, email, password, "Member");
        this.progress = progress;
        this.subscription = subscription;
        this.status = status;

    }

    // Methods
    public void trackProgress() {
        // Logic for tracking member's progress
        System.out.println("Tracking progress...");
    }

    public void submitComplaint() {
        // Logic for submitting a complaint
        System.out.println("Submitting complaint...");
    }

    public void makePayment() {
        // Logic for making a payment
        System.out.println("Making payment...");
    }

    public String viewAvailableClasses() {
        // Logic for viewing available classes
        return "Available classes displayed.";
    }

    public void updateProfile() {
        // Logic for updating profile information
        System.out.println("Updating profile...");
    }

    public void renewSubscription() {
        // Logic for renewing subscription
        System.out.println("Renewing subscription...");
    }

    // Getters
    public IMemberProgressROI getProgress() {// Mohammed Abou Bakr
        return progress;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public boolean isStatus() {
        return status;
    }

    // Setters
    public void setProgress(IMemberProgressROI progress) { // Mohammed Abou Bakr
        this.progress = progress;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Update method
    public void update(String feedbackDetails) {
        // Logic for updating based on feedback details
        System.out.println("Updating with feedback: " + feedbackDetails);
    }
    
    public static boolean updateAccount(Member m) {// Mohammed Abou Bakr
        return DB.updateInDB(m.getId(), m, "Person");
    }

    public static boolean deleteAccount(Member m) {// Mohammed Abou Bakr
        return DB.deleteFromDB(m.getId(), "Person");
    }
    
      public static boolean createAccount(Member m) throws RemoteException {
        return DB.inserIntoDB(m, "Member");
   }

   public static ArrayList<Member> getAllMember () {
      return DB.readAllFromDB("Member ", Member.class);
   }

    public static Person getMember(int id) {
        return DB.readFromDB(id, "Member ", Member.class);
   }
    public static boolean updateMember(Member  m) throws RemoteException {
        return DB.updateInDB(m.getId(), m, "Member ");
   }

  public static boolean deleteMember(Member m) throws RemoteException {
       return DB.deleteFromDB(m.getId(), "Member ");
   }
}
