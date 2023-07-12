package P1;



interface additionInterface
{
	//int addition(int x, int y);
  default void demo() // default methods
	{
		System.out.println("i am from demo method");
	}
  public static void demo1()
  {
	System.out.println("i am from static method");
   }

}
class ibm implements additionInterface
{	
}
public class defaultmeth {
public static void main(String args[])
{
	ibm obj=new ibm();
	obj.demo();
	additionInterface.demo1();
}	
}
