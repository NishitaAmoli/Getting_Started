// Calculate power of any given number x using itteration  (x ^ n).
import java.util.Scanner;
public class Power {
    public static double myPow(double x, int b){
        if(x==1) return 1;
        if(x==-1){
            if(b%2==0) return 1;
            else return -1;
        }
        long n=b;
        double res=1;
        for(int idx=1;idx<=x && res!=0;idx++){
            res=res*x;
        }
        return res;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double x;
        int b;
        System.out.println("enter x:");
        x=sc.nextDouble();
        System.out.println("enter n:");
        b=sc.nextInt();
        double res=myPow(x,b);
        System.out.println("result: "+res);
    }

}
