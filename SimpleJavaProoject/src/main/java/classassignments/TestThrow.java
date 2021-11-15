package classassignments;

public class TestThrow {
    void sqaure(int num) {
        if (num < 1) {
            throw new ArithmeticException("Number passed is negative");
        } else {
            System.out.println("Square value is :" + num * num);
        }
    }

    public static void main(String[] args) {
        TestThrow obj = new TestThrow();
        obj.sqaure(-2);
        System.out.println("Hgello");
    }
}
