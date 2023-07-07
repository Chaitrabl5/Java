package P1;

//MULTIPLE CLASSES 
class BANK    // business logic class
{
	int Accountno=123;
	String Holdername="arun";
}
class TAX    // business logic class
{
	int panno=9999;
	String Holdername="kiran";
}
public class demo3 // Execution logic class
{
	public static void main(String args[])
	{
		BANK obj=new BANK();
		System.out.println(obj.Accountno);
		System.out.println(obj.Holdername);
		TAX obj1=new TAX();
		System.out.println(obj1.panno);
		System.out.println(obj1.Holdername);
	}

}

