package services;

import java.io.Serializable;

/**
 *
 * @author Mohammed Abou Bakr
 */
public class Progress implements Serializable {

    private int id;
    private double weight;
    private double bodyFatPercentage;

    private double muscleMass;

    private static final long serialVersionUID = 4L;

    public Progress(int id, double weight, double bodyFatPercentage, double muscleMass) {
        this.id = id;
        this.weight = weight;
        this.bodyFatPercentage = bodyFatPercentage;
        this.muscleMass = muscleMass;
    }

    public int geId() {
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
}
