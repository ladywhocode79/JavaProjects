package classassignments;

import java.util.Scanner;

public class AddTwoNThreeNumWithSameMethodName {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.println("Enter the number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the number3: ");
        int num3 = sc.nextInt();
        int sum1,sum2 ;
       // sum1= addTwoNumbers(num1,num2);
        //sum2 =addTwoNumbers(num1,num2,num3);
        System.out.println("Sum of 2 numbers: "+ addTwoNumbers(num1,num2));
        System.out.println("Sum of 3 numbers: "+ addTwoNumbers(num1,num2,num3));
    }
    static int addTwoNumbers(int num1,int num2){
        int sum = num1+num2;
        return sum;
    }
    static int addTwoNumbers(int num1,int num2,int num3){
        int sum = num1+num2+num3;
        return sum;
    }
}
