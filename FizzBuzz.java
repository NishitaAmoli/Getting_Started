/* From 1 to 100 print "Fizz" if number is multiple of 3, "Buzz" if number is multiple of 5, "FizzBuzz" if
   number is multiple of 3 and 5.  */
public class FizzBuzz {
    public static void main(String[] args){
        // Approach 1
      /*   for(int idx=1;idx<=100;idx++){
            if(idx%3==0 && idx%5==0) {
                System.out.println("FixBuzz");
            }
            else if(idx%3==0) {
                System.out.println("Fizz");
            }
            else if(idx%5==0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(idx);
            }
        }   */
        // Approach 2
        int fizz=0,buzz=0;
        for(int idx=1;idx<=100;idx++){
            fizz++; buzz++;
            if(fizz==3 && buzz==5){
                System.out.println("FizzBuzz");
                fizz=0; buzz=0;
            } else if(fizz==3){
                System.out.println("Fizz");
                fizz=0;
            } else if(buzz==5){
                System.out.println("Buzz");
                buzz=0;
            } else{
                System.out.println(idx);
            }
        }

    }

}
