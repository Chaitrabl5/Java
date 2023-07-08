package P1;

public class excep {
public static void main(String args[])
{
	System.out.println("0");
	System.out.println("1");
	System.out.println("2");
	try {
		int x=9/0;
	}
	catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}
	System.out.println("3");
	System.out.println("4");
	System.out.println("5");
	}
}
