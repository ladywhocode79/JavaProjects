package classassignments;

import java.util.Scanner;

public class FindDayInAMonth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        //Find day in a month for the entered input number by user
        if(num % 7 == 1){
           System.out.println("Its Monday!!");
            }
            else if(num % 7 ==2){
                System.out.println("Its Tuesday!!");
            }else if(num % 7 == 3 ){
                System.out.println("Its Wednesday");
            }
            else if(num % 7 == 4){
                System.out.println("Its Thursday");
            }else if(num % 7 == 5){
            System.out.println("Its Friday");
        }else if(num % 7 == 4){
            System.out.println("Its Saturday");
        }
        else{
            System.out.println("Its Sunday");
        }
    }
}
