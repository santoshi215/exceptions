package exceptions;

@SuppressWarnings("serial")
public class TooLargeNumber extends RuntimeException{
	
	

	TooLargeNumber(String s)
	{
		super (s);
	}
	
	
}
