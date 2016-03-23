//Yuecheng Shi
//hw07
//Twisty Program

import java.util.Scanner;

public class Twisty{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Input your desired length: " );
    System.out.println("Input your desired width: " );
    int length = s.nextInt();
    int width = s.nextInt();
    
    for(int i=0; i<width; i++){
      for(int j=0; j<length; j++){
        if(j/width%2==0){
        if (i == j%(width)) {
          System.out.print("#");
        } 
        else if(i+j%(width) == width-1) {
          System.out.print("/");
        } 
         else{
          System.out.print(" ");
          
        }
        } else {
          if (i == j%(width)) {
          System.out.print("\\");
        } 
        else if(i+j%(width) == width-1) {
          System.out.print("#");
        } 
         else{
          System.out.print(" ");
          
        }
      }
      }
      System.out.println();
    
    }
  }
  }