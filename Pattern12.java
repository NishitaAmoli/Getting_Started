/*
 * Print inverted diamond pattern
 *  * * *   * * *
 *  * *       * *  
 *  *           *
 *    
 *  *           *
 *  * *       * *
 *  * * *    * * *     
 */
import java.util.Scanner;
public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int stars=n/2, spaces=1;
        for(int row=1;row<=n;row++){
            for(int count=1;count<=stars;count++){
                System.out.print("*");
            }
            for(int count=1;count<=spaces;count++){
                System.out.print(" ");
            }
            for(int count=1;count<=stars;count++){
                System.out.print("*");
            }
            if(row<=n/2){
                stars=stars-1;
                spaces=spaces+2;
            }else{
                stars=stars+1;
                spaces=spaces-2;
            }
            System.out.println();
        }

    }

}


