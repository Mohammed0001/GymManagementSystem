package mms.controllers;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import rmipack.IUserAuth;
import users.Person;

/**
 *
 * @author Mohammed Abou Bakr
 */
public class UserController {

    Registry registry;
    IUserAuth userAuth;

    public UserController() {
        try {
            this.registry = LocateRegistry.getRegistry(1099);
            this.userAuth = (IUserAuth) registry.lookup("MohammedFacade");

        } catch (RemoteException ex) {
            Logger.getLogger(loginController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(loginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean createAccount(int id, String name, int phoneNumber, String DOB, String email, String password, String role) {
        Person p = new Person(id, name, phoneNumber, DOB, email, password, role);
        try {
            return userAuth.createAccount(p);
        } catch (RemoteException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean deleteAccount(int id) {
        Person p = new Person(id, "", 0, "", "", "", "");
        try {
            return userAuth.deleteAccount(p);
        } catch (RemoteException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updateAccount(int id , String name , String email , String role , String password ,int phoneNumber , String DOB) {
        Person p = new Person(id, name , phoneNumber , DOB ,  email,  password, role);
        try {
            return userAuth.updateAccount(p);
        } catch (RemoteException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public DefaultTableModel getUsers() {
        DefaultTableModel table = new DefaultTableModel();
        table.setColumnIdentifiers(new String[]{"ID", "Name", "Email", "Role" , "Password" , "PhoneNumber" , "DOB"});

        ArrayList<Person> accounts = new ArrayList<>();
        try {
            accounts = userAuth.viewAllUsers();
        } catch (RemoteException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Person person : accounts) {
            table.addRow(new Object[]{person.getId(), person.getName(), person.getEmail(), person.getRole() , person.getPassword() , person.getPhoneNumber(), person.getDOB()});
            System.out.println(person);
//            Object[] row = new Object[4];
//            row[0] = person.getId();
//            row[1] = person.getName();
//            row[2] = person.getEmail();
//            row[3] = person.getRole();
//            table.addRow(row);
        }
        return table;
    }
}
