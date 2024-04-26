// Print sum of first N natural numbers.
import java.util.Scanner;
public class SumNnumber {
    static void Sum_of_n_terms(int N){
        int sum=0;
     /*    for(int idx=1;idx<=N;idx++){
            sum=sum+idx;
        }    */
        // calculating sum using formula (n*(n+1)/2)
        sum=(N*(N+1))/2;
        System.out.print("sum = "+sum);
    }

    public static void main(String[] args){
        int N;
        Scanner sc= new Scanner(System.in);
        N=sc.nextInt();
        Sum_of_n_terms(N);
    }

}
