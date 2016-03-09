//Yuecheng Shi
//hw06
//RunFactorial Program

import java.util.Scanner;

public class RunFactorial{
    public static void main(String[] args) {
    
    Scanner input = new Scanner( System.in );
    
    System.out.print("Please enter an integer that is between 9 and 16 : ");
     int num = input.nextInt();  int sum=1;
     
     if(num < 9 || num > 16){
      System.out.print("Invalid input, enter again!");
     }
     
     for(int i=1;i<=num;i++){
      sum *= i;
     }

    
     System.out.println("!=" + sum);

    }
}