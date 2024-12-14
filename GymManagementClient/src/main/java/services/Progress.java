package services;

import com.google.gson.annotations.Expose;

/**
 *
 * @author Mohammed Abou Bakr
 */
public class Progress implements IMemberProgressROI {
    @Expose
    private int personId; 
    @Expose
    private double weight;
    @Expose
    private double bodyFatPercentage;
    @Expose
    private double muscleMass;

    public Progress(int personId, double weight, double bodyFatPercentage, double muscleMass) {
        this.personId = personId;
        this.weight = weight;
        this.bodyFatPercentage = bodyFatPercentage;
        this.muscleMass = muscleMass;
    }
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
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
        return "Progress{" +
                "personId=" + personId +
                ", weight=" + weight +
                ", bodyFatPercentage=" + bodyFatPercentage +
                ", muscleMass=" + muscleMass +
                '}';
    }
}
