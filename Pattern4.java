/* Print below pattern
 *  0  -1  -2  -3  -4
 *  1   0  -1  -2  -3
 *  2   1   0  -1  -2    
 *  3   2   1   0  -1   
 *  4   3   2   1   0       
 */
import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print(row-col+"  ");
                if(row-col>=0)  System.out.print(" "); 
            }
            System.out.println();
        }
    }

}


