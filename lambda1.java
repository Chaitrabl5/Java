package P1;
@FunctionalInterface
interface functionInterf
{
	int addition(int x, int y);
}
//class sample implements functionInterface
//{
//	@Override
//	public int addition(int x, int y) // without lambda expression
//	{
//		int z;
//		z=x+y;
//	    return z;	
//	}
//}
public class lambda1 
{
public static void main(String args[])
{
functionInterf i=( x, y)-> x+y;
int r=i.addition(4, 5);
System.out.println(r);
//sample obj=new sample();
// obj.addition(3,4);
}	
}	