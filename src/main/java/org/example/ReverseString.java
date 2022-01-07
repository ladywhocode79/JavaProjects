package org.example;

public class ReverseString {
    public static void main(String[] args) {
        //charAt function gets character at a specified index
        String string = "computer";
        String reverseString = "";
        for(int i=0;i<string.length();i++){
            reverseString = string.charAt(i)+reverseString;

        }
        System.out.println("Reverse String for "+string+" is "+reverseString);
    }
}
