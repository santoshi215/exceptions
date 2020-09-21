package Exception;

public class Exc3 {
	
	
	void m1()
	{
		int a=10;
		int b=0;
		
		
		int result =0;
		try{
			 result=a/b;
			//System.out.println("result is:"+result);
		}
		catch(ArithmeticException e)
		{
			
			System.out.println("exception handled.");

		}
		
		System.out.println("result is:"+result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exc3 e = new Exc3();
		e.m1();
		

	}

}
