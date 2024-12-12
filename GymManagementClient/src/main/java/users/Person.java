package users;

import java.io.Serializable;

/**
 *
 * @author Mohammed Abou Bakr
 */
public class Person implements Serializable {

    private int id;
    private String name;
    private int phoneNumber;
    private String DOB;
    private String email;
    private String password;
    private String role;
    private static final long serialVersionUID = 1L;

    public Person() {
    }

    ;
    
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

}
