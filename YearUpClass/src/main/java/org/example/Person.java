package org.example;

public class Person {
    private String firstname;
    private String lastname;
    private String email;
    private String gender;

    // Constructor
    public Person(String firstname, String lastname, String email, String gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
    }

    // Getter methods
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    // Method to get full name
    public String getName() {
        return firstname + " " + lastname;
    }
}


