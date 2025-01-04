/* Print below pattern
 *  0   1   2   3   4
 *  1   2   3   4   5
 *  2   3   4   5   6    
 *  3   4   5   6   7   
 *  4   5   6   7   8       
 */
import java.util.Scanner;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                System.out.print(row+col+"  ");
            }
            System.out.println();
        }
    }

}



