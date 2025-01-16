/* Print W pattern
 *       *               *
 *       *               *
 *       *        *      *
 *       *     *     *   *
 *       *               *
 */
import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if(col==1 || col==n || (row > n/2 && row==col) || (row > n/2 && row+col==n+1)){
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

}


