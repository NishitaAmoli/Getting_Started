/* 1. You are given two numbers n and k. You are required to rotate n,k times to the right. If k is positive, rotate to the right
i.e, remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute 
value larger than number of digits in n
2. Take as input n and k.
3. Print the rotated number.
4. Assume that the number of rotations will not cause leading 0's in the result. eg, such an input will not be given 
n= 12340056
k=3
r=05612340
 */
import java.util.*;
public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  // Input number
        int k=sc.nextInt();  // Input number of rotation
        int d=0;
        for(int N=n;N!=0;N/=10){   // Calculate digits
            d++;
        }
        k=k%d;    // Reducing value of k
        if(k<0){   // Converting negative rotation to positive rotation
            k=k+d;
        }
        int a=n%(int)Math.pow(10,k);  // Calculating last half of number
        int b=n/(int)Math.pow(10,k);  // Calculating first half of number
        int res=a*(int)Math.pow(10,d-k)+b; // Calculating resultant (number after rotation)
        System.out.println(res);
    }

}
