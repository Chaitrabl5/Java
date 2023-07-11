package P1;

import java.util.TreeMap;

public class tremap {
	public static void main(String args[])
	{
		//TreeMap 1) sorted order
				//2) key should to be homo
				//3) duplicate are allowed
		
		
TreeMap tm =new TreeMap();
tm.put(1, "india");
tm.put(3, "aus");
tm.put(2,"uk");
tm.put(4,"uk");
tm.put(4,"usa");
System.out.println(tm);
}
}