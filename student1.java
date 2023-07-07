package P1;

class std
{
	int std_id;
	String std_name;
	String std_loc;
}
public class student1 
{
	public static void main(String args[])
	{		
		std obj1=new std();
		obj1.std_id=111;
		obj1.std_name="asha";
		obj1.std_loc="chikmagalur";
		System.out.println(obj1.std_id);
		System.out.println(obj1.std_name);
		System.out.println(obj1.std_loc);
		std obj2=new std();
		obj2.std_id=112;
		obj2.std_name="riya";
		obj2.std_loc="chikmagalur";
		System.out.println(obj2.std_id);
		System.out.println(obj2.std_name);
		System.out.println(obj2.std_loc);
	}
}