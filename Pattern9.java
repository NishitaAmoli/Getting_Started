/*
 * Print pyramid pattern
 *      *
 *    *   *  
 *  *   *   *
 * *  *   *   *
 */
import java.util.Scanner;
public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int stars=1, spaces=n-1;
        for(int row=1;row<=n;row++){
            for(int count=1;count<=spaces;count++){
                System.out.print(" ");
            }
            for(int count=1;count<=stars;count++){
                System.out.print("* ");
            }
            stars++; spaces--;
            System.out.println();
        }

    }

}
