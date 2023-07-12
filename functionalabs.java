package P1;
//LAMBDA EXAMPLE
@FunctionalInterface
interface functionInterface
{
	void demo();
}
//class sample implements functionInterface
//{
//	@Override
//	public void demo()
//	{
//	System.out.println("from demo method");	
//	}
//}

public class functionalabs {
public static void main(String args[])
{
	 functionInterface i=()->{System.out.println("from lambda demo method");};
	 i.demo();
	
	
// sample obj=new sample();
// obj.demo();
}	
}	
