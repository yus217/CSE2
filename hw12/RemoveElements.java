

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class RemoveElements{
 public static void main(String[] args) {
  Scanner scan=new Scanner(System.in);
  int num[]=new int[10];
  int newArray1[];
  int newArray2[];
  int index,target;
     String answer="";
  do{
   System.out.print("Random input 10 ints [0-9]");
   num = randomInput();
   String out = "The original array is:";
   out += listArray(num);
   System.out.println(out);
   System.out.print("Enter the index ");
   index = scan.nextInt();
   newArray1 = delete(num,index);
   String out1="The output array is ";
   out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
   System.out.println(out1);
   System.out.print("Enter the target value ");
   target = scan.nextInt();
   newArray2 = remove(num,target);
      String out2="The output array is ";
      out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
   System.out.println(out2); 

  System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
   answer=scan.next();
  }while(answer.equals("Y") || answer.equals("y"));
      }
   private static int[] remove(int[] num, int target) {
  // TODO Auto-generated method stub
     
     ArrayList<Integer> list=new ArrayList<Integer>();
     ArrayList<Integer> temp2=new ArrayList<Integer>();
     for(int i =0; i<num.length;i++){
       list.add(num[i]);
     }
     System.out.println();
     for(int x: list){
       if(x!=target){
         temp2.add(x);
       }
     }
     int temp[] = new int[temp2.size()];
     for(int j=0; j<temp2.size(); j++){
       temp[j]=temp2.get(j);
     }
     return temp;
   }
   
  private static int[] delete(int[] num, int index) {
  // TODO Auto-generated method stub
    if(index<0||index>num.length){
      System.out.println("The index is not valid.");
      return num;
    }
    else{
      ArrayList<Integer> list=new ArrayList<Integer>();
      for(int i=0;i<num.length;i++)
      {
        list.add(num[i]);
      }
      list.remove(index);
      int[] b=new int[num.length-1];
      for(int i=0;i<num.length-1;i++)
      {
        b[i]=list.get(i);
      }
      System.out.println("Index "+index+" element is removed");
      return b;
    }
  
  }
  
  private static int[] randomInput() {
  // TODO Auto-generated method stub
    int[] a=new int[10];
    for(int i=0;i<a.length;i++)
    {
      a[i]=(int) (Math.random()*10);
    }
    return a;
  }
  public static String listArray(int[] num){
    String out ="";
    for(int j=0;j<num.length;j++){
      out += "[" + num[j] +"]";
    }
    return out;
  }
}