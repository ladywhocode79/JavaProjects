package classassignments;

import java.util.Objects;

public class Student {
    String name;
    String rollNumber;
    int marks;

    //Default Constructor
   Student(){
         this.name = "Sonal";
        this.rollNumber = "001";
        this.marks = 50;
    }
    //Parameterized Constructor with all 3 parameters
    Student(String name,String rollNumber,int marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    //Parameterized Constructor with all 2 parameters
    Student(String name,String rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
       // this.marks = marks;
    }
    void checkIfStudentPassedOrFailed(int marks,String name,String rollNumber){
        if(marks >=80){
            System.out.println(name + " with roll no "+rollNumber +" got marks as "+marks+" and passed!!");
        }else{
            System.out.println(name + " with roll no "+rollNumber +" got marks as "+marks+" and failed!!");
        }
    }

}
