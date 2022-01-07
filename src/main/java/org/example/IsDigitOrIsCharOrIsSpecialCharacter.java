package org.example;

public class IsDigitOrIsCharOrIsSpecialCharacter {
    public static void main(String[] args) {
        String string = "ABCabc123@#$";
        String digit ="";
        String character="";
        //String specialCharacter="";
        Character ch;
        for(int i=0;i<string.length();i++){
            ch=string.charAt(i);
            if(Character.isDigit(ch))
                digit = digit+ch;
            if(Character.isAlphabetic(ch))
                character = character+ch;


        }
        System.out.println("Digit string "+digit);
        System.out.println("Character string "+character);
    }
}
