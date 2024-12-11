/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mms.gymmanagementserver;

/**
 *
 * @author hp
 */
public class Inventory {
    private int id;
    private String name;
    private String provider;
    private String description;
    private String lastMaintenanceDate;
    private String nextMaintenanceDate;
    private String warrantyEndDate;

    // Constructor
    public Inventory(int id, String name, String provider, String description, 
                     String lastMaintenanceDate, String nextMaintenanceDate, String warrantyEndDate) {
        this.id = id;
        this.name = name;
        this.provider = provider;
        this.description = description;
        this.lastMaintenanceDate = lastMaintenanceDate;
        this.nextMaintenanceDate = nextMaintenanceDate;
        this.warrantyEndDate = warrantyEndDate;
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

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLastMaintenanceDate() {
        return lastMaintenanceDate;
    }

    public void setLastMaintenanceDate(String lastMaintenanceDate) {
        this.lastMaintenanceDate = lastMaintenanceDate;
    }

    public String getNextMaintenanceDate() {
        return nextMaintenanceDate;
    }

    public void setNextMaintenanceDate(String nextMaintenanceDate) {
        this.nextMaintenanceDate = nextMaintenanceDate;
    }

    public String getWarrantyEndDate() {
        return warrantyEndDate;
    }

    public void setWarrantyEndDate(String warrantyEndDate) {
        this.warrantyEndDate = warrantyEndDate;
    }

    // Methods
    public boolean needMaintenance() {
        // Placeholder for actual date comparison logic
        System.out.println("Checking if " + name + " needs maintenance...");
        return true; // Replace with real comparison logic
    }

    public void updateStatus(String status) {
        System.out.println("Updating status for inventory " + name + " to: " + status);
    }
}
