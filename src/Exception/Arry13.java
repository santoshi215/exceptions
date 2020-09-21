package Exception;

public class Arry13 {
	
	int num[]=new int[6];
	
	void m1()
	{
	num[0]=00;
	num[1]=10;
	num[2]=20;
	num[3]=30;
	num[4]=40;
	num[5]=50;
	
	//num[7]=70;
	
	System.out.println("print here 1st index value:"+num[0]);
	System.out.println("print here 2nd index value:"+num[1]);
	System.out.println("print here 3rd index value:"+num[2]);
	System.out.println("print here 4th index value:"+num[3]);
	System.out.println("print here 5th index value:"+num[4]);
	System.out.println("print here 6th index value:"+num[5]);
	
	try
	{
		num[7]=70;
		
	}
	catch(ArrayIndexOutOfBoundsException  ae)
	{
		System.out.println(" handled excetion excluded index value of array.");
	}
	}
	
	
	
	
	void m2()
	{
		m1();
		System.out.println("this is m2 method.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is main method.");

		Arry13 a=new Arry13();
		a.m1();
		
		
		
	}

}
