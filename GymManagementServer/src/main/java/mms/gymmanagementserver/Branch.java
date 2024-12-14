/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mms.gymmanagementserver;

/**
 *
 * @author hp
 */
import java.util.ArrayList;
import users.Trainer;


public class Branch {
    private int id;
    private String name;
    private String location;
    private ArrayList<Inventory> inventory;
 private ArrayList<Trainer> trainers;
    // Constructor
    public Branch(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.inventory = new ArrayList<>();
         this.trainers = new ArrayList<>();
    }

    // Getters and Setters
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Inventory> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Inventory> inventory) {
        this.inventory = inventory;
    }

    public ArrayList<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(ArrayList<Trainer> trainers) {
        this.trainers = trainers;
    }

    // Methods
    public boolean addInventory(Inventory item) {
        if (!inventory.contains(item)) {
            inventory.add(item);
            System.out.println("Added inventory: " + item.getName());
            return true;
        }
        System.out.println("Inventory already exists.");
        return false;
    }

    public Inventory editInventory(int index, Inventory newItem) {
        if (index >= 0 && index < inventory.size()) {
            Inventory oldItem = inventory.set(index, newItem);
            System.out.println("Updated inventory: " + newItem.getName());
            return oldItem;
        }
        System.out.println("Invalid inventory index.");
        return null;
    }

    public boolean removeInventory(Inventory item) {
        if (inventory.remove(item)) {
            System.out.println("Removed inventory: " + item.getName());
            return true;
        }
        System.out.println("Inventory not found.");
        return false;
    }

    public String viewGymBranchReport(int branchId) {
        if (branchId != id) {
            return "Branch ID does not match.";
        }
        StringBuilder report = new StringBuilder("Branch Report:\n");
        report.append("Branch ID: ").append(id).append("\n");
        report.append("Branch Name: ").append(name).append("\n");
        report.append("Location: ").append(location).append("\n");
        report.append("Inventory:\n");
        for (Inventory item : inventory) {
            report.append("- ").append(item.getName()).append(" (Provider: ").append(item.getProvider()).append(")\n");
        }
        return report.toString();
    }

    public String generateBranchReport() {
        return viewGymBranchReport(id);
    }
    
    // Methods to manage trainers
    public void addTrainer(Trainer trainer) {
        trainers.add(trainer);
        System.out.println("Trainer added: " + trainer.getName());
    }

    public void removeTrainer(Trainer trainer) {
        trainers.remove(trainer);
        System.out.println("Trainer removed: " + trainer.getName());
    }
}
