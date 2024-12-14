package services;

import com.google.gson.annotations.Expose;
import java.io.Serializable;
import java.util.ArrayList;
import mms.gymmanagementserver.DBConnector;

/**
 *
 * @author Mohammed Abou Bakr
 */
public class Inventory implements Serializable {

    @Expose
    private int id;
    @Expose
    private String name;
    @Expose
    private String provider;
    @Expose
    private String description;
    @Expose
    private String lastMaintenanceDate;
    @Expose
    private String nextMaintenanceDate;
    @Expose
    private String warrantyEndDate;

    private static DBConnector DB = DBConnector.connectDB(); // Mohammed Abou Bakr
    private static final long serialVersionUID = 5L;// Mohammed Abou Bakr

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

    public static boolean createTrainingClass(Inventory inv) {
        return DB.inserIntoDB(inv, "Inventory");
    }

    public static boolean updateInventory(Inventory inv) {
        return DB.updateInDB(inv.getId(), inv, "Inventory");
    }

    public static boolean deleteInventory(Inventory inv) {
        return DB.deleteFromDB(inv.getId(), "Inventory");
    }

    public static ArrayList<Inventory> getAllAccounts() {
        return DB.readAllFromDB("Inventory", Inventory.class);
    }

    public static Inventory getAccount(int id) {
        return DB.readFromDB(id, "Inventory", Inventory.class);
    }

}
