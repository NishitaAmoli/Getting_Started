/*
 * Print inverted pyramid pattern
 *   *  *  *  *  *
 *    *  *  *  *  
 *      *  *  *
 *        * *
 *         *
 */
import java.util.Scanner;
public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int stars=n, spaces=1;
        for(int row=1;row<=n;row++){
            for(int count=1;count<=spaces;count++){
                System.out.print(" ");
            }
            for(int count=1;count<=stars;count++){
                System.out.print("* ");
            }
            stars--; spaces++;
            System.out.println();
        }
        // Approach 2 (grid based approach)
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if(col>=row){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}

