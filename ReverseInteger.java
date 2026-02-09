// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

import java.util.Scanner;
public class ReverseInteger {
    public static int reverse(int n){
        int res=0;
        while(n!=0){  // to handle negative number input
            int digit=n%10;
            int newres=res*10+digit;
            if(newres/10 !=res){  // to handle integer overflow cases
                return 0; // integer overflow
            }
            res= newres;
            n/=10;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input integer:");
        int n= sc.nextInt();
        System.out.println("Input taken:"+n);
        System.out.println("After reversing:"+ reverse(n));
    }    
}
