package assignments;
/*Create a simple calculator which can perform following operations with two numbers
1. add
2. multi
3. division
4. sub
Note: Program should take continuous input on what operation to perform from user.
 Should take inputs required for operation and print output at every operation. */
import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        int num1,num2;
        char operator;
        char flagToContinue = 'Y';
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream

        //check the conditions if user wants to continue usimg calculator Y/N
        while (flagToContinue == 'Y') {
            //takes user inputs for number 1,number 2 and operator;
            System.out.println("Enter the number1: ");
            num1 = sc.nextInt();
            System.out.println("Enter the number2: ");
            num2 = sc.nextInt();
            System.out.println("Enter the operator: ");
            operator = sc.next().charAt(0);

            //calls function to calculate as per given value and operator
            calculateOutput(num1, num2, operator);

            //checks if user wants to continue using calculator.
            System.out.println("Do you want continue (Y-Yes/N-No) : ");
            flagToContinue = sc.next().charAt(0);
            //converts user input to upper case
            flagToContinue=Character.toUpperCase(flagToContinue);
        }


    }
    static void calculateOutput(int num1,int num2,char operator){
        //stores the output
        int output;
        //select the operator and do the respective operation on numbers
        switch (operator) {
            case '+': {
                output = num1 + num2;
                System.out.println("Sum of entered two numbers is: " +output);
                break;
            }
            case '-': {
                output = num1 - num2;
                System.out.println("Difference of entered two numbers is: " +output);
                break;
            }
            case '/': {
                output = num1 / num2;
                System.out.println("Division of entered two numbers is: " +output);
                break;
            }
            case '*': {
                output = num1 * num2;
                System.out.println("Product of entered two numbers is: " +output);
                break;
            }
            default:
                System.out.println("Entered operator "+ operator+" is incorrect,please try again!!\nYour options" +
                        " are + , - , / , *.");
                break;
        }

    }

}
