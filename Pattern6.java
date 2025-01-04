/* Print top right to bottom left diagonal
 *             *
 *           *  
 *         *    
 *       *      
 *     *        
 */
import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n=2*n-1;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if(row-col==0 || row+col==n+1){
                    int left=col, right=n-col+1;
                    int min=Math.min(left,right);
                    System.out.print(min + " ");
                }
                else{ 
                    System.out.print(" ");
                     }
            }
            System.out.println();
        }
    }

}


