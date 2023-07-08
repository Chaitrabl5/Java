package P1;

public class arrayexce 
{
public static void main(String args[])
{
	System.out.println("0");	
	System.out.println("1");
	System.out.println("2");
	
	
	try {
	int x[]=new int[3];
	x[0]=2;
	x[1]=3;
	x[5]=10;
	
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	try {
		String s=null;
		System.out.println(s.length());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	System.out.println("3");
	System.out.println("4");
	System.out.println("5");	
}
}
