//Find Nth tribonacci number.
import java.util.Scanner;
public class Tribonacci {
    public static int tribo(int N){
        if(N==0){
            return 0;
        }if(N==1 || N==2){
            return 1;
        }
        int a=0, b=1, c=1, d=2;
        for(int idx=3;idx<=N;idx++){
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
        return d;

    }

    public static void main(String[] args){
        int N;
        Scanner sc= new Scanner(System.in);
        N=sc.nextInt();
        int d=tribo(N);
        System.out.println("tribonacci number for :"+N+"th term is "+ d);
    }

}
