package P1;

class father
{	void breakfast()
	{
		System.out.println("breakfast timings 7 am");
	}}
class child extends father
{
	@Override // anotation
	void breakfast()
	{
		System.out.println("breakfast timings 9 am");
	}
	void sleepingtime()
	{
		System.out.println("sleeping timings 9 pm");
	}
}
public class overriding
{	
public static void main(String args[])
{
	
	father f; // ref variable.... null values
	f=new child(); // abstraction
	f.breakfast();
//	f.sleeptime(); // two steps to execute 1) compilation(syntax, semantics errors) 2) run(execute)
	
	
	
// father f=new father();
// f.breakfast();
//
// // f.sleepingtime(); // child sleeping time
//
// child c=new child();
// c.breakfast();
// c.sleepingtime();
	
	
}
}
