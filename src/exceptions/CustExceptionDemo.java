package exceptions;

import java.util.Scanner;

public class CustExceptionDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter age:");
			int age=sc.nextInt();
			
			
				if(age>60)//try &catch to handle thorwed exception
				{
					try
					{
					throw new TooYoungException("age alerdy crossed marriage age.");
					}
					catch(TooYoungException c)
					{
						System.out.println("no chance of getting married aleredy age crossed");
					}
				}
				else if(age<18)
				{
					try
					{
					throw new TooOldException ("please wait sometime u will get best match.");
					}
					catch(TooOldException v)
					{
						System.out.println(	"you are too young");
					}
				}
				else
				{
					System.out.println("you will get details by email soon.");
				}
	}

}
