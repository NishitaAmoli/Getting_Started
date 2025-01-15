/*
 * Print pattern as below (Fibonacci+lower left triangle)
 *   0
 *   1  1
 *   2  3  5
 *   8  13  21  34
 */
import java.util.Scanner;
public class Pattern8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c=1;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(a+" ");
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println();
        }
    }
}