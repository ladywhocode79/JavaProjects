public class Math {
    public int multiply(int x, int y){
        int z;
        z= x * y;
        return z;

    }

    public static void main(String[] args) {
        Math math = new Math();
        int result = math.multiply(3,4);
        System.out.println(result);
    }
}
