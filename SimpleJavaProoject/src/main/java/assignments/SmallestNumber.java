package assignments;
/*"Assignment 1 - Write a program to find smallest of 4 numbers.
Input - 5,8,2,3
Output - Smallest number is 2*/


import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
       //Variable to store minimum number
        int min1 =0, min2=0;

        //System.in is a standard input stream
        Scanner sc= new Scanner(System.in);

        //Input first number
        System.out.println("Enter the number1: ");
        int num1 = sc.nextInt();
        //Input second number
        System.out.println("Enter the number2: ");
        int num2 = sc.nextInt();
        //Input third number
        System.out.println("Enter the number3: ");
        int num3 = sc.nextInt();
        //Input fourth number
        System.out.println("Enter the number4: ");
        int num4 = sc.nextInt();

        //Check if num1 is smaller then num2 or num2 is smaller then num1
        if (num1 < num2)
            min1 = num1;
        else
            min1=num2;

        //Check if num3 is smaller then num4 or num4 is smaller then num3
        if (num3 < num4)
            min2 = num3;
        else
            min2 =num4;

        //Check if min1 is smaller then min2 or min2 is smaller then min1
        if(min1 <min2)
            System.out.println("Smallest number is : "+min1);
        else
            System.out.println("Smallest number is : "+min2);

    }
}