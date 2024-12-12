package services;

import com.google.gson.annotations.Expose;

/**
 *
 * @author Mohammed Abou Bakr
 */
public class Progress implements IMemberProgressROI {

    @Expose
    private double weight;
    @Expose
    private double bodyFatPercentage;
    @Expose
    private double muscleMass;

    public Progress(double weight, double bodyFatPercentage, double muscleMass) {
        this.weight = weight;
        this.bodyFatPercentage = bodyFatPercentage;
        this.muscleMass = muscleMass;
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
        return "Progress{" + "weight=" + weight + ", bodyFatPercentage=" + bodyFatPercentage + ", muscleMass=" + muscleMass + '}';
    }

}
