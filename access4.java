package P1;

import p2.access5;
class child2 extends access5
{
	void demo()
	{
//		
//		System.out.println(pri);
		System.out.println(pro);
//		System.out.println(def);
		System.out.println(pub);
	}
}
class childd
{
	void demo()
	{
		access5 obj=new access5();
//		System.out.println(obj.pri);
//		System.out.println(obj.pro);
//		System.out.println(obj.def);
		System.out.println(obj.pub);
	}
}
public class access4
{	
public static void main(String args[])
{
	childd obj=new childd();
	obj.demo();
}
}