package classassignments;

import java.util.Scanner;

public class PrintSumOfArrayIntegers {
    public static void main(String[] args) {
        //Add 10 integers numbers stored in an array through use input,array length
        // is input from user.

        //System.in is a standard input stream
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int lengthOfArray = sc.nextInt();

        //Define an empty array
        int [] array = new int[lengthOfArray] ;

        //call to take input from user,returns array of integers
        array =returnNumberListInArray(lengthOfArray);

        //Stores the sum of array returned from the method.
        int sum = sumOfArrayOf10Int(array);
        System.out.println("Sum of numbers in array is :"+sum);
    }

    //return array of integers input from user.
    static int[] returnNumberListInArray(int lengthOfArray){
        Scanner sc= new Scanner(System.in);
        int numListOfArray[] = new int[lengthOfArray];

        //intialise the integer for loop in array
        int i=0;
        //take input as number from user,store in array.
        while(i<lengthOfArray){
            System.out.println("Enter the number to be stored in an array: ");
            int numInArr = sc.nextInt();
            numListOfArray[i]=numInArr;
            i++;
            // int [] array = new int[] {10,20,30,40,50,60,70,80,90,100};
        }
        return numListOfArray;
    }

    //returns sum of array of integers
    static int sumOfArrayOf10Int(int[] arr){
     int sum=0;
        for(int i =0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        return sum;
    }
}
