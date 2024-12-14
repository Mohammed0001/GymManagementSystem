package users;

import com.google.gson.annotations.Expose;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;
import mms.gymmanagementserver.DBConnector;
import rmipack.IUserAuth;

/**
 *
 * @author Mohammed Abou Bakr
 */
public class Person implements Serializable {

    @Expose
    private int id;
    @Expose
    private String name;
    @Expose
    private int phoneNumber;
    @Expose
    private String DOB;
    @Expose
    private String email;
    @Expose
    private String password;
    @Expose
    private String role;

    private static DBConnector DB = DBConnector.connectDB();
    private static final long serialVersionUID = 1L;

    public Person() {
    }

    public Person(int id, String name, int phoneNumber, String DOB, String email, String password, String role) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.DOB = DOB;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", DOB=" + DOB + ", email=" + email + ", password=" + password + ", Role= " + role + ')';
    }

    public static Person login(String email, String password) throws RemoteException {
        return DB.login(email, password);
    }

    public static boolean createAccount(Person p) throws RemoteException {
        return DB.inserIntoDB(p, "Person");
    }

    public static ArrayList<Person> getAllAccounts() {
        return DB.readAllFromDB("Person", Person.class);
    }

    public static Person getAccount(int id) {
        return DB.readFromDB(id, "Person", Person.class);
    }

    public static boolean updateAccount(Person p) throws RemoteException {
        return DB.updateInDB(p.getId(), p, "Person");
    }

    public static boolean deleteAccount(Person p) throws RemoteException {
        return DB.deleteFromDB(p.getId(), "Person");
    }
}
