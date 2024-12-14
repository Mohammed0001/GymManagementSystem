
package users;

import java.rmi.RemoteException;
import java.util.ArrayList;
import static users.Person.DB;

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

    public Accountant(int id, String name, int phoneNumber, String DOB, String email,String password,String role, String accessLevel) {
        super(id, name, phoneNumber, DOB, email, password, role);
        this.accessLevel = accessLevel;
    }
    
    public String getAccessLevel() {
        return accessLevel;
    }
    
    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }

    @Override
    public String toString() {
        return "Accountant{" + "accessLevel=" + accessLevel + '}';
    }
    
     
}