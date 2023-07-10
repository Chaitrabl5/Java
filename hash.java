package P1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
public class hash {

	
	public static void main(String args[]) throws IOException
	{
		// set: 1) no duplicate values
		//2)some classes will homo and hetero and some will allow only homo
		
		// set: 1) hashset 2) treeset
		
		// hashset: 1) no duplicate 2) no order insertion
		//3) fast accessible 4) both home and hetero
		
		HashSet hs=new HashSet();
		hs.add("A");
		hs.add("1");
		hs.add(2);
		hs.add("a");
		hs.add(22.f);
		hs.add(true);
		hs.add(1);
		hs.add(2);
		System.out.println(hs);
		
		
	}
}

