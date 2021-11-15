package classassignments;

import java.util.Scanner;

    public class Application {
        public static void main(String[] args) {


            //create an object of science student and set values using parametrized constructor
            ScienceStudent scienceStudent = new ScienceStudent("Sona","002",20,30,50);
            System.out.println("Name of Science student: "+scienceStudent.name);
            System.out.println("Roll number of Science student: "+scienceStudent.rollNumber);
            System.out.println("Marks for Physics : "+scienceStudent.physicsMarks);
            System.out.println("Marks for Chemistry : "+scienceStudent.chemistryMarks);
            System.out.println("Marks for Maths : "+ scienceStudent.mathsMarks);
            int totalOfScienceStudentMarks = addMarksForStudent(scienceStudent.physicsMarks,scienceStudent.chemistryMarks
            ,scienceStudent.mathsMarks);
            System.out.println("Total marks for "+scienceStudent.name+" is  : "+ totalOfScienceStudentMarks);

            //create an object of commerce student and set values using parametrized constructor
            CommerceStudent commerceStudent = new CommerceStudent("Rahuk","003",50,80,50);
            System.out.println("Name of Commerce student: "+commerceStudent.name);
            System.out.println("Roll number of Commerce student: "+commerceStudent.rollNumber);
            System.out.println("Marks for Accounts : "+commerceStudent.accountsMarks);
            System.out.println("Marks for Econimics : "+commerceStudent.economicMarks);
            System.out.println("Marks for Business Studies : "+ commerceStudent.businessStudiesMarks);
            int totalOfCommerceStudentMarks = addMarksForStudent(commerceStudent.accountsMarks,commerceStudent.economicMarks
                    ,commerceStudent.businessStudiesMarks);
            System.out.println("Total marks for "+commerceStudent.name+" is  : "+ totalOfCommerceStudentMarks);


           /*
            //Create an object using parent class
             Scanner sc= new Scanner(System.in);
            Student newStudent = new Student("Arnav","001");
            System.out.println("Name of  new student: "+newStudent.name);
            System.out.println("Roll number of new  student: "+newStudent.rollNumber);
           String name = sc.nextLine();
            System.out.println("Enter the name of Student1: ");
            String name =sc.nextLine();
            System.out.println("Enter the RollNumber of Student1: ");
            String rollNumber =sc.nextLine();
            System.out.println("Enter the Marks of Student1: ");
            int marks =sc.nextInt();

            //using 3 parameters constructor in parent class

            Student studentTwo = new Student(name,rollNumber,marks);
            System.out.println(studentTwo.name +" with roll number " + studentTwo.rollNumber
                    +" scored marks as "+studentTwo.marks);


            //using 2 parameters constructor in parent class
            Student studentThree = new Student(name,rollNumber);
            System.out.println(studentOne.name +" with roll number " + studentOne.rollNumber
                    +" scored marks as "+studentOne.marks);

            //check total nuumber of students of parent class
            System.out.println("Checking number of students added:");
            char flag = 'y';
            while (flag == 'y') {
                sc.nextLine();
                System.out.println("Enter the student name: ");
                name = sc.nextLine();

                System.out.println("Enter the RollNumber of Student1: ");
                 rollNumber = sc.nextLine();

                System.out.println("Enter the Marks of Student1: ");
                 marks = sc.nextInt();

                Student student1 = new Student(name, rollNumber, marks);
                System.out.println("Do you want to add more student : ");
                flag = sc.next().charAt(0);
                sc.nextLine();
            }
            System.out.println("Total number of students created: "+ Student2.numberOfStudent);
*/
        }
        static int addMarksForStudent(int sub1,int sub2,int sub3){
            int sum =sub1+sub2+sub3;
            return sum;
        }
    }
