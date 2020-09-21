package Exception;

import java.util.Scanner;

public class Rstack {
	
	void m1()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter no1:");
		int n1=sc.nextInt();
		System.out.println("enter no2:");
		int n2=sc.nextInt();
		int result=0;
		
		try
		{
			result = n1/n2;
		}
		catch (ArithmeticException ae)
		{
			System.out.println("handles exception here.");
		}
		System.out.println("result is:" +result);

		
		System.out.println("method m1");
	}
	void m2()
	{
		m1();
		System.out.println("method m2");
	}
	void m3()
	{
		m2();
		System.out.println("method m3");
	}
	void m4()
	{
		m3();
		System.out.println("method m4");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("this is main method");
		Rstack r = new Rstack();
		r.m4();
		

	}

}
