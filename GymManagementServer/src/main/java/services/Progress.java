package services;

import com.google.gson.annotations.Expose;
import java.io.Serializable;
import javax.swing.text.Document;
import mms.gymmanagementserver.DBConnector;

/**
 *
 * @author Mohammed Abou Bakr
 */
public class Progress implements IMemberProgressROI, Serializable {

    @Expose
    private int id;
    @Expose
    private double weight;
    @Expose
    private double bodyFatPercentage;
    @Expose
    private double muscleMass;

    private static DBConnector DB = DBConnector.connectDB();
    private static final long serialVersionUID = 4L;

    public Progress(int id, double weight, double bodyFatPercentage, double muscleMass) {
        this.id = id;
        this.weight = weight;
        this.bodyFatPercentage = bodyFatPercentage;
        this.muscleMass = muscleMass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBodyFatPercentage() {
        return bodyFatPercentage;
    }

    public void setBodyFatPercentage(double bodyFatPercentage) {
        this.bodyFatPercentage = bodyFatPercentage;
    }

    public double getMuscleMass() {
        return muscleMass;
    }

    public void setMuscleMass(double muscleMass) {
        this.muscleMass = muscleMass;
    }

    @Override
    public String toString() {
        return "Progress{"
                + "personId=" + id
                + ", weight=" + weight
                + ", bodyFatPercentage=" + bodyFatPercentage
                + ", muscleMass=" + muscleMass
                + '}';
    }

    public static Progress getProgressByPersonId(int id) {

        Progress result = DB.readFromDB(id, "Progress", Progress.class);
        return result;
    }
}
