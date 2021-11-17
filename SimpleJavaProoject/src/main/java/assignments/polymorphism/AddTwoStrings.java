package assignments.polymorphism;

//Child class extending base class AddTwoNumbers
public class AddTwoStrings extends AddTwoNumbers{

    public void addTwoVariables(String string1,String string2){
        String sumOfString = string1+string2;
        System.out.println("Addition of two string is : "+sumOfString);
    }
}
