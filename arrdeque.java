package P1;

import java.io.IOException;
import java.util.ArrayDeque;

public class arrdeque {

	public static void main(String args[]) throws IOException
	{
	
ArrayDeque q=new ArrayDeque();
q.push("arun");
q.push("kiran");
q.push("sai");
System.out.println(q);
System.out.println(q.poll());
System.out.println(q);
System.out.println(q.peek());// print first head element
System.out.println(q.pop());
System.out.println(q);
}
}