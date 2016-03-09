//Yuecheng Shi
//lab06
//TwistGenerator Program

import java.util.Scanner;


public class TwistGenerator{
    
   public static void main(String[] args) {
    Scanner input = new Scanner( System.in );
     System.out.print("Please enter the length of twist: ");
     
     int length=0;
     int lengthOfX=length/3;
     int lengthOfSlash=lengthOfX*2;
     
     while(input.hasNextInt()){
         if(length < 0){
             System.out.println("Sorry, your input must consist of integers");
         }
         
         System.out.println("");	
     }