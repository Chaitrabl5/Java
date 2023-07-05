package P1;

public class demo1 {
 static int x=10;
void sam()
{
	System.out.println(x);
}
public static void main(String args[])
{
demo1 obj1=new demo1();
demo1 obj2=new demo1();
obj1.sam();
obj2.sam();
obj2.x=30;
obj1.sam();
obj2.sam();
int x=10;//local variables
int y=20;
int z;
z=x+y;

}

}
