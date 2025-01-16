// Switch case -- Design basic calculator using switch case.

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) { 
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            int result;
            char operator=sc.next().charAt(0);

            switch(operator){
                case '+':{
                    result=num1+num2;
                    System.out.println("Addition operation: "+result);
                    break;
                }
                case '-':{
                    result=num1-num2;
                    System.out.println("Subtraction operation: "+result);
                    break;
                }
                case '*':{
                    result=num1*num2;
                    System.out.println("Multiplication operation: "+result);
                    break;
                }
                case '/':{
                    double division=(double)num1/num2;
                    System.out.println("Division operation: "+division);
                    break;
                }
                case '%':{
                    result=num1%num2;
                    System.out.println("Modulus operation: "+result);
                    break;
                }
                default:{
                    System.out.println("Invalid input");
                    return;
                }
            }            
        }
    }
    }


