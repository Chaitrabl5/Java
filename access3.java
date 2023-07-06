package P1;
class fatherr
{	
	private int pri=10;
	protected int pro=20;
	 int def=30;
	public int pub=40;
	}
class childdd
{
	void demo()
	{ 
		fatherr obj=new fatherr(); // uses a relation to access the properties
//		System.out.println(obj.pri);
		System.out.println(obj.pro);
		System.out.println(obj.def);
		System.out.println(obj.pub);
	}
}
public class access3
{	
public static void main(String args[])
{
	childdd obj=new childdd();
	obj.demo();
}
}