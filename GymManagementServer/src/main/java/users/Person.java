package users;

import com.google.gson.annotations.Expose;
import java.rmi.RemoteException;
import mms.gymmanagementserver.DBConnector;
import rmipack.IUserAuth;

/**
 *
 * @author Mohammed Abou Bakr
 */
public class Person  implements IUserAuth{

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
    private DBConnector DB = DBConnector.connectDB();

    public Person(){};
    
    public Person(int id, String name, int phoneNumber, String DOB, String email, String password ,String role) {
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

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", DOB=" + DOB + ", email=" + email + ", password=" + password + ", Role= " + role +')';
    }

    @Override
    public Person login(String email, String password) throws RemoteException {
       return DB.login(email, password);
    }

    @Override
    public boolean createAccount() throws RemoteException {
       return DB.inserIntoDB(this, "Person");
    }
}
