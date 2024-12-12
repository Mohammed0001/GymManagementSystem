package users;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Karim 219226
 */
public class MedicalTeam extends Person{
    private String specialization;
    
    public MedicalTeam(int id, String name, int phoneNumber, String DOB, String email, String password, String specialization) {
        super(id, name, phoneNumber, DOB, email, password, "MedicalTeam");
        this.specialization = specialization;
    }
    
    public String getSpecialization() {
        return specialization;
    }
    
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
    public String conductHealthAssessment(){
        return "";
    }
    
    public void provideHealthRecommendation(){
        
    }

    @Override
    public String toString() {
        return "MedicalTeam{" + "specialization=" + specialization + '}';
    }
}