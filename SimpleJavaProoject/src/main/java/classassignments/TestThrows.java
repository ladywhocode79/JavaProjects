package classassignments;

public class TestThrows {
    int divide(int a,int b) throws ArithmeticException{
        int div = a/b;
        return div;
    }

    public static void main(String[] args) {
        TestThrows obj = new TestThrows();
        try {
            obj.divide(10, 0);
        }catch (ArithmeticException e){
            System.out.println("Exception :" +e);
        }
    }
}
