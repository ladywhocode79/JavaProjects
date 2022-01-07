package org.example;

public class StringToUpperCaseAndToLowerCase {
    public static void main(String[] args) {
        String string = "ABCabc123@#$";
        Character toUpperCase;
        Character toLowerCase;
        Character ch;
        for(int i=0;i<string.length();i++){
            ch=string.charAt(i);
            toLowerCase = Character.toLowerCase(ch);
            toUpperCase = Character.toUpperCase(ch);
            System.out.println(ch+" "+toLowerCase+" "+toUpperCase);


        }

    }
}
