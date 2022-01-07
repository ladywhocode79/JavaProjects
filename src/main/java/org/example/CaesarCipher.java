package org.example;

import java.util.Locale;

public class CaesarCipher {
    public static void main(String[] args) {
        //
        int key = 15;
        String inputString = "At noon be in the conference room with your hat on for a surprise party" +
                ". YELL LOUD!";
        String outputString = encrypt(inputString,key);
        System.out.println("Encrypted String is "+outputString);

    }
    public static String encrypt(String input,int key){
        StringBuilder encryptedString=new StringBuilder(input.toUpperCase(Locale.ROOT));
        String alphabet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet = alphabet.substring(key)+alphabet.substring(0,key);
        Character character;
        for(int i=0;i<encryptedString.length();i++){
            //get character at ith index of passed string
            character = encryptedString.charAt(i);
            //take out the index of same character from alphabet string
            int indexOfCharacterInAlphabet = alphabet.indexOf(character);
            //if current character is int the alphabet
            if(indexOfCharacterInAlphabet != -1){
                Character newChar = shiftedAlphabet.charAt(indexOfCharacterInAlphabet);
                encryptedString.setCharAt(i,newChar);
            }
            }



        return encryptedString.toString();
    }
}
