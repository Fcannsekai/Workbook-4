package org.example;

public class Main {
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student(
                "Freddie", "Canning", "freddie.j.canning@gmail.com", "Male",
                "https://github.com/Fcannsekai", "https://www.linkedin.com/in/frederick-canning-583736282/", "Theuselessone", "12",
                "https://avatars.githubusercontent.com/u/203720381?v=4", "Windows", 60, "Building a Java Application"
        );

        // Displaying the student's information
        student.displayInfo();
    }
}

   /* Student student = new Student(
            101,                                // ID
            "Brian",                            // First name
            "Vega-Solano",                      // Last name
            "brianvs@example.com",              // Email
            "male",                             // Gender
            "https://github.com/BrianVegaSol",  // GitHub link
            "https://www.linkedin.com/in/brianvs/", // LinkedIn profile
            "Crash n' Burn",                    // Coding nickname
            "0",                                // Codewars XP (as String)
            "img/Avatar_Student_Male.jpg",      // Image URL
            "Windows",                          // Device type
            0,                                  // Workbook page number
            "81"                                // Currently working on (page/task)
    );*/

