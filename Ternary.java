// Ternary Operator -- a)find even or odd  b)find max and min number

import java.util.Scanner;
public class Ternary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // Find given number is even or odd number
        int n=sc.nextInt();
        String result=(n%2==0)?"EVEN":"ODD";
        System.out.println("Given number is: "+result);

        // Find maximum and minimum of two given number using ternary operator
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int maxnum=(num1>num2)?num1:num2;
        int minnum=(num1<num2)?num1:num2;
        System.out.println("MAXIMUM OF TWO GIVEN NO IS: "+maxnum);
        System.out.println("MINIMUM OF TWO GIVEN NO IS: "+minnum);
    }

}
