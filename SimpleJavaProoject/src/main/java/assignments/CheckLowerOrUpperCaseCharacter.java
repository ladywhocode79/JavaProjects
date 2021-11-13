package assignments;
/*Assignment 2 -
Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z )."
*/
import java.util.Scanner;

public class CheckLowerOrUpperCaseCharacter {
    public static void main(String[] args) {
        //System.in is a standard input stream
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the character: ");

        /*there is no nextChar() in Java.To read a char,
         we use next().charAt(0). next() function returns the next token/word
         in the input as a string and charAt(0) function returns the first character in that string
        * */
        char character = sc.next().charAt(0);

        //Check if character entered is uppercase or lowercase
        if (Character.isUpperCase(character)) {
            System.out.println(character + " is Uppercase Letter!");
        }else {
            System.out.println(character + " is Lowercase Letter!");
        }

    }
}
