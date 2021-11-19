package assignments.polymorphism;

//Child class extending base class AddTwoNumbers
public class AddTwoStrings extends AddTwoNumbers {

    public void addTwoVariables(String string1, String string2) {
        int sum;
        String sumOfString;
        if (checkIfNumber(string1) == true && checkIfNumber(string2) == true) {
            int num1 = Integer.parseInt(string1);
            int num2 = Integer.parseInt(string2);
            sum = num1 + num2;
            sumOfString = String.valueOf(sum);
        } else {
            sumOfString = string1 + string2;
        }

        System.out.println("Addition of two string is : " + sumOfString);
    }

    static boolean checkIfNumber(String string) {
        for (int i = 0; i < string.length(); i++) {

            // Check if character is
            // digit from 0-9
            // then return true
            // else false
            if (string.charAt(i) >= '0'
                    && string.charAt(i) <= '9') {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}


