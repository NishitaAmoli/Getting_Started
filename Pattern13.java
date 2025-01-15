/*
 * Print diamond border pattern
 *      *
 *    *    *  
 *  *        *
 *    *    *
 *       *
 */
import java.util.Scanner;
public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int stars=1, spaces=n/2;
        for(int row=1;row<=n;row++){
            for(int count=1;count<=spaces;count++){
                System.out.print(" ");
            }
            for(int count=1;count<=stars;count++){
                if(count==1 || count==stars){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
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


