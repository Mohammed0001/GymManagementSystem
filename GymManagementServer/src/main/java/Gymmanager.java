
import java.util.List;

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

    public GymManager(int id, String name, int phoneNumber, String DOB, String email, Branch branch) {
        super(id, name, phoneNumber, DOB, email); // Call the superclass constructor
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
}