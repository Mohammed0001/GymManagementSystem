
package users;


import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import static users.Person.DB;
import services.Branch;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kanzihaitham
 */
public class Gymmanager extends Person {
    
    private Branch branch;

    public Gymmanager(int id, String name, int phoneNumber, String DOB, String email,String password,String role , Branch branch) {
        super(id, name, phoneNumber, DOB, email, password , role); 
        this.branch = branch;
    }
    // Getter for branch
    public Branch getBranch() {
        return branch;
    }

    // Setter for branch
    public void setBranch(Branch branch) {
        this.branch = branch;
    }
    
    public String viewStaffAccounts() {
        // Assuming the Branch class contains a list of staff members.
        List<Trainer> trainers = branch.getTrainers();
        StringBuilder staffDetails = new StringBuilder("Staff Accounts:\n");

        for (Trainer trainer : trainers) {
            staffDetails.append("Name: ").append(trainer.getName())
                    .append(", Specialty: ").append(trainer.getSpecialty())
                    .append(", Rating: ").append(trainer.getRating()).append("\n");
        }

        return staffDetails.toString();
    }
   
    public static boolean createAccount(Gymmanager g) throws RemoteException {
        return DB.inserIntoDB(g, "Gymmanager");
    }

    public static ArrayList<Gymmanager> getAllGymmanager() {
        return DB.readAllFromDB("Gymmanager", Gymmanager.class);
    }

    public static Person getAccount(int id) {
        return DB.readFromDB(id, "Gymmanager", Gymmanager.class);
    }

    public static boolean updateAccount(Gymmanager g) throws RemoteException {
        return DB.updateInDB(g.getId(), g, "Gymmanager");
    }

    public static boolean deleteAccount(Gymmanager g) throws RemoteException {
        return DB.deleteFromDB(g.getId(), "Gymmanager");
    }
   
}
