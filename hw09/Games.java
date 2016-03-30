//Yuecheng Shi
//hw09
//Games Program

import java.util.Scanner;

public class Games {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n==1)
	{
		System.out.println("Welcome to guessTheBox game center");
		method1();
	}
	else if(n==2)
	{
		System.out.println("Welcome to spinTheWheel game center");
		method2();
	}
	else if(n==3)
	{
		System.out.println("Welcome to scrambler game center");
		method3();
	}
}
public static void method1()
{
	int a=(int)(3*Math.random()+1);
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n==1||n==2||n==3)
	{
		if(n==a)
		{
			System.out.println("Congratulations!The prize is in the box"+n);
		}
		else 
		{
			System.out.println("Sorry,you guess the wrong number!");
			method1();
		}
	}
	else
	{
		System.out.println("Sorry,please try again!");
		method1();
	}
}
public static void method2()
{
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	String ss=s.toLowerCase().trim();
	int n=sc.nextInt();
	int a=(int) (Math.random()*10+1);
	switch (a) {
	case 1:
		System.out.println("red 1");
		if((ss+" "+n).equals("red 1"))
		{
			System.out.println("Congratulations!You win the prize!");
		}
		else
		{
			System.out.println("Sorry!");
			method2();
		}
		break;
	case 2:
		System.out.println("red 2");
		if((ss+" "+n).equals("red 2"))
		{
			System.out.println("Congratulations!You win the prize!");
		}
		else
		{
			System.out.println("Sorry!");
			method2();
		}
		break;
	case 3:
		System.out.println("red 3");
		if((ss+" "+n).equals("red 3"))
		{
			System.out.println("Congratulations!You win the prize!");
		}
		else
		{
			System.out.println("Sorry!");
			method2();
		}
		break;
	case 4:
		System.out.println("red 4");
		if((ss+" "+n).equals("red 4"))
		{
			System.out.println("Congratulations!You win the prize!");
		}
		else
		{
			System.out.println("Sorry!");
			method2();
		}
		break;
	case 5:
		System.out.println("red 5");
		if((ss+" "+n).equals("red 5"))
		{
			System.out.println("Congratulations!You win the prize!");
		}
		else
		{
			System.out.println("Sorry!");
			method2();
		}
		break;
	case 6:
		System.out.println("black 1");
		if((ss+" "+n).equals("black 1"))
		{
			System.out.println("Congratulations!You win the prize!");
		}
		else
		{
			System.out.println("Sorry!");
			method2();
		}
		break;
	case 7:
		System.out.println("black 2");
		if((ss+" "+n).equals("black 2"))
		{
			System.out.println("Congratulations!You win the prize!");
		}
		else
		{
			System.out.println("Sorry!");
			method2();
		}
		break;
	case 8:
		System.out.println("black 3");
		if((ss+" "+n).equals("black 3"))
		{
			System.out.println("Congratulations!You win the prize!");
		}
		else
		{
			System.out.println("Sorry!");
			method2();
		}
		break;
	case 9:
		System.out.println("black 4");
		if((ss+" "+n).equals("black 4"))
		{
			System.out.println("Congratulations!You win the prize!");
		}
		else
		{
			System.out.println("Sorry!");
			method2();
		}
		break;
	case 10:
		System.out.println("black 5");
		if((ss+" "+n).equals("black 5"))
		{
			System.out.println("Congratulations!You win the prize!");
		}
		else
		{
			System.out.println("Sorry!");
			method2();
		}
		break;
	default:
		break;
	}
	
}
public static void method3()
{
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int a=s.length()-1;
    int n=(int) (Math.random()*a+1);
    char c1=s.charAt(n);
    for(int i=0;i<s.length();i++)
    {
    	if(i==0)
    	{
    		System.out.print(s.charAt(n));
    	}
    	else if(i==n)
    	{
    		System.out.print(s.charAt(0));
    	}
    	else
    	{
    		System.out.print(s.charAt(i));
    	}
    }
}
}
