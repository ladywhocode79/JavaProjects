package classassignments;

public class MethodOverloadingExample {
    public void doSomething(int val){
        System.out.println("This is an integer");
    }
    public void doSomething(String Val){
        System.out.println("This is a string");
    }

    public static void main(String[] args) {
        //Method overlaoding
        MethodOverloadingExample obj1=new MethodOverloadingExample();
        obj1.doSomething(1);
        obj1.doSomething("Hello");
    }
}
