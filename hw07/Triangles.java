//Yuecheng Shi
//hw07
//Triangles Program

import java.util.Scanner;

public class Triangles{
  
  public static void main(String[] args) {
    Scanner input = new Scanner( System.in );
    System.out.print("enter an integer between 5 and 30: ");
    int n = input.nextInt();
    int i,j;
    if(n<5 || n>30){
         System.out.println("error");
    }
    else{
      for (i=1;i<n;i++){
        for(j=0;j<i;j++){
          System.out.print(i);
          
        }
        System.out.println();
      }
      for (i=0;i<n;i++){
        for(j=0;j<n-i;j++){
           System.out.print(n-i);
           
        }
        System.out.println();
      }
      
    }
  }
}