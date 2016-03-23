//Yuecheng Shi
//hw07
//Triangles Program

import java.util.Scanner;

public class Triangles{
  public Triangles(){}
    
  public void ForLoop(int n) {
    System.out.println("for loop:");
    int i,j;
    if(n<5 || n>30){
         System.out.println("error");
    } else{
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

  
  public void WhileLoop(int n) {
    System.out.println("while loop:");
    if(n<5 || n>30){
         System.out.println("error");
    } else{
      
      int i=1;
      while(i<n){
        int j=0;
        while(j<i){
          System.out.print(i);
          j++;
          }
        i++;
        System.out.println();
      }
      
      int x =0;
      while(x<n){
        int y=0;
        while(y<n-x){
          System.out.print(n-x);
          y++;
          }
        x++;
        System.out.println();
      }
    }
  }


  public void DoWhile(int n) {
    System.out.println("do while:");
    if(n<5 || n>30){
         System.out.println("error");
    } else{
      
      int i=1;
      do{int j=0;
        do{
          System.out.print(i);
          j++;
        }while(j<i);
        i++;
        System.out.println();
      } while (i<n);
      
      int x=0;
      do{
        int y=0;
        do{
          System.out.print(n-x);
          y++;
        }while(y<n-x);
        x++;
        System.out.println();
      } while (x<n);
    }
  }
  
   public static void main(String[] args) {
     Scanner input = new Scanner( System.in );
    System.out.print("enter an integer between 5 and 30: ");
    int n = input.nextInt();
    Triangles s = new Triangles();
    s.ForLoop(n);
    s.WhileLoop(n);
    s.DoWhile(n);
   }
}