package org.example;

public class Student extends Person {
    private String github;
    private String linkedin;
    private String codingNickname;
    private String codewarsXPoints;
    private String imageUrl;
    private String deviceType; // Mac or Windows
    private int pageNumberWorkbook;
    private String currentlyWorkingOn;

    // Constructor
    public Student(String firstname, String lastname, String email, String gender,
                   String github, String linkedin, String codingNickname, String codewarsXPoints,
                   String imageUrl, String deviceType, int pageNumberWorkbook, String currentlyWorkingOn) {
        super(firstname, lastname, email, gender); // Calling the parent class constructor
        this.github = github;
        this.linkedin = linkedin;
        this.codingNickname = codingNickname;
        this.codewarsXPoints = codewarsXPoints;
        this.imageUrl = imageUrl;
        this.deviceType = deviceType;
        this.pageNumberWorkbook = pageNumberWorkbook;
        this.currentlyWorkingOn = currentlyWorkingOn;
    }

    // Getter methods for Student-specific attributes
    public String getGithub() {
        return github;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public String getCodingNickname() {
        return codingNickname;
    }

    public String getCodewarsXPoints() {
        return codewarsXPoints;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public int getPageNumberWorkbook() {
        return pageNumberWorkbook;
    }

    public String getCurrentlyWorkingOn() {
        return currentlyWorkingOn;
    }

    // Method to display all information
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Gender: " + getGender());
        System.out.println("GitHub: " + getGithub());
        System.out.println("LinkedIn: " + getLinkedin());
        System.out.println("Coding Nickname: " + getCodingNickname());
        System.out.println("Codewars X Points: " + getCodewarsXPoints());
        System.out.println("Image URL: " + getImageUrl());
        System.out.println("Device Type: " + getDeviceType());
        System.out.println("Page Number Workbook: " + getPageNumberWorkbook());
        System.out.println("Currently Working On: " + getCurrentlyWorkingOn());
    }
}