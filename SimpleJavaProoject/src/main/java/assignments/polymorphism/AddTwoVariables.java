package assignments.polymorphism;
/*Add 2 integers and concat 2 strings with same method name(Apply method Overloading)*/

public class AddTwoVariables {
    public static void main(String[] args) {

        System.out.println("Sum of two integers : "+addTwoVariables(2,3));
        System.out.println("Sum of two strings : "+addTwoVariables("sonal ","singh"));
    }
    public  static int addTwoVariables(int num1,int num2){
        return num1+num2;
    }
    public  static String addTwoVariables(String string1,String string2){
        return string1+string2;
    }
}

