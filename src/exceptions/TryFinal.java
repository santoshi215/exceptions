package exceptions;

public class TryFinal {

	void demo()
	{
		int num1=20;
		int num2=5;
		
		
		try
		{
			int result1=num1/num2;
			System.out.println("result is:"+result1);
		}
		finally
		{
			System.out.println("executes irrespective to exception handled or not");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryFinal tf = new TryFinal();
		tf.demo();

	}

}
