// Print multiplication table of given number
import java.util.Scanner;
public class MultiplicationTable {
    static void table(int N){
        for(int idx=1;idx<=10;idx++){
            System.out.println(N +"*"+idx+"="+(N*idx));
        }
    }
    public static void main(String[] args){
        int N;
        Scanner sc= new Scanner(System.in);
        N=sc.nextInt();
        table(N);
    }
}
