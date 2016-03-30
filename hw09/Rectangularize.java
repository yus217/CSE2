//Yuecheng Shi
//hw09
// Rectangularize Program

import java.util.Scanner;

public class Rectangularize {
public static void main(String[] args) {
	method1();
	method2();
}
public static void method1()
{
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	for(int i=0;i<s.length();i++)
	{
		System.out.println(s);
	}
}
public static void method2()
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print("%");
		}
		System.out.println();
	}
}
}
