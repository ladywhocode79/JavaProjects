package classassignments;

import java.util.Scanner;

public class testall {
public static void main(String[]args){

    int num1,num2,output;
    char operator;
    char flagToContinue = 'Y';
    Scanner sc= new Scanner(System.in);    //System.in is a standard input stream

    Character.toUpperCase(flagToContinue);

    while (flagToContinue == 'Y') {

        System.out.println("Enter the number1: ");
        if(sc.hasNextInt()) {
            num1 = sc.nextInt();
        }else{
            System.out.println("Sorry, couldn't understand you!");
        }
        System.out.println("Enter the number2: ");
        num2 = sc.nextInt();
        System.out.println("Enter the number1: ");
        operator = sc.next().charAt(0);


        System.out.println("Do you want continue (Y-Yes/N-No) : ");
        flagToContinue = sc.next().charAt(0);
    }


}
}


