package P1;


//MULTIPLE CLASSES
class BANke // business logic class
{
	int Accountno;
	String Holdername;
}
public class demo3alternate // Execution logic class
{
	public static void main(String args[])
	{		BANke obj1=new BANke();
		obj1.Accountno=123;
		obj1.Holdername="kiran";
		System.out.println(obj1.Accountno);
		System.out.println(obj1.Holdername);
		BANke obj2=new BANke();
		obj2.Accountno=33;
		obj2.Holdername="raj";
		System.out.println(obj2.Accountno);
		System.out.println(obj2.Holdername);
		
		
		
//		TAX obj1=new TAX();
//		System.out.println(obj1.panno);
//		System.out.println(obj1.Holdername);
	}
}
//class TAX // business logic class
//{
//	int panno=9999;
//	String Holdername="kiran";
//}
