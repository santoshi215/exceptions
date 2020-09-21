package exceptions;

import java.util.Scanner;

public class MenuDrive {
	
	void drive()
	{

	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first number:");
	int number1=sc.nextInt();
	System.out.println("enter second number:");
	int number2=sc.nextInt();
	
	
	int result=0;
	//try with multiple catch blocks
	try
	{
		result=number1/number2;
		System.out.println("result is:"+result);
	}
	catch(ArithmeticException a)
	{
		System.out.println("handeled arithmetic exception.");
	}
	catch(RuntimeException i)
	{
		System.out.println("handele when runtime problem occured.");
	}
	
	finally
	{
		System.out.println("all time execution");
	}
	

	if(number2==0)//throw example
	{
		throw new ArithmeticException("invalid number.");
	}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenuDrive md=new MenuDrive();
		md.drive();
		
	}

}
