package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArrangeNumberInAscendingOrder {
    public static void main(String[] args) {
        int countDigit;
        String input,newNumber="";
        int [] numArray;
        //System.in is a standard input stream
        Scanner sc= new Scanner(System.in);

        //take the input as string
        System.out.println("Enter the number: ");
        input = sc.nextLine();

        //counts the digits in the number string
        countDigit = countDigitInNumber(input);

        //converts string into arrays
        numArray = numberInArray(input,countDigit);

        //arrange the arrays into ascending order
        numArray = arrangeNumberInAscendingOrder(numArray);

        //converts array into string and display number in ascending order
        for(int i=0;i<numArray.length;++i){
            newNumber=newNumber+numArray[i];
        }
        System.out.println(input+" number arranged in ascending order as : " + newNumber);

    }

    //arrange number in array
    static int[] arrangeNumberInAscendingOrder(int [] numberArray){
        int length = numberArray.length;
        /*Function to sort array using insertion sort*/
        for (int i = 1; i < length; ++i) {
            int key = numberArray[i];
            int j = i - 1;
            /* Move elements of array[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && numberArray[j] > key) {
                numberArray[j + 1] = numberArray[j];
                j = j - 1;
            }
            numberArray[j + 1] = key;
        }
        return numberArray;
    }

    //slice the number and store into array
    static int[] numberInArray(String input,int length){
        int singleDigit=0;
        int [] array = new int[length];
            for(int i=0;i<input.length();i++){
                //parse the number in the string into integer number
                singleDigit = Integer.parseInt(String.valueOf(input.charAt(i)));
                //stores the integer number into array
                array[i] = singleDigit;
            }
        return array;
    }

    //counts the number of digits in a number string
    static int countDigitInNumber(String input){
        int count =0;
        return count =input.length();
    }
}
