package classassignments;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
       /* int [] array = new int[4];
        array [0]= 10;
        array [1]= 20;
        array [2]= 30;
        array [3]= 40;
        System.out.println(array[0]);*/
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.println("Enter the number: ");
        int length = sc.nextInt();
        int [] array = new int[length];
        insertDataIntoArray(array);
        printArray(array);

        //System.out.println(array.getClass().getName());
    }
    static void insertDataIntoArray(int[] arr){
        int num =1;
        for(int i=0;i<arr.length;i++, num++){
            arr[i] = num;
            // num++;
            // System.out.println(array[i]);
        }

        }
    static void printArray(int[] arr){

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
}
