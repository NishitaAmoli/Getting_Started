// Check if given number is an ARMSTRONG number or not. (no. is armstrong if sum of cube of digits is equal to number)
import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n, sum=0;
        while(n!=0){
            int digit=n%10;
            sum=sum+(int)Math.pow(digit,3);
            n=n/10;
        }
        if(sum==num){
            System.out.println("Yes, given number is an ARMSTRONG number");
        }
        else{
            System.out.println("No, given number is NOT an ARMSTRONG number");
        }
        
    }

}
