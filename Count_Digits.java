// Count digits that divides number completely  { i/o:- 2446 o/p:-1;  i/o:- 12   o/p:-2}
import java.util.Scanner;
public class Count_Digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n, count=0;
        while(n!=0){
            int digit=n%10;
            if(digit>0 && num%digit==0){
            count+=1;
            }
            n/=10;
        }
        System.out.print("number of digits that divides number completely:"+count);
    }

}
