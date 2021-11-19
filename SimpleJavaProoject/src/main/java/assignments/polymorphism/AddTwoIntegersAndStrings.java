package assignments.polymorphism;
/*Polymorphism:-
* 2) Add 2 integers and concat 2 strings with same method name(Apply method Overriding)*/

public class AddTwoIntegersAndStrings {
    public static void main(String[] args) {
        //object of child class
        AddTwoStrings addTwoStrings = new AddTwoStrings();
        //object of child class calling method of child class as parameter type is String
        addTwoStrings.addTwoVariables("Sonal ","Singh");
        addTwoStrings.addTwoVariables("2","3");

    }
}
