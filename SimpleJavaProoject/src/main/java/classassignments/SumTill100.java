package classassignments;

public class SumTill100 {
    //Sum of numbers from 1 to 100 with for loops and while loops
    public static void main(String[] args) {
        int sum=0;
       /* for(int i=0;i<=100;i++)
            sum =sum+i;*/
        int i=0;
        do {
            sum =sum+i;
            i++;
        }while ( i<=100);
        System.out.println(sum);
    }


}
