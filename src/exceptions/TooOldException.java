package exceptions;

@SuppressWarnings("serial")
public class TooOldException extends RuntimeException {

	
	TooOldException(String s)
	{
		super (s);
	}
	
}
