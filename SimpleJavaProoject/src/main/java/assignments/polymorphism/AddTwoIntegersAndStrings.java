package assignments.polymorphism;
/*Polymorphism:-
* 2) Add 2 integers and concat 2 strings with same method name(Apply method Overriding)*/

public class AddTwoIntegersAndStrings {
    public static void main(String[] args) {
        //object of child class
        AddTwoIntegers addTwoIntegers = new AddTwoIntegers();
        //object of child class calling method of parent class as parameter type as String
        addTwoIntegers.addTwoVariables("Sonal ","Singh");
        addTwoIntegers.addTwoVariables("2","3");
        //calls functions from AddTwoIntegers class
        addTwoIntegers.addTwoVariables(4,5);

    }
}
