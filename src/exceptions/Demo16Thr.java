package exceptions;

public class Demo16Thr extends Demo16{

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		Demo16 d= new Demo16();
		//--> d.division(12,0);-->this line is to throw exception
	
		try
		{
			d.division(12,0);
		}
	
		catch(ArithmeticException a)
		{
			System.out.println("Arithmetic Exception is thrown.");
		}
		
		finally
		{
			System.out.println("the result is:"+result);
		}
	
	}
}


