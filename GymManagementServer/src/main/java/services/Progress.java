package services;

import com.google.gson.annotations.Expose;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;
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

    @Override
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getBodyFatPercentage() {
        return bodyFatPercentage;
    }

    public void setBodyFatPercentage(double bodyFatPercentage) {
        this.bodyFatPercentage = bodyFatPercentage;
    }

    @Override
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
    public static boolean createProgress(Progress pg) throws RemoteException {
        return DB.inserIntoDB(pg, "Subscription");
    }

    public static ArrayList<Progress> getAllProgress() {
        return DB.readAllFromDB("Progress", Progress.class);
    }

    public static boolean getProgress(int id) {
        return DB.readFromDB(id, "Progress", Progress.class);
    }

    public static boolean updateProgress(Progress pg) throws RemoteException {
        return DB.updateInDB(pg.getId(), pg, "Progress");
    }

    public static boolean deleteProgress(Progress pg) throws RemoteException {
        return DB.deleteFromDB(pg.getId(), "Progress");
    }
}
