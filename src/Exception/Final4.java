package Exception;

public class Final4 {
	void m()
	{
	int []a= new int[2];
	a[0]=10;
	a[1]=0;
	
	
	System.out.println(a[0]);
	System.out.println(a[1]);
	
	int result=0;
	
	System.out.println("result is:"+result);
	
	try
	{
		result=(a[0]/a[1]);
	System.out.println("result is:"+result);
			
	}
	
	catch(ArithmeticException e)//whether exception will handled or not 
	{                           //finally block will execute.
		System.out.println("infinte ae occured");
		
	}
	
	finally
	{
		System.out.println("this is finally block.");	
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final4 f =new Final4();
		f.m();
		
	
	}

}
