package assignments.polymorphism;
/*Polymorphism:-
1) Find the largest of 2 numbers and largest of 3 numbers(Apply method overloading concept)
*/

import java.util.Scanner;

public class LargestNumbers {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.println("Larget of 2 numbers");
        System.out.println("Enter the number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2: ");
        int num2 = sc.nextInt();
        int largestNumber = returnLargestNumber(num1,num2);
        System.out.println("Largest of 2 numbers "+num1+" and "+num2+" is " + largestNumber );
        System.out.println("Larget of 3 numbers");
        System.out.println("Enter the number3: ");
        int num3 = sc.nextInt();
        largestNumber = returnLargestNumber(num1,num2,num3);
        System.out.println("Largest of 3 numbers "+num1+" , "+num2+ " and "+num3+" is " + largestNumber );

    }
    //returns largest of 2 numbers
    static int returnLargestNumber(int number1,int number2){
        int largestNumber=number2;
        if(number1>number2)
            largestNumber = number1;

        return largestNumber;
    }
    static int returnLargestNumber(int number1,int number2,int number3){
        int largestNumber = number3;
        if(number1<number2)
            largestNumber = number2;
         if(number2<number3)
            largestNumber = number3;

        return largestNumber;
    }
}
