// Digit traversal (print individual digits of num in reverse order) eg- i/o:- 136 o/p:- 6 3 1 (every num in separate line) 
import java.util.Scanner;
public class Digit_Traversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n;
        System.out.println("original number is:-"+num);
        System.out.println("extracting individual digit from right to left(reverse)");

        while(num!=0){
            n=num%10;
            num=num/10;
            System.out.println(n);
        }
    }

}
