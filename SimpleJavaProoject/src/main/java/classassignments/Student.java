package classassignments;

import java.util.Objects;

public class Student {
    String name;
    String rollNumber;
    static int numberOfStudent = 0;

    //Default Constructor
    Student() {
        this.name = "Sonal";
        this.rollNumber = "001";
        numberOfStudent++;
    }

    //Parameterized Constructor with all 2 parameters
    public Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        numberOfStudent++;
    }

    //checks if student is passed or failed
    void checkIfStudentPassedOrFailed(int marks, String name, String rollNumber) {
        if (marks >= 80) {
            System.out.println(name + " with roll no " + rollNumber + " got marks as " + marks + " and passed!!");
        } else {
            System.out.println(name + " with roll no " + rollNumber + " got marks as " + marks + " and failed!!");
        }
    }
}


