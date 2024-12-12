package users;

import <any?>;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Karim 219226
 */
public class Accountant extends Person{
    private String accessLevel;

    public Accountant(int id, String name, int phoneNumber, String DOB, String email, String accessLevel) {
        super(id, name, phoneNumber, DOB, email);
        this.accessLevel = accessLevel;
    }
    
    public String getAccessLevel() {
        return accessLevel;
    }
    
    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }
    
    public boolean createAccount(Accountant accountant){
        
    }
    
    public void processRefundRequest(String req){
        
    } 
}