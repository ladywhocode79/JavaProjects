package assignments.polymorphism;
/*Polymorphism:-
* 2) Add 2 integers and concat 2 strings with same method name(Apply method Overriding)*/

public class AddTwoIntegersAndStrings {
    public static void main(String[] args) {
        //object of child class
        AddTwoStrings addTwoStrings = new AddTwoStrings();
        //object of child class calling method of child class as parameter type is String
        addTwoStrings.addTwoVariables("abc","ads");
        //object of child class calling method of parent class as parameter type is Int
        addTwoStrings.addTwoVariables(3,5);
    }
}
