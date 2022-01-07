package org.example;

import java.util.Locale;

public class CaesarCipherWithTwoKeys {
    public static void main(String[] args) {
        //
        int key1 = 8;
        int key2 = 21;
        String inputString = "At noon be in the conference room with your hat on for a surprise party" +
                ". YELL LOUD!";
        String outputString = encrypt(inputString,key1,key2);
        System.out.println("Encrypted String is "+outputString);

    }
    public static String encrypt(String input,int key1,int key2){
        StringBuilder encryptedString=new StringBuilder(input.toUpperCase(Locale.ROOT));
        String alphabet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet1 = alphabet.substring(key1)+alphabet.substring(0,key1);
        String shiftedAlphabet2 = alphabet.substring(key2)+alphabet.substring(0,key2);
        Character character1,character2;
        for(int i=0;i<encryptedString.length();i+=2){
            //get character at ith index of passed string

                character1 = encryptedString.charAt(i);

                //take out the index of same character from alphabet string
                int indexOfCharacterInAlphabet1 = alphabet.indexOf(character1);

                //if current character is int the alphabet

                if (indexOfCharacterInAlphabet1 != -1  ) {
                    Character newChar1 = shiftedAlphabet1.charAt(indexOfCharacterInAlphabet1);
                    encryptedString.setCharAt(i, newChar1);

                }else
                    encryptedString.setCharAt(i,character1);
            }
        for(int j=1;j<encryptedString.length();j=j+2) {
            character2 = encryptedString.charAt(j);
            int indexOfCharacterInAlphabet2 = alphabet.indexOf(character2);
            if (indexOfCharacterInAlphabet2 != -1 ) {
                Character newChar2 = shiftedAlphabet2.charAt(indexOfCharacterInAlphabet2);
                encryptedString.setCharAt(j, newChar2);
            }else
                encryptedString.setCharAt(j,character2);
        }



        return encryptedString.toString();
    }
}
