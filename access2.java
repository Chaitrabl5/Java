package P1;

class fathers
{	
	private int pri=10;
	protected int pro=20;
	 int def=30;
	public int pub=40;
	
}
class childr extends fathers
{
	void demo()
	{
	//	System.out.println(pri);
		System.out.println(pro);
		System.out.println(def);
		System.out.println(pub);
	}
}
public class access2
{	
public static void main(String args[])
{
	childr obj=new childr();
	obj.demo();
}
}
