// Print sum of first N natural numbers cube.
import java.util.Scanner;
public class SumNcube {
    static void Sum_of_n_cube(int N){
        int sum=0;
        for(int idx=1;idx<=N;idx++){
            sum=sum+(idx*idx*idx);
        }  
        System.out.print("sum = "+sum);  
    }
    public static void main(String[] args){
        int N;
        Scanner sc= new Scanner(System.in);
        N=sc.nextInt();
        Sum_of_n_cube(N);
    }

}
