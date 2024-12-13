package services;

import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import mms.gymmanagementserver.DBConnector;

/**
 *
 * @author Mohammed Abou Bakr
 */
public class TrainingClass {

    @Expose
    private int id;
    @Expose
    private String name;
    @Expose
    private String type;
    @Expose
    private String schedule;
    @Expose
    private int capacity;
    @Expose
    private boolean isAvailable;
    

    private static DBConnector DB = DBConnector.connectDB(); // Mohammed Abou Bakr
    private static final long serialVersionUID = 3L;// Mohammed Abou Bakr

    public TrainingClass(int id, String name, String type, String schedule, int capacity, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.schedule = schedule;
        this.capacity = capacity;
        this.isAvailable = isAvailable;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setId(boolean isAvailable) {
        this.isAvailable = isAvailable;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "TrainingClass{" + "id=" + id + ", name=" + name + ", type=" + type + ", schedule=" + schedule + ", capacity=" + capacity +", Availabilty="+ isAvailable + '}';
    }

    public static boolean createTrainingClass(TrainingClass trainingClass) {
        return DB.inserIntoDB(trainingClass, "TrainingClass");
    }

    public static boolean updateTrainingClass(TrainingClass trainingClass) {
        return DB.updateInDB(trainingClass.getId(), trainingClass, "TrainingClass");
    }

    public static boolean deleteTrainingClass(TrainingClass trainingClass) {
        return DB.deleteFromDB(trainingClass.getId(), "TrainingClass");
    }

    public static ArrayList<TrainingClass> getAllClasses() {
        return DB.readAllFromDB("TrainingClass", TrainingClass.class);
    }

    public static TrainingClass gettrainingClass(int id) {
        return DB.readFromDB(id, "TrainingClass", TrainingClass.class);
    }

}
