package exceptions;

@SuppressWarnings("serial")
public class TooYoungException extends RuntimeException
{
	TooYoungException(String s)
	{
		super(s);
	}
	
}

