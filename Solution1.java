// Print 1 to N natural numbers
import java.util.Scanner;
public class Solution1 {
    static void n_number(int N){
        for(int idx=1; idx<=N;idx++){
            System.out.print(idx+ " ");
        }
    }
    public static void main(String[] args){
        int N;
        Scanner sc= new Scanner(System.in);
        N=sc.nextInt();
        n_number(N);
    }
}
