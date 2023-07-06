package P1;

class fatherss
{	
	private int pri=10;
	protected int pro=20;
	 int def=30;
	public int pub=40;
	void demo()
	{
		System.out.println(pri);
		System.out.println(pro);
		System.out.println(def);
		System.out.println(pub);
	}
}
public class access
{	
public static void main(String args[])
{
	fatherss obj=new fatherss();
	obj.demo();
}
}


