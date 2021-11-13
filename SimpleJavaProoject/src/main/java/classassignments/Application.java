package classassignments;

import java.util.Scanner;

    public class Application {
        public static void main(String[] args) {
            //using default constructor
            Student studentOne = new Student();
            System.out.println(studentOne.name +" with roll number " + studentOne.rollNumber
            +" scored marks as "+studentOne.marks);

            //using parametrized constructor

            Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
            System.out.println("Enter the Name of Student1: ");
            String name = sc.nextLine();

            System.out.println("Enter the RollNumber of Student1: ");
            String rollNumber =sc.nextLine();

            System.out.println("Enter the Marks of Student1: ");
            int marks =sc.nextInt();

            //using 3 parameters constructor
            Student studentTwo = new Student(name,rollNumber,marks);
            System.out.println(studentTwo.name +" with roll number " + studentTwo.rollNumber
                    +" scored marks as "+studentTwo.marks);

            //using 2 parameters constructor
            Student studentThree = new Student(name,rollNumber);
            System.out.println(studentOne.name +" with roll number " + studentOne.rollNumber
                    +" scored marks as "+studentOne.marks);

          /*  System.out.println("Enter the Name of Student2: ");
            studentTwo.name =sc.nextLine();

            studentTwo.RollNumber =sc.nextLine();
            System.out.println("Enter the RollNumber of Student2: ");
            System.out.println("Enter the Marks of Student2: ");
            studentTwo.marks =sc.nextInt();

*/


        //studentOne.checkIfStudentPassedOrFailed(studentOne.marks,studentOne.name, studentOne.rollNumber);
//            studentTwo.checkIfStudentPassedOrFailed(studentTwo.marks,studentTwo.name, studentTwo.RollNumber);

        }
    }
