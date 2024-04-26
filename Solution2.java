// Print N to 1 natural numbers
import java.util.Scanner;
public class Solution2 {
    static void n_number(int N){
        for(int idx=N; idx>=1;idx--){
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
