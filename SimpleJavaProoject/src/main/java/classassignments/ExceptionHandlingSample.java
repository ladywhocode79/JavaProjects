package classassignments;

public class ExceptionHandlingSample {
    //Null pointer exception and arithmatic exception
    public static void main(String[] args) {
     /* try {
          String str =null;
        System.out.println(str.length());
      }catch (NullPointerException e){
          System.out.println("Cannot determine length of null");
      }*/
        try
        { int a =100;
        int b=0;
        int c= a/b;
        System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("");
        }
    }

}
