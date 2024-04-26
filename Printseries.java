// Print 'a' to 'z'.
public class Printseries {
    public static void main(String[] args){
       /*  for(char ch='a';ch<='z';ch++){
            System.out.print(ch+" ");
        }  */
        for(int idx=0;idx<26;idx++){
            char ch=(char)(idx+'a');
            System.out.print(ch+" ");
        }
    }
}
