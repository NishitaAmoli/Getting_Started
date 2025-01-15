/*
 * Print given pattern (eg., n=5)
 *      1
 *   2  3  2  
 * 3 4  5  4 3
 *   2  3  2
 *      1
 */
import java.util.Scanner;
public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int stars=1, spaces=n/2;
        for(int row=1;row<=n;row++){
            for(int count=1;count<=spaces;count++){
                System.out.print("  ");
            }
            int val=row;
            if(row>=n/2+1){
                val=n-row+1;
            }
            for(int count=1;count<=stars;count++){
                System.out.print(val+" ");
                if(count<=stars/2){
                    val++;
                }else{
                    val--;
                }
            }
            if(row<=n/2){
                stars=stars+2;
                spaces=spaces-1;
            }else{
                stars=stars-2;
                spaces=spaces+1;
            }
            System.out.println();
        }

    }

}


