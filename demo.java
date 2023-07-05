package P1;

public class demo {
	 int x=20;
	void sample()
	{
		int y=11;
	System.out.println("sample method");
	}
public static void main(String args[])
{
	int x=10;//local variables
	int y=20;
	int z;
	z=x+y;
	System.out.println("sum of "+x+" and "+y+" is "+z);
	System.out.println("hello,welcome to ibm");
	demo obj=new demo();
	obj.sample();
	System.out.print(obj.x);
	
}
}
