
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
    
     public static boolean createAccount(Accountant a) throws RemoteException {
        return DB.inserIntoDB(a, "Accountant");
    }

    public static ArrayList<Accountant> getAllAccountant () {
        return DB.readAllFromDB("Accountant ", Accountant.class);
    }

    public static Person getAccount(int id) {
        return DB.readFromDB(id, "Accountant ", Accountant.class);
    }

    public static boolean updateAccount(Accountant a) throws RemoteException {
        return DB.updateInDB(a.getId(), a, "Accountant ");
    }

    public static boolean deleteAccount(Accountant a) throws RemoteException {
        return DB.deleteFromDB(a.getId(), "Accountant");
    }
}