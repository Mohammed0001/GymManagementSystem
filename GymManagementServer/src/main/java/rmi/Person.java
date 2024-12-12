package rmi;

/**
 *
 * @author Mohammed Abou Bakr
 */
public class Person {

    private int id;
    private String name;
    private int phoneNumber;
    private String DOB;
    private String email;

    public Person(int id, String name, int phoneNumber, String DOB, String email) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.DOB = DOB;
        this.email = email;
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

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", DOB=" + DOB + ", email=" + email + '}';
    }
}
