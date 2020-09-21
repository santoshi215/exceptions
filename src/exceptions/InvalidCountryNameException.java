package exceptions;

@SuppressWarnings("serial")
public class InvalidCountryNameException extends Exception{
	
	public InvalidCountryNameException(String str)
	{
	super(str);
	}

}
