//Find fibonacci number for given Nth term.
import java.util.*;;
public class Fibonacci {
    public static int fibo(int N){
        if(N==0){
            return 0;
        }if(N==1){
            return 1;
        }
        int a=0, b=1, c=0;
        for(int idx=2;idx<=N;idx++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;

    }

    public static void main(String[] args){
        int N;
        Scanner sc= new Scanner(System.in);
        N=sc.nextInt();
        int c=fibo(N);
        System.out.println("fibonacci number for :"+N+"th term is "+ c);
    }
}
