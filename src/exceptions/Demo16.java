package exceptions;


public class Demo16 //extends RuntimeException
	{
	static int result=0;
	
	public int division(int dividend,int diviser) 
	{

	if(diviser==0)
	{
		throw new ArithmeticException("diviser cannot be zero.");
	}
	
	result=dividend/diviser;
	
	return result;
	
	
	}}
	

