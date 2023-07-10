package P1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
public class link {
	// arraylist, linkedlist, stack and vector
	public static void main(String args[]) throws IOException
	{
		//ArrayList// 1) collection of values 2) homo and hetero 3) duplicates		
		//advantage: searching is very fast/accessing very fast
		// inserting and deleting the values in the middle of the A L more often will reduce
		//the performance of the application
				ArrayList al=new ArrayList();
	 // 	LinkedList al=new LinkedList();
		//LinkedList// 1) collection of values 2) homo and hetero 3) duplicates	
				// Advantage:we have to use linkedlist class
				// if we have the scenorio to insert and delete the values
				//more often in application
				// cons: searching is bit slow compare to array list
		al.add("arun");
		al.add("kiran");
		al.add("kiran");
		al.add(0,"first");
		
		al.add(1);
		al.add(2);
		al.add(22.2f);
		al.add(true);
	System.out.println(al);
	}
}
