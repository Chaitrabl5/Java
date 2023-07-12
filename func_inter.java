package P1;

@FunctionalInterface
interface functionInter
{
	void addition(int x, int y);
}
//class sample implements functionInterface
//{
//	@Override
//	public void addition(int x, int y) // without lambda expression
//	{
//		int z;
//		z=x+y;
//	System.out.println(z);	
//	}
//}
public class func_inter 
{
public static void main(String args[])
{
functionInter i=(x,y)->System.out.println(x+y);
i.addition(4, 5);
// sample obj=new sample();
// obj.addition(3,4);
}	
}	