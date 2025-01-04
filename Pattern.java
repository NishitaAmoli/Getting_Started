/* Print below pattern (Floyd's triangle)
 * 1
 * 2 3
 * 3 4 5
 * 4 5 6 7
 * 5 6 7 8 9
 */
import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int row=1;row<=n;row++){
        int val=row;
        for(int col=1;col<=row;col++){
               System.out.print(val+" ");
               val++;
        }
        System.out.println();
    }
}
}
