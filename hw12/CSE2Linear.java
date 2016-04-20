package hw12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class CSE2Linear {
	
		  
		 public static int Counter = 1;   
		 public static void main(String args[])  
		 {  
			 int Counter2=0;
			 System.out.print("Enter 15 ints for final grades in CSE2: ");
			 int[] Data =new int[15];
			 Scanner sc=new Scanner(System.in);
			 
			 for(int i=0;i<15;i++)
			 {
				 Data[i]=sc.nextInt(); 
			 }
			 System.out.print("Enter a grade to search for:");
			 int KeyValue = sc.nextInt();  
			
			 if (Linear_Search((int) KeyValue,Data))  
			 {  
				   
				 System.out.println("Sorted");
				 Arrays.sort(Data);
				 for(int i=0;i<15;i++)
				 {
					 System.out.print(Data[i]+" ");
				 }
				 System.out.println();  
				 System.out.println(KeyValue+" was Found in the list with "+Counter+" iterations");
				 Counter2=Counter;
			 }  
			 else  
			 {  
				   
				 System.out.println("Sorted");
				 Arrays.sort(Data);
				 for(int i=0;i<15;i++)
				 {
					 System.out.print(Data[i]+" ");
				 }
				 System.out.println();
				 System.out.println(KeyValue+" was not Found in the list with "+Counter+" iterations");
				 Counter2=Counter;
			 }  
			 System.out.println("Scrambled:");
			 List list=new ArrayList<>();
			 for(int i=0;i<15;i++)
			 {
				 list.add(Data[i]);
			 }
//			 List list = Arrays.asList(Data);
     		 Collections.shuffle(list);
			 Iterator ite = list.iterator();    
			 while(ite.hasNext())
			 {    
				 System.out.print(ite.next().toString()+" ");    
		     }
			 int[] Data2=new int[15];
			 for(int i=0;i<15;i++)
			 {
				 Data2[i]=(int) list.get(i);
			 }
			 System.out.println();
			 System.out.print("Enter a grade to search for:");
			 int KeyValue2 = sc.nextInt();  
			  
			 if (Linear_Search((int) KeyValue2,Data2))  
			 {  
				   
				 System.out.println("Sorted");
				 Arrays.sort(Data2);
				 for(int i=0;i<15;i++)
				 {
					 System.out.print(Data2[i]+" ");
				 }
				 System.out.println();  
				 System.out.println(KeyValue2+" was Found in the list with "+(Counter-Counter2+1)+" iterations");  
			 }  
			 else  
			 {  
				 
				 System.out.println("Sorted");
				 Arrays.sort(Data2);
				 for(int i=0;i<15;i++)
				 {
					 System.out.print(Data2[i]+" ");
				 }
				 System.out.println();
				 System.out.println(KeyValue+" was not Found in the list with "+(Counter-Counter2+1)+" iterations");  
			 }  
		 }  
		  
		 // ---------------------------------------------------  
		 
		 // ---------------------------------------------------  
		 public static boolean Linear_Search(int Key,int[] Data)  
		 {  
			 int i;  
			 for (i = 0; i < 15; i++)  
			 {  
				 
//				 System.out.print( (int) Data[i]+" " );  
				  
				 if ((int) Key == (int) Data[i])  
					 return true;   
				 Counter++;   
			 }  
			 return false;  
		 }  
}
