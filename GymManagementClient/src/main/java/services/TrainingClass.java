package services;

import java.io.Serializable;


/**
 *
 * @author Mohammed Abou Bakr
 */
public class TrainingClass implements Serializable{

    private int id;
    private String name;
    private String type;
    private String schedule;
    private int capacity;
    private boolean isAvailable;
    
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

}
