package exceptions;

public class Excep5 {

	public void m1()
	{
		//Thread t =new Thread();
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println("exception handled.");
		}
		catch(ArithmeticException a)
		{

			System.out.println("exception handled if AE occured.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Excep5 ed = new Excep5();
		ed.m1();
	}

}
