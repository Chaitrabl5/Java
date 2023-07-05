package P1;

public class student
{
	int rollno;  // INSTANCE VAR
	String name;// INSTANCE VAR
static	String collegeName="KPIT";	// STATIC VAR
	void display()
	{
		System.out.println(rollno+name+collegeName);
	}
	public static void main(String args[])
	{
		student s1=new student();
		s1.rollno=1;
		s1.name="arun";
//		s1.collegeName="KPIT";
		student s2=new student();
		s2.rollno=2;
		s2.name="KIRAN";
//		s2.collegeName="KPIT";
		student s3=new student();
		s3.rollno=3;
		s3.name="RAJ";
//		s3.collegeName="KPIT";
		s1.display();
		s2.display();
		s3.display();
	}
			

}

