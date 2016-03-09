//Yuecheng Shi
//hw06
//Fibonacci Program

import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
    
   
    Scanner input = new Scanner( System.in );
    
    System.out.print("Enter the first number in the sequence: ");
    int a1 = input.nextInt();
    
    System.out.print("Enter the second number in the sequence: ");
    int a2 = input.nextInt();
 
    System.out.print("How many custom Fibonacci numbers should be printed? ");
    boolean x = input.hasNextInt();
    int n = input.nextInt();
   
    while (x) {
        
        System.out.print(a1 + ", " + a2 + ", ");
       
        int a3 = 0;
        
        for(int i = 2; i < n; i++) {
        a3 = a1 + a2;
        System.out.print(a3 + ". ");
        a1 = a2;
        a2 = a3;
        }
        break;
    }
    
   
    }
}

   
 
   
    
    
    
    
    
    
        
     