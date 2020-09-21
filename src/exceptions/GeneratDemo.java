package exceptions;

import java.util.Scanner;

public class GeneratDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter employe id :");
		int empid=sc.nextInt();

		if(empid>10)
		{
			throw new TooLargeNumber("mismatc in empid");
		}
		else
		{
			System.out.println("empid is valid.");
		}
	}

}
