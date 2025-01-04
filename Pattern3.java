/* Print top right to bottom left diagonal
 *             *
 *           *  
 *         *    
 *       *      
 *     *        
 */
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if((row+col)==(n+1))  System.out.print("* ");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

}

