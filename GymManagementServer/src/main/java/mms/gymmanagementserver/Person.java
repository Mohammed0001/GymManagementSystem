/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mms.gymmanagementserver;

/**
 *
 * @author hp
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Add similar getters and setters for the rest of the fields
}