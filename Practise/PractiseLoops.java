import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PractiseLoops {
    //print 10 line outputs in N * X = result using loops
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

       // int N = Integer.parseInt(bufferedReader.readLine().trim());
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        // int N =2;
        for(int i=1;i<=10;i++){
            int m = N*i;
            System.out.println(N+"x"+i+"="+m);

        }
        bufferedReader.close();
    }

}
