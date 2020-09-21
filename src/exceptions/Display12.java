package exceptions;

public class Display12 {

	
	void display()
	{
		int num1=50;
		int num2=0;
		
		int result=0;
		try
		{
			
			System.out.println("exception arised is:- Artithmetic.");
			
			result=num1/num2;
			
		}
		catch(ArithmeticException a)
		{
			System.out.println("handeled exception using try and catch block.");
		}
		
		System.out.println("result is:"+result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display12 d=new Display12();
		d.display();
	}

}
