package classassignments;

public class EncapsulationExample {
    private int a ;

    //acess private variable of a class using getter and setter method
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
class Sample{
    public static void main(String[] args) {
        EncapsulationExample obj = new EncapsulationExample();
        obj.setA(12);
        System.out.println(obj.getA());
    }
}