// Print factorial of any given number N.
import java.util.Scanner;
public class Factorial {
    static void fact(int N){
        int product=1;
        for(int idx=1;idx<=N;idx++){
            product=product*idx;
        }  
        System.out.print("factorial of given number "+ N +" is = "+product);  
    }
    public static void main(String[] args){
        int N;
        Scanner sc= new Scanner(System.in);
        N=sc.nextInt();
        fact(N);
    }

}
